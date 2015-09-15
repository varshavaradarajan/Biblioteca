var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":118,"id":1346,"methods":[{"el":19,"sc":5,"sl":14},{"el":31,"sc":5,"sl":21},{"el":43,"sc":5,"sl":33},{"el":51,"sc":5,"sl":45},{"el":63,"sc":5,"sl":53},{"el":71,"sc":5,"sl":65},{"el":79,"sc":5,"sl":73},{"el":88,"sc":5,"sl":81},{"el":100,"sc":5,"sl":90},{"el":108,"sc":5,"sl":102},{"el":116,"sc":5,"sl":110}],"name":"LibraryTest","sl":12}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_0":{"methods":[{"sl":53}],"name":"shouldReturnFalseWhenLibraryDoesNotHaveABookAfterWeRemoveItFromBookList","pass":true,"statements":[{"sl":55},{"sl":56},{"sl":57},{"sl":58},{"sl":59},{"sl":60},{"sl":62}]},"test_100":{"methods":[{"sl":21}],"name":"shouldReturnTrueIfLibraryHasABook","pass":true,"statements":[{"sl":23},{"sl":24},{"sl":25},{"sl":26},{"sl":27},{"sl":28},{"sl":30}]},"test_1007":{"methods":[{"sl":14}],"name":"shouldReturnTheContentsOfLibrary","pass":true,"statements":[{"sl":16},{"sl":18}]},"test_1009":{"methods":[{"sl":102}],"name":"shouldReturnAnotherMessageIfBookIsNotAdded","pass":true,"statements":[{"sl":104},{"sl":105},{"sl":107}]},"test_1019":{"methods":[{"sl":110}],"name":"shouldReturnANotValidMessageIfTheBookSpecifiedIsNotInCheckedOutBookList","pass":true,"statements":[{"sl":112},{"sl":113},{"sl":115}]},"test_1051":{"methods":[{"sl":90}],"name":"shouldReturnFalseIfLibraryDoesNotHaveABookEqualToBookBeingSpecified","pass":true,"statements":[{"sl":92},{"sl":93},{"sl":94},{"sl":95},{"sl":96},{"sl":97},{"sl":99}]},"test_1058":{"methods":[{"sl":81}],"name":"shouldReturnAMessageIfBookIsAdded","pass":true,"statements":[{"sl":83},{"sl":84},{"sl":85},{"sl":87}]},"test_1070":{"methods":[{"sl":102}],"name":"shouldReturnAnotherMessageIfBookIsNotAdded","pass":true,"statements":[{"sl":104},{"sl":105},{"sl":107}]},"test_1072":{"methods":[{"sl":73}],"name":"shouldAddCheckedOutBookToAnotherList","pass":true,"statements":[{"sl":75},{"sl":76},{"sl":78}]},"test_1074":{"methods":[{"sl":53}],"name":"shouldReturnFalseWhenLibraryDoesNotHaveABookAfterWeRemoveItFromBookList","pass":true,"statements":[{"sl":55},{"sl":56},{"sl":57},{"sl":58},{"sl":59},{"sl":60},{"sl":62}]},"test_1075":{"methods":[{"sl":14}],"name":"shouldReturnTheContentsOfLibrary","pass":true,"statements":[{"sl":16},{"sl":18}]},"test_1087":{"methods":[{"sl":14}],"name":"shouldReturnTheContentsOfLibrary","pass":true,"statements":[{"sl":16},{"sl":18}]},"test_1094":{"methods":[{"sl":65}],"name":"shouldReturnAnotherMessageIfBookIsNotRemoved","pass":true,"statements":[{"sl":67},{"sl":68},{"sl":70}]},"test_1096":{"methods":[{"sl":33}],"name":"shouldReturnTrueIfLibraryHasABookEqualToBookBeingSpecified","pass":true,"statements":[{"sl":35},{"sl":36},{"sl":37},{"sl":38},{"sl":39},{"sl":40},{"sl":42}]},"test_1103":{"methods":[{"sl":21}],"name":"shouldReturnTrueIfLibraryHasABook","pass":true,"statements":[{"sl":23},{"sl":24},{"sl":25},{"sl":26},{"sl":27},{"sl":28},{"sl":30}]},"test_1116":{"methods":[{"sl":90}],"name":"shouldReturnFalseIfLibraryDoesNotHaveABookEqualToBookBeingSpecified","pass":true,"statements":[{"sl":92},{"sl":93},{"sl":94},{"sl":95},{"sl":96},{"sl":97},{"sl":99}]},"test_1130":{"methods":[{"sl":21}],"name":"shouldReturnTrueIfLibraryHasABook","pass":true,"statements":[{"sl":23},{"sl":24},{"sl":25},{"sl":26},{"sl":27},{"sl":28},{"sl":30}]},"test_1142":{"methods":[{"sl":81}],"name":"shouldReturnAMessageIfBookIsAdded","pass":true,"statements":[{"sl":83},{"sl":84},{"sl":85},{"sl":87}]},"test_1158":{"methods":[{"sl":65}],"name":"shouldReturnAnotherMessageIfBookIsNotRemoved","pass":true,"statements":[{"sl":67},{"sl":68},{"sl":70}]},"test_1167":{"methods":[{"sl":81}],"name":"shouldReturnAMessageIfBookIsAdded","pass":true,"statements":[{"sl":83},{"sl":84},{"sl":85},{"sl":87}]},"test_1174":{"methods":[{"sl":14}],"name":"shouldReturnTheContentsOfLibrary","pass":true,"statements":[{"sl":16},{"sl":18}]},"test_120":{"methods":[{"sl":102}],"name":"shouldReturnAnotherMessageIfBookIsNotAdded","pass":true,"statements":[{"sl":104},{"sl":105},{"sl":107}]},"test_1209":{"methods":[{"sl":65}],"name":"shouldReturnAnotherMessageIfBookIsNotRemoved","pass":true,"statements":[{"sl":67},{"sl":68},{"sl":70}]},"test_1215":{"methods":[{"sl":90}],"name":"shouldReturnFalseIfLibraryDoesNotHaveABookEqualToBookBeingSpecified","pass":true,"statements":[{"sl":92},{"sl":93},{"sl":94},{"sl":95},{"sl":96},{"sl":97},{"sl":99}]},"test_1235":{"methods":[{"sl":81}],"name":"shouldReturnAMessageIfBookIsAdded","pass":true,"statements":[{"sl":83},{"sl":84},{"sl":85},{"sl":87}]},"test_126":{"methods":[{"sl":14}],"name":"shouldReturnTheContentsOfLibrary","pass":true,"statements":[{"sl":16},{"sl":18}]},"test_135":{"methods":[{"sl":110}],"name":"shouldReturnANotValidMessageIfTheBookSpecifiedIsNotInCheckedOutBookList","pass":true,"statements":[{"sl":112},{"sl":113},{"sl":115}]},"test_149":{"methods":[{"sl":81}],"name":"shouldReturnAMessageIfBookIsAdded","pass":true,"statements":[{"sl":83},{"sl":84},{"sl":85},{"sl":87}]},"test_162":{"methods":[{"sl":90}],"name":"shouldReturnFalseIfLibraryDoesNotHaveABookEqualToBookBeingSpecified","pass":true,"statements":[{"sl":92},{"sl":93},{"sl":94},{"sl":95},{"sl":96},{"sl":97},{"sl":99}]},"test_168":{"methods":[{"sl":65}],"name":"shouldReturnAnotherMessageIfBookIsNotRemoved","pass":true,"statements":[{"sl":67},{"sl":68},{"sl":70}]},"test_178":{"methods":[{"sl":102}],"name":"shouldReturnAnotherMessageIfBookIsNotAdded","pass":true,"statements":[{"sl":104},{"sl":105},{"sl":107}]},"test_188":{"methods":[{"sl":110}],"name":"shouldReturnANotValidMessageIfTheBookSpecifiedIsNotInCheckedOutBookList","pass":true,"statements":[{"sl":112},{"sl":113},{"sl":115}]},"test_195":{"methods":[{"sl":65}],"name":"shouldReturnAnotherMessageIfBookIsNotRemoved","pass":true,"statements":[{"sl":67},{"sl":68},{"sl":70}]},"test_200":{"methods":[{"sl":110}],"name":"shouldReturnANotValidMessageIfTheBookSpecifiedIsNotInCheckedOutBookList","pass":true,"statements":[{"sl":112},{"sl":113},{"sl":115}]},"test_206":{"methods":[{"sl":90}],"name":"shouldReturnFalseIfLibraryDoesNotHaveABookEqualToBookBeingSpecified","pass":true,"statements":[{"sl":92},{"sl":93},{"sl":94},{"sl":95},{"sl":96},{"sl":97},{"sl":99}]},"test_228":{"methods":[{"sl":73}],"name":"shouldAddCheckedOutBookToAnotherList","pass":true,"statements":[{"sl":75},{"sl":76},{"sl":78}]},"test_28":{"methods":[{"sl":33}],"name":"shouldReturnTrueIfLibraryHasABookEqualToBookBeingSpecified","pass":true,"statements":[{"sl":35},{"sl":36},{"sl":37},{"sl":38},{"sl":39},{"sl":40},{"sl":42}]},"test_281":{"methods":[{"sl":65}],"name":"shouldReturnAnotherMessageIfBookIsNotRemoved","pass":true,"statements":[{"sl":67},{"sl":68},{"sl":70}]},"test_293":{"methods":[{"sl":33}],"name":"shouldReturnTrueIfLibraryHasABookEqualToBookBeingSpecified","pass":true,"statements":[{"sl":35},{"sl":36},{"sl":37},{"sl":38},{"sl":39},{"sl":40},{"sl":42}]},"test_3":{"methods":[{"sl":102}],"name":"shouldReturnAnotherMessageIfBookIsNotAdded","pass":true,"statements":[{"sl":104},{"sl":105},{"sl":107}]},"test_307":{"methods":[{"sl":33}],"name":"shouldReturnTrueIfLibraryHasABookEqualToBookBeingSpecified","pass":true,"statements":[{"sl":35},{"sl":36},{"sl":37},{"sl":38},{"sl":39},{"sl":40},{"sl":42}]},"test_312":{"methods":[{"sl":21}],"name":"shouldReturnTrueIfLibraryHasABook","pass":true,"statements":[{"sl":23},{"sl":24},{"sl":25},{"sl":26},{"sl":27},{"sl":28},{"sl":30}]},"test_329":{"methods":[{"sl":90}],"name":"shouldReturnFalseIfLibraryDoesNotHaveABookEqualToBookBeingSpecified","pass":true,"statements":[{"sl":92},{"sl":93},{"sl":94},{"sl":95},{"sl":96},{"sl":97},{"sl":99}]},"test_333":{"methods":[{"sl":81}],"name":"shouldReturnAMessageIfBookIsAdded","pass":true,"statements":[{"sl":83},{"sl":84},{"sl":85},{"sl":87}]},"test_340":{"methods":[{"sl":21}],"name":"shouldReturnTrueIfLibraryHasABook","pass":true,"statements":[{"sl":23},{"sl":24},{"sl":25},{"sl":26},{"sl":27},{"sl":28},{"sl":30}]},"test_353":{"methods":[{"sl":110}],"name":"shouldReturnANotValidMessageIfTheBookSpecifiedIsNotInCheckedOutBookList","pass":true,"statements":[{"sl":112},{"sl":113},{"sl":115}]},"test_370":{"methods":[{"sl":45}],"name":"shouldReturnMessageIfBookIsRemoved","pass":true,"statements":[{"sl":47},{"sl":48},{"sl":50}]},"test_373":{"methods":[{"sl":102}],"name":"shouldReturnAnotherMessageIfBookIsNotAdded","pass":true,"statements":[{"sl":104},{"sl":105},{"sl":107}]},"test_374":{"methods":[{"sl":33}],"name":"shouldReturnTrueIfLibraryHasABookEqualToBookBeingSpecified","pass":true,"statements":[{"sl":35},{"sl":36},{"sl":37},{"sl":38},{"sl":39},{"sl":40},{"sl":42}]},"test_385":{"methods":[{"sl":21}],"name":"shouldReturnTrueIfLibraryHasABook","pass":true,"statements":[{"sl":23},{"sl":24},{"sl":25},{"sl":26},{"sl":27},{"sl":28},{"sl":30}]},"test_387":{"methods":[{"sl":81}],"name":"shouldReturnAMessageIfBookIsAdded","pass":true,"statements":[{"sl":83},{"sl":84},{"sl":85},{"sl":87}]},"test_388":{"methods":[{"sl":53}],"name":"shouldReturnFalseWhenLibraryDoesNotHaveABookAfterWeRemoveItFromBookList","pass":true,"statements":[{"sl":55},{"sl":56},{"sl":57},{"sl":58},{"sl":59},{"sl":60},{"sl":62}]},"test_392":{"methods":[{"sl":53}],"name":"shouldReturnFalseWhenLibraryDoesNotHaveABookAfterWeRemoveItFromBookList","pass":true,"statements":[{"sl":55},{"sl":56},{"sl":57},{"sl":58},{"sl":59},{"sl":60},{"sl":62}]},"test_41":{"methods":[{"sl":45}],"name":"shouldReturnMessageIfBookIsRemoved","pass":true,"statements":[{"sl":47},{"sl":48},{"sl":50}]},"test_42":{"methods":[{"sl":110}],"name":"shouldReturnANotValidMessageIfTheBookSpecifiedIsNotInCheckedOutBookList","pass":true,"statements":[{"sl":112},{"sl":113},{"sl":115}]},"test_422":{"methods":[{"sl":14}],"name":"shouldReturnTheContentsOfLibrary","pass":true,"statements":[{"sl":16},{"sl":18}]},"test_428":{"methods":[{"sl":21}],"name":"shouldReturnTrueIfLibraryHasABook","pass":true,"statements":[{"sl":23},{"sl":24},{"sl":25},{"sl":26},{"sl":27},{"sl":28},{"sl":30}]},"test_449":{"methods":[{"sl":102}],"name":"shouldReturnAnotherMessageIfBookIsNotAdded","pass":true,"statements":[{"sl":104},{"sl":105},{"sl":107}]},"test_452":{"methods":[{"sl":53}],"name":"shouldReturnFalseWhenLibraryDoesNotHaveABookAfterWeRemoveItFromBookList","pass":true,"statements":[{"sl":55},{"sl":56},{"sl":57},{"sl":58},{"sl":59},{"sl":60},{"sl":62}]},"test_485":{"methods":[{"sl":53}],"name":"shouldReturnFalseWhenLibraryDoesNotHaveABookAfterWeRemoveItFromBookList","pass":true,"statements":[{"sl":55},{"sl":56},{"sl":57},{"sl":58},{"sl":59},{"sl":60},{"sl":62}]},"test_530":{"methods":[{"sl":33}],"name":"shouldReturnTrueIfLibraryHasABookEqualToBookBeingSpecified","pass":true,"statements":[{"sl":35},{"sl":36},{"sl":37},{"sl":38},{"sl":39},{"sl":40},{"sl":42}]},"test_534":{"methods":[{"sl":14}],"name":"shouldReturnTheContentsOfLibrary","pass":true,"statements":[{"sl":16},{"sl":18}]},"test_535":{"methods":[{"sl":53}],"name":"shouldReturnFalseWhenLibraryDoesNotHaveABookAfterWeRemoveItFromBookList","pass":true,"statements":[{"sl":55},{"sl":56},{"sl":57},{"sl":58},{"sl":59},{"sl":60},{"sl":62}]},"test_555":{"methods":[{"sl":65}],"name":"shouldReturnAnotherMessageIfBookIsNotRemoved","pass":true,"statements":[{"sl":67},{"sl":68},{"sl":70}]},"test_561":{"methods":[{"sl":73}],"name":"shouldAddCheckedOutBookToAnotherList","pass":true,"statements":[{"sl":75},{"sl":76},{"sl":78}]},"test_569":{"methods":[{"sl":21}],"name":"shouldReturnTrueIfLibraryHasABook","pass":true,"statements":[{"sl":23},{"sl":24},{"sl":25},{"sl":26},{"sl":27},{"sl":28},{"sl":30}]},"test_574":{"methods":[{"sl":45}],"name":"shouldReturnMessageIfBookIsRemoved","pass":true,"statements":[{"sl":47},{"sl":48},{"sl":50}]},"test_578":{"methods":[{"sl":81}],"name":"shouldReturnAMessageIfBookIsAdded","pass":true,"statements":[{"sl":83},{"sl":84},{"sl":85},{"sl":87}]},"test_592":{"methods":[{"sl":33}],"name":"shouldReturnTrueIfLibraryHasABookEqualToBookBeingSpecified","pass":true,"statements":[{"sl":35},{"sl":36},{"sl":37},{"sl":38},{"sl":39},{"sl":40},{"sl":42}]},"test_593":{"methods":[{"sl":53}],"name":"shouldReturnFalseWhenLibraryDoesNotHaveABookAfterWeRemoveItFromBookList","pass":true,"statements":[{"sl":55},{"sl":56},{"sl":57},{"sl":58},{"sl":59},{"sl":60},{"sl":62}]},"test_604":{"methods":[{"sl":110}],"name":"shouldReturnANotValidMessageIfTheBookSpecifiedIsNotInCheckedOutBookList","pass":true,"statements":[{"sl":112},{"sl":113},{"sl":115}]},"test_605":{"methods":[{"sl":102}],"name":"shouldReturnAnotherMessageIfBookIsNotAdded","pass":true,"statements":[{"sl":104},{"sl":105},{"sl":107}]},"test_61":{"methods":[{"sl":73}],"name":"shouldAddCheckedOutBookToAnotherList","pass":true,"statements":[{"sl":75},{"sl":76},{"sl":78}]},"test_617":{"methods":[{"sl":73}],"name":"shouldAddCheckedOutBookToAnotherList","pass":true,"statements":[{"sl":75},{"sl":76},{"sl":78}]},"test_62":{"methods":[{"sl":45}],"name":"shouldReturnMessageIfBookIsRemoved","pass":true,"statements":[{"sl":47},{"sl":48},{"sl":50}]},"test_624":{"methods":[{"sl":102}],"name":"shouldReturnAnotherMessageIfBookIsNotAdded","pass":true,"statements":[{"sl":104},{"sl":105},{"sl":107}]},"test_625":{"methods":[{"sl":81}],"name":"shouldReturnAMessageIfBookIsAdded","pass":true,"statements":[{"sl":83},{"sl":84},{"sl":85},{"sl":87}]},"test_632":{"methods":[{"sl":90}],"name":"shouldReturnFalseIfLibraryDoesNotHaveABookEqualToBookBeingSpecified","pass":true,"statements":[{"sl":92},{"sl":93},{"sl":94},{"sl":95},{"sl":96},{"sl":97},{"sl":99}]},"test_651":{"methods":[{"sl":33}],"name":"shouldReturnTrueIfLibraryHasABookEqualToBookBeingSpecified","pass":true,"statements":[{"sl":35},{"sl":36},{"sl":37},{"sl":38},{"sl":39},{"sl":40},{"sl":42}]},"test_668":{"methods":[{"sl":14}],"name":"shouldReturnTheContentsOfLibrary","pass":true,"statements":[{"sl":16},{"sl":18}]},"test_684":{"methods":[{"sl":21}],"name":"shouldReturnTrueIfLibraryHasABook","pass":true,"statements":[{"sl":23},{"sl":24},{"sl":25},{"sl":26},{"sl":27},{"sl":28},{"sl":30}]},"test_70":{"methods":[{"sl":90}],"name":"shouldReturnFalseIfLibraryDoesNotHaveABookEqualToBookBeingSpecified","pass":true,"statements":[{"sl":92},{"sl":93},{"sl":94},{"sl":95},{"sl":96},{"sl":97},{"sl":99}]},"test_700":{"methods":[{"sl":45}],"name":"shouldReturnMessageIfBookIsRemoved","pass":true,"statements":[{"sl":47},{"sl":48},{"sl":50}]},"test_702":{"methods":[{"sl":102}],"name":"shouldReturnAnotherMessageIfBookIsNotAdded","pass":true,"statements":[{"sl":104},{"sl":105},{"sl":107}]},"test_716":{"methods":[{"sl":90}],"name":"shouldReturnFalseIfLibraryDoesNotHaveABookEqualToBookBeingSpecified","pass":true,"statements":[{"sl":92},{"sl":93},{"sl":94},{"sl":95},{"sl":96},{"sl":97},{"sl":99}]},"test_720":{"methods":[{"sl":65}],"name":"shouldReturnAnotherMessageIfBookIsNotRemoved","pass":true,"statements":[{"sl":67},{"sl":68},{"sl":70}]},"test_742":{"methods":[{"sl":53}],"name":"shouldReturnFalseWhenLibraryDoesNotHaveABookAfterWeRemoveItFromBookList","pass":true,"statements":[{"sl":55},{"sl":56},{"sl":57},{"sl":58},{"sl":59},{"sl":60},{"sl":62}]},"test_755":{"methods":[{"sl":33}],"name":"shouldReturnTrueIfLibraryHasABookEqualToBookBeingSpecified","pass":true,"statements":[{"sl":35},{"sl":36},{"sl":37},{"sl":38},{"sl":39},{"sl":40},{"sl":42}]},"test_775":{"methods":[{"sl":45}],"name":"shouldReturnMessageIfBookIsRemoved","pass":true,"statements":[{"sl":47},{"sl":48},{"sl":50}]},"test_783":{"methods":[{"sl":90}],"name":"shouldReturnFalseIfLibraryDoesNotHaveABookEqualToBookBeingSpecified","pass":true,"statements":[{"sl":92},{"sl":93},{"sl":94},{"sl":95},{"sl":96},{"sl":97},{"sl":99}]},"test_793":{"methods":[{"sl":73}],"name":"shouldAddCheckedOutBookToAnotherList","pass":true,"statements":[{"sl":75},{"sl":76},{"sl":78}]},"test_796":{"methods":[{"sl":53}],"name":"shouldReturnFalseWhenLibraryDoesNotHaveABookAfterWeRemoveItFromBookList","pass":true,"statements":[{"sl":55},{"sl":56},{"sl":57},{"sl":58},{"sl":59},{"sl":60},{"sl":62}]},"test_805":{"methods":[{"sl":45}],"name":"shouldReturnMessageIfBookIsRemoved","pass":true,"statements":[{"sl":47},{"sl":48},{"sl":50}]},"test_808":{"methods":[{"sl":110}],"name":"shouldReturnANotValidMessageIfTheBookSpecifiedIsNotInCheckedOutBookList","pass":true,"statements":[{"sl":112},{"sl":113},{"sl":115}]},"test_822":{"methods":[{"sl":81}],"name":"shouldReturnAMessageIfBookIsAdded","pass":true,"statements":[{"sl":83},{"sl":84},{"sl":85},{"sl":87}]},"test_826":{"methods":[{"sl":14}],"name":"shouldReturnTheContentsOfLibrary","pass":true,"statements":[{"sl":16},{"sl":18}]},"test_842":{"methods":[{"sl":73}],"name":"shouldAddCheckedOutBookToAnotherList","pass":true,"statements":[{"sl":75},{"sl":76},{"sl":78}]},"test_843":{"methods":[{"sl":45}],"name":"shouldReturnMessageIfBookIsRemoved","pass":true,"statements":[{"sl":47},{"sl":48},{"sl":50}]},"test_845":{"methods":[{"sl":65}],"name":"shouldReturnAnotherMessageIfBookIsNotRemoved","pass":true,"statements":[{"sl":67},{"sl":68},{"sl":70}]},"test_89":{"methods":[{"sl":65}],"name":"shouldReturnAnotherMessageIfBookIsNotRemoved","pass":true,"statements":[{"sl":67},{"sl":68},{"sl":70}]},"test_890":{"methods":[{"sl":73}],"name":"shouldAddCheckedOutBookToAnotherList","pass":true,"statements":[{"sl":75},{"sl":76},{"sl":78}]},"test_899":{"methods":[{"sl":73}],"name":"shouldAddCheckedOutBookToAnotherList","pass":true,"statements":[{"sl":75},{"sl":76},{"sl":78}]},"test_922":{"methods":[{"sl":45}],"name":"shouldReturnMessageIfBookIsRemoved","pass":true,"statements":[{"sl":47},{"sl":48},{"sl":50}]},"test_938":{"methods":[{"sl":45}],"name":"shouldReturnMessageIfBookIsRemoved","pass":true,"statements":[{"sl":47},{"sl":48},{"sl":50}]},"test_949":{"methods":[{"sl":21}],"name":"shouldReturnTrueIfLibraryHasABook","pass":true,"statements":[{"sl":23},{"sl":24},{"sl":25},{"sl":26},{"sl":27},{"sl":28},{"sl":30}]},"test_960":{"methods":[{"sl":14}],"name":"shouldReturnTheContentsOfLibrary","pass":true,"statements":[{"sl":16},{"sl":18}]},"test_962":{"methods":[{"sl":110}],"name":"shouldReturnANotValidMessageIfTheBookSpecifiedIsNotInCheckedOutBookList","pass":true,"statements":[{"sl":112},{"sl":113},{"sl":115}]},"test_982":{"methods":[{"sl":73}],"name":"shouldAddCheckedOutBookToAnotherList","pass":true,"statements":[{"sl":75},{"sl":76},{"sl":78}]},"test_989":{"methods":[{"sl":110}],"name":"shouldReturnANotValidMessageIfTheBookSpecifiedIsNotInCheckedOutBookList","pass":true,"statements":[{"sl":112},{"sl":113},{"sl":115}]},"test_992":{"methods":[{"sl":33}],"name":"shouldReturnTrueIfLibraryHasABookEqualToBookBeingSpecified","pass":true,"statements":[{"sl":35},{"sl":36},{"sl":37},{"sl":38},{"sl":39},{"sl":40},{"sl":42}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [], [], [], [], [534, 1174, 826, 422, 126, 668, 1075, 1007, 1087, 960], [], [534, 1174, 826, 422, 126, 668, 1075, 1007, 1087, 960], [], [534, 1174, 826, 422, 126, 668, 1075, 1007, 1087, 960], [], [], [385, 340, 428, 684, 312, 100, 569, 949, 1130, 1103], [], [385, 340, 428, 684, 312, 100, 569, 949, 1130, 1103], [385, 340, 428, 684, 312, 100, 569, 949, 1130, 1103], [385, 340, 428, 684, 312, 100, 569, 949, 1130, 1103], [385, 340, 428, 684, 312, 100, 569, 949, 1130, 1103], [385, 340, 428, 684, 312, 100, 569, 949, 1130, 1103], [385, 340, 428, 684, 312, 100, 569, 949, 1130, 1103], [], [385, 340, 428, 684, 312, 100, 569, 949, 1130, 1103], [], [], [755, 1096, 374, 592, 992, 307, 651, 28, 530, 293], [], [755, 1096, 374, 592, 992, 307, 651, 28, 530, 293], [755, 1096, 374, 592, 992, 307, 651, 28, 530, 293], [755, 1096, 374, 592, 992, 307, 651, 28, 530, 293], [755, 1096, 374, 592, 992, 307, 651, 28, 530, 293], [755, 1096, 374, 592, 992, 307, 651, 28, 530, 293], [755, 1096, 374, 592, 992, 307, 651, 28, 530, 293], [], [755, 1096, 374, 592, 992, 307, 651, 28, 530, 293], [], [], [775, 938, 805, 41, 700, 370, 843, 922, 62, 574], [], [775, 938, 805, 41, 700, 370, 843, 922, 62, 574], [775, 938, 805, 41, 700, 370, 843, 922, 62, 574], [], [775, 938, 805, 41, 700, 370, 843, 922, 62, 574], [], [], [535, 1074, 593, 388, 742, 796, 452, 0, 392, 485], [], [535, 1074, 593, 388, 742, 796, 452, 0, 392, 485], [535, 1074, 593, 388, 742, 796, 452, 0, 392, 485], [535, 1074, 593, 388, 742, 796, 452, 0, 392, 485], [535, 1074, 593, 388, 742, 796, 452, 0, 392, 485], [535, 1074, 593, 388, 742, 796, 452, 0, 392, 485], [535, 1074, 593, 388, 742, 796, 452, 0, 392, 485], [], [535, 1074, 593, 388, 742, 796, 452, 0, 392, 485], [], [], [845, 1094, 1209, 168, 1158, 720, 89, 555, 195, 281], [], [845, 1094, 1209, 168, 1158, 720, 89, 555, 195, 281], [845, 1094, 1209, 168, 1158, 720, 89, 555, 195, 281], [], [845, 1094, 1209, 168, 1158, 720, 89, 555, 195, 281], [], [], [61, 982, 228, 890, 1072, 899, 561, 617, 842, 793], [], [61, 982, 228, 890, 1072, 899, 561, 617, 842, 793], [61, 982, 228, 890, 1072, 899, 561, 617, 842, 793], [], [61, 982, 228, 890, 1072, 899, 561, 617, 842, 793], [], [], [578, 387, 822, 1058, 1142, 1167, 333, 149, 1235, 625], [], [578, 387, 822, 1058, 1142, 1167, 333, 149, 1235, 625], [578, 387, 822, 1058, 1142, 1167, 333, 149, 1235, 625], [578, 387, 822, 1058, 1142, 1167, 333, 149, 1235, 625], [], [578, 387, 822, 1058, 1142, 1167, 333, 149, 1235, 625], [], [], [1051, 70, 162, 716, 632, 1116, 329, 206, 783, 1215], [], [1051, 70, 162, 716, 632, 1116, 329, 206, 783, 1215], [1051, 70, 162, 716, 632, 1116, 329, 206, 783, 1215], [1051, 70, 162, 716, 632, 1116, 329, 206, 783, 1215], [1051, 70, 162, 716, 632, 1116, 329, 206, 783, 1215], [1051, 70, 162, 716, 632, 1116, 329, 206, 783, 1215], [1051, 70, 162, 716, 632, 1116, 329, 206, 783, 1215], [], [1051, 70, 162, 716, 632, 1116, 329, 206, 783, 1215], [], [], [449, 120, 178, 605, 373, 3, 1009, 1070, 702, 624], [], [449, 120, 178, 605, 373, 3, 1009, 1070, 702, 624], [449, 120, 178, 605, 373, 3, 1009, 1070, 702, 624], [], [449, 120, 178, 605, 373, 3, 1009, 1070, 702, 624], [], [], [604, 135, 42, 962, 808, 1019, 200, 188, 989, 353], [], [604, 135, 42, 962, 808, 1019, 200, 188, 989, 353], [604, 135, 42, 962, 808, 1019, 200, 188, 989, 353], [], [604, 135, 42, 962, 808, 1019, 200, 188, 989, 353], [], [], []]
