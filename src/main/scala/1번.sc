//다음 주어진 List 에 있는 단어의 수와, 총 문자의 수를 한번에 계산하는 함수를 collection 을 이용해서 계산하세요.
val wordList = List("apple", "basket", "candy") // 5, 6, 5
val wordCount = wordList
val totalCharacterCount = wordList.map(_.length).sum
println(s"단어의 수 : $wordCount")
println(s"총 문자의 수 $totalCharacterCount")