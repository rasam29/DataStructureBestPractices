//import java.util.ArrayList;
//import java.util.List;
//
///**
// * Created by Rasam on 5/24/2018.
// */
//
//
//class RankSort {
//
//
//    private Student[] _studentArray;
//
//    public RankSort(int size) {
//        CreateArray(size);
//    }
//
//    public void CreateArray(int size) {
//        // این قسمت آرایه دانشجویان را میگیرد و با اطلاعات تصادفی پر میکند
//        _studentArray = new Student[size];
//        for (int i = 0; i < _studentArray.length; i++)
//            _studentArray[i] = new Student();
//    }
//
//    public List<Student> FindBest() {
//
//        List<Student> best_students = new ArrayList<>()();
//
//        InsertionSort(0, _studentArray.length - 1, CompareBranchCode);
//
//        int lb_branch = 0, ub_branch;
//
//        int i = 0;
//        do {
//            while (i < _studentArray.length && _studentArray[i].BranchCode == _studentArray[lb_branch].BranchCode)
//                i++;
//            ub_branch = i - 1;
//
//            InsertionSort(lb_branch, ub_branch, CompareAverage);
//
//            lb_branch = ub_branch + 1;
//
//            best_students.Add(_studentArray[ub_branch]);
//            i++;
//        } while (i <= _studentArray.length);
//
//        return best_students;
//    }
//
//    public List<Student> FindBestBubble() {
//
//        List<Student> best_students = new List<Student>();
//
//        BubbleSort(0, _studentArray.length - 1, CompareBranchCode);
//
//        int lb_branch = 0, ub_branch;
//
//        int i = 0;
//        do {
//            while (i < _studentArray.Length && _studentArray[i].BranchCode == _studentArray[lb_branch].BranchCode)
//                i++;
//            ub_branch = i - 1;
//
//            BubbleSort(lb_branch, ub_branch, CompareAverage);
//
//            lb_branch = ub_branch + 1;
//
//            best_students.Add(_studentArray[ub_branch]);
//            i++;
//        } while (i <= _studentArray.Length);
//
//        return best_students;
//    }
//
//    private void BubbleSort(int LB, int UB, Compare compare_function) {
//        for (int i = LB; i <= UB; i++)
//            for (int j = LB; j <= UB - 1; j++)
//                if (compare_function.Invoke(_studentArray[j], _studentArray[j + 1]) > 0) {
//                    Student temp = _studentArray[j];
//                    _studentArray[j] = _studentArray[j + 1];
//                    _studentArray[j + 1] = temp;
//                }
//    }
//
//    private void InsertionSort(int LB, int UB, Compare compare_function) {
//        // الگوریتم مرتب سازی درجی
//        for (int i = LB + 1; i <= UB; i++) {
//            Student temp = _studentArray[i];
//            int j = i - 1;
//            while ((j >= LB) && compare_function.Invoke(_studentArray[j], temp) > 0) {
//                _studentArray[j + 1] = _studentArray[j];
//                j--;
//            }
//            _studentArray[j + 1] = temp;
//        }
//    }
//
//    private int CompareAverage(Student item1, Student item2) {
//        return (item1.Average > item2.Average) ? 1 : ((item1.Average < item2.Average) ? -1 : 0);
//    }
//
//
//    private int CompareBranchCode(Student item1, Student item2) {
//        return item1.BranchCode - item2.BranchCode;
//    }
//
//}
//
//
//}
