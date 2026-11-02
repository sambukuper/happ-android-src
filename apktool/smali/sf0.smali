.class public final Lsf0;
.super Ljava/lang/Object;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"


# instance fields
.field public final a:Lgh0;

.field public final b:Ls98;

.field public final c:Ljava/util/Map;

.field public final d:Ljava/util/Map;

.field public final e:Lcl7;

.field public final f:Ltl7;

.field public final g:Z

.field public final h:I

.field public final i:Ljava/lang/Object;

.field public j:Z

.field public k:Lqf0;

.field public final l:Lme;


# direct methods
.method public constructor <init>(Lgh0;Ls98;Ljava/util/Map;Ljava/util/Map;Lcl7;Ltl7;Z)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    invoke-virtual {p4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 11
    .line 12
    .line 13
    invoke-virtual {p6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 14
    .line 15
    .line 16
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 17
    .line 18
    .line 19
    iput-object p1, p0, Lsf0;->a:Lgh0;

    .line 20
    .line 21
    iput-object p2, p0, Lsf0;->b:Ls98;

    .line 22
    .line 23
    iput-object p3, p0, Lsf0;->c:Ljava/util/Map;

    .line 24
    .line 25
    iput-object p4, p0, Lsf0;->d:Ljava/util/Map;

    .line 26
    .line 27
    iput-object p5, p0, Lsf0;->e:Lcl7;

    .line 28
    .line 29
    iput-object p6, p0, Lsf0;->f:Ltl7;

    .line 30
    .line 31
    iput-boolean p7, p0, Lsf0;->g:Z

    .line 32
    .line 33
    sget-object p3, Ltf0;->a:Lqv;

    .line 34
    .line 35
    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 36
    .line 37
    .line 38
    sget-object p4, Lqv;->b:Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;

    .line 39
    .line 40
    invoke-virtual {p4, p3}, Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;->incrementAndGet(Ljava/lang/Object;)I

    .line 41
    .line 42
    .line 43
    move-result p3

    .line 44
    iput p3, p0, Lsf0;->h:I

    .line 45
    .line 46
    new-instance p3, Ljava/lang/Object;

    .line 47
    .line 48
    invoke-direct {p3}, Ljava/lang/Object;-><init>()V

    .line 49
    .line 50
    .line 51
    iput-object p3, p0, Lsf0;->i:Ljava/lang/Object;

    .line 52
    .line 53
    iget-object p3, p5, Lcl7;->h0:Ljava/util/List;

    .line 54
    .line 55
    invoke-interface {p3}, Ljava/util/Collection;->isEmpty()Z

    .line 56
    .line 57
    .line 58
    move-result p4

    .line 59
    const/4 p5, 0x0

    .line 60
    if-nez p4, :cond_2

    .line 61
    .line 62
    invoke-static {p3}, Lwv0;->r0(Ljava/util/List;)Ljava/lang/Object;

    .line 63
    .line 64
    .line 65
    move-result-object p3

    .line 66
    check-cast p3, Lzk7;

    .line 67
    .line 68
    invoke-interface {p1}, Lgh0;->getInputSurface()Landroid/view/Surface;

    .line 69
    .line 70
    .line 71
    move-result-object p1

    .line 72
    if-eqz p1, :cond_1

    .line 73
    .line 74
    :try_start_0
    iget p4, p3, Lzk7;->a:I

    .line 75
    .line 76
    iget p3, p3, Lzk7;->b:I

    .line 77
    .line 78
    invoke-virtual {p2}, Ls98;->a()Landroid/os/Handler;

    .line 79
    .line 80
    .line 81
    move-result-object p2

    .line 82
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 83
    .line 84
    .line 85
    sget p6, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 86
    .line 87
    const/16 p7, 0x1d

    .line 88
    .line 89
    if-lt p6, p7, :cond_0

    .line 90
    .line 91
    invoke-static {p3, p1}, Lwa;->t(ILandroid/view/Surface;)Landroid/media/ImageWriter;

    .line 92
    .line 93
    .line 94
    move-result-object p1

    .line 95
    goto :goto_0

    .line 96
    :cond_0
    invoke-static {p3}, Lyk7;->b(I)Ljava/lang/String;

    .line 97
    .line 98
    .line 99
    const/4 p3, 0x1

    .line 100
    invoke-static {p1, p3}, Landroid/media/ImageWriter;->newInstance(Landroid/view/Surface;I)Landroid/media/ImageWriter;

    .line 101
    .line 102
    .line 103
    move-result-object p1

    .line 104
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 105
    .line 106
    .line 107
    :goto_0
    new-instance p3, Lme;

    .line 108
    .line 109
    invoke-direct {p3, p1, p4}, Lme;-><init>(Landroid/media/ImageWriter;I)V

    .line 110
    .line 111
    .line 112
    invoke-virtual {p1, p3, p2}, Landroid/media/ImageWriter;->setOnImageReleasedListener(Landroid/media/ImageWriter$OnImageReleasedListener;Landroid/os/Handler;)V
    :try_end_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0

    .line 113
    .line 114
    .line 115
    move-object p5, p3

    .line 116
    goto :goto_1

    .line 117
    :catch_0
    iget-object p1, p0, Lsf0;->a:Lgh0;

    .line 118
    .line 119
    invoke-static {p1}, Ljava/util/Objects;->toString(Ljava/lang/Object;)Ljava/lang/String;

    .line 120
    .line 121
    .line 122
    :goto_1
    if-eqz p5, :cond_2

    .line 123
    .line 124
    invoke-virtual {p5}, Lme;->toString()Ljava/lang/String;

    .line 125
    .line 126
    .line 127
    iget-object p1, p0, Lsf0;->a:Lgh0;

    .line 128
    .line 129
    invoke-static {p1}, Ljava/util/Objects;->toString(Ljava/lang/Object;)Ljava/lang/String;

    .line 130
    .line 131
    .line 132
    goto :goto_2

    .line 133
    :cond_1
    const-string p0, "inputSurface is required to create instance of imageWriter."

    .line 134
    .line 135
    invoke-static {p0}, Lbt;->i(Ljava/lang/String;)V

    .line 136
    .line 137
    .line 138
    throw p5

    .line 139
    :cond_2
    :goto_2
    iput-object p5, p0, Lsf0;->l:Lme;

    .line 140
    .line 141
    return-void
.end method


# virtual methods
.method public final a(ZLjava/util/List;Ljava/util/Map;Ljava/util/Map;Ljava/util/Map;Lvk1;Ljava/util/List;)Lqf0;
    .locals 30

    move-object/from16 v1, p0

    move-object/from16 v5, p3

    move-object/from16 v7, p5

    .line 1
    invoke-virtual/range {p4 .. p4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual/range {p7 .. p7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    new-instance v13, Ljava/util/ArrayList;

    invoke-interface/range {p2 .. p2}, Ljava/util/List;->size()I

    move-result v0

    invoke-direct {v13, v0}, Ljava/util/ArrayList;-><init>(I)V

    .line 3
    new-instance v14, Ljava/util/ArrayList;

    invoke-interface/range {p2 .. p2}, Ljava/util/List;->size()I

    move-result v0

    invoke-direct {v14, v0}, Ljava/util/ArrayList;-><init>(I)V

    .line 4
    new-instance v15, Landroid/util/ArrayMap;

    invoke-direct {v15}, Landroid/util/ArrayMap;-><init>()V

    .line 5
    new-instance v2, Landroid/util/ArrayMap;

    invoke-direct {v2}, Landroid/util/ArrayMap;-><init>()V

    .line 6
    new-instance v8, Landroid/util/ArrayMap;

    invoke-direct {v8}, Landroid/util/ArrayMap;-><init>()V

    .line 7
    invoke-interface/range {p2 .. p2}, Ljava/util/Collection;->isEmpty()Z

    move-result v0

    const-string v3, "build(...) should never be called with an empty request list!"

    const/16 v16, 0x0

    if-nez v0, :cond_33

    .line 8
    iget-object v4, v1, Lsf0;->a:Lgh0;

    instance-of v0, v4, Lya;

    const/16 v17, 0x1

    iget-object v6, v1, Lsf0;->e:Lcl7;

    if-eqz v0, :cond_15

    .line 9
    invoke-interface/range {p2 .. p2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    move-object/from16 v9, v16

    move-object v10, v9

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v21

    if-eqz v21, :cond_15

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v21

    move-object/from16 v11, v21

    check-cast v11, Lne6;

    .line 10
    iget-object v12, v11, Lne6;->a:Ljava/util/List;

    if-eqz v12, :cond_1

    .line 11
    invoke-interface {v12}, Ljava/util/Collection;->isEmpty()Z

    move-result v21

    if-eqz v21, :cond_1

    :cond_0
    move-object/from16 v24, v0

    move-object/from16 v21, v3

    move-object/from16 v26, v4

    move-object/from16 v27, v13

    const/4 v0, 0x0

    goto/16 :goto_7

    .line 12
    :cond_1
    invoke-interface {v12}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v12

    :goto_1
    invoke-interface {v12}, Ljava/util/Iterator;->hasNext()Z

    move-result v21

    if-eqz v21, :cond_0

    invoke-interface {v12}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v21

    move-object/from16 v24, v0

    move-object/from16 v0, v21

    check-cast v0, Ldl7;

    .line 13
    iget v0, v0, Ldl7;->a:I

    .line 14
    iget-object v0, v6, Lcl7;->j0:Ljava/util/ArrayList;

    if-eqz v0, :cond_3

    .line 15
    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v21

    if-eqz v21, :cond_3

    :cond_2
    move-object/from16 v21, v3

    move-object/from16 v26, v4

    move-object/from16 v28, v12

    move-object/from16 v27, v13

    goto :goto_6

    .line 16
    :cond_3
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_2
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v21

    if-eqz v21, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v21

    move-object/from16 v25, v0

    move-object/from16 v0, v21

    check-cast v0, Lbl7;

    move-object/from16 v21, v3

    .line 17
    iget-object v3, v0, Lbl7;->g:Lcf5;

    iget-object v0, v0, Lbl7;->i:Ldf5;

    if-nez v3, :cond_4

    move-object/from16 v26, v4

    move-object/from16 v28, v12

    move-object/from16 v27, v13

    const/4 v3, 0x0

    goto :goto_3

    :cond_4
    move-object/from16 v26, v4

    .line 18
    iget-wide v3, v3, Lcf5;->a:J

    move-object/from16 v28, v12

    move-object/from16 v27, v13

    const-wide/16 v12, 0x1

    .line 19
    invoke-static {v3, v4, v12, v13}, Lcf5;->a(JJ)Z

    move-result v3

    :goto_3
    if-nez v3, :cond_7

    if-nez v0, :cond_5

    const/4 v3, 0x0

    goto :goto_4

    .line 20
    :cond_5
    iget-wide v3, v0, Ldf5;->a:J

    const-wide/16 v12, 0x0

    .line 21
    invoke-static {v3, v4, v12, v13}, Ldf5;->a(JJ)Z

    move-result v3

    :goto_4
    if-nez v3, :cond_7

    if-nez v0, :cond_6

    goto :goto_5

    :cond_6
    move-object/from16 v3, v21

    move-object/from16 v0, v25

    move-object/from16 v4, v26

    move-object/from16 v13, v27

    move-object/from16 v12, v28

    goto :goto_2

    :cond_7
    :goto_5
    move/from16 v0, v17

    goto :goto_7

    :goto_6
    move-object/from16 v3, v21

    move-object/from16 v0, v24

    move-object/from16 v4, v26

    move-object/from16 v13, v27

    move-object/from16 v12, v28

    goto/16 :goto_1

    .line 22
    :goto_7
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    if-eqz v10, :cond_8

    .line 23
    invoke-virtual {v10, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 24
    :cond_8
    iget-object v3, v11, Lne6;->a:Ljava/util/List;

    if-eqz v3, :cond_a

    .line 25
    invoke-interface {v3}, Ljava/util/Collection;->isEmpty()Z

    move-result v4

    if-eqz v4, :cond_a

    :cond_9
    const/4 v3, 0x0

    goto/16 :goto_e

    .line 26
    :cond_a
    invoke-interface {v3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_8
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_9

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ldl7;

    .line 27
    iget v4, v4, Ldl7;->a:I

    .line 28
    iget-object v4, v6, Lcl7;->j0:Ljava/util/ArrayList;

    if-eqz v4, :cond_c

    .line 29
    invoke-virtual {v4}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v10

    if-eqz v10, :cond_c

    :cond_b
    move-object v13, v3

    goto :goto_d

    .line 30
    :cond_c
    invoke-virtual {v4}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :goto_9
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v10

    if-eqz v10, :cond_b

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Lbl7;

    .line 31
    iget-object v11, v10, Lbl7;->g:Lcf5;

    if-nez v11, :cond_d

    move-object v13, v3

    move-object/from16 v25, v4

    const/4 v11, 0x0

    goto :goto_a

    .line 32
    :cond_d
    iget-wide v11, v11, Lcf5;->a:J

    move-object v13, v3

    move-object/from16 v25, v4

    const-wide/16 v3, 0x3

    .line 33
    invoke-static {v11, v12, v3, v4}, Lcf5;->a(JJ)Z

    move-result v11

    :goto_a
    if-nez v11, :cond_10

    .line 34
    iget-object v3, v10, Lbl7;->i:Ldf5;

    if-nez v3, :cond_e

    const/4 v3, 0x0

    goto :goto_b

    .line 35
    :cond_e
    iget-wide v3, v3, Ldf5;->a:J

    const-wide/16 v10, 0x1

    .line 36
    invoke-static {v3, v4, v10, v11}, Ldf5;->a(JJ)Z

    move-result v3

    :goto_b
    if-eqz v3, :cond_f

    goto :goto_c

    :cond_f
    move-object v3, v13

    move-object/from16 v4, v25

    goto :goto_9

    :cond_10
    :goto_c
    move/from16 v3, v17

    goto :goto_e

    :goto_d
    move-object v3, v13

    goto :goto_8

    .line 37
    :goto_e
    invoke-static {v3}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v3

    if-eqz v9, :cond_11

    .line 38
    invoke-virtual {v9, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 39
    :cond_11
    iget-object v4, v6, Lcl7;->j0:Ljava/util/ArrayList;

    if-eqz v4, :cond_12

    .line 40
    invoke-virtual {v4}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v9

    if-eqz v9, :cond_12

    goto :goto_f

    .line 41
    :cond_12
    invoke-virtual {v4}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :cond_13
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v9

    if-eqz v9, :cond_14

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Lbl7;

    .line 42
    invoke-virtual {v9}, Lbl7;->a()Z

    move-result v9

    if-nez v9, :cond_13

    .line 43
    iget-object v0, v6, Lcl7;->j0:Ljava/util/ArrayList;

    .line 44
    invoke-static {v0}, Ljava/util/Objects;->toString(Ljava/lang/Object;)Ljava/lang/String;

    return-object v16

    :cond_14
    :goto_f
    move-object v10, v0

    move-object v9, v3

    move-object/from16 v3, v21

    move-object/from16 v0, v24

    move-object/from16 v4, v26

    move-object/from16 v13, v27

    goto/16 :goto_0

    :cond_15
    move-object/from16 v21, v3

    move-object/from16 v26, v4

    move-object/from16 v27, v13

    .line 45
    invoke-interface/range {p2 .. p2}, Ljava/util/Collection;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_32

    .line 46
    invoke-interface/range {p2 .. p2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_10
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    const-string v13, "Check failed."

    if-eqz v3, :cond_1e

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lne6;

    .line 47
    iget-object v4, v3, Lne6;->a:Ljava/util/List;

    .line 48
    invoke-interface {v4}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v4

    const/4 v9, 0x0

    :cond_16
    :goto_11
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v10

    if-eqz v10, :cond_1b

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Ldl7;

    .line 49
    iget v11, v10, Ldl7;->a:I

    .line 50
    invoke-virtual {v8, v10}, Landroid/util/ArrayMap;->containsKey(Ljava/lang/Object;)Z

    move-result v12

    if-eqz v12, :cond_18

    :cond_17
    move/from16 v9, v17

    goto :goto_11

    .line 51
    :cond_18
    iget-object v12, v1, Lsf0;->c:Ljava/util/Map;

    invoke-interface {v12, v10}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v12

    check-cast v12, Landroid/view/Surface;

    if-eqz v12, :cond_16

    .line 52
    invoke-virtual {v15, v12, v10}, Landroid/util/ArrayMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 53
    invoke-virtual {v8, v10, v12}, Landroid/util/ArrayMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 54
    invoke-virtual {v6, v11}, Lcl7;->g(I)Lfl0;

    move-result-object v9

    const-string v10, "Required value was null."

    if-eqz v9, :cond_1a

    .line 55
    iget-object v9, v9, Lfl0;->b:Ljava/util/ArrayList;

    .line 56
    invoke-virtual {v9}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v9

    :goto_12
    invoke-interface {v9}, Ljava/util/Iterator;->hasNext()Z

    move-result v11

    if-eqz v11, :cond_17

    invoke-interface {v9}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v11

    check-cast v11, Lbl7;

    .line 57
    iget v12, v11, Lbl7;->a:I

    move-object/from16 v21, v0

    .line 58
    new-instance v0, Lpe5;

    invoke-direct {v0, v12}, Lpe5;-><init>(I)V

    .line 59
    iget-object v12, v1, Lsf0;->d:Ljava/util/Map;

    invoke-interface {v12, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    if-eqz v0, :cond_19

    check-cast v0, Landroid/view/Surface;

    .line 60
    iget v11, v11, Lbl7;->a:I

    .line 61
    new-instance v12, Lpe5;

    invoke-direct {v12, v11}, Lpe5;-><init>(I)V

    .line 62
    invoke-virtual {v2, v0, v12}, Landroid/util/ArrayMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-object/from16 v0, v21

    goto :goto_12

    .line 63
    :cond_19
    invoke-static {v10}, Lbt;->i(Ljava/lang/String;)V

    return-object v16

    .line 64
    :cond_1a
    invoke-static {v10}, Lbt;->i(Ljava/lang/String;)V

    return-object v16

    :cond_1b
    move-object/from16 v21, v0

    if-nez v9, :cond_1c

    .line 65
    invoke-virtual {v3}, Lne6;->toString()Ljava/lang/String;

    return-object v16

    :cond_1c
    if-eqz v9, :cond_1d

    move-object/from16 v0, v21

    goto/16 :goto_10

    .line 66
    :cond_1d
    invoke-static {v13}, Lbt;->i(Ljava/lang/String;)V

    return-object v16

    .line 67
    :cond_1e
    invoke-interface/range {p2 .. p2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v21

    :goto_13
    invoke-interface/range {v21 .. v21}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_31

    invoke-interface/range {v21 .. v21}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v10, v0

    check-cast v10, Lne6;

    .line 68
    invoke-static {v10}, Ljava/util/Objects;->toString(Ljava/lang/Object;)Ljava/lang/String;

    .line 69
    iget-object v0, v10, Lne6;->e:Lwe6;

    if-eqz v0, :cond_1f

    .line 70
    iget v0, v0, Lwe6;->a:I

    goto :goto_14

    :cond_1f
    move/from16 v0, v17

    .line 71
    :goto_14
    invoke-interface/range {v26 .. v26}, Lgh0;->i0()Lyh0;

    move-result-object v3

    invoke-interface {v3, v0}, Lyh0;->Y(I)Landroid/hardware/camera2/CaptureRequest$Builder;

    move-result-object v3

    if-nez v3, :cond_20

    .line 72
    invoke-static {v0}, Lwe6;->b(I)Ljava/lang/String;

    move-object/from16 v3, v16

    :cond_20
    if-nez v3, :cond_21

    goto/16 :goto_22

    .line 73
    :cond_21
    sget-object v0, Lsj0;->b:Lxu4;

    .line 74
    invoke-interface {v7, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    if-nez v4, :cond_22

    .line 75
    invoke-interface {v5, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    .line 76
    :cond_22
    invoke-virtual {v3, v4}, Landroid/hardware/camera2/CaptureRequest$Builder;->setTag(Ljava/lang/Object;)V

    .line 77
    iget-object v0, v10, Lne6;->a:Ljava/util/List;

    .line 78
    invoke-interface {v0}, Ljava/util/Collection;->size()I

    move-result v0

    const/4 v4, 0x0

    const/4 v9, 0x0

    :goto_15
    if-ge v4, v0, :cond_24

    .line 79
    iget-object v11, v10, Lne6;->a:Ljava/util/List;

    .line 80
    invoke-interface {v11, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v11

    invoke-virtual {v8, v11}, Landroid/util/ArrayMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v11

    check-cast v11, Landroid/view/Surface;

    if-eqz v11, :cond_23

    .line 81
    invoke-virtual {v3, v11}, Landroid/hardware/camera2/CaptureRequest$Builder;->addTarget(Landroid/view/Surface;)V

    move/from16 v9, v17

    :cond_23
    add-int/lit8 v4, v4, 0x1

    goto :goto_15

    :cond_24
    if-eqz v9, :cond_30

    .line 82
    invoke-static {v3, v5}, Ljb5;->X(Landroid/hardware/camera2/CaptureRequest$Builder;Ljava/util/Map;)V

    move-object/from16 v4, p4

    .line 83
    invoke-static {v3, v4}, Ljb5;->X(Landroid/hardware/camera2/CaptureRequest$Builder;Ljava/util/Map;)V

    .line 84
    iget-object v0, v10, Lne6;->b:Ljava/util/Map;

    .line 85
    invoke-static {v3, v0}, Ljb5;->X(Landroid/hardware/camera2/CaptureRequest$Builder;Ljava/util/Map;)V

    .line 86
    invoke-static {v3, v7}, Ljb5;->X(Landroid/hardware/camera2/CaptureRequest$Builder;Ljava/util/Map;)V

    .line 87
    sget-object v0, Ltf0;->c:Lsv;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 88
    sget-object v9, Lsv;->b:Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;

    invoke-virtual {v9, v0}, Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;->incrementAndGet(Ljava/lang/Object;)J

    move-result-wide v11

    .line 89
    invoke-virtual {v3}, Landroid/hardware/camera2/CaptureRequest$Builder;->build()Landroid/hardware/camera2/CaptureRequest;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 90
    iget-object v3, v1, Lsf0;->a:Lgh0;

    instance-of v9, v3, Lya;

    if-eqz v9, :cond_2f

    .line 91
    check-cast v3, Lya;

    .line 92
    iget-object v9, v3, Lxa;->X:Lza;

    .line 93
    :try_start_0
    const-string v24, "CXCP#createHighSpeedRequestList"
    :try_end_0
    .catch Ljava/lang/IllegalStateException; {:try_start_0 .. :try_end_0} :catch_2
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/UnsupportedOperationException; {:try_start_0 .. :try_end_0} :catch_0

    .line 94
    :try_start_1
    invoke-static/range {v24 .. v24}, Landroid/os/Trace;->beginSection(Ljava/lang/String;)V

    .line 95
    iget-object v3, v3, Lya;->g0:Landroid/hardware/camera2/CameraConstrainedHighSpeedCaptureSession;

    .line 96
    invoke-virtual {v3, v0}, Landroid/hardware/camera2/CameraConstrainedHighSpeedCaptureSession;->createHighSpeedRequestList(Landroid/hardware/camera2/CaptureRequest;)Ljava/util/List;

    move-result-object v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 97
    :try_start_2
    invoke-static {}, Landroid/os/Trace;->endSection()V

    goto :goto_17

    :catchall_0
    move-exception v0

    invoke-static {}, Landroid/os/Trace;->endSection()V

    .line 98
    throw v0
    :try_end_2
    .catch Ljava/lang/IllegalStateException; {:try_start_2 .. :try_end_2} :catch_2
    .catch Ljava/lang/IllegalArgumentException; {:try_start_2 .. :try_end_2} :catch_1
    .catch Ljava/lang/UnsupportedOperationException; {:try_start_2 .. :try_end_2} :catch_0

    .line 99
    :catch_0
    invoke-static {v9}, Ljava/util/Objects;->toString(Ljava/lang/Object;)Ljava/lang/String;

    goto :goto_16

    .line 100
    :catch_1
    invoke-static {v9}, Ljava/util/Objects;->toString(Ljava/lang/Object;)Ljava/lang/String;

    goto :goto_16

    .line 101
    :catch_2
    invoke-static {v9}, Ljava/util/Objects;->toString(Ljava/lang/Object;)Ljava/lang/String;

    :goto_16
    move-object/from16 v0, v16

    :goto_17
    if-nez v0, :cond_25

    goto/16 :goto_22

    .line 102
    :cond_25
    iget-object v3, v10, Lne6;->a:Ljava/util/List;

    if-eqz v3, :cond_27

    .line 103
    invoke-interface {v3}, Ljava/util/Collection;->isEmpty()Z

    move-result v9

    if-eqz v9, :cond_27

    :cond_26
    move-object/from16 v25, v2

    move-object/from16 v24, v6

    move-object/from16 v19, v13

    move-object/from16 v20, v15

    move-object/from16 v3, v27

    const/4 v15, 0x0

    const-wide/16 v22, 0x3

    const-wide/16 v28, 0x1

    goto/16 :goto_20

    .line 104
    :cond_27
    invoke-interface {v3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_18
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v9

    if-eqz v9, :cond_26

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Ldl7;

    .line 105
    iget v9, v9, Ldl7;->a:I

    .line 106
    iget-object v9, v6, Lcl7;->j0:Ljava/util/ArrayList;

    if-eqz v9, :cond_29

    .line 107
    invoke-virtual {v9}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v24

    if-eqz v24, :cond_29

    :cond_28
    move-object/from16 v25, v2

    move-object/from16 p2, v3

    move-object/from16 v24, v6

    move-object/from16 v19, v13

    move-object/from16 v20, v15

    move-object/from16 v3, v27

    const/4 v15, 0x0

    const-wide/16 v22, 0x3

    const-wide/16 v28, 0x1

    goto/16 :goto_1f

    .line 108
    :cond_29
    invoke-virtual {v9}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v9

    :goto_19
    invoke-interface {v9}, Ljava/util/Iterator;->hasNext()Z

    move-result v24

    if-eqz v24, :cond_28

    invoke-interface {v9}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v24

    move-object/from16 v25, v2

    move-object/from16 v2, v24

    check-cast v2, Lbl7;

    move-object/from16 p2, v3

    .line 109
    iget-object v3, v2, Lbl7;->g:Lcf5;

    if-nez v3, :cond_2a

    move-object/from16 v24, v6

    const/4 v3, 0x0

    const-wide/16 v5, 0x3

    goto :goto_1a

    .line 110
    :cond_2a
    iget-wide v3, v3, Lcf5;->a:J

    move-object/from16 v24, v6

    const-wide/16 v5, 0x3

    .line 111
    invoke-static {v3, v4, v5, v6}, Lcf5;->a(JJ)Z

    move-result v3

    :goto_1a
    if-nez v3, :cond_2d

    .line 112
    iget-object v2, v2, Lbl7;->i:Ldf5;

    if-nez v2, :cond_2b

    const/4 v2, 0x0

    const-wide/16 v5, 0x1

    goto :goto_1b

    .line 113
    :cond_2b
    iget-wide v2, v2, Ldf5;->a:J

    const-wide/16 v5, 0x1

    .line 114
    invoke-static {v2, v3, v5, v6}, Ldf5;->a(JJ)Z

    move-result v2

    :goto_1b
    if-eqz v2, :cond_2c

    goto :goto_1c

    :cond_2c
    move-object/from16 v3, p2

    move-object/from16 v5, p3

    move-object/from16 v4, p4

    move-object/from16 v6, v24

    move-object/from16 v2, v25

    goto :goto_19

    :cond_2d
    const-wide/16 v5, 0x1

    .line 115
    :goto_1c
    invoke-interface {v0}, Ljava/util/Collection;->size()I

    move-result v2

    const/4 v3, 0x0

    :goto_1d
    if-ge v3, v2, :cond_2e

    move v4, v2

    .line 116
    new-instance v2, Lkg0;

    .line 117
    invoke-interface {v0, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Landroid/hardware/camera2/CaptureRequest;

    move/from16 v22, v3

    .line 118
    iget-object v3, v1, Lsf0;->a:Lgh0;

    move/from16 v18, v4

    move-wide/from16 v28, v5

    move-object v4, v9

    move-object/from16 v19, v13

    move-object/from16 v20, v15

    move/from16 v13, v22

    const/4 v15, 0x0

    const-wide/16 v22, 0x3

    move/from16 v9, p1

    move-object/from16 v5, p3

    move-object/from16 v6, p4

    invoke-direct/range {v2 .. v12}, Lkg0;-><init>(Lgh0;Landroid/hardware/camera2/CaptureRequest;Ljava/util/Map;Ljava/util/Map;Ljava/util/Map;Landroid/util/ArrayMap;ZLne6;J)V

    .line 119
    invoke-interface {v0, v13}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    invoke-virtual {v14, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    move-object/from16 v3, v27

    .line 120
    invoke-virtual {v3, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-int/lit8 v2, v13, 0x1

    move-object/from16 v7, p5

    move-object/from16 v13, v19

    move-object/from16 v15, v20

    move-wide/from16 v5, v28

    move v3, v2

    move/from16 v2, v18

    goto :goto_1d

    :cond_2e
    move-object/from16 v20, v15

    const/4 v15, 0x0

    move-object/from16 v5, p3

    move-object/from16 v7, p5

    :goto_1e
    move-object/from16 v15, v20

    move-object/from16 v6, v24

    move-object/from16 v2, v25

    goto/16 :goto_13

    :goto_1f
    move-object/from16 v5, p3

    move-object/from16 v4, p4

    move-object/from16 v7, p5

    move-object/from16 v27, v3

    move-object/from16 v13, v19

    move-object/from16 v15, v20

    move-object/from16 v6, v24

    move-object/from16 v2, v25

    move-object/from16 v3, p2

    goto/16 :goto_18

    .line 121
    :goto_20
    new-instance v2, Lkg0;

    .line 122
    invoke-interface {v0, v15}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Landroid/hardware/camera2/CaptureRequest;

    move-object/from16 v27, v3

    .line 123
    iget-object v3, v1, Lsf0;->a:Lgh0;

    move/from16 v9, p1

    move-object/from16 v5, p3

    move-object/from16 v6, p4

    move-object/from16 v7, p5

    move-object/from16 v13, v27

    invoke-direct/range {v2 .. v12}, Lkg0;-><init>(Lgh0;Landroid/hardware/camera2/CaptureRequest;Ljava/util/Map;Ljava/util/Map;Ljava/util/Map;Landroid/util/ArrayMap;ZLne6;J)V

    .line 124
    invoke-interface {v0, v15}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    invoke-virtual {v14, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 125
    invoke-virtual {v13, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :goto_21
    move-object/from16 v13, v19

    goto :goto_1e

    :cond_2f
    move-object/from16 v25, v2

    move-object/from16 v24, v6

    move-object/from16 v19, v13

    move-object/from16 v20, v15

    move-object/from16 v13, v27

    const/4 v15, 0x0

    const-wide/16 v22, 0x3

    const-wide/16 v28, 0x1

    .line 126
    new-instance v2, Lkg0;

    move/from16 v9, p1

    move-object/from16 v5, p3

    move-object/from16 v6, p4

    move-object/from16 v7, p5

    move-object v4, v0

    .line 127
    invoke-direct/range {v2 .. v12}, Lkg0;-><init>(Lgh0;Landroid/hardware/camera2/CaptureRequest;Ljava/util/Map;Ljava/util/Map;Ljava/util/Map;Landroid/util/ArrayMap;ZLne6;J)V

    .line 128
    invoke-virtual {v14, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 129
    invoke-virtual {v13, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_21

    :cond_30
    move-object/from16 v19, v13

    .line 130
    invoke-static/range {v19 .. v19}, Lbt;->i(Ljava/lang/String;)V

    return-object v16

    :cond_31
    move-object/from16 v25, v2

    move-object/from16 v20, v15

    move-object/from16 v13, v27

    .line 131
    new-instance v0, Lqf0;

    .line 132
    invoke-interface/range {v26 .. v26}, Lgh0;->i0()Lyh0;

    move-result-object v2

    invoke-interface {v2}, Lyh0;->m()Ljava/lang/String;

    move-result-object v2

    .line 133
    iget-object v9, v1, Lsf0;->e:Lcl7;

    .line 134
    iget-object v10, v1, Lsf0;->f:Ltl7;

    move-object/from16 v6, p6

    move-object/from16 v5, p7

    move-object v1, v2

    move-object v4, v13

    move-object v3, v14

    move-object/from16 v7, v20

    move-object/from16 v8, v25

    move/from16 v2, p1

    .line 135
    invoke-direct/range {v0 .. v10}, Lqf0;-><init>(Ljava/lang/String;ZLjava/util/ArrayList;Ljava/util/ArrayList;Ljava/util/List;Lvk1;Landroid/util/ArrayMap;Landroid/util/ArrayMap;Lcl7;Ltl7;)V

    move-object/from16 v16, v0

    :goto_22
    return-object v16

    .line 136
    :cond_32
    invoke-static/range {v21 .. v21}, Lbt;->i(Ljava/lang/String;)V

    return-object v16

    :cond_33
    move-object/from16 v21, v3

    .line 137
    invoke-static/range {v21 .. v21}, Lbt;->i(Ljava/lang/String;)V

    return-object v16
.end method

.method public final b()V
    .locals 6

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 7
    .line 8
    .line 9
    const-string v1, "#disconnect"

    .line 10
    .line 11
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 12
    .line 13
    .line 14
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    :try_start_0
    invoke-static {v0}, Landroid/os/Trace;->beginSection(Ljava/lang/String;)V

    .line 19
    .line 20
    .line 21
    iget-object v0, p0, Lsf0;->i:Ljava/lang/Object;

    .line 22
    .line 23
    monitor-enter v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 24
    :try_start_1
    iget-boolean v1, p0, Lsf0;->j:Z

    .line 25
    .line 26
    const/4 v2, 0x0

    .line 27
    if-nez v1, :cond_2

    .line 28
    .line 29
    const/4 v1, 0x1

    .line 30
    iput-boolean v1, p0, Lsf0;->j:Z

    .line 31
    .line 32
    iget-object v1, p0, Lsf0;->l:Lme;

    .line 33
    .line 34
    if-eqz v1, :cond_0

    .line 35
    .line 36
    invoke-static {v1}, Lp61;->z(Ljava/lang/Object;)V

    .line 37
    .line 38
    .line 39
    goto :goto_0

    .line 40
    :catchall_0
    move-exception p0

    .line 41
    goto :goto_2

    .line 42
    :cond_0
    :goto_0
    iget-object v1, p0, Lsf0;->a:Lgh0;

    .line 43
    .line 44
    invoke-interface {v1}, Lgh0;->getInputSurface()Landroid/view/Surface;

    .line 45
    .line 46
    .line 47
    move-result-object v1

    .line 48
    if-eqz v1, :cond_1

    .line 49
    .line 50
    invoke-virtual {v1}, Landroid/view/Surface;->release()V

    .line 51
    .line 52
    .line 53
    :cond_1
    iget-object v1, p0, Lsf0;->k:Lqf0;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 54
    .line 55
    goto :goto_1

    .line 56
    :cond_2
    move-object v1, v2

    .line 57
    :goto_1
    :try_start_2
    monitor-exit v0

    .line 58
    iget-boolean v0, p0, Lsf0;->g:Z

    .line 59
    .line 60
    if-eqz v0, :cond_3

    .line 61
    .line 62
    if-eqz v1, :cond_3

    .line 63
    .line 64
    invoke-static {v1}, Ljava/util/Objects;->toString(Ljava/lang/Object;)Ljava/lang/String;

    .line 65
    .line 66
    .line 67
    iget-object v0, p0, Lsf0;->b:Ls98;

    .line 68
    .line 69
    new-instance v3, Lrf0;

    .line 70
    .line 71
    const/4 v4, 0x0

    .line 72
    invoke-direct {v3, v1, v2, v4}, Lrf0;-><init>(Ljava/lang/Object;Lq51;B)V

    .line 73
    .line 74
    .line 75
    const-wide/16 v4, 0x7d0

    .line 76
    .line 77
    invoke-virtual {v0, v4, v5, v3}, Ls98;->b(JLgn2;)Ljava/lang/Object;

    .line 78
    .line 79
    .line 80
    move-result-object v0

    .line 81
    check-cast v0, Ldn8;

    .line 82
    .line 83
    if-nez v0, :cond_3

    .line 84
    .line 85
    invoke-virtual {p0}, Lsf0;->toString()Ljava/lang/String;

    .line 86
    .line 87
    .line 88
    invoke-static {v1}, Ljava/util/Objects;->toString(Ljava/lang/Object;)Ljava/lang/String;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 89
    .line 90
    .line 91
    :cond_3
    invoke-static {}, Landroid/os/Trace;->endSection()V

    .line 92
    .line 93
    .line 94
    return-void

    .line 95
    :goto_2
    :try_start_3
    monitor-exit v0

    .line 96
    throw p0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 97
    :catchall_1
    move-exception p0

    .line 98
    invoke-static {}, Landroid/os/Trace;->endSection()V

    .line 99
    .line 100
    .line 101
    throw p0
.end method

.method public final c(Lqf0;)Ljava/lang/Integer;
    .locals 4

    .line 1
    iget-object v0, p0, Lsf0;->i:Ljava/lang/Object;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    iget-boolean v1, p0, Lsf0;->j:Z

    .line 5
    .line 6
    if-eqz v1, :cond_0

    .line 7
    .line 8
    invoke-virtual {p0}, Lsf0;->toString()Ljava/lang/String;

    .line 9
    .line 10
    .line 11
    invoke-virtual {p1}, Lqf0;->toString()Ljava/lang/String;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 12
    .line 13
    .line 14
    monitor-exit v0

    .line 15
    const/4 p0, 0x0

    .line 16
    return-object p0

    .line 17
    :catchall_0
    move-exception p0

    .line 18
    goto :goto_1

    .line 19
    :cond_0
    :try_start_1
    iget-object v1, p1, Lqf0;->c:Ljava/util/ArrayList;

    .line 20
    .line 21
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    .line 22
    .line 23
    .line 24
    move-result v1

    .line 25
    const/4 v2, 0x1

    .line 26
    if-ne v1, v2, :cond_3

    .line 27
    .line 28
    iget-object v1, p0, Lsf0;->a:Lgh0;

    .line 29
    .line 30
    instance-of v2, v1, Lya;

    .line 31
    .line 32
    if-nez v2, :cond_3

    .line 33
    .line 34
    iget-boolean v2, p1, Lqf0;->b:Z

    .line 35
    .line 36
    const/4 v3, 0x0

    .line 37
    if-eqz v2, :cond_2

    .line 38
    .line 39
    iget-boolean v2, p0, Lsf0;->g:Z

    .line 40
    .line 41
    if-eqz v2, :cond_1

    .line 42
    .line 43
    iput-object p1, p0, Lsf0;->k:Lqf0;

    .line 44
    .line 45
    :cond_1
    iget-object p0, p1, Lqf0;->c:Ljava/util/ArrayList;

    .line 46
    .line 47
    invoke-virtual {p0, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 48
    .line 49
    .line 50
    move-result-object p0

    .line 51
    check-cast p0, Landroid/hardware/camera2/CaptureRequest;

    .line 52
    .line 53
    invoke-interface {v1, p0, p1}, Lgh0;->O0(Landroid/hardware/camera2/CaptureRequest;Landroid/hardware/camera2/CameraCaptureSession$CaptureCallback;)Ljava/lang/Integer;

    .line 54
    .line 55
    .line 56
    move-result-object p0

    .line 57
    goto :goto_0

    .line 58
    :cond_2
    iget-object p0, p1, Lqf0;->c:Ljava/util/ArrayList;

    .line 59
    .line 60
    invoke-virtual {p0, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 61
    .line 62
    .line 63
    move-result-object p0

    .line 64
    check-cast p0, Landroid/hardware/camera2/CaptureRequest;

    .line 65
    .line 66
    invoke-interface {v1, p0, p1}, Lgh0;->G(Landroid/hardware/camera2/CaptureRequest;Landroid/hardware/camera2/CameraCaptureSession$CaptureCallback;)Ljava/lang/Integer;

    .line 67
    .line 68
    .line 69
    move-result-object p0

    .line 70
    goto :goto_0

    .line 71
    :cond_3
    iget-boolean v1, p1, Lqf0;->b:Z
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 72
    .line 73
    iget-object p0, p0, Lsf0;->a:Lgh0;

    .line 74
    .line 75
    iget-object v2, p1, Lqf0;->c:Ljava/util/ArrayList;

    .line 76
    .line 77
    if-eqz v1, :cond_4

    .line 78
    .line 79
    :try_start_2
    invoke-interface {p0, v2, p1}, Lgh0;->L0(Ljava/util/ArrayList;Landroid/hardware/camera2/CameraCaptureSession$CaptureCallback;)Ljava/lang/Integer;

    .line 80
    .line 81
    .line 82
    move-result-object p0

    .line 83
    goto :goto_0

    .line 84
    :cond_4
    invoke-interface {p0, v2, p1}, Lgh0;->R0(Ljava/util/ArrayList;Landroid/hardware/camera2/CameraCaptureSession$CaptureCallback;)Ljava/lang/Integer;

    .line 85
    .line 86
    .line 87
    move-result-object p0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 88
    :goto_0
    monitor-exit v0

    .line 89
    return-object p0

    .line 90
    :goto_1
    monitor-exit v0

    .line 91
    throw p0
.end method

.method public final toString()Ljava/lang/String;
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    const-string v1, "Camera2CaptureSequenceProcessor-"

    .line 4
    .line 5
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    iget p0, p0, Lsf0;->h:I

    .line 9
    .line 10
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 11
    .line 12
    .line 13
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    return-object p0
.end method
