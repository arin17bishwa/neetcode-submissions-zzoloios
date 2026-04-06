from collections import Counter
from typing import List


class Solution:
    def hasDuplicate(self, nums: List[int]) -> bool:
        return any(i > 1 for i in Counter(nums).values())
