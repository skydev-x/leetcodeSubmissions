/* The isBadVersion API is defined in the parent class VersionControl.
      fun isBadVersion(version: Int) : Boolean {} */

class Solution: VersionControl() {

  override fun firstBadVersion(n: Int) : Int {
    return util(n,1,n)  
	}

  fun util(n : Int,s : Int,e : Int) : Int {
   if(s > e) {
      return s
   }
  
   val mid = (e -s)/2 + s

   if(isBadVersion(mid)){
      return util(n,s,mid-1)
   } else {
      return util(n,mid+1,e)
   }

  }

}
