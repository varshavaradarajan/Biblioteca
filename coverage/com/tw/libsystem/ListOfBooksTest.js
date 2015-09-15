var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":44,"id":0,"methods":[{"el":21,"sc":5,"sl":11},{"el":32,"sc":5,"sl":23},{"el":43,"sc":5,"sl":34}],"name":"ListOfBooksTest","sl":9}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_119":{"methods":[{"sl":23}],"name":"shouldReturnBookDetailsWithColumnHeaders","pass":true,"statements":[{"sl":25},{"sl":26},{"sl":27},{"sl":28},{"sl":30},{"sl":31}]},"test_251":{"methods":[{"sl":23}],"name":"shouldReturnBookDetailsWithColumnHeaders","pass":true,"statements":[{"sl":25},{"sl":26},{"sl":27},{"sl":28},{"sl":30},{"sl":31}]},"test_328":{"methods":[{"sl":34}],"name":"shouldReturnAllBookDetailsUponCallingExecuteMethod","pass":true,"statements":[{"sl":36},{"sl":37},{"sl":38},{"sl":39},{"sl":41},{"sl":42}]},"test_641":{"methods":[{"sl":11}],"name":"shouldReturnAPreExistingSetOfBooks","pass":true,"statements":[{"sl":13},{"sl":14},{"sl":15},{"sl":16},{"sl":18},{"sl":20}]},"test_722":{"methods":[{"sl":34}],"name":"shouldReturnAllBookDetailsUponCallingExecuteMethod","pass":true,"statements":[{"sl":36},{"sl":37},{"sl":38},{"sl":39},{"sl":41},{"sl":42}]},"test_788":{"methods":[{"sl":11}],"name":"shouldReturnAPreExistingSetOfBooks","pass":true,"statements":[{"sl":13},{"sl":14},{"sl":15},{"sl":16},{"sl":18},{"sl":20}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = $jsonSrcFileLines
