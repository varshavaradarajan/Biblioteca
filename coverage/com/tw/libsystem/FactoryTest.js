var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":32,"id":781,"methods":[{"el":15,"sc":5,"sl":9},{"el":22,"sc":5,"sl":17},{"el":31,"sc":5,"sl":24}],"name":"FactoryTest","sl":7}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_306":{"methods":[{"sl":24}],"name":"shouldReturnNewParserObject","pass":true,"statements":[{"sl":26},{"sl":27},{"sl":28},{"sl":30}]},"test_6":{"methods":[{"sl":17}],"name":"shouldReturnNewInputViewObjects","pass":true,"statements":[{"sl":19},{"sl":21}]},"test_63":{"methods":[{"sl":9}],"name":"shouldReturnNewDisplayObjects","pass":true,"statements":[{"sl":11},{"sl":12},{"sl":14}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [63], [], [63], [63], [], [63], [], [], [6], [], [6], [], [6], [], [], [306], [], [306], [306], [306], [], [306], [], []]
