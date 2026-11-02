.class public abstract Lu78;
.super Ljava/lang/Object;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"


# static fields
.field public static final a:Lox1;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 1
    new-instance v0, Lmq7;

    .line 2
    .line 3
    const/16 v1, 0x18

    .line 4
    .line 5
    invoke-direct {v0, v1}, Lmq7;-><init>(B)V

    .line 6
    .line 7
    .line 8
    new-instance v1, Lox1;

    .line 9
    .line 10
    const/4 v2, 0x0

    .line 11
    invoke-direct {v1, v0, v2}, Lox1;-><init>(Ldn2;B)V

    .line 12
    .line 13
    .line 14
    sput-object v1, Lu78;->a:Lox1;

    .line 15
    .line 16
    return-void
.end method

.method public static final a(Lo88;Lzy0;Llp2;I)V
    .locals 4

    .line 1
    const v0, 0xe9e0ce

    .line 2
    .line 3
    .line 4
    invoke-virtual {p2, v0}, Llp2;->X(I)Llp2;

    .line 5
    .line 6
    .line 7
    invoke-virtual {p2, p0}, Llp2;->f(Ljava/lang/Object;)Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    const/4 v0, 0x4

    .line 14
    goto :goto_0

    .line 15
    :cond_0
    const/4 v0, 0x2

    .line 16
    :goto_0
    or-int/2addr v0, p3

    .line 17
    and-int/lit8 v1, p3, 0x30

    .line 18
    .line 19
    if-nez v1, :cond_2

    .line 20
    .line 21
    invoke-virtual {p2, p1}, Llp2;->h(Ljava/lang/Object;)Z

    .line 22
    .line 23
    .line 24
    move-result v1

    .line 25
    if-eqz v1, :cond_1

    .line 26
    .line 27
    const/16 v1, 0x20

    .line 28
    .line 29
    goto :goto_1

    .line 30
    :cond_1
    const/16 v1, 0x10

    .line 31
    .line 32
    :goto_1
    or-int/2addr v0, v1

    .line 33
    :cond_2
    and-int/lit8 v1, v0, 0x13

    .line 34
    .line 35
    const/16 v2, 0x12

    .line 36
    .line 37
    const/4 v3, 0x1

    .line 38
    if-eq v1, v2, :cond_3

    .line 39
    .line 40
    move v1, v3

    .line 41
    goto :goto_2

    .line 42
    :cond_3
    const/4 v1, 0x0

    .line 43
    :goto_2
    and-int/lit8 v2, v0, 0x1

    .line 44
    .line 45
    invoke-virtual {p2, v2, v1}, Llp2;->N(IZ)Z

    .line 46
    .line 47
    .line 48
    move-result v1

    .line 49
    if-eqz v1, :cond_4

    .line 50
    .line 51
    sget-object v1, Lu78;->a:Lox1;

    .line 52
    .line 53
    invoke-virtual {p2, v1}, Llp2;->j(Lq06;)Ljava/lang/Object;

    .line 54
    .line 55
    .line 56
    move-result-object v2

    .line 57
    check-cast v2, Lo88;

    .line 58
    .line 59
    invoke-virtual {v2, p0}, Lo88;->d(Lo88;)Lo88;

    .line 60
    .line 61
    .line 62
    move-result-object v2

    .line 63
    invoke-virtual {v1, v2}, Lox1;->a(Ljava/lang/Object;)Lt06;

    .line 64
    .line 65
    .line 66
    move-result-object v1

    .line 67
    and-int/lit8 v0, v0, 0x70

    .line 68
    .line 69
    const/16 v2, 0x8

    .line 70
    .line 71
    or-int/2addr v0, v2

    .line 72
    invoke-static {v1, p1, p2, v0}, Lmb6;->a(Lt06;Lrn2;Llp2;I)V

    .line 73
    .line 74
    .line 75
    goto :goto_3

    .line 76
    :cond_4
    invoke-virtual {p2}, Llp2;->Q()V

    .line 77
    .line 78
    .line 79
    :goto_3
    invoke-virtual {p2}, Llp2;->r()Lj86;

    .line 80
    .line 81
    .line 82
    move-result-object p2

    .line 83
    if-eqz p2, :cond_5

    .line 84
    .line 85
    new-instance v0, Lwy2;

    .line 86
    .line 87
    invoke-direct {v0, v3, p3, p0, p1}, Lwy2;-><init>(BILjava/lang/Object;Ljava/lang/Object;)V

    .line 88
    .line 89
    .line 90
    iput-object v0, p2, Lj86;->d:Lrn2;

    .line 91
    .line 92
    :cond_5
    return-void
.end method

.method public static final b(Ljava/lang/String;Lkx4;JLmx;JJLo28;JIZIILgn2;Lo88;Llp2;III)V
    .locals 31

    move-object/from16 v0, p18

    move/from16 v1, p19

    move/from16 v2, p20

    move/from16 v3, p21

    const v4, 0x6bda414b

    .line 1
    invoke-virtual {v0, v4}, Llp2;->X(I)Llp2;

    and-int/lit8 v4, v1, 0x6

    const/4 v5, 0x2

    const/4 v6, 0x4

    if-nez v4, :cond_1

    move-object/from16 v4, p0

    invoke-virtual {v0, v4}, Llp2;->f(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_0

    move v7, v6

    goto :goto_0

    :cond_0
    move v7, v5

    :goto_0
    or-int/2addr v7, v1

    goto :goto_1

    :cond_1
    move-object/from16 v4, p0

    move v7, v1

    :goto_1
    and-int/lit8 v8, v3, 0x2

    if-eqz v8, :cond_3

    or-int/lit8 v7, v7, 0x30

    :cond_2
    move-object/from16 v9, p1

    goto :goto_3

    :cond_3
    and-int/lit8 v9, v1, 0x30

    if-nez v9, :cond_2

    move-object/from16 v9, p1

    invoke-virtual {v0, v9}, Llp2;->f(Ljava/lang/Object;)Z

    move-result v10

    if-eqz v10, :cond_4

    const/16 v10, 0x20

    goto :goto_2

    :cond_4
    const/16 v10, 0x10

    :goto_2
    or-int/2addr v7, v10

    :goto_3
    or-int/lit16 v10, v7, 0x180

    and-int/lit8 v11, v3, 0x8

    if-eqz v11, :cond_6

    or-int/lit16 v10, v7, 0xd80

    :cond_5
    move-object/from16 v7, p4

    goto :goto_5

    :cond_6
    and-int/lit16 v7, v1, 0xc00

    if-nez v7, :cond_5

    move-object/from16 v7, p4

    invoke-virtual {v0, v7}, Llp2;->h(Ljava/lang/Object;)Z

    move-result v12

    if-eqz v12, :cond_7

    const/16 v12, 0x800

    goto :goto_4

    :cond_7
    const/16 v12, 0x400

    :goto_4
    or-int/2addr v10, v12

    :goto_5
    const v12, 0x36db6000

    or-int/2addr v10, v12

    and-int/lit16 v12, v3, 0x400

    if-eqz v12, :cond_8

    or-int/lit8 v5, v2, 0x6

    move-object/from16 v13, p9

    goto :goto_6

    :cond_8
    and-int/lit8 v13, v2, 0x6

    if-nez v13, :cond_a

    move-object/from16 v13, p9

    invoke-virtual {v0, v13}, Llp2;->f(Ljava/lang/Object;)Z

    move-result v14

    if-eqz v14, :cond_9

    move v5, v6

    :cond_9
    or-int/2addr v5, v2

    goto :goto_6

    :cond_a
    move-object/from16 v13, p9

    move v5, v2

    :goto_6
    or-int/lit8 v6, v5, 0x30

    and-int/lit16 v14, v3, 0x1000

    if-eqz v14, :cond_c

    or-int/lit16 v6, v5, 0x1b0

    :cond_b
    move/from16 v5, p12

    goto :goto_8

    :cond_c
    and-int/lit16 v5, v2, 0x180

    if-nez v5, :cond_b

    move/from16 v5, p12

    invoke-virtual {v0, v5}, Llp2;->d(I)Z

    move-result v15

    if-eqz v15, :cond_d

    const/16 v15, 0x100

    goto :goto_7

    :cond_d
    const/16 v15, 0x80

    :goto_7
    or-int/2addr v6, v15

    :goto_8
    or-int/lit16 v15, v6, 0xc00

    and-int/lit16 v1, v3, 0x4000

    if-eqz v1, :cond_f

    or-int/lit16 v15, v6, 0x6c00

    :cond_e
    move/from16 v6, p14

    goto :goto_a

    :cond_f
    and-int/lit16 v6, v2, 0x6000

    if-nez v6, :cond_e

    move/from16 v6, p14

    invoke-virtual {v0, v6}, Llp2;->d(I)Z

    move-result v16

    if-eqz v16, :cond_10

    const/16 v16, 0x4000

    goto :goto_9

    :cond_10
    const/16 v16, 0x2000

    :goto_9
    or-int v15, v15, v16

    :goto_a
    const v16, 0x8000

    and-int v16, v3, v16

    const/high16 v17, 0x10000

    const/high16 v18, 0x30000

    const/high16 v19, 0x20000

    if-eqz v16, :cond_12

    or-int v15, v15, v18

    :cond_11
    move/from16 v18, v1

    move/from16 v1, p15

    goto :goto_c

    :cond_12
    and-int v18, v2, v18

    if-nez v18, :cond_11

    move/from16 v18, v1

    move/from16 v1, p15

    invoke-virtual {v0, v1}, Llp2;->d(I)Z

    move-result v20

    if-eqz v20, :cond_13

    move/from16 v20, v19

    goto :goto_b

    :cond_13
    move/from16 v20, v17

    :goto_b
    or-int v15, v15, v20

    :goto_c
    and-int v17, v3, v17

    const/high16 v20, 0x180000

    if-eqz v17, :cond_14

    or-int v15, v15, v20

    move-object/from16 v1, p16

    goto :goto_e

    :cond_14
    and-int v20, v2, v20

    move-object/from16 v1, p16

    if-nez v20, :cond_16

    invoke-virtual {v0, v1}, Llp2;->h(Ljava/lang/Object;)Z

    move-result v20

    if-eqz v20, :cond_15

    const/high16 v20, 0x100000

    goto :goto_d

    :cond_15
    const/high16 v20, 0x80000

    :goto_d
    or-int v15, v15, v20

    :cond_16
    :goto_e
    const/high16 v20, 0xc00000

    and-int v20, v2, v20

    if-nez v20, :cond_18

    and-int v20, v3, v19

    move-object/from16 v1, p17

    if-nez v20, :cond_17

    invoke-virtual {v0, v1}, Llp2;->f(Ljava/lang/Object;)Z

    move-result v20

    if-eqz v20, :cond_17

    const/high16 v20, 0x800000

    goto :goto_f

    :cond_17
    const/high16 v20, 0x400000

    :goto_f
    or-int v15, v15, v20

    goto :goto_10

    :cond_18
    move-object/from16 v1, p17

    :goto_10
    const v20, 0x12492493

    and-int v1, v10, v20

    const v2, 0x12492492

    const/16 v20, 0x1

    if-ne v1, v2, :cond_1a

    const v1, 0x492493

    and-int/2addr v1, v15

    const v2, 0x492492

    if-eq v1, v2, :cond_19

    goto :goto_11

    :cond_19
    const/4 v1, 0x0

    goto :goto_12

    :cond_1a
    :goto_11
    move/from16 v1, v20

    :goto_12
    and-int/lit8 v2, v10, 0x1

    invoke-virtual {v0, v2, v1}, Llp2;->N(IZ)Z

    move-result v1

    if-eqz v1, :cond_29

    invoke-virtual {v0}, Llp2;->S()V

    and-int/lit8 v1, p19, 0x1

    const v2, -0x1c00001

    if-eqz v1, :cond_1d

    invoke-virtual {v0}, Llp2;->x()Z

    move-result v1

    if-eqz v1, :cond_1b

    goto :goto_13

    .line 2
    :cond_1b
    invoke-virtual {v0}, Llp2;->Q()V

    and-int v1, p21, v19

    if-eqz v1, :cond_1c

    and-int/2addr v15, v2

    :cond_1c
    move-wide/from16 v22, p5

    move-wide/from16 v11, p10

    move/from16 v20, p13

    move-object/from16 v21, p16

    move-object/from16 v16, p17

    move v2, v5

    move v14, v6

    move-object v1, v9

    move/from16 v17, v15

    move-wide/from16 v8, p2

    move-wide/from16 v5, p7

    move/from16 v15, p15

    goto :goto_18

    :cond_1d
    :goto_13
    if-eqz v8, :cond_1e

    .line 3
    sget-object v1, Lhx4;->X:Lhx4;

    goto :goto_14

    :cond_1e
    move-object v1, v9

    .line 4
    :goto_14
    sget-wide v8, Ldw0;->g:J

    const/16 v21, 0x0

    if-eqz v11, :cond_1f

    move-object/from16 v7, v21

    .line 5
    :cond_1f
    sget-wide v22, Lv88;->c:J

    if-eqz v12, :cond_20

    move-object/from16 v13, v21

    :cond_20
    if-eqz v14, :cond_21

    move/from16 v5, v20

    :cond_21
    if-eqz v18, :cond_22

    const v6, 0x7fffffff

    :cond_22
    if-eqz v16, :cond_23

    move/from16 v11, v20

    goto :goto_15

    :cond_23
    move/from16 v11, p15

    :goto_15
    if-eqz v17, :cond_24

    goto :goto_16

    :cond_24
    move-object/from16 v21, p16

    :goto_16
    and-int v12, p21, v19

    if-eqz v12, :cond_25

    .line 6
    sget-object v12, Lu78;->a:Lox1;

    .line 7
    invoke-virtual {v0, v12}, Llp2;->j(Lq06;)Ljava/lang/Object;

    move-result-object v12

    check-cast v12, Lo88;

    and-int/2addr v15, v2

    move v2, v5

    move v14, v6

    move-object/from16 v16, v12

    :goto_17
    move/from16 v17, v15

    move-wide/from16 v5, v22

    move v15, v11

    move-wide v11, v5

    goto :goto_18

    :cond_25
    move-object/from16 v16, p17

    move v2, v5

    move v14, v6

    goto :goto_17

    .line 8
    :goto_18
    invoke-virtual {v0}, Llp2;->q()V

    const v3, -0x21b08752

    invoke-virtual {v0, v3}, Llp2;->W(I)V

    const-wide/16 v24, 0x10

    cmp-long v3, v8, v24

    if-eqz v3, :cond_26

    move-object/from16 p12, v1

    move/from16 p13, v2

    move-wide/from16 v26, v8

    const/4 v1, 0x0

    goto :goto_1b

    :cond_26
    const v3, -0x21b0844d

    .line 9
    invoke-virtual {v0, v3}, Llp2;->W(I)V

    .line 10
    invoke-virtual/range {v16 .. v16}, Lo88;->b()J

    move-result-wide v26

    cmp-long v3, v26, v24

    if-eqz v3, :cond_27

    move-object/from16 p12, v1

    move/from16 p13, v2

    :goto_19
    const/4 v1, 0x0

    goto :goto_1a

    .line 11
    :cond_27
    sget-object v3, Lj41;->a:Lox1;

    .line 12
    invoke-virtual {v0, v3}, Llp2;->j(Lq06;)Ljava/lang/Object;

    move-result-object v3

    .line 13
    check-cast v3, Ldw0;

    move-object/from16 p12, v1

    move/from16 p13, v2

    .line 14
    iget-wide v1, v3, Ldw0;->a:J

    move-wide/from16 v26, v1

    goto :goto_19

    .line 15
    :goto_1a
    invoke-virtual {v0, v1}, Llp2;->p(Z)V

    :goto_1b
    invoke-virtual {v0, v1}, Llp2;->p(Z)V

    if-eqz v13, :cond_28

    .line 16
    iget v3, v13, Lo28;->a:I

    goto :goto_1c

    :cond_28
    move v3, v1

    :goto_1c
    const v1, 0xfd6f50

    move/from16 p11, v1

    move/from16 p8, v3

    move-wide/from16 p6, v5

    move-wide/from16 p9, v11

    move-object/from16 p1, v16

    move-wide/from16 p4, v22

    move-wide/from16 p2, v26

    .line 17
    invoke-static/range {p1 .. p11}, Lo88;->e(Lo88;JJJIJI)Lo88;

    move-result-object v1

    move-object/from16 v12, p1

    move-wide/from16 v2, p6

    move-wide/from16 v5, p9

    and-int/lit8 v11, v10, 0x7e

    shr-int/lit8 v0, v17, 0x9

    and-int/lit16 v0, v0, 0x1c00

    or-int/2addr v0, v11

    shl-int/lit8 v11, v17, 0x6

    const v16, 0xe000

    and-int v16, v11, v16

    or-int v0, v0, v16

    const/high16 v16, 0x70000

    and-int v16, v11, v16

    or-int v0, v0, v16

    const/high16 v16, 0x380000

    and-int v16, v11, v16

    or-int v0, v0, v16

    const/high16 v16, 0x1c00000

    and-int v11, v11, v16

    or-int/2addr v0, v11

    shl-int/lit8 v10, v10, 0x12

    const/high16 v11, 0x70000000

    and-int/2addr v10, v11

    or-int/2addr v0, v10

    const/16 v10, 0x100

    move-object/from16 p2, p12

    move/from16 p5, p13

    move-object/from16 p10, p18

    move/from16 p11, v0

    move-object/from16 p3, v1

    move-object/from16 p1, v4

    move-object/from16 p9, v7

    move/from16 p12, v10

    move/from16 p7, v14

    move/from16 p8, v15

    move/from16 p6, v20

    move-object/from16 p4, v21

    .line 18
    invoke-static/range {p1 .. p12}, Lwl7;->b(Ljava/lang/String;Lkx4;Lo88;Lgn2;IZIILmx;Llp2;II)V

    move-object/from16 v1, p2

    move/from16 v0, p5

    move/from16 v4, p7

    move/from16 v11, p8

    move v15, v4

    move/from16 v16, v11

    move-object/from16 v18, v12

    move-object v10, v13

    move/from16 v14, v20

    move-object/from16 v17, v21

    move v13, v0

    move-wide v11, v5

    move-object v5, v7

    move-wide/from16 v6, v22

    move-wide/from16 v29, v2

    move-object v2, v1

    move-wide v3, v8

    move-wide/from16 v8, v29

    goto :goto_1d

    .line 19
    :cond_29
    invoke-virtual/range {p18 .. p18}, Llp2;->Q()V

    move-wide/from16 v3, p2

    move-wide/from16 v11, p10

    move/from16 v14, p13

    move/from16 v16, p15

    move-object/from16 v17, p16

    move-object/from16 v18, p17

    move v15, v6

    move-object v2, v9

    move-object v10, v13

    move-wide/from16 v8, p7

    move v13, v5

    move-object v5, v7

    move-wide/from16 v6, p5

    .line 20
    :goto_1d
    invoke-virtual/range {p18 .. p18}, Llp2;->r()Lj86;

    move-result-object v0

    if-eqz v0, :cond_2a

    move-object v1, v0

    new-instance v0, Lt78;

    move/from16 v19, p19

    move/from16 v20, p20

    move/from16 v21, p21

    move-object/from16 v28, v1

    move-object/from16 v1, p0

    invoke-direct/range {v0 .. v21}, Lt78;-><init>(Ljava/lang/String;Lkx4;JLmx;JJLo28;JIZIILgn2;Lo88;III)V

    move-object/from16 v1, v28

    .line 21
    iput-object v0, v1, Lj86;->d:Lrn2;

    :cond_2a
    return-void
.end method

.method public static final c(Lql;Lkx4;JLmx;JJLo28;JIZIILjava/util/Map;Lgn2;Lo88;Llp2;II)V
    .locals 55

    move-object/from16 v1, p0

    move-object/from16 v10, p9

    move-object/from16 v0, p19

    move/from16 v2, p20

    move/from16 v3, p21

    const v4, 0x116b5779

    .line 1
    invoke-virtual {v0, v4}, Llp2;->X(I)Llp2;

    and-int/lit8 v4, v2, 0x6

    if-nez v4, :cond_1

    invoke-virtual {v0, v1}, Llp2;->f(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_0

    const/4 v4, 0x4

    goto :goto_0

    :cond_0
    const/4 v4, 0x2

    :goto_0
    or-int/2addr v4, v2

    goto :goto_1

    :cond_1
    move v4, v2

    :goto_1
    and-int/lit8 v7, v2, 0x30

    move-object/from16 v12, p1

    if-nez v7, :cond_3

    invoke-virtual {v0, v12}, Llp2;->f(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_2

    const/16 v7, 0x20

    goto :goto_2

    :cond_2
    const/16 v7, 0x10

    :goto_2
    or-int/2addr v4, v7

    :cond_3
    or-int/lit16 v4, v4, 0x180

    and-int/lit16 v7, v2, 0xc00

    if-nez v7, :cond_5

    move-object/from16 v7, p4

    invoke-virtual {v0, v7}, Llp2;->h(Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_4

    const/16 v8, 0x800

    goto :goto_3

    :cond_4
    const/16 v8, 0x400

    :goto_3
    or-int/2addr v4, v8

    goto :goto_4

    :cond_5
    move-object/from16 v7, p4

    :goto_4
    const v8, 0x36db6000

    or-int/2addr v4, v8

    and-int/lit8 v8, v3, 0x6

    if-nez v8, :cond_7

    invoke-virtual {v0, v10}, Llp2;->f(Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_6

    const/4 v8, 0x4

    goto :goto_5

    :cond_6
    const/4 v8, 0x2

    :goto_5
    or-int/2addr v8, v3

    goto :goto_6

    :cond_7
    move v8, v3

    :goto_6
    or-int/lit8 v8, v8, 0x30

    and-int/lit16 v9, v3, 0x180

    move/from16 v13, p12

    if-nez v9, :cond_9

    invoke-virtual {v0, v13}, Llp2;->d(I)Z

    move-result v9

    if-eqz v9, :cond_8

    const/16 v9, 0x100

    goto :goto_7

    :cond_8
    const/16 v9, 0x80

    :goto_7
    or-int/2addr v8, v9

    :cond_9
    or-int/lit16 v8, v8, 0xc00

    and-int/lit16 v9, v3, 0x6000

    move/from16 v15, p14

    if-nez v9, :cond_b

    invoke-virtual {v0, v15}, Llp2;->d(I)Z

    move-result v9

    if-eqz v9, :cond_a

    const/16 v9, 0x4000

    goto :goto_8

    :cond_a
    const/16 v9, 0x2000

    :goto_8
    or-int/2addr v8, v9

    :cond_b
    const/high16 v9, 0x30000

    and-int/2addr v9, v3

    if-nez v9, :cond_d

    move/from16 v9, p15

    invoke-virtual {v0, v9}, Llp2;->d(I)Z

    move-result v11

    if-eqz v11, :cond_c

    const/high16 v11, 0x20000

    goto :goto_9

    :cond_c
    const/high16 v11, 0x10000

    :goto_9
    or-int/2addr v8, v11

    goto :goto_a

    :cond_d
    move/from16 v9, p15

    :goto_a
    const/high16 v11, 0xd80000

    or-int/2addr v8, v11

    const/high16 v11, 0x6000000

    and-int/2addr v11, v3

    if-nez v11, :cond_f

    move-object/from16 v11, p18

    invoke-virtual {v0, v11}, Llp2;->f(Ljava/lang/Object;)Z

    move-result v14

    if-eqz v14, :cond_e

    const/high16 v14, 0x4000000

    goto :goto_b

    :cond_e
    const/high16 v14, 0x2000000

    :goto_b
    or-int/2addr v8, v14

    goto :goto_c

    :cond_f
    move-object/from16 v11, p18

    :goto_c
    const v14, 0x12492493

    and-int/2addr v14, v4

    const v6, 0x12492492

    const/16 v18, 0x1

    if-ne v14, v6, :cond_11

    const v6, 0x2492493

    and-int/2addr v6, v8

    const v14, 0x2492492

    if-eq v6, v14, :cond_10

    goto :goto_d

    :cond_10
    const/4 v6, 0x0

    goto :goto_e

    :cond_11
    :goto_d
    move/from16 v6, v18

    :goto_e
    and-int/lit8 v14, v4, 0x1

    invoke-virtual {v0, v14, v6}, Llp2;->N(IZ)Z

    move-result v6

    if-eqz v6, :cond_1d

    invoke-virtual {v0}, Llp2;->S()V

    and-int/lit8 v6, v2, 0x1

    sget-object v14, Lzz0;->a:Lbe;

    if-eqz v6, :cond_13

    invoke-virtual {v0}, Llp2;->x()Z

    move-result v6

    if-eqz v6, :cond_12

    goto :goto_f

    .line 2
    :cond_12
    invoke-virtual {v0}, Llp2;->Q()V

    move-wide/from16 v5, p2

    move-wide/from16 v19, p5

    move-wide/from16 v21, p7

    move-wide/from16 v24, p10

    move/from16 v27, p13

    move-object/from16 v28, p16

    move-object/from16 v29, p17

    goto :goto_10

    .line 3
    :cond_13
    :goto_f
    sget-wide v19, Ldw0;->g:J

    .line 4
    sget-wide v21, Lv88;->c:J

    .line 5
    invoke-virtual {v0}, Llp2;->K()Ljava/lang/Object;

    move-result-object v6

    if-ne v6, v14, :cond_14

    .line 6
    new-instance v6, Lb58;

    const/4 v5, 0x2

    invoke-direct {v6, v5}, Lb58;-><init>(B)V

    .line 7
    invoke-virtual {v0, v6}, Llp2;->g0(Ljava/lang/Object;)V

    .line 8
    :cond_14
    move-object v5, v6

    check-cast v5, Lgn2;

    sget-object v6, Le02;->X:Le02;

    move-object/from16 v29, v5

    move-object/from16 v28, v6

    move/from16 v27, v18

    move-wide/from16 v5, v19

    move-wide/from16 v19, v21

    move-wide/from16 v24, v19

    .line 9
    :goto_10
    invoke-virtual {v0}, Llp2;->q()V

    const v2, 0x63f3c35c

    invoke-virtual {v0, v2}, Llp2;->W(I)V

    const-wide/16 v30, 0x10

    cmp-long v2, v5, v30

    if-eqz v2, :cond_15

    move-wide/from16 v32, v5

    const/4 v2, 0x0

    goto :goto_13

    :cond_15
    const v2, 0x63f3c661

    .line 10
    invoke-virtual {v0, v2}, Llp2;->W(I)V

    .line 11
    invoke-virtual {v11}, Lo88;->b()J

    move-result-wide v32

    cmp-long v2, v32, v30

    if-eqz v2, :cond_16

    :goto_11
    const/4 v2, 0x0

    goto :goto_12

    .line 12
    :cond_16
    sget-object v2, Lj41;->a:Lox1;

    .line 13
    invoke-virtual {v0, v2}, Llp2;->j(Lq06;)Ljava/lang/Object;

    move-result-object v2

    .line 14
    check-cast v2, Ldw0;

    .line 15
    iget-wide v2, v2, Ldw0;->a:J

    move-wide/from16 v32, v2

    goto :goto_11

    .line 16
    :goto_12
    invoke-virtual {v0, v2}, Llp2;->p(Z)V

    :goto_13
    invoke-virtual {v0, v2}, Llp2;->p(Z)V

    .line 17
    sget-object v3, Lkw0;->a:Lox1;

    .line 18
    invoke-virtual {v0, v3}, Llp2;->j(Lq06;)Ljava/lang/Object;

    move-result-object v3

    .line 19
    check-cast v3, Liw0;

    .line 20
    iget-wide v2, v3, Liw0;->a:J

    .line 21
    invoke-virtual {v0, v2, v3}, Llp2;->e(J)Z

    move-result v17

    move-wide/from16 v35, v2

    .line 22
    invoke-virtual {v0}, Llp2;->K()Ljava/lang/Object;

    move-result-object v2

    if-nez v17, :cond_18

    if-ne v2, v14, :cond_17

    goto :goto_14

    :cond_17
    move/from16 v30, v4

    goto :goto_15

    .line 23
    :cond_18
    :goto_14
    new-instance v2, Lc88;

    .line 24
    new-instance v34, Lqe7;

    const/16 v52, 0x0

    const v53, 0xeffe

    const-wide/16 v37, 0x0

    const/16 v39, 0x0

    const/16 v40, 0x0

    const/16 v41, 0x0

    const/16 v42, 0x0

    const/16 v43, 0x0

    const-wide/16 v44, 0x0

    const/16 v46, 0x0

    const/16 v47, 0x0

    const/16 v48, 0x0

    const-wide/16 v49, 0x0

    sget-object v51, Lx38;->c:Lx38;

    invoke-direct/range {v34 .. v53}, Lqe7;-><init>(JJLdj2;Lbj2;Lcj2;Lgi2;Ljava/lang/String;JLx20;Lg78;Lge4;JLx38;Lt67;I)V

    move/from16 v30, v4

    move-object/from16 v3, v34

    const/4 v4, 0x0

    .line 25
    invoke-direct {v2, v3, v4, v4, v4}, Lc88;-><init>(Lqe7;Lqe7;Lqe7;Lqe7;)V

    .line 26
    invoke-virtual {v0, v2}, Llp2;->g0(Ljava/lang/Object;)V

    .line 27
    :goto_15
    check-cast v2, Lc88;

    and-int/lit8 v3, v30, 0xe

    const/4 v4, 0x4

    if-ne v3, v4, :cond_19

    goto :goto_16

    :cond_19
    const/16 v18, 0x0

    .line 28
    :goto_16
    invoke-virtual {v0, v2}, Llp2;->f(Ljava/lang/Object;)Z

    move-result v3

    or-int v3, v18, v3

    .line 29
    invoke-virtual {v0}, Llp2;->K()Ljava/lang/Object;

    move-result-object v4

    if-nez v3, :cond_1a

    if-ne v4, v14, :cond_1b

    .line 30
    :cond_1a
    new-instance v3, Lpy7;

    const/4 v4, 0x7

    invoke-direct {v3, v2, v4}, Lpy7;-><init>(Ljava/lang/Object;B)V

    invoke-virtual {v1, v3}, Lql;->b(Lgn2;)Lql;

    move-result-object v4

    .line 31
    invoke-virtual {v0, v4}, Llp2;->g0(Ljava/lang/Object;)V

    .line 32
    :cond_1b
    check-cast v4, Lql;

    if-eqz v10, :cond_1c

    .line 33
    iget v2, v10, Lo28;->a:I

    move/from16 v23, v2

    goto :goto_17

    :cond_1c
    const/16 v23, 0x0

    :goto_17
    const v26, 0xfd6f50

    move-object/from16 v16, v11

    move-wide/from16 v17, v32

    .line 34
    invoke-static/range {v16 .. v26}, Lo88;->e(Lo88;JJJIJI)Lo88;

    move-result-object v2

    move-wide/from16 v31, v21

    move-wide/from16 v33, v24

    move-wide/from16 v24, v19

    and-int/lit8 v3, v30, 0x70

    shr-int/lit8 v11, v8, 0xc

    and-int/lit16 v11, v11, 0x1c00

    or-int/2addr v3, v11

    shl-int/lit8 v8, v8, 0x6

    const v11, 0xe000

    and-int/2addr v11, v8

    or-int/2addr v3, v11

    const/high16 v11, 0x70000

    and-int/2addr v11, v8

    or-int/2addr v3, v11

    const/high16 v11, 0x380000

    and-int/2addr v11, v8

    or-int/2addr v3, v11

    const/high16 v11, 0x1c00000

    and-int/2addr v11, v8

    or-int/2addr v3, v11

    const/high16 v11, 0xe000000

    and-int/2addr v8, v11

    or-int v22, v3, v8

    shr-int/lit8 v3, v30, 0x9

    and-int/lit8 v23, v3, 0xe

    move-object/from16 v21, v0

    move-object v11, v4

    move-object/from16 v20, v7

    move/from16 v18, v9

    move/from16 v17, v15

    move/from16 v16, v27

    move-object/from16 v19, v28

    move-object/from16 v14, v29

    move v15, v13

    move-object v13, v2

    .line 35
    invoke-static/range {v11 .. v23}, Lwl7;->a(Lql;Lkx4;Lo88;Lgn2;IZIILjava/util/Map;Lmx;Llp2;II)V

    move-wide v3, v5

    move-object/from16 v18, v14

    move/from16 v14, v16

    move-object/from16 v17, v19

    move-wide/from16 v6, v24

    move-wide/from16 v8, v31

    move-wide/from16 v11, v33

    goto :goto_18

    .line 36
    :cond_1d
    invoke-virtual/range {p19 .. p19}, Llp2;->Q()V

    move-wide/from16 v3, p2

    move-wide/from16 v6, p5

    move-wide/from16 v8, p7

    move-wide/from16 v11, p10

    move/from16 v14, p13

    move-object/from16 v17, p16

    move-object/from16 v18, p17

    .line 37
    :goto_18
    invoke-virtual/range {p19 .. p19}, Llp2;->r()Lj86;

    move-result-object v0

    if-eqz v0, :cond_1e

    move-object v2, v0

    new-instance v0, Ls78;

    move-object/from16 v5, p4

    move/from16 v13, p12

    move/from16 v15, p14

    move/from16 v16, p15

    move-object/from16 v19, p18

    move/from16 v20, p20

    move/from16 v21, p21

    move-object/from16 v54, v2

    move-object/from16 v2, p1

    invoke-direct/range {v0 .. v21}, Ls78;-><init>(Lql;Lkx4;JLmx;JJLo28;JIZIILjava/util/Map;Lgn2;Lo88;II)V

    move-object/from16 v2, v54

    .line 38
    iput-object v0, v2, Lj86;->d:Lrn2;

    :cond_1e
    return-void
.end method
