var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":37,"id":1146,"methods":[{"el":16,"sc":5,"sl":13},{"el":21,"sc":5,"sl":18},{"el":26,"sc":5,"sl":23},{"el":36,"sc":5,"sl":28}],"name":"Factory","sl":6}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_165":{"methods":[{"sl":13}],"name":"shouldReturnNewDisplayObjects","pass":true,"statements":[{"sl":14},{"sl":15}]},"test_202":{"methods":[{"sl":23}],"name":"shouldReturnNewParserObject","pass":true,"statements":[{"sl":24},{"sl":25}]},"test_316":{"methods":[{"sl":28}],"name":"shouldReturnNewMenus","pass":true,"statements":[{"sl":29},{"sl":30},{"sl":31},{"sl":32},{"sl":33},{"sl":34},{"sl":35}]},"test_493":{"methods":[{"sl":18}],"name":"shouldReturnNewInputViewObjects","pass":true,"statements":[{"sl":19},{"sl":20}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [], [], [], [165], [165], [165], [], [], [493], [493], [493], [], [], [202], [202], [202], [], [], [316], [316], [316], [316], [316], [316], [316], [316], [], []]
