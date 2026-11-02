.class public abstract Lzw4;
.super Ljava/lang/Object;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"


# static fields
.field public static final a:J


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    const/high16 v0, 0x3f000000    # 0.5f

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-static {v0, v1}, Lpn7;->h(FF)J

    .line 5
    .line 6
    .line 7
    move-result-wide v0

    .line 8
    sput-wide v0, Lzw4;->a:J

    .line 9
    .line 10
    return-void
.end method

.method public static final a(Ldn2;Lo87;FZLx67;JJJLrn2;Lrn2;Lax4;Lzy0;Llp2;I)V
    .locals 27

    move-object/from16 v1, p0

    move-object/from16 v2, p1

    move-wide/from16 v14, p5

    move-object/from16 v0, p15

    move/from16 v8, p16

    const v3, 0x7188eb30

    .line 1
    invoke-virtual {v0, v3}, Llp2;->X(I)Llp2;

    and-int/lit8 v3, v8, 0x6

    if-nez v3, :cond_1

    invoke-virtual {v0, v1}, Llp2;->h(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_0

    const/4 v3, 0x4

    goto :goto_0

    :cond_0
    const/4 v3, 0x2

    :goto_0
    or-int/2addr v3, v8

    goto :goto_1

    :cond_1
    move v3, v8

    :goto_1
    and-int/lit8 v4, v8, 0x30

    if-nez v4, :cond_3

    sget-object v4, Lhx4;->X:Lhx4;

    invoke-virtual {v0, v4}, Llp2;->f(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_2

    const/16 v4, 0x20

    goto :goto_2

    :cond_2
    const/16 v4, 0x10

    :goto_2
    or-int/2addr v3, v4

    :cond_3
    and-int/lit16 v4, v8, 0x180

    const/16 v5, 0x80

    if-nez v4, :cond_5

    invoke-virtual {v0, v2}, Llp2;->f(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_4

    const/16 v4, 0x100

    goto :goto_3

    :cond_4
    move v4, v5

    :goto_3
    or-int/2addr v3, v4

    :cond_5
    or-int/lit16 v3, v3, 0xc00

    and-int/lit16 v4, v8, 0x6000

    move/from16 v13, p3

    if-nez v4, :cond_7

    invoke-virtual {v0, v13}, Llp2;->g(Z)Z

    move-result v4

    if-eqz v4, :cond_6

    const/16 v4, 0x4000

    goto :goto_4

    :cond_6
    const/16 v4, 0x2000

    :goto_4
    or-int/2addr v3, v4

    :cond_7
    const/high16 v4, 0x30000

    and-int/2addr v4, v8

    if-nez v4, :cond_8

    const/high16 v4, 0x10000

    or-int/2addr v3, v4

    :cond_8
    const/high16 v4, 0x180000

    and-int/2addr v4, v8

    if-nez v4, :cond_a

    invoke-virtual {v0, v14, v15}, Llp2;->e(J)Z

    move-result v4

    if-eqz v4, :cond_9

    const/high16 v4, 0x100000

    goto :goto_5

    :cond_9
    const/high16 v4, 0x80000

    :goto_5
    or-int/2addr v3, v4

    :cond_a
    const/high16 v4, 0xc00000

    and-int/2addr v4, v8

    if-nez v4, :cond_b

    const/high16 v4, 0x400000

    or-int/2addr v3, v4

    :cond_b
    const/high16 v4, 0x6000000

    or-int/2addr v4, v3

    const/high16 v6, 0x30000000

    and-int/2addr v6, v8

    if-nez v6, :cond_c

    const/high16 v4, 0x16000000

    or-int/2addr v4, v3

    :cond_c
    move-object/from16 v3, p11

    invoke-virtual {v0, v3}, Llp2;->h(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_d

    const/4 v6, 0x4

    goto :goto_6

    :cond_d
    const/4 v6, 0x2

    :goto_6
    or-int/lit16 v6, v6, 0xc10

    move-object/from16 v7, p13

    invoke-virtual {v0, v7}, Llp2;->f(Ljava/lang/Object;)Z

    move-result v16

    if-eqz v16, :cond_e

    const/16 v5, 0x100

    :cond_e
    or-int/2addr v5, v6

    const v6, 0x12492493

    and-int/2addr v6, v4

    const v9, 0x12492492

    const/16 v21, 0x1

    if-ne v6, v9, :cond_10

    and-int/lit16 v6, v5, 0x493

    const/16 v9, 0x492

    if-eq v6, v9, :cond_f

    goto :goto_7

    :cond_f
    const/4 v6, 0x0

    goto :goto_8

    :cond_10
    :goto_7
    move/from16 v6, v21

    :goto_8
    and-int/lit8 v9, v4, 0x1

    invoke-virtual {v0, v9, v6}, Llp2;->N(IZ)Z

    move-result v6

    if-eqz v6, :cond_32

    invoke-virtual {v0}, Llp2;->S()V

    and-int/lit8 v6, v8, 0x1

    const v9, -0x71c70001

    if-eqz v6, :cond_12

    invoke-virtual {v0}, Llp2;->x()Z

    move-result v6

    if-eqz v6, :cond_11

    goto :goto_9

    .line 2
    :cond_11
    invoke-virtual {v0}, Llp2;->Q()V

    and-int/2addr v4, v9

    and-int/lit8 v5, v5, -0x71

    move/from16 v11, p2

    move-object/from16 v13, p4

    move-wide/from16 v16, p7

    move-wide/from16 v9, p9

    move-object/from16 v19, p12

    move v12, v4

    const/16 v18, 0x10

    const/16 v20, 0x2

    goto :goto_a

    .line 3
    :cond_12
    :goto_9
    sget v6, Ln70;->a:F

    .line 4
    sget v18, Ln70;->a:F

    move/from16 v18, v9

    .line 5
    sget-object v9, Lnr4;->J:Ld77;

    .line 6
    invoke-static {v9, v0}, Lq77;->b(Ld77;Llp2;)Lx67;

    move-result-object v9

    .line 7
    invoke-static {v14, v15, v0}, Lkw0;->a(JLlp2;)J

    move-result-wide v19

    .line 8
    sget-object v11, Lch3;->e:Ljw0;

    .line 9
    invoke-static {v11, v0}, Lkw0;->c(Ljw0;Llp2;)J

    move-result-wide v10

    const v12, 0x3ea3d70a    # 0.32f

    invoke-static {v12, v10, v11}, Ldw0;->b(FJ)J

    move-result-wide v10

    and-int v4, v4, v18

    .line 10
    sget-object v12, Lg0;->n0:Lg0;

    and-int/lit8 v5, v5, -0x71

    move-object v13, v9

    move-wide v9, v10

    move-wide/from16 v16, v19

    move v11, v6

    move-object/from16 v19, v12

    const/16 v18, 0x10

    const/16 v20, 0x2

    move v12, v4

    .line 11
    :goto_a
    invoke-virtual {v0}, Llp2;->q()V

    .line 12
    sget-object v4, Lly4;->X:Lly4;

    invoke-static {v4, v0}, Lw39;->q0(Lly4;Llp2;)Lwf7;

    move-result-object v6

    .line 13
    invoke-static {v4, v0}, Lw39;->q0(Lly4;Llp2;)Lwf7;

    move-result-object v4

    .line 14
    sget-object v3, Lly4;->f0:Lly4;

    invoke-static {v3, v0}, Lw39;->q0(Lly4;Llp2;)Lwf7;

    move-result-object v3

    move/from16 p2, v5

    and-int/lit16 v5, v12, 0x380

    xor-int/lit16 v5, v5, 0x180

    const/16 v7, 0x100

    if-le v5, v7, :cond_13

    .line 15
    invoke-virtual {v0, v2}, Llp2;->f(Ljava/lang/Object;)Z

    move-result v23

    if-nez v23, :cond_14

    :cond_13
    and-int/lit16 v2, v12, 0x180

    if-ne v2, v7, :cond_15

    :cond_14
    move/from16 v2, v21

    goto :goto_b

    :cond_15
    const/4 v2, 0x0

    :goto_b
    invoke-virtual {v0, v4}, Llp2;->h(Ljava/lang/Object;)Z

    move-result v7

    or-int/2addr v2, v7

    invoke-virtual {v0, v3}, Llp2;->h(Ljava/lang/Object;)Z

    move-result v7

    or-int/2addr v2, v7

    invoke-virtual {v0, v6}, Llp2;->h(Ljava/lang/Object;)Z

    move-result v7

    or-int/2addr v2, v7

    .line 16
    invoke-virtual {v0}, Llp2;->K()Ljava/lang/Object;

    move-result-object v7

    .line 17
    sget-object v8, Lzz0;->a:Lbe;

    if-nez v2, :cond_17

    if-ne v7, v8, :cond_16

    goto :goto_c

    :cond_16
    move-object/from16 v3, p1

    move/from16 v24, p2

    move-wide/from16 p7, v9

    move v9, v5

    goto :goto_d

    .line 18
    :cond_17
    :goto_c
    new-instance v2, Lhd;

    const/4 v7, 0x4

    move/from16 v24, p2

    move-wide/from16 p7, v9

    move v9, v5

    move-object v5, v3

    move-object/from16 v3, p1

    invoke-direct/range {v2 .. v7}, Lhd;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 19
    invoke-virtual {v0, v2}, Llp2;->g0(Ljava/lang/Object;)V

    move-object v7, v2

    .line 20
    :goto_d
    check-cast v7, Ldn2;

    invoke-static {v7, v0}, Lu70;->q(Ldn2;Llp2;)V

    .line 21
    invoke-virtual {v0}, Llp2;->K()Ljava/lang/Object;

    move-result-object v2

    if-ne v2, v8, :cond_18

    .line 22
    invoke-static {v0}, Lu70;->D(Llp2;)Lb71;

    move-result-object v2

    .line 23
    invoke-virtual {v0, v2}, Llp2;->g0(Ljava/lang/Object;)V

    .line 24
    :cond_18
    check-cast v2, Lb71;

    const/16 v7, 0x100

    if-le v9, v7, :cond_19

    .line 25
    invoke-virtual {v0, v3}, Llp2;->f(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_1a

    :cond_19
    and-int/lit16 v4, v12, 0x180

    if-ne v4, v7, :cond_1b

    :cond_1a
    move/from16 v4, v21

    goto :goto_e

    :cond_1b
    const/4 v4, 0x0

    :goto_e
    invoke-virtual {v0, v2}, Llp2;->h(Ljava/lang/Object;)Z

    move-result v5

    or-int/2addr v4, v5

    and-int/lit8 v5, v12, 0xe

    const/4 v6, 0x4

    if-ne v5, v6, :cond_1c

    move/from16 v6, v21

    goto :goto_f

    :cond_1c
    const/4 v6, 0x0

    :goto_f
    or-int/2addr v4, v6

    .line 26
    invoke-virtual {v0}, Llp2;->K()Ljava/lang/Object;

    move-result-object v6

    if-nez v4, :cond_1d

    if-ne v6, v8, :cond_1e

    .line 27
    :cond_1d
    new-instance v6, Lrw4;

    invoke-direct {v6, v3, v2, v1}, Lrw4;-><init>(Lo87;Lb71;Ldn2;)V

    .line 28
    invoke-virtual {v0, v6}, Llp2;->g0(Ljava/lang/Object;)V

    .line 29
    :cond_1e
    check-cast v6, Ldn2;

    .line 30
    invoke-virtual {v0, v2}, Llp2;->h(Ljava/lang/Object;)Z

    move-result v4

    const/16 v7, 0x100

    if-le v9, v7, :cond_1f

    invoke-virtual {v0, v3}, Llp2;->f(Ljava/lang/Object;)Z

    move-result v10

    if-nez v10, :cond_20

    :cond_1f
    and-int/lit16 v10, v12, 0x180

    if-ne v10, v7, :cond_21

    :cond_20
    move/from16 v7, v21

    goto :goto_10

    :cond_21
    const/4 v7, 0x0

    :goto_10
    or-int/2addr v4, v7

    const/4 v7, 0x4

    if-ne v5, v7, :cond_22

    move/from16 v7, v21

    goto :goto_11

    :cond_22
    const/4 v7, 0x0

    :goto_11
    or-int/2addr v4, v7

    .line 31
    invoke-virtual {v0}, Llp2;->K()Ljava/lang/Object;

    move-result-object v7

    if-nez v4, :cond_23

    if-ne v7, v8, :cond_24

    .line 32
    :cond_23
    new-instance v7, Lsn;

    move/from16 v4, v18

    invoke-direct {v7, v2, v3, v1, v4}, Lsn;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 33
    invoke-virtual {v0, v7}, Llp2;->g0(Ljava/lang/Object;)V

    .line 34
    :cond_24
    move-object v10, v7

    check-cast v10, Lgn2;

    .line 35
    invoke-virtual {v0}, Llp2;->K()Ljava/lang/Object;

    move-result-object v4

    if-ne v4, v8, :cond_25

    const/4 v4, 0x0

    .line 36
    invoke-static {v4}, Lz51;->b(F)Loi;

    move-result-object v4

    .line 37
    invoke-virtual {v0, v4}, Llp2;->g0(Ljava/lang/Object;)V

    .line 38
    :cond_25
    check-cast v4, Loi;

    const/16 v7, 0x100

    if-le v9, v7, :cond_27

    .line 39
    invoke-virtual {v0, v3}, Llp2;->f(Ljava/lang/Object;)Z

    move-result v18

    if-nez v18, :cond_26

    goto :goto_12

    :cond_26
    move-object/from16 p2, v6

    goto :goto_13

    :cond_27
    :goto_12
    move-object/from16 p2, v6

    and-int/lit16 v6, v12, 0x180

    if-ne v6, v7, :cond_28

    :goto_13
    move/from16 v6, v21

    goto :goto_14

    :cond_28
    const/4 v6, 0x0

    :goto_14
    invoke-virtual {v0, v2}, Llp2;->h(Ljava/lang/Object;)Z

    move-result v18

    or-int v6, v6, v18

    invoke-virtual {v0, v4}, Llp2;->h(Ljava/lang/Object;)Z

    move-result v18

    or-int v6, v6, v18

    const/4 v7, 0x4

    if-ne v5, v7, :cond_29

    move/from16 v5, v21

    goto :goto_15

    :cond_29
    const/4 v5, 0x0

    :goto_15
    or-int/2addr v5, v6

    .line 40
    invoke-virtual {v0}, Llp2;->K()Ljava/lang/Object;

    move-result-object v6

    if-nez v5, :cond_2a

    if-ne v6, v8, :cond_2b

    .line 41
    :cond_2a
    new-instance v6, Lhd;

    invoke-direct {v6, v3, v2, v4, v1}, Lhd;-><init>(Lo87;Lb71;Loi;Ldn2;)V

    .line 42
    invoke-virtual {v0, v6}, Llp2;->g0(Ljava/lang/Object;)V

    .line 43
    :cond_2b
    move-object/from16 v22, v6

    check-cast v22, Ldn2;

    move v5, v9

    move-object v9, v2

    .line 44
    new-instance v2, Lvw4;

    move-object/from16 v18, p11

    move-object/from16 v7, p13

    move-object/from16 v20, p14

    move-object v6, v3

    move v1, v5

    move-object/from16 v25, v8

    move/from16 v23, v12

    move-object/from16 v5, p2

    move/from16 v12, p3

    move-object v8, v4

    move-wide/from16 v3, p7

    invoke-direct/range {v2 .. v20}, Lvw4;-><init>(JLdn2;Lo87;Lax4;Loi;Lb71;Lgn2;FZLx67;JJLrn2;Lrn2;Lzy0;)V

    move-wide v14, v3

    move-object v10, v6

    move-object v6, v8

    const v3, 0x3c33c970

    invoke-static {v3, v2, v0}, Ljm4;->U(ILon2;Llp2;)Lzy0;

    move-result-object v7

    move/from16 v5, v24

    and-int/lit16 v2, v5, 0x380

    or-int/lit16 v9, v2, 0x7000

    move-object/from16 v5, p13

    move-object v8, v0

    move-wide/from16 v3, v16

    move-object/from16 v2, v22

    .line 45
    invoke-static/range {v2 .. v9}, Lx97;->c(Ldn2;JLax4;Loi;Lzy0;Llp2;I)V

    .line 46
    iget-object v2, v10, Lo87;->d:Lt5;

    .line 47
    invoke-virtual {v2}, Lt5;->d()Llp4;

    move-result-object v2

    sget-object v3, Lp87;->Y:Lp87;

    .line 48
    iget-object v2, v2, Llp4;->a:Ljava/util/Map;

    .line 49
    invoke-interface {v2, v3}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_31

    const v2, 0x2c9c96f2

    .line 50
    invoke-virtual {v0, v2}, Llp2;->W(I)V

    const/16 v7, 0x100

    if-le v1, v7, :cond_2c

    .line 51
    invoke-virtual {v0, v10}, Llp2;->f(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2e

    :cond_2c
    move/from16 v4, v23

    and-int/lit16 v1, v4, 0x180

    if-ne v1, v7, :cond_2d

    goto :goto_16

    :cond_2d
    const/16 v21, 0x0

    .line 52
    :cond_2e
    :goto_16
    invoke-virtual {v0}, Llp2;->K()Ljava/lang/Object;

    move-result-object v1

    if-nez v21, :cond_2f

    move-object/from16 v2, v25

    if-ne v1, v2, :cond_30

    .line 53
    :cond_2f
    new-instance v1, Luw4;

    const/4 v2, 0x0

    const/4 v3, 0x2

    invoke-direct {v1, v10, v2, v3}, Luw4;-><init>(Lo87;Lq51;B)V

    .line 54
    invoke-virtual {v0, v1}, Llp2;->g0(Ljava/lang/Object;)V

    .line 55
    :cond_30
    check-cast v1, Lrn2;

    invoke-static {v1, v0, v10}, Lu70;->h(Lrn2;Llp2;Ljava/lang/Object;)V

    const/4 v1, 0x0

    .line 56
    invoke-virtual {v0, v1}, Llp2;->p(Z)V

    goto :goto_17

    :cond_31
    const/4 v1, 0x0

    const v2, 0x2c9d8732

    .line 57
    invoke-virtual {v0, v2}, Llp2;->W(I)V

    .line 58
    invoke-virtual {v0, v1}, Llp2;->p(Z)V

    :goto_17
    move v3, v11

    move-object v5, v13

    move-wide v10, v14

    move-wide/from16 v8, v16

    move-object/from16 v13, v19

    goto :goto_18

    :cond_32
    move-object v10, v2

    .line 59
    invoke-virtual {v0}, Llp2;->Q()V

    move/from16 v3, p2

    move-object/from16 v5, p4

    move-wide/from16 v8, p7

    move-wide/from16 v10, p9

    move-object/from16 v13, p12

    .line 60
    :goto_18
    invoke-virtual {v0}, Llp2;->r()Lj86;

    move-result-object v0

    if-eqz v0, :cond_33

    move-object v1, v0

    new-instance v0, Lsw4;

    move-object/from16 v2, p1

    move/from16 v4, p3

    move-wide/from16 v6, p5

    move-object/from16 v12, p11

    move-object/from16 v14, p13

    move-object/from16 v15, p14

    move/from16 v16, p16

    move-object/from16 v26, v1

    move-object/from16 v1, p0

    invoke-direct/range {v0 .. v16}, Lsw4;-><init>(Ldn2;Lo87;FZLx67;JJJLrn2;Lrn2;Lax4;Lzy0;I)V

    move-object/from16 v1, v26

    .line 61
    iput-object v0, v1, Lj86;->d:Lrn2;

    :cond_33
    return-void
.end method

.method public static final b(Loi;Lb71;Ldn2;Lgn2;Lkx4;Lo87;FZLx67;JJFLrn2;Lrn2;Lzy0;Llp2;I)V
    .locals 34

    move-object/from16 v1, p0

    move-object/from16 v9, p3

    move-object/from16 v10, p4

    move-object/from16 v3, p5

    move/from16 v11, p6

    move/from16 v8, p7

    move-object/from16 v12, p17

    const v0, -0x23aaf70

    .line 1
    invoke-virtual {v12, v0}, Llp2;->X(I)Llp2;

    invoke-virtual {v12, v1}, Llp2;->h(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/16 v0, 0x20

    goto :goto_0

    :cond_0
    const/16 v0, 0x10

    :goto_0
    or-int v0, p18, v0

    move-object/from16 v7, p1

    invoke-virtual {v12, v7}, Llp2;->h(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_1

    const/16 v5, 0x100

    goto :goto_1

    :cond_1
    const/16 v5, 0x80

    :goto_1
    or-int/2addr v0, v5

    move-object/from16 v5, p2

    invoke-virtual {v12, v5}, Llp2;->h(Ljava/lang/Object;)Z

    move-result v14

    const/16 v16, 0x400

    if-eqz v14, :cond_2

    const/16 v14, 0x800

    goto :goto_2

    :cond_2
    move/from16 v14, v16

    :goto_2
    or-int/2addr v0, v14

    invoke-virtual {v12, v9}, Llp2;->h(Ljava/lang/Object;)Z

    move-result v14

    const/16 v18, 0x2000

    if-eqz v14, :cond_3

    const/16 v14, 0x4000

    goto :goto_3

    :cond_3
    move/from16 v14, v18

    :goto_3
    or-int/2addr v0, v14

    invoke-virtual {v12, v10}, Llp2;->f(Ljava/lang/Object;)Z

    move-result v14

    const/high16 v19, 0x10000

    const/high16 v20, 0x20000

    if-eqz v14, :cond_4

    move/from16 v14, v20

    goto :goto_4

    :cond_4
    move/from16 v14, v19

    :goto_4
    or-int/2addr v0, v14

    invoke-virtual {v12, v3}, Llp2;->f(Ljava/lang/Object;)Z

    move-result v14

    if-eqz v14, :cond_5

    const/high16 v14, 0x100000

    goto :goto_5

    :cond_5
    const/high16 v14, 0x80000

    :goto_5
    or-int/2addr v0, v14

    invoke-virtual {v12, v11}, Llp2;->c(F)Z

    move-result v14

    if-eqz v14, :cond_6

    const/high16 v14, 0x800000

    goto :goto_6

    :cond_6
    const/high16 v14, 0x400000

    :goto_6
    or-int/2addr v0, v14

    invoke-virtual {v12, v8}, Llp2;->g(Z)Z

    move-result v14

    if-eqz v14, :cond_7

    const/high16 v14, 0x4000000

    goto :goto_7

    :cond_7
    const/high16 v14, 0x2000000

    :goto_7
    or-int/2addr v0, v14

    move-object/from16 v14, p8

    invoke-virtual {v12, v14}, Llp2;->f(Ljava/lang/Object;)Z

    move-result v22

    if-eqz v22, :cond_8

    const/high16 v22, 0x20000000

    goto :goto_8

    :cond_8
    const/high16 v22, 0x10000000

    :goto_8
    or-int v22, v0, v22

    move-wide/from16 v13, p9

    invoke-virtual {v12, v13, v14}, Llp2;->e(J)Z

    move-result v23

    if-eqz v23, :cond_9

    const/16 v23, 0x4

    :goto_9
    move-wide/from16 v4, p11

    goto :goto_a

    :cond_9
    const/16 v23, 0x2

    goto :goto_9

    :goto_a
    invoke-virtual {v12, v4, v5}, Llp2;->e(J)Z

    move-result v24

    if-eqz v24, :cond_a

    const/16 v17, 0x20

    goto :goto_b

    :cond_a
    const/16 v17, 0x10

    :goto_b
    or-int v17, v23, v17

    move/from16 v15, p13

    invoke-virtual {v12, v15}, Llp2;->c(F)Z

    move-result v24

    if-eqz v24, :cond_b

    const/16 v0, 0x100

    goto :goto_c

    :cond_b
    const/16 v0, 0x80

    :goto_c
    or-int v0, v17, v0

    move-object/from16 v2, p14

    invoke-virtual {v12, v2}, Llp2;->h(Ljava/lang/Object;)Z

    move-result v21

    if-eqz v21, :cond_c

    const/16 v16, 0x800

    :cond_c
    or-int v0, v0, v16

    move-object/from16 v6, p15

    invoke-virtual {v12, v6}, Llp2;->h(Ljava/lang/Object;)Z

    move-result v21

    if-eqz v21, :cond_d

    const/16 v18, 0x4000

    :cond_d
    or-int v0, v0, v18

    move/from16 v18, v0

    move-object/from16 v0, p16

    invoke-virtual {v12, v0}, Llp2;->h(Ljava/lang/Object;)Z

    move-result v21

    if-eqz v21, :cond_e

    move/from16 v19, v20

    :cond_e
    or-int v18, v18, v19

    const v19, 0x12492493

    and-int v0, v22, v19

    const v2, 0x12492492

    const/4 v4, 0x1

    if-ne v0, v2, :cond_10

    const v0, 0x12493

    and-int v0, v18, v0

    const v2, 0x12492

    if-eq v0, v2, :cond_f

    goto :goto_d

    :cond_f
    const/4 v0, 0x0

    goto :goto_e

    :cond_10
    :goto_d
    move v0, v4

    :goto_e
    and-int/lit8 v2, v22, 0x1

    invoke-virtual {v12, v2, v0}, Llp2;->N(IZ)Z

    move-result v0

    if-eqz v0, :cond_2d

    invoke-virtual {v12}, Llp2;->S()V

    and-int/lit8 v0, p18, 0x1

    if-eqz v0, :cond_12

    invoke-virtual {v12}, Llp2;->x()Z

    move-result v0

    if-eqz v0, :cond_11

    goto :goto_f

    .line 2
    :cond_11
    invoke-virtual {v12}, Llp2;->Q()V

    :cond_12
    :goto_f
    invoke-virtual {v12}, Llp2;->q()V

    .line 3
    sget v0, La56;->m3c_bottom_sheet_pane_title:I

    .line 4
    invoke-static {v0, v12}, Lw79;->B(ILlp2;)Ljava/lang/String;

    move-result-object v0

    .line 5
    sget-object v2, Lpz2;->f0:Lp50;

    .line 6
    invoke-static {v10, v2}, Ll80;->a(Lkx4;Lp50;)Lkx4;

    move-result-object v2

    .line 7
    invoke-static {v2, v11, v4}, Landroidx/compose/foundation/layout/b;->l(Lkx4;FI)Lkx4;

    move-result-object v2

    .line 8
    sget-object v4, Landroidx/compose/foundation/layout/b;->a:Landroidx/compose/foundation/layout/FillElement;

    invoke-interface {v2, v4}, Lkx4;->y(Lkx4;)Lkx4;

    move-result-object v2

    const/high16 v20, 0x380000

    .line 9
    sget-object v4, Lzz0;->a:Lbe;

    const/high16 v21, 0x180000

    if-eqz v8, :cond_18

    const v5, -0x5e4bf1b7

    .line 10
    invoke-virtual {v12, v5}, Llp2;->W(I)V

    and-int v5, v22, v20

    xor-int v5, v5, v21

    const/high16 v6, 0x100000

    if-le v5, v6, :cond_13

    .line 11
    invoke-virtual {v12, v3}, Llp2;->f(Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_14

    :cond_13
    and-int v5, v22, v21

    if-ne v5, v6, :cond_15

    :cond_14
    const/4 v5, 0x1

    goto :goto_10

    :cond_15
    const/4 v5, 0x0

    .line 12
    :goto_10
    invoke-virtual {v12}, Llp2;->K()Ljava/lang/Object;

    move-result-object v6

    if-nez v5, :cond_16

    if-ne v6, v4, :cond_17

    .line 13
    :cond_16
    sget-object v5, Lm87;->a:Lsg8;

    .line 14
    new-instance v6, Ll87;

    invoke-direct {v6, v3, v9}, Ll87;-><init>(Lo87;Lgn2;)V

    .line 15
    invoke-virtual {v12, v6}, Llp2;->g0(Ljava/lang/Object;)V

    .line 16
    :cond_17
    check-cast v6, Lt25;

    .line 17
    invoke-static {v6}, Lz91;->J(Lt25;)Lkx4;

    move-result-object v5

    const/4 v6, 0x0

    .line 18
    invoke-virtual {v12, v6}, Llp2;->p(Z)V

    goto :goto_11

    :cond_18
    const/4 v6, 0x0

    const v5, -0x5e4bb908

    .line 19
    invoke-virtual {v12, v5}, Llp2;->W(I)V

    .line 20
    invoke-virtual {v12, v6}, Llp2;->p(Z)V

    .line 21
    sget-object v5, Lhx4;->X:Lhx4;

    .line 22
    :goto_11
    invoke-interface {v2, v5}, Lkx4;->y(Lkx4;)Lkx4;

    move-result-object v2

    .line 23
    iget-object v5, v3, Lo87;->d:Lt5;

    iget-object v6, v3, Lo87;->d:Lt5;

    and-int v20, v22, v20

    xor-int v7, v20, v21

    const/high16 v8, 0x100000

    if-le v7, v8, :cond_19

    .line 24
    invoke-virtual {v12, v3}, Llp2;->f(Ljava/lang/Object;)Z

    move-result v16

    if-nez v16, :cond_1a

    :cond_19
    and-int v10, v22, v21

    if-ne v10, v8, :cond_1b

    :cond_1a
    const/4 v8, 0x1

    goto :goto_12

    :cond_1b
    const/4 v8, 0x0

    .line 25
    :goto_12
    invoke-virtual {v12}, Llp2;->K()Ljava/lang/Object;

    move-result-object v10

    if-nez v8, :cond_1c

    if-ne v10, v4, :cond_1d

    .line 26
    :cond_1c
    new-instance v10, Lb1;

    const/16 v8, 0xd

    invoke-direct {v10, v3, v8}, Lb1;-><init>(Ljava/lang/Object;B)V

    .line 27
    invoke-virtual {v12, v10}, Llp2;->g0(Ljava/lang/Object;)V

    .line 28
    :cond_1d
    check-cast v10, Lrn2;

    invoke-static {v2, v5, v10}, Lys0;->p(Lkx4;Lt5;Lrn2;)Lkx4;

    move-result-object v24

    .line 29
    iget-object v2, v6, Lt5;->h0:Ljava/lang/Object;

    move-object/from16 v25, v2

    check-cast v25, Ldq;

    if-eqz p7, :cond_1e

    .line 30
    invoke-virtual {v3}, Lo87;->d()Z

    move-result v2

    if-eqz v2, :cond_1e

    const/16 v27, 0x1

    goto :goto_13

    :cond_1e
    const/16 v27, 0x0

    .line 31
    :goto_13
    iget-object v2, v6, Lt5;->m0:Ljava/lang/Object;

    check-cast v2, Lrh5;

    .line 32
    invoke-virtual {v2}, Lrh5;->getValue()Ljava/lang/Object;

    move-result-object v2

    if-eqz v2, :cond_1f

    const/16 v29, 0x1

    goto :goto_14

    :cond_1f
    const/16 v29, 0x0

    :goto_14
    const v10, 0xe000

    and-int v2, v22, v10

    const/16 v5, 0x4000

    if-ne v2, v5, :cond_20

    const/4 v2, 0x1

    goto :goto_15

    :cond_20
    const/4 v2, 0x0

    .line 33
    :goto_15
    invoke-virtual {v12}, Llp2;->K()Ljava/lang/Object;

    move-result-object v5

    if-nez v2, :cond_21

    if-ne v5, v4, :cond_22

    .line 34
    :cond_21
    new-instance v5, Lww4;

    const/4 v2, 0x0

    invoke-direct {v5, v9, v2}, Lww4;-><init>(Lgn2;Lq51;)V

    .line 35
    invoke-virtual {v12, v5}, Llp2;->g0(Ljava/lang/Object;)V

    .line 36
    :cond_22
    move-object/from16 v30, v5

    check-cast v30, Lsn2;

    const/16 v31, 0x0

    const/16 v32, 0xa8

    .line 37
    sget-object v26, Lsd5;->X:Lsd5;

    const/16 v28, 0x0

    invoke-static/range {v24 .. v32}, Ljv1;->a(Lkx4;Llv1;Lsd5;ZLxz4;ZLsn2;ZI)Lkx4;

    move-result-object v2

    .line 38
    invoke-virtual {v12, v0}, Llp2;->f(Ljava/lang/Object;)Z

    move-result v5

    .line 39
    invoke-virtual {v12}, Llp2;->K()Ljava/lang/Object;

    move-result-object v8

    if-nez v5, :cond_23

    if-ne v8, v4, :cond_24

    .line 40
    :cond_23
    new-instance v8, Lm40;

    const/16 v5, 0xf

    invoke-direct {v8, v0, v5}, Lm40;-><init>(Ljava/lang/String;B)V

    .line 41
    invoke-virtual {v12, v8}, Llp2;->g0(Ljava/lang/Object;)V

    .line 42
    :cond_24
    check-cast v8, Lgn2;

    const/4 v0, 0x0

    .line 43
    invoke-static {v2, v0, v8}, Lv07;->a(Lkx4;ZLgn2;)Lkx4;

    move-result-object v2

    .line 44
    iget-object v0, v6, Lt5;->k0:Ljava/lang/Object;

    check-cast v0, Lnh5;

    .line 45
    invoke-virtual {v0}, Lnh5;->l()F

    move-result v0

    float-to-int v6, v0

    if-gez v6, :cond_25

    const/4 v6, 0x0

    .line 46
    :cond_25
    new-instance v0, Lwc2;

    invoke-direct {v0, v6}, Lwc2;-><init>(I)V

    .line 47
    invoke-static {v2, v0}, Lz51;->v(Lkx4;Lwc2;)Lkx4;

    move-result-object v0

    const/high16 v6, 0x100000

    if-le v7, v6, :cond_26

    .line 48
    invoke-virtual {v12, v3}, Llp2;->f(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_27

    :cond_26
    and-int v2, v22, v21

    if-ne v2, v6, :cond_28

    :cond_27
    const/4 v6, 0x1

    goto :goto_16

    :cond_28
    const/4 v6, 0x0

    :goto_16
    and-int/lit8 v2, v22, 0x70

    const/16 v5, 0x20

    if-eq v2, v5, :cond_2a

    invoke-virtual {v12, v1}, Llp2;->h(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_29

    goto :goto_17

    :cond_29
    const/16 v19, 0x0

    goto :goto_18

    :cond_2a
    :goto_17
    const/16 v19, 0x1

    :goto_18
    or-int v2, v6, v19

    .line 49
    invoke-virtual {v12}, Llp2;->K()Ljava/lang/Object;

    move-result-object v5

    if-nez v2, :cond_2b

    if-ne v5, v4, :cond_2c

    .line 50
    :cond_2b
    new-instance v5, Lzw2;

    const/16 v2, 0x11

    invoke-direct {v5, v3, v1, v2}, Lzw2;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 51
    invoke-virtual {v12, v5}, Llp2;->g0(Ljava/lang/Object;)V

    .line 52
    :cond_2c
    check-cast v5, Lgn2;

    invoke-static {v0, v5}, Ljm4;->I(Lkx4;Lgn2;)Lkx4;

    move-result-object v0

    .line 53
    new-instance v2, Lt70;

    const/4 v6, 0x0

    invoke-direct {v2, v3, v6}, Lt70;-><init>(Lo87;B)V

    invoke-static {v0, v2}, Ljm4;->I(Lkx4;Lgn2;)Lkx4;

    move-result-object v16

    .line 54
    new-instance v0, Lyw4;

    move-object/from16 v7, p1

    move-object/from16 v6, p2

    move/from16 v8, p7

    move-object/from16 v4, p14

    move-object/from16 v5, p16

    move-object v2, v1

    move-object/from16 v1, p15

    invoke-direct/range {v0 .. v8}, Lyw4;-><init>(Lrn2;Loi;Lo87;Lrn2;Lzy0;Ldn2;Lb71;Z)V

    const v1, 0x2b6fbd6b

    invoke-static {v1, v0, v12}, Ljm4;->U(ILon2;Llp2;)Lzy0;

    move-result-object v20

    shr-int/lit8 v0, v22, 0x18

    and-int/lit8 v0, v0, 0x70

    const/high16 v1, 0xc00000

    or-int/2addr v0, v1

    shl-int/lit8 v1, v18, 0x6

    and-int/lit16 v2, v1, 0x380

    or-int/2addr v0, v2

    and-int/lit16 v2, v1, 0x1c00

    or-int/2addr v0, v2

    and-int/2addr v1, v10

    or-int v22, v0, v1

    const/16 v23, 0x60

    const/16 v19, 0x0

    move-object/from16 v21, v12

    move/from16 v18, v15

    move-object/from16 v12, v16

    move-wide/from16 v16, p11

    move-wide v14, v13

    move-object/from16 v13, p8

    .line 55
    invoke-static/range {v12 .. v23}, Lay7;->a(Lkx4;Lx67;JJFFLzy0;Llp2;II)V

    goto :goto_19

    .line 56
    :cond_2d
    invoke-virtual/range {p17 .. p17}, Llp2;->Q()V

    .line 57
    :goto_19
    invoke-virtual/range {p17 .. p17}, Llp2;->r()Lj86;

    move-result-object v0

    if-eqz v0, :cond_2e

    move-object v1, v0

    new-instance v0, Lqw4;

    move-object/from16 v2, p1

    move-object/from16 v3, p2

    move-object/from16 v5, p4

    move-object/from16 v6, p5

    move/from16 v8, p7

    move-wide/from16 v12, p11

    move/from16 v14, p13

    move-object/from16 v15, p14

    move-object/from16 v16, p15

    move-object/from16 v17, p16

    move/from16 v18, p18

    move-object/from16 v33, v1

    move-object v4, v9

    move v7, v11

    move-object/from16 v1, p0

    move-object/from16 v9, p8

    move-wide/from16 v10, p9

    invoke-direct/range {v0 .. v18}, Lqw4;-><init>(Loi;Lb71;Ldn2;Lgn2;Lkx4;Lo87;FZLx67;JJFLrn2;Lrn2;Lzy0;I)V

    move-object/from16 v1, v33

    .line 58
    iput-object v0, v1, Lj86;->d:Lrn2;

    :cond_2e
    return-void
.end method

.method public static final c(JLdn2;ZZLlp2;I)V
    .locals 17

    .line 1
    move-wide/from16 v1, p0

    .line 2
    .line 3
    move-object/from16 v3, p2

    .line 4
    .line 5
    move/from16 v4, p3

    .line 6
    .line 7
    move/from16 v5, p4

    .line 8
    .line 9
    move-object/from16 v9, p5

    .line 10
    .line 11
    const v0, -0x17578dd7

    .line 12
    .line 13
    .line 14
    invoke-virtual {v9, v0}, Llp2;->X(I)Llp2;

    .line 15
    .line 16
    .line 17
    invoke-virtual {v9, v1, v2}, Llp2;->e(J)Z

    .line 18
    .line 19
    .line 20
    move-result v0

    .line 21
    if-eqz v0, :cond_0

    .line 22
    .line 23
    const/4 v0, 0x4

    .line 24
    goto :goto_0

    .line 25
    :cond_0
    const/4 v0, 0x2

    .line 26
    :goto_0
    or-int v0, p6, v0

    .line 27
    .line 28
    invoke-virtual {v9, v3}, Llp2;->h(Ljava/lang/Object;)Z

    .line 29
    .line 30
    .line 31
    move-result v6

    .line 32
    const/16 v13, 0x10

    .line 33
    .line 34
    const/16 v14, 0x20

    .line 35
    .line 36
    if-eqz v6, :cond_1

    .line 37
    .line 38
    move v6, v14

    .line 39
    goto :goto_1

    .line 40
    :cond_1
    move v6, v13

    .line 41
    :goto_1
    or-int/2addr v0, v6

    .line 42
    invoke-virtual {v9, v4}, Llp2;->g(Z)Z

    .line 43
    .line 44
    .line 45
    move-result v6

    .line 46
    if-eqz v6, :cond_2

    .line 47
    .line 48
    const/16 v6, 0x100

    .line 49
    .line 50
    goto :goto_2

    .line 51
    :cond_2
    const/16 v6, 0x80

    .line 52
    .line 53
    :goto_2
    or-int/2addr v0, v6

    .line 54
    invoke-virtual {v9, v5}, Llp2;->g(Z)Z

    .line 55
    .line 56
    .line 57
    move-result v6

    .line 58
    if-eqz v6, :cond_3

    .line 59
    .line 60
    const/16 v6, 0x800

    .line 61
    .line 62
    goto :goto_3

    .line 63
    :cond_3
    const/16 v6, 0x400

    .line 64
    .line 65
    :goto_3
    or-int/2addr v0, v6

    .line 66
    and-int/lit16 v6, v0, 0x493

    .line 67
    .line 68
    const/16 v7, 0x492

    .line 69
    .line 70
    const/4 v15, 0x1

    .line 71
    const/4 v8, 0x0

    .line 72
    if-eq v6, v7, :cond_4

    .line 73
    .line 74
    move v6, v15

    .line 75
    goto :goto_4

    .line 76
    :cond_4
    move v6, v8

    .line 77
    :goto_4
    and-int/lit8 v7, v0, 0x1

    .line 78
    .line 79
    invoke-virtual {v9, v7, v6}, Llp2;->N(IZ)Z

    .line 80
    .line 81
    .line 82
    move-result v6

    .line 83
    if-eqz v6, :cond_11

    .line 84
    .line 85
    const-wide/16 v6, 0x10

    .line 86
    .line 87
    cmp-long v6, v1, v6

    .line 88
    .line 89
    if-eqz v6, :cond_10

    .line 90
    .line 91
    const v6, -0x55bf0636

    .line 92
    .line 93
    .line 94
    invoke-virtual {v9, v6}, Llp2;->W(I)V

    .line 95
    .line 96
    .line 97
    if-eqz v4, :cond_5

    .line 98
    .line 99
    const/high16 v6, 0x3f800000    # 1.0f

    .line 100
    .line 101
    goto :goto_5

    .line 102
    :cond_5
    const/4 v6, 0x0

    .line 103
    :goto_5
    sget-object v7, Lly4;->Z:Lly4;

    .line 104
    .line 105
    invoke-static {v7, v9}, Lw39;->q0(Lly4;Llp2;)Lwf7;

    .line 106
    .line 107
    .line 108
    move-result-object v7

    .line 109
    const/4 v10, 0x0

    .line 110
    const/16 v11, 0x1c

    .line 111
    .line 112
    move/from16 v16, v8

    .line 113
    .line 114
    const/4 v8, 0x0

    .line 115
    move/from16 v12, v16

    .line 116
    .line 117
    invoke-static/range {v6 .. v11}, Lri;->b(FLwf7;Ljava/lang/String;Llp2;II)Llh7;

    .line 118
    .line 119
    .line 120
    move-result-object v6

    .line 121
    sget v7, Lb56;->close_sheet:I

    .line 122
    .line 123
    invoke-static {v7, v9}, Lw79;->B(ILlp2;)Ljava/lang/String;

    .line 124
    .line 125
    .line 126
    move-result-object v7

    .line 127
    sget-object v8, Lhx4;->X:Lhx4;

    .line 128
    .line 129
    sget-object v10, Lzz0;->a:Lbe;

    .line 130
    .line 131
    if-eqz v5, :cond_c

    .line 132
    .line 133
    const v11, -0x55ba773b

    .line 134
    .line 135
    .line 136
    invoke-virtual {v9, v11}, Llp2;->W(I)V

    .line 137
    .line 138
    .line 139
    and-int/lit8 v11, v0, 0x70

    .line 140
    .line 141
    if-ne v11, v14, :cond_6

    .line 142
    .line 143
    move/from16 v16, v15

    .line 144
    .line 145
    goto :goto_6

    .line 146
    :cond_6
    move/from16 v16, v12

    .line 147
    .line 148
    :goto_6
    invoke-virtual {v9}, Llp2;->K()Ljava/lang/Object;

    .line 149
    .line 150
    .line 151
    move-result-object v12

    .line 152
    if-nez v16, :cond_7

    .line 153
    .line 154
    if-ne v12, v10, :cond_8

    .line 155
    .line 156
    :cond_7
    new-instance v12, Lsd;

    .line 157
    .line 158
    invoke-direct {v12, v3, v15}, Lsd;-><init>(Ljava/lang/Object;B)V

    .line 159
    .line 160
    .line 161
    invoke-virtual {v9, v12}, Llp2;->g0(Ljava/lang/Object;)V

    .line 162
    .line 163
    .line 164
    :cond_8
    check-cast v12, Landroidx/compose/ui/input/pointer/PointerInputEventHandler;

    .line 165
    .line 166
    invoke-static {v8, v3, v12}, Lyy7;->a(Lkx4;Ljava/lang/Object;Landroidx/compose/ui/input/pointer/PointerInputEventHandler;)Lkx4;

    .line 167
    .line 168
    .line 169
    move-result-object v8

    .line 170
    invoke-virtual {v9, v7}, Llp2;->f(Ljava/lang/Object;)Z

    .line 171
    .line 172
    .line 173
    move-result v12

    .line 174
    if-ne v11, v14, :cond_9

    .line 175
    .line 176
    move v11, v15

    .line 177
    goto :goto_7

    .line 178
    :cond_9
    const/4 v11, 0x0

    .line 179
    :goto_7
    or-int/2addr v11, v12

    .line 180
    invoke-virtual {v9}, Llp2;->K()Ljava/lang/Object;

    .line 181
    .line 182
    .line 183
    move-result-object v12

    .line 184
    if-nez v11, :cond_a

    .line 185
    .line 186
    if-ne v12, v10, :cond_b

    .line 187
    .line 188
    :cond_a
    new-instance v12, Lzw2;

    .line 189
    .line 190
    invoke-direct {v12, v7, v3, v13}, Lzw2;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 191
    .line 192
    .line 193
    invoke-virtual {v9, v12}, Llp2;->g0(Ljava/lang/Object;)V

    .line 194
    .line 195
    .line 196
    :cond_b
    check-cast v12, Lgn2;

    .line 197
    .line 198
    invoke-static {v8, v15, v12}, Lv07;->a(Lkx4;ZLgn2;)Lkx4;

    .line 199
    .line 200
    .line 201
    move-result-object v8

    .line 202
    const/4 v12, 0x0

    .line 203
    invoke-virtual {v9, v12}, Llp2;->p(Z)V

    .line 204
    .line 205
    .line 206
    goto :goto_8

    .line 207
    :cond_c
    const v7, -0x55b3f66f

    .line 208
    .line 209
    .line 210
    invoke-virtual {v9, v7}, Llp2;->W(I)V

    .line 211
    .line 212
    .line 213
    invoke-virtual {v9, v12}, Llp2;->p(Z)V

    .line 214
    .line 215
    .line 216
    :goto_8
    sget-object v7, Landroidx/compose/foundation/layout/b;->c:Landroidx/compose/foundation/layout/FillElement;

    .line 217
    .line 218
    invoke-interface {v7, v8}, Lkx4;->y(Lkx4;)Lkx4;

    .line 219
    .line 220
    .line 221
    move-result-object v7

    .line 222
    and-int/lit8 v0, v0, 0xe

    .line 223
    .line 224
    const/4 v8, 0x4

    .line 225
    if-ne v0, v8, :cond_d

    .line 226
    .line 227
    goto :goto_9

    .line 228
    :cond_d
    const/4 v15, 0x0

    .line 229
    :goto_9
    invoke-virtual {v9, v6}, Llp2;->f(Ljava/lang/Object;)Z

    .line 230
    .line 231
    .line 232
    move-result v0

    .line 233
    or-int/2addr v0, v15

    .line 234
    invoke-virtual {v9}, Llp2;->K()Ljava/lang/Object;

    .line 235
    .line 236
    .line 237
    move-result-object v8

    .line 238
    if-nez v0, :cond_e

    .line 239
    .line 240
    if-ne v8, v10, :cond_f

    .line 241
    .line 242
    :cond_e
    new-instance v8, Lrc2;

    .line 243
    .line 244
    invoke-direct {v8, v1, v2, v6}, Lrc2;-><init>(JLlh7;)V

    .line 245
    .line 246
    .line 247
    invoke-virtual {v9, v8}, Llp2;->g0(Ljava/lang/Object;)V

    .line 248
    .line 249
    .line 250
    :cond_f
    check-cast v8, Lgn2;

    .line 251
    .line 252
    const/4 v12, 0x0

    .line 253
    invoke-static {v12, v8, v9, v7}, Lyn0;->b(ILgn2;Llp2;Lkx4;)V

    .line 254
    .line 255
    .line 256
    invoke-virtual {v9, v12}, Llp2;->p(Z)V

    .line 257
    .line 258
    .line 259
    goto :goto_a

    .line 260
    :cond_10
    move v12, v8

    .line 261
    const v0, -0x55b13247

    .line 262
    .line 263
    .line 264
    invoke-virtual {v9, v0}, Llp2;->W(I)V

    .line 265
    .line 266
    .line 267
    invoke-virtual {v9, v12}, Llp2;->p(Z)V

    .line 268
    .line 269
    .line 270
    goto :goto_a

    .line 271
    :cond_11
    invoke-virtual {v9}, Llp2;->Q()V

    .line 272
    .line 273
    .line 274
    :goto_a
    invoke-virtual {v9}, Llp2;->r()Lj86;

    .line 275
    .line 276
    .line 277
    move-result-object v7

    .line 278
    if-eqz v7, :cond_12

    .line 279
    .line 280
    new-instance v0, Lpw4;

    .line 281
    .line 282
    move/from16 v6, p6

    .line 283
    .line 284
    invoke-direct/range {v0 .. v6}, Lpw4;-><init>(JLdn2;ZZI)V

    .line 285
    .line 286
    .line 287
    iput-object v0, v7, Lj86;->d:Lrn2;

    .line 288
    .line 289
    :cond_12
    return-void
.end method

.method public static final d(Lpk6;F)F
    .locals 4

    .line 1
    iget-wide v0, p0, Lpk6;->t0:J

    .line 2
    .line 3
    const/16 v2, 0x20

    .line 4
    .line 5
    shr-long/2addr v0, v2

    .line 6
    long-to-int v0, v0

    .line 7
    invoke-static {v0}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    invoke-static {v0}, Ljava/lang/Float;->isNaN(F)Z

    .line 12
    .line 13
    .line 14
    move-result v1

    .line 15
    const/high16 v2, 0x3f800000    # 1.0f

    .line 16
    .line 17
    if-nez v1, :cond_1

    .line 18
    .line 19
    const/4 v1, 0x0

    .line 20
    cmpg-float v3, v0, v1

    .line 21
    .line 22
    if-nez v3, :cond_0

    .line 23
    .line 24
    goto :goto_0

    .line 25
    :cond_0
    iget-object p0, p0, Lpk6;->v0:Lfi1;

    .line 26
    .line 27
    invoke-interface {p0}, Lfi1;->getDensity()F

    .line 28
    .line 29
    .line 30
    move-result p0

    .line 31
    const/high16 v3, 0x42400000    # 48.0f

    .line 32
    .line 33
    mul-float/2addr p0, v3

    .line 34
    invoke-static {p0, v0}, Ljava/lang/Math;->min(FF)F

    .line 35
    .line 36
    .line 37
    move-result p0

    .line 38
    invoke-static {v1, p0, p1}, Lw51;->H(FFF)F

    .line 39
    .line 40
    .line 41
    move-result p0

    .line 42
    div-float/2addr p0, v0

    .line 43
    sub-float/2addr v2, p0

    .line 44
    :cond_1
    :goto_0
    return v2
.end method

.method public static final e(Lpk6;F)F
    .locals 4

    .line 1
    iget-wide v0, p0, Lpk6;->t0:J

    .line 2
    .line 3
    const-wide v2, 0xffffffffL

    .line 4
    .line 5
    .line 6
    .line 7
    .line 8
    and-long/2addr v0, v2

    .line 9
    long-to-int v0, v0

    .line 10
    invoke-static {v0}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 11
    .line 12
    .line 13
    move-result v0

    .line 14
    invoke-static {v0}, Ljava/lang/Float;->isNaN(F)Z

    .line 15
    .line 16
    .line 17
    move-result v1

    .line 18
    const/high16 v2, 0x3f800000    # 1.0f

    .line 19
    .line 20
    if-nez v1, :cond_1

    .line 21
    .line 22
    const/4 v1, 0x0

    .line 23
    cmpg-float v3, v0, v1

    .line 24
    .line 25
    if-nez v3, :cond_0

    .line 26
    .line 27
    goto :goto_0

    .line 28
    :cond_0
    iget-object p0, p0, Lpk6;->v0:Lfi1;

    .line 29
    .line 30
    invoke-interface {p0}, Lfi1;->getDensity()F

    .line 31
    .line 32
    .line 33
    move-result p0

    .line 34
    const/high16 v3, 0x41c00000    # 24.0f

    .line 35
    .line 36
    mul-float/2addr p0, v3

    .line 37
    invoke-static {p0, v0}, Ljava/lang/Math;->min(FF)F

    .line 38
    .line 39
    .line 40
    move-result p0

    .line 41
    invoke-static {v1, p0, p1}, Lw51;->H(FFF)F

    .line 42
    .line 43
    .line 44
    move-result p0

    .line 45
    div-float/2addr p0, v0

    .line 46
    sub-float/2addr v2, p0

    .line 47
    :cond_1
    :goto_0
    return v2
.end method

.method public static final f(Lgn2;Llp2;II)Lo87;
    .locals 10

    .line 1
    and-int/lit8 v0, p3, 0x1

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    const/4 v2, 0x0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    move v4, v2

    .line 8
    goto :goto_0

    .line 9
    :cond_0
    move v4, v1

    .line 10
    :goto_0
    and-int/lit8 p3, p3, 0x2

    .line 11
    .line 12
    sget-object v0, Lzz0;->a:Lbe;

    .line 13
    .line 14
    if-eqz p3, :cond_2

    .line 15
    .line 16
    invoke-virtual {p1}, Llp2;->K()Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    move-result-object p0

    .line 20
    if-ne p0, v0, :cond_1

    .line 21
    .line 22
    new-instance p0, Luh3;

    .line 23
    .line 24
    const/16 p3, 0x1c

    .line 25
    .line 26
    invoke-direct {p0, p3}, Luh3;-><init>(B)V

    .line 27
    .line 28
    .line 29
    invoke-virtual {p1, p0}, Llp2;->g0(Ljava/lang/Object;)V

    .line 30
    .line 31
    .line 32
    :cond_1
    check-cast p0, Lgn2;

    .line 33
    .line 34
    :cond_2
    move-object v8, p0

    .line 35
    and-int/lit8 p0, p2, 0xe

    .line 36
    .line 37
    or-int/lit16 p0, p0, 0x180

    .line 38
    .line 39
    and-int/lit8 p2, p2, 0x70

    .line 40
    .line 41
    or-int/2addr p0, p2

    .line 42
    sget-object p2, Lm87;->a:Lsg8;

    .line 43
    .line 44
    sget p2, Ln70;->b:F

    .line 45
    .line 46
    sget p3, Ln70;->c:F

    .line 47
    .line 48
    sget-object v3, Ly01;->h:Lox1;

    .line 49
    .line 50
    invoke-virtual {p1, v3}, Llp2;->j(Lq06;)Ljava/lang/Object;

    .line 51
    .line 52
    .line 53
    move-result-object v3

    .line 54
    check-cast v3, Lfi1;

    .line 55
    .line 56
    invoke-virtual {p1, v3}, Llp2;->f(Ljava/lang/Object;)Z

    .line 57
    .line 58
    .line 59
    move-result v5

    .line 60
    invoke-virtual {p1, p2}, Llp2;->c(F)Z

    .line 61
    .line 62
    .line 63
    move-result v6

    .line 64
    or-int/2addr v5, v6

    .line 65
    invoke-virtual {p1}, Llp2;->K()Ljava/lang/Object;

    .line 66
    .line 67
    .line 68
    move-result-object v6

    .line 69
    if-nez v5, :cond_3

    .line 70
    .line 71
    if-ne v6, v0, :cond_4

    .line 72
    .line 73
    :cond_3
    new-instance v6, Lj87;

    .line 74
    .line 75
    invoke-direct {v6, v3, p2, v2}, Lj87;-><init>(Lfi1;FB)V

    .line 76
    .line 77
    .line 78
    invoke-virtual {p1, v6}, Llp2;->g0(Ljava/lang/Object;)V

    .line 79
    .line 80
    .line 81
    :cond_4
    move-object v5, v6

    .line 82
    check-cast v5, Ldn2;

    .line 83
    .line 84
    invoke-virtual {p1, v3}, Llp2;->f(Ljava/lang/Object;)Z

    .line 85
    .line 86
    .line 87
    move-result p2

    .line 88
    invoke-virtual {p1, p3}, Llp2;->c(F)Z

    .line 89
    .line 90
    .line 91
    move-result v6

    .line 92
    or-int/2addr p2, v6

    .line 93
    invoke-virtual {p1}, Llp2;->K()Ljava/lang/Object;

    .line 94
    .line 95
    .line 96
    move-result-object v6

    .line 97
    if-nez p2, :cond_5

    .line 98
    .line 99
    if-ne v6, v0, :cond_6

    .line 100
    .line 101
    :cond_5
    new-instance v6, Lj87;

    .line 102
    .line 103
    invoke-direct {v6, v3, p3, v1}, Lj87;-><init>(Lfi1;FB)V

    .line 104
    .line 105
    .line 106
    invoke-virtual {p1, v6}, Llp2;->g0(Ljava/lang/Object;)V

    .line 107
    .line 108
    .line 109
    :cond_6
    check-cast v6, Ldn2;

    .line 110
    .line 111
    invoke-static {v4}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 112
    .line 113
    .line 114
    move-result-object p2

    .line 115
    sget-object p3, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 116
    .line 117
    filled-new-array {p2, v8, p3}, [Ljava/lang/Object;

    .line 118
    .line 119
    .line 120
    move-result-object p2

    .line 121
    new-instance p3, Lew6;

    .line 122
    .line 123
    const/16 v3, 0x1a

    .line 124
    .line 125
    invoke-direct {p3, v3}, Lew6;-><init>(B)V

    .line 126
    .line 127
    .line 128
    new-instance v3, Lkg;

    .line 129
    .line 130
    invoke-direct {v3, v4, v5, v6, v8}, Lkg;-><init>(ZLdn2;Ldn2;Lgn2;)V

    .line 131
    .line 132
    .line 133
    new-instance v9, Lxd6;

    .line 134
    .line 135
    const/4 v7, 0x6

    .line 136
    invoke-direct {v9, p3, v3, v7}, Lxd6;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 137
    .line 138
    .line 139
    and-int/lit8 p3, p0, 0xe

    .line 140
    .line 141
    xor-int/2addr p3, v7

    .line 142
    const/4 v3, 0x4

    .line 143
    if-le p3, v3, :cond_7

    .line 144
    .line 145
    invoke-virtual {p1, v4}, Llp2;->g(Z)Z

    .line 146
    .line 147
    .line 148
    move-result p3

    .line 149
    if-nez p3, :cond_8

    .line 150
    .line 151
    :cond_7
    and-int/lit8 p3, p0, 0x6

    .line 152
    .line 153
    if-ne p3, v3, :cond_9

    .line 154
    .line 155
    :cond_8
    move p3, v1

    .line 156
    goto :goto_1

    .line 157
    :cond_9
    move p3, v2

    .line 158
    :goto_1
    invoke-virtual {p1, v5}, Llp2;->f(Ljava/lang/Object;)Z

    .line 159
    .line 160
    .line 161
    move-result v3

    .line 162
    or-int/2addr p3, v3

    .line 163
    invoke-virtual {p1, v6}, Llp2;->f(Ljava/lang/Object;)Z

    .line 164
    .line 165
    .line 166
    move-result v3

    .line 167
    or-int/2addr p3, v3

    .line 168
    and-int/lit8 v3, p0, 0x70

    .line 169
    .line 170
    xor-int/lit8 v3, v3, 0x30

    .line 171
    .line 172
    const/16 v7, 0x20

    .line 173
    .line 174
    if-le v3, v7, :cond_a

    .line 175
    .line 176
    invoke-virtual {p1, v8}, Llp2;->f(Ljava/lang/Object;)Z

    .line 177
    .line 178
    .line 179
    move-result v3

    .line 180
    if-nez v3, :cond_c

    .line 181
    .line 182
    :cond_a
    and-int/lit8 p0, p0, 0x30

    .line 183
    .line 184
    if-ne p0, v7, :cond_b

    .line 185
    .line 186
    goto :goto_2

    .line 187
    :cond_b
    move v1, v2

    .line 188
    :cond_c
    :goto_2
    or-int p0, p3, v1

    .line 189
    .line 190
    invoke-virtual {p1, v2}, Llp2;->g(Z)Z

    .line 191
    .line 192
    .line 193
    move-result p3

    .line 194
    or-int/2addr p0, p3

    .line 195
    invoke-virtual {p1}, Llp2;->K()Ljava/lang/Object;

    .line 196
    .line 197
    .line 198
    move-result-object p3

    .line 199
    if-nez p0, :cond_d

    .line 200
    .line 201
    if-ne p3, v0, :cond_e

    .line 202
    .line 203
    :cond_d
    new-instance v3, Lk87;

    .line 204
    .line 205
    sget-object v7, Lp87;->X:Lp87;

    .line 206
    .line 207
    invoke-direct/range {v3 .. v8}, Lk87;-><init>(ZLdn2;Ldn2;Lp87;Lgn2;)V

    .line 208
    .line 209
    .line 210
    invoke-virtual {p1, v3}, Llp2;->g0(Ljava/lang/Object;)V

    .line 211
    .line 212
    .line 213
    move-object p3, v3

    .line 214
    :cond_e
    check-cast p3, Ldn2;

    .line 215
    .line 216
    invoke-static {p2, v9, p3, p1, v2}, Ljm4;->Y([Ljava/lang/Object;Lbw6;Ldn2;Llp2;I)Ljava/lang/Object;

    .line 217
    .line 218
    .line 219
    move-result-object p0

    .line 220
    check-cast p0, Lo87;

    .line 221
    .line 222
    return-object p0
.end method
