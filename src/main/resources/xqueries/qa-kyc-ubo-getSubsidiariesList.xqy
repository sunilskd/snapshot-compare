xquery version "1.0-ml";
import module namespace qa-kyc-ubo-getEntityList = "qa-kyc-ubo-getEntityList" at "qa-kyc-ubo-getEntityList.xqy";

let $fid := xs:string(xdmp:get-request-field("fid"))
let $percentageFilter := xs:string(xdmp:get-request-field("percentage"))

let $subsidiariesList := qa-kyc-ubo-getEntityList:getEntityList($fid, "subsidiaries")

let $subsidiariesFilteredList := for $results in $subsidiariesList/entityInfo
				return if($percentageFilter ne "all")
				        then if (xs:double($results/percentOwnership) >= xs:double($percentageFilter))
				             then $results
				             else ()
				        else $results

return <entitiesInfo>{$subsidiariesFilteredList}</entitiesInfo>
