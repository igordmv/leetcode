//https://leetcode.com/problems/simplify-path/    
fun simplifyPath(path: String): String {
    val result = Stack<String>()
    for (substring in path.split("/")) {
        if(substring.isEmpty() || substring.equals(".")){
            continue
        }
        if (substring.equals("..")) {
            if (result.isNotEmpty()) {
                result.pop()
            }
        } else {
            result.push(substring)
        }
    }
    return "/" + result.joinToString("/")
}