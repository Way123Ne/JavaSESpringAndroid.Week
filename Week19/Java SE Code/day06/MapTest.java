package wayne.c1.map.test;

import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

/*
 * 练习：
 * "fdgavcbsacdfs"获取该字符串中，每一个字母出现的次数
 * 
 * 思路：
 * 对于结果的分析发现，字母和次数之间存在着映射的关系，而且这种关系很多
 * 很多就需要存储，能存储映射关系的容器有数组和Map集合
 * 关系中方式有序编号？没有
 * 那就是使用Map集合。又发现可以保证唯一的一方 具备这顺序如：a b c ...
 * 所以可以使用TreeMap集合
 * 
 *这个集合最终应该存储的是字母和次数的对应关系
 * 
 * 步骤：
 * 1>因为操作的是字符串中的字母，所以先将字符串变成字符数组
 * 2>遍历字符数组，用每一个字母作为键区查Map集合这个表
 *   如果该字母键不存在，就将该字母作为键1作为值存储到Map集合中
 *   如果该字母键存在，就将该字母键对应的值取出并+1,在将该字母和+1后的值存储到Map集合中
 *   键相同会覆盖，这样就记录住了该字母的次数
 * 3>遍历结束，map集合就记录所有字母出现的次数。
 * 
 */

public class MapTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "fdg Aa6vc  bs3a+cd-fs";
		
		String s = getCharCount(str);

		System.out.println(s);
	}

	public static String getCharCount(String str) {
		// TODO Auto-generated method stub

		// 将字符串变成字符数组
		char[] chs = str.toCharArray();

		// 定义map集合表
		Map<Character, Integer> map = new TreeMap<Character, Integer>();

		for (int i = 0; i < chs.length; i++) {
			if(!(chs[i]>='a' && chs[i]<='z' || chs[i]>='A' && chs[i]<='Z'))
				continue;
		
			// 用数组中的字母作为键去查map表
			Integer value = map.get(chs[i]);

			int count = 1;
			
			// 判断map表是否为空
			if(value!=null){
				count = value +1;
			}
			map.put(chs[i], count);
			
			/*
			 * if(value == null){ map.put(chs[i], 1); } else { map.put(chs[i],
			 * value+1); }
			 */

		}
		return maptoString(map);
	}

	private static String maptoString(Map<Character, Integer> map) {
		// TODO Auto-generated method stub

		StringBuilder sb = new StringBuilder();
		Iterator<Character> it = map.keySet().iterator();

		while (it.hasNext()) {
			Character key = it.next();
			Integer value = map.get(key);

			sb.append(key + "(" + value + ")");
		}

		return sb.toString();
	}
	
}

