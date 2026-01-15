
// Eager Loading -> Will create an instance at the time of class instantiation itself.
// Will take memory even when not using it. Thread Safe.
// class JudgeAnalytics
// {
//     private static final JudgeAnalytics judgeAnalytics = new JudgeAnalytics();
//     private JudgeAnalytics()
//     {
        
//     }
//     public static JudgeAnalytics getInstance()
//     {
//         return judgeAnalytics;
//     }
// }
// All the ways below are Lazy Loading but thread safe. synchronized,bill pugh,double check
// locking.
// Lazy Loading -> Will create an instance only when called.
// So will not taking extra memory if not used. Not Thread Safe.
// Can be made Thread Safe using synchronized keyword.
// class JudgeAnalytics
// {
//     private static JudgeAnalytics judgeAnalytics;
//     private JudgeAnalytics()
//     {
        
//     }
    
//     public static JudgeAnalytics getInstance()
//     {
//         if(judgeAnalytics == null)
//         {
//             judgeAnalytics= new JudgeAnalytics();
//         }
//         return judgeAnalytics;
//     }
// }
// Synchronized way
// Not so efficient. As for every call we will be going in a synchronized way.
// class JudgeAnalytics
// {
//     private static JudgeAnalytics judgeAnalytics;
//     private JudgeAnalytics()
//     {
        
//     }
    
//     public static synchronized JudgeAnalytics getInstance()
//     {
//         if(judgeAnalytics == null)
//         {
//             judgeAnalytics= new JudgeAnalytics();
//         }
//         return judgeAnalytics;
//     }
// }

// Double Check Locking Way Efficient Way
// class JudgeAnalytics
// {
//     private static volatile JudgeAnalytics judgeAnalytics;
//     private JudgeAnalytics()
//     {
        
//     }
//     public static JudgeAnalytics getInstance()
//     {
//         if(judgeAnalytics == null)
//         {
//             synchronized(JudgeAnalytics.class)
//             {
//                 if(judgeAnalytics == null)
//                 {
//                     judgeAnalytics = new JudgeAnalytics();
//                 }
//             }
//         }
//         return judgeAnalytics;
//     }
// }

// Bill Pugh -> Inner Class Way -> Will work when called.
// class JudgeAnalytics
// {
//     private JudgeAnalytics()
//     {
        
//     }
    
//     private static class Holder
//     {
//         private static final JudgeAnalytics judgeAnalytics = new JudgeAnalytics();
//     }
//     public static JudgeAnalytics getInstance()
//     {
//         return Holder.judgeAnalytics;
//     }
// }
class Main {
    public static void main(String[] args) {
      System.out.println(JudgeAnalytics.getInstance());
    }
}
