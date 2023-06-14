package com.example.sem_dendis.TrainingII

import com.example.sem_dendis.R

enum class ExerciseClass(val nameOfExercise:String,
                    val description: String,
                    val imageResource : Int,
                    val setCount : Int,
                    val setRepetitionCouunt : Int,

    ) {
    //LEGS
    FRONT_BARBEL_SQUAT("Front barbell squat","A front squat is a squat that is performed while holding a barbell except, unlike with a back squat, the bar is held in front of the chest. This places more force on the upper body while still working the glutes, hamstrings, and hips", R.drawable.frontsquat, 4,10),
    GLUTE_BRIDGE("Glute bridge","A glute bridge is an exercise that involves lying on the ground on your back and thrusting your hips upwards. It is a simple at-home exercise that can be performed with no equipment, and it can increase glute strength, core stability, and lower back health.", R.drawable.glute, 4,10),
    LEF_EXTENSION("Leg extensions","Leg extensions are exercises usually done with a lever machine. You sit on a padded seat and raise a padded bar with your legs. The exercise works mainly the quadriceps muscles of the front of the thigh—the rectus femoris and the vastus muscles.", R.drawable.legsextension, 4,20),
    NORDIC_HAMSTRING_CURL("Nordic hamstring curl","The Nordic Hamstring Curl involves kneeling on a pad (for knee comfort) and lowering your torso slowly and with control. At the same time, the ankles are held in place by a partner, a loaded barbell, or any other immovable object. The movement should be slow and controlled.", R.drawable.nordic, 4,10),

    CALF_RAISES("Calf raises","To do a calf raise with dumbbells, hold a dumbbell in each hand and stand with your feet about shoulder-width apart. Let your arms hang straight below your shoulders. Rise up onto your toes, then slowly return to the starting position. You'll feel tension in the muscles in the back of your lower legs.", R.drawable.calfreses, 4  ,20),

    //PUSH
    BENCH("Bench","The bench press is a compound exercise that targets the muscles of the upper body. It involves lying on a bench and pressing weight upward using either a barbell or a pair of dumbbells. During a bench press, you lower the weight down to chest level and then press upwards while extending your arms.", R.drawable.bench,   3,10),
    FLY("Fly","A fly or flye is a strength training exercise in which the hand and arm move through an arc while the elbow is kept at a constant angle. Flies are used to work the muscles of the upper body.", R.drawable.fly,   3,16),
    FRONT_RAISE("Front raise","Stand with your feet about shoulder-width apart. Let your arms hang in front of you with the dumbbells in front of the thighs (palms facing the thighs). Your back is straight, your feet are planted flat on the floor, and your abdominal muscles are engaged. Lift the weights upward while inhaling.", R.drawable.frontraise,4   ,12),
    OVER_PRESS("Over press","While keeping your entire body tight, press the bar overhead. Keep the bar as close to your face (without hitting it) as possible. Once the bar passes your forehead, move your body back under the bar by driving your torso forward and back into a standing position.", R.drawable.overpress,  4 , 10),

    PUSH_UP("Push up"," Get into a plank position with your hands directly below shoulders, your neck and spine neutral, and your feet together. On the descent, keep your elbows pinned to your sides and your upper arms straight back. Lower down until your chest reaches the floor and return to start.", R.drawable.pushup,   4,20),


    //PULL
    DEAD_LIFT("Deadlift","Stand with your mid-foot under the barbell Bend over and grab the bar with a shoulder-width grip Bend your knees until your shins touch the bar Lift your chest up and straighten your lower back Take a big breath, hold it, and stand up with the weight", R.drawable.pulldeadlift,   4,20),
    BENT_OVER("Bent over","Hold onto a barbell with your palms facing down While keeping your torso stationary, lift the barbell toward you Slowly lower the barbell back to the starting position Repeat the process for the number of repetitions in your workout routine", R.drawable.pullbentover,   4,10),
    PULL_DOWN("Pull down","The pull-down usually uses a weight machine with a seat and brace for the thighs. The starting position involves sitting at the machine with the thighs braced, back straight and feet flat on the floor. The arms are held overhead at full extension, grasping a bar connected to the weight stack. The movement is initiated by pulling the elbows down and back, lowering the bar to the neck, and completed by returning to the initial position.", R.drawable.pulldown,   4,12),
    GOOD_MORNING("Good morning","In a nutshell, you perform a good morning by placing a barbell on your upper back, similar to a squat, then hinging forward at the hips until your body is just above parallel. Then, you complete the exercise by reversing to the starting position.", R.drawable.pullgoodmorning,   4,10),

    BICEPS("Bicep curl","To do a biceps curl with a dumbbell, hold a dumbbell with your palm facing upward. Slowly curl the weight up by bending your elbow, keeping your elbow close to your body. Then slowly lower the weight to the starting position. You'll feel tension in the muscles in the front of your upper arm.", R.drawable.pullbicepscurl,   3,10),
}