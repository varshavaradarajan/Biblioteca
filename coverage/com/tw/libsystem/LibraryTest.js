var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":118,"id":1346,"methods":[{"el":19,"sc":5,"sl":14},{"el":31,"sc":5,"sl":21},{"el":43,"sc":5,"sl":33},{"el":51,"sc":5,"sl":45},{"el":63,"sc":5,"sl":53},{"el":71,"sc":5,"sl":65},{"el":79,"sc":5,"sl":73},{"el":88,"sc":5,"sl":81},{"el":100,"sc":5,"sl":90},{"el":108,"sc":5,"sl":102},{"el":116,"sc":5,"sl":110}],"name":"LibraryTest","sl":12}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_101":{"methods":[{"sl":81}],"name":"shouldReturnAMessageIfBookIsAdded","pass":true,"statements":[{"sl":83},{"sl":84},{"sl":85},{"sl":87}]},"test_115":{"methods":[{"sl":65}],"name":"shouldReturnAnotherMessageIfBookIsNotRemoved","pass":true,"statements":[{"sl":67},{"sl":68},{"sl":70}]},"test_121":{"methods":[{"sl":102}],"name":"shouldReturnAnotherMessageIfBookIsNotAdded","pass":true,"statements":[{"sl":104},{"sl":105},{"sl":107}]},"test_136":{"methods":[{"sl":65}],"name":"shouldReturnAnotherMessageIfBookIsNotRemoved","pass":true,"statements":[{"sl":67},{"sl":68},{"sl":70}]},"test_139":{"methods":[{"sl":110}],"name":"shouldReturnANotValidMessageIfTheBookSpecifiedIsNotInCheckedOutBookList","pass":true,"statements":[{"sl":112},{"sl":113},{"sl":115}]},"test_143":{"methods":[{"sl":90}],"name":"shouldReturnFalseIfLibraryDoesNotHaveABookEqualToBookBeingSpecified","pass":true,"statements":[{"sl":92},{"sl":93},{"sl":94},{"sl":95},{"sl":96},{"sl":97},{"sl":99}]},"test_15":{"methods":[{"sl":33}],"name":"shouldReturnTrueIfLibraryHasABookEqualToBookBeingSpecified","pass":true,"statements":[{"sl":35},{"sl":36},{"sl":37},{"sl":38},{"sl":39},{"sl":40},{"sl":42}]},"test_198":{"methods":[{"sl":65}],"name":"shouldReturnAnotherMessageIfBookIsNotRemoved","pass":true,"statements":[{"sl":67},{"sl":68},{"sl":70}]},"test_219":{"methods":[{"sl":21}],"name":"shouldReturnTrueIfLibraryHasABook","pass":true,"statements":[{"sl":23},{"sl":24},{"sl":25},{"sl":26},{"sl":27},{"sl":28},{"sl":30}]},"test_232":{"methods":[{"sl":90}],"name":"shouldReturnFalseIfLibraryDoesNotHaveABookEqualToBookBeingSpecified","pass":true,"statements":[{"sl":92},{"sl":93},{"sl":94},{"sl":95},{"sl":96},{"sl":97},{"sl":99}]},"test_24":{"methods":[{"sl":45}],"name":"shouldReturnMessageIfBookIsRemoved","pass":true,"statements":[{"sl":47},{"sl":48},{"sl":50}]},"test_247":{"methods":[{"sl":110}],"name":"shouldReturnANotValidMessageIfTheBookSpecifiedIsNotInCheckedOutBookList","pass":true,"statements":[{"sl":112},{"sl":113},{"sl":115}]},"test_272":{"methods":[{"sl":21}],"name":"shouldReturnTrueIfLibraryHasABook","pass":true,"statements":[{"sl":23},{"sl":24},{"sl":25},{"sl":26},{"sl":27},{"sl":28},{"sl":30}]},"test_273":{"methods":[{"sl":53}],"name":"shouldReturnFalseWhenLibraryDoesNotHaveABookAfterWeRemoveItFromBookList","pass":true,"statements":[{"sl":55},{"sl":56},{"sl":57},{"sl":58},{"sl":59},{"sl":60},{"sl":62}]},"test_296":{"methods":[{"sl":14}],"name":"shouldReturnTheContentsOfLibrary","pass":true,"statements":[{"sl":16},{"sl":18}]},"test_318":{"methods":[{"sl":102}],"name":"shouldReturnAnotherMessageIfBookIsNotAdded","pass":true,"statements":[{"sl":104},{"sl":105},{"sl":107}]},"test_344":{"methods":[{"sl":53}],"name":"shouldReturnFalseWhenLibraryDoesNotHaveABookAfterWeRemoveItFromBookList","pass":true,"statements":[{"sl":55},{"sl":56},{"sl":57},{"sl":58},{"sl":59},{"sl":60},{"sl":62}]},"test_380":{"methods":[{"sl":33}],"name":"shouldReturnTrueIfLibraryHasABookEqualToBookBeingSpecified","pass":true,"statements":[{"sl":35},{"sl":36},{"sl":37},{"sl":38},{"sl":39},{"sl":40},{"sl":42}]},"test_383":{"methods":[{"sl":53}],"name":"shouldReturnFalseWhenLibraryDoesNotHaveABookAfterWeRemoveItFromBookList","pass":true,"statements":[{"sl":55},{"sl":56},{"sl":57},{"sl":58},{"sl":59},{"sl":60},{"sl":62}]},"test_398":{"methods":[{"sl":65}],"name":"shouldReturnAnotherMessageIfBookIsNotRemoved","pass":true,"statements":[{"sl":67},{"sl":68},{"sl":70}]},"test_406":{"methods":[{"sl":21}],"name":"shouldReturnTrueIfLibraryHasABook","pass":true,"statements":[{"sl":23},{"sl":24},{"sl":25},{"sl":26},{"sl":27},{"sl":28},{"sl":30}]},"test_409":{"methods":[{"sl":45}],"name":"shouldReturnMessageIfBookIsRemoved","pass":true,"statements":[{"sl":47},{"sl":48},{"sl":50}]},"test_413":{"methods":[{"sl":81}],"name":"shouldReturnAMessageIfBookIsAdded","pass":true,"statements":[{"sl":83},{"sl":84},{"sl":85},{"sl":87}]},"test_426":{"methods":[{"sl":33}],"name":"shouldReturnTrueIfLibraryHasABookEqualToBookBeingSpecified","pass":true,"statements":[{"sl":35},{"sl":36},{"sl":37},{"sl":38},{"sl":39},{"sl":40},{"sl":42}]},"test_427":{"methods":[{"sl":53}],"name":"shouldReturnFalseWhenLibraryDoesNotHaveABookAfterWeRemoveItFromBookList","pass":true,"statements":[{"sl":55},{"sl":56},{"sl":57},{"sl":58},{"sl":59},{"sl":60},{"sl":62}]},"test_43":{"methods":[{"sl":90}],"name":"shouldReturnFalseIfLibraryDoesNotHaveABookEqualToBookBeingSpecified","pass":true,"statements":[{"sl":92},{"sl":93},{"sl":94},{"sl":95},{"sl":96},{"sl":97},{"sl":99}]},"test_437":{"methods":[{"sl":110}],"name":"shouldReturnANotValidMessageIfTheBookSpecifiedIsNotInCheckedOutBookList","pass":true,"statements":[{"sl":112},{"sl":113},{"sl":115}]},"test_448":{"methods":[{"sl":73}],"name":"shouldAddCheckedOutBookToAnotherList","pass":true,"statements":[{"sl":75},{"sl":76},{"sl":78}]},"test_453":{"methods":[{"sl":102}],"name":"shouldReturnAnotherMessageIfBookIsNotAdded","pass":true,"statements":[{"sl":104},{"sl":105},{"sl":107}]},"test_454":{"methods":[{"sl":81}],"name":"shouldReturnAMessageIfBookIsAdded","pass":true,"statements":[{"sl":83},{"sl":84},{"sl":85},{"sl":87}]},"test_460":{"methods":[{"sl":90}],"name":"shouldReturnFalseIfLibraryDoesNotHaveABookEqualToBookBeingSpecified","pass":true,"statements":[{"sl":92},{"sl":93},{"sl":94},{"sl":95},{"sl":96},{"sl":97},{"sl":99}]},"test_473":{"methods":[{"sl":33}],"name":"shouldReturnTrueIfLibraryHasABookEqualToBookBeingSpecified","pass":true,"statements":[{"sl":35},{"sl":36},{"sl":37},{"sl":38},{"sl":39},{"sl":40},{"sl":42}]},"test_509":{"methods":[{"sl":45}],"name":"shouldReturnMessageIfBookIsRemoved","pass":true,"statements":[{"sl":47},{"sl":48},{"sl":50}]},"test_510":{"methods":[{"sl":102}],"name":"shouldReturnAnotherMessageIfBookIsNotAdded","pass":true,"statements":[{"sl":104},{"sl":105},{"sl":107}]},"test_526":{"methods":[{"sl":65}],"name":"shouldReturnAnotherMessageIfBookIsNotRemoved","pass":true,"statements":[{"sl":67},{"sl":68},{"sl":70}]},"test_550":{"methods":[{"sl":33}],"name":"shouldReturnTrueIfLibraryHasABookEqualToBookBeingSpecified","pass":true,"statements":[{"sl":35},{"sl":36},{"sl":37},{"sl":38},{"sl":39},{"sl":40},{"sl":42}]},"test_564":{"methods":[{"sl":45}],"name":"shouldReturnMessageIfBookIsRemoved","pass":true,"statements":[{"sl":47},{"sl":48},{"sl":50}]},"test_569":{"methods":[{"sl":90}],"name":"shouldReturnFalseIfLibraryDoesNotHaveABookEqualToBookBeingSpecified","pass":true,"statements":[{"sl":92},{"sl":93},{"sl":94},{"sl":95},{"sl":96},{"sl":97},{"sl":99}]},"test_578":{"methods":[{"sl":53}],"name":"shouldReturnFalseWhenLibraryDoesNotHaveABookAfterWeRemoveItFromBookList","pass":true,"statements":[{"sl":55},{"sl":56},{"sl":57},{"sl":58},{"sl":59},{"sl":60},{"sl":62}]},"test_593":{"methods":[{"sl":81}],"name":"shouldReturnAMessageIfBookIsAdded","pass":true,"statements":[{"sl":83},{"sl":84},{"sl":85},{"sl":87}]},"test_596":{"methods":[{"sl":14}],"name":"shouldReturnTheContentsOfLibrary","pass":true,"statements":[{"sl":16},{"sl":18}]},"test_609":{"methods":[{"sl":73}],"name":"shouldAddCheckedOutBookToAnotherList","pass":true,"statements":[{"sl":75},{"sl":76},{"sl":78}]},"test_610":{"methods":[{"sl":45}],"name":"shouldReturnMessageIfBookIsRemoved","pass":true,"statements":[{"sl":47},{"sl":48},{"sl":50}]},"test_642":{"methods":[{"sl":73}],"name":"shouldAddCheckedOutBookToAnotherList","pass":true,"statements":[{"sl":75},{"sl":76},{"sl":78}]},"test_65":{"methods":[{"sl":21}],"name":"shouldReturnTrueIfLibraryHasABook","pass":true,"statements":[{"sl":23},{"sl":24},{"sl":25},{"sl":26},{"sl":27},{"sl":28},{"sl":30}]},"test_650":{"methods":[{"sl":73}],"name":"shouldAddCheckedOutBookToAnotherList","pass":true,"statements":[{"sl":75},{"sl":76},{"sl":78}]},"test_667":{"methods":[{"sl":45}],"name":"shouldReturnMessageIfBookIsRemoved","pass":true,"statements":[{"sl":47},{"sl":48},{"sl":50}]},"test_685":{"methods":[{"sl":21}],"name":"shouldReturnTrueIfLibraryHasABook","pass":true,"statements":[{"sl":23},{"sl":24},{"sl":25},{"sl":26},{"sl":27},{"sl":28},{"sl":30}]},"test_694":{"methods":[{"sl":14}],"name":"shouldReturnTheContentsOfLibrary","pass":true,"statements":[{"sl":16},{"sl":18}]},"test_696":{"methods":[{"sl":110}],"name":"shouldReturnANotValidMessageIfTheBookSpecifiedIsNotInCheckedOutBookList","pass":true,"statements":[{"sl":112},{"sl":113},{"sl":115}]},"test_715":{"methods":[{"sl":73}],"name":"shouldAddCheckedOutBookToAnotherList","pass":true,"statements":[{"sl":75},{"sl":76},{"sl":78}]},"test_721":{"methods":[{"sl":110}],"name":"shouldReturnANotValidMessageIfTheBookSpecifiedIsNotInCheckedOutBookList","pass":true,"statements":[{"sl":112},{"sl":113},{"sl":115}]},"test_736":{"methods":[{"sl":14}],"name":"shouldReturnTheContentsOfLibrary","pass":true,"statements":[{"sl":16},{"sl":18}]},"test_738":{"methods":[{"sl":102}],"name":"shouldReturnAnotherMessageIfBookIsNotAdded","pass":true,"statements":[{"sl":104},{"sl":105},{"sl":107}]},"test_781":{"methods":[{"sl":73}],"name":"shouldAddCheckedOutBookToAnotherList","pass":true,"statements":[{"sl":75},{"sl":76},{"sl":78}]},"test_782":{"methods":[{"sl":53}],"name":"shouldReturnFalseWhenLibraryDoesNotHaveABookAfterWeRemoveItFromBookList","pass":true,"statements":[{"sl":55},{"sl":56},{"sl":57},{"sl":58},{"sl":59},{"sl":60},{"sl":62}]},"test_798":{"methods":[{"sl":33}],"name":"shouldReturnTrueIfLibraryHasABookEqualToBookBeingSpecified","pass":true,"statements":[{"sl":35},{"sl":36},{"sl":37},{"sl":38},{"sl":39},{"sl":40},{"sl":42}]},"test_80":{"methods":[{"sl":102}],"name":"shouldReturnAnotherMessageIfBookIsNotAdded","pass":true,"statements":[{"sl":104},{"sl":105},{"sl":107}]},"test_811":{"methods":[{"sl":90}],"name":"shouldReturnFalseIfLibraryDoesNotHaveABookEqualToBookBeingSpecified","pass":true,"statements":[{"sl":92},{"sl":93},{"sl":94},{"sl":95},{"sl":96},{"sl":97},{"sl":99}]},"test_824":{"methods":[{"sl":21}],"name":"shouldReturnTrueIfLibraryHasABook","pass":true,"statements":[{"sl":23},{"sl":24},{"sl":25},{"sl":26},{"sl":27},{"sl":28},{"sl":30}]},"test_834":{"methods":[{"sl":81}],"name":"shouldReturnAMessageIfBookIsAdded","pass":true,"statements":[{"sl":83},{"sl":84},{"sl":85},{"sl":87}]},"test_848":{"methods":[{"sl":65}],"name":"shouldReturnAnotherMessageIfBookIsNotRemoved","pass":true,"statements":[{"sl":67},{"sl":68},{"sl":70}]},"test_85":{"methods":[{"sl":14}],"name":"shouldReturnTheContentsOfLibrary","pass":true,"statements":[{"sl":16},{"sl":18}]},"test_862":{"methods":[{"sl":14}],"name":"shouldReturnTheContentsOfLibrary","pass":true,"statements":[{"sl":16},{"sl":18}]},"test_90":{"methods":[{"sl":110}],"name":"shouldReturnANotValidMessageIfTheBookSpecifiedIsNotInCheckedOutBookList","pass":true,"statements":[{"sl":112},{"sl":113},{"sl":115}]},"test_907":{"methods":[{"sl":81}],"name":"shouldReturnAMessageIfBookIsAdded","pass":true,"statements":[{"sl":83},{"sl":84},{"sl":85},{"sl":87}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [], [], [], [], [862, 596, 296, 736, 85, 694], [], [862, 596, 296, 736, 85, 694], [], [862, 596, 296, 736, 85, 694], [], [], [406, 685, 824, 272, 219, 65], [], [406, 685, 824, 272, 219, 65], [406, 685, 824, 272, 219, 65], [406, 685, 824, 272, 219, 65], [406, 685, 824, 272, 219, 65], [406, 685, 824, 272, 219, 65], [406, 685, 824, 272, 219, 65], [], [406, 685, 824, 272, 219, 65], [], [], [550, 798, 473, 15, 426, 380], [], [550, 798, 473, 15, 426, 380], [550, 798, 473, 15, 426, 380], [550, 798, 473, 15, 426, 380], [550, 798, 473, 15, 426, 380], [550, 798, 473, 15, 426, 380], [550, 798, 473, 15, 426, 380], [], [550, 798, 473, 15, 426, 380], [], [], [564, 24, 509, 610, 409, 667], [], [564, 24, 509, 610, 409, 667], [564, 24, 509, 610, 409, 667], [], [564, 24, 509, 610, 409, 667], [], [], [578, 383, 782, 427, 273, 344], [], [578, 383, 782, 427, 273, 344], [578, 383, 782, 427, 273, 344], [578, 383, 782, 427, 273, 344], [578, 383, 782, 427, 273, 344], [578, 383, 782, 427, 273, 344], [578, 383, 782, 427, 273, 344], [], [578, 383, 782, 427, 273, 344], [], [], [115, 848, 526, 398, 136, 198], [], [115, 848, 526, 398, 136, 198], [115, 848, 526, 398, 136, 198], [], [115, 848, 526, 398, 136, 198], [], [], [650, 715, 642, 781, 448, 609], [], [650, 715, 642, 781, 448, 609], [650, 715, 642, 781, 448, 609], [], [650, 715, 642, 781, 448, 609], [], [], [413, 834, 101, 907, 593, 454], [], [413, 834, 101, 907, 593, 454], [413, 834, 101, 907, 593, 454], [413, 834, 101, 907, 593, 454], [], [413, 834, 101, 907, 593, 454], [], [], [43, 811, 232, 143, 569, 460], [], [43, 811, 232, 143, 569, 460], [43, 811, 232, 143, 569, 460], [43, 811, 232, 143, 569, 460], [43, 811, 232, 143, 569, 460], [43, 811, 232, 143, 569, 460], [43, 811, 232, 143, 569, 460], [], [43, 811, 232, 143, 569, 460], [], [], [738, 318, 80, 510, 121, 453], [], [738, 318, 80, 510, 121, 453], [738, 318, 80, 510, 121, 453], [], [738, 318, 80, 510, 121, 453], [], [], [437, 139, 90, 721, 696, 247], [], [437, 139, 90, 721, 696, 247], [437, 139, 90, 721, 696, 247], [], [437, 139, 90, 721, 696, 247], [], [], []]
