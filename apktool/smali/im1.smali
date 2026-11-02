.class public final Lim1;
.super Lgx5;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"

# interfaces
.implements Lml1;


# instance fields
.field public final E0:Lcz5;

.field public final F0:Lw15;

.field public final G0:Lux4;

.field public final H0:Ldv8;

.field public final I0:Lxl1;


# direct methods
.method public constructor <init>(Led1;Lfx5;Lsm;Lfx4;Lfl1;ZLv15;IZZZZZLcz5;Lw15;Lux4;Ldv8;Lxl1;)V
    .locals 15

    .line 1
    invoke-virtual/range {p1 .. p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual/range {p3 .. p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    invoke-virtual/range {p4 .. p4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    invoke-virtual/range {p5 .. p5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 11
    .line 12
    .line 13
    invoke-virtual/range {p7 .. p7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 14
    .line 15
    .line 16
    if-eqz p8, :cond_0

    .line 17
    .line 18
    invoke-virtual/range {p15 .. p15}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 19
    .line 20
    .line 21
    invoke-virtual/range {p17 .. p17}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 22
    .line 23
    .line 24
    sget-object v9, Lke7;->G:Lg55;

    .line 25
    .line 26
    move-object v0, p0

    .line 27
    move-object/from16 v1, p1

    .line 28
    .line 29
    move-object/from16 v2, p2

    .line 30
    .line 31
    move-object/from16 v3, p3

    .line 32
    .line 33
    move-object/from16 v4, p4

    .line 34
    .line 35
    move-object/from16 v5, p5

    .line 36
    .line 37
    move/from16 v6, p6

    .line 38
    .line 39
    move-object/from16 v7, p7

    .line 40
    .line 41
    move/from16 v8, p8

    .line 42
    .line 43
    move/from16 v10, p9

    .line 44
    .line 45
    move/from16 v11, p10

    .line 46
    .line 47
    move/from16 v13, p11

    .line 48
    .line 49
    move/from16 v14, p12

    .line 50
    .line 51
    move/from16 v12, p13

    .line 52
    .line 53
    invoke-direct/range {v0 .. v14}, Lgx5;-><init>(Led1;Lfx5;Lsm;Lfx4;Lfl1;ZLv15;ILke7;ZZZZZ)V

    .line 54
    .line 55
    .line 56
    move-object/from16 v1, p14

    .line 57
    .line 58
    iput-object v1, p0, Lim1;->E0:Lcz5;

    .line 59
    .line 60
    move-object/from16 v1, p15

    .line 61
    .line 62
    iput-object v1, p0, Lim1;->F0:Lw15;

    .line 63
    .line 64
    move-object/from16 v1, p16

    .line 65
    .line 66
    iput-object v1, p0, Lim1;->G0:Lux4;

    .line 67
    .line 68
    move-object/from16 v1, p17

    .line 69
    .line 70
    iput-object v1, p0, Lim1;->H0:Ldv8;

    .line 71
    .line 72
    move-object/from16 v1, p18

    .line 73
    .line 74
    iput-object v1, p0, Lim1;->I0:Lxl1;

    .line 75
    .line 76
    return-void

    .line 77
    :cond_0
    const/4 p0, 0x0

    .line 78
    throw p0
.end method


# virtual methods
.method public final G()Lux4;
    .locals 0

    .line 1
    iget-object p0, p0, Lim1;->G0:Lux4;

    .line 2
    .line 3
    return-object p0
.end method

.method public final J0(Led1;Lfx4;Lfl1;Lfx5;ILv15;)Lgx5;
    .locals 19

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    invoke-virtual/range {p1 .. p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    invoke-virtual/range {p2 .. p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 7
    .line 8
    .line 9
    invoke-virtual/range {p3 .. p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 10
    .line 11
    .line 12
    if-eqz p5, :cond_0

    .line 13
    .line 14
    invoke-virtual/range {p6 .. p6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 15
    .line 16
    .line 17
    new-instance v1, Lim1;

    .line 18
    .line 19
    invoke-virtual {v0}, Lcw0;->getAnnotations()Lsm;

    .line 20
    .line 21
    .line 22
    move-result-object v3

    .line 23
    invoke-virtual {v0}, Lim1;->k()Z

    .line 24
    .line 25
    .line 26
    move-result v11

    .line 27
    iget-object v2, v0, Lim1;->H0:Ldv8;

    .line 28
    .line 29
    iget-object v4, v0, Lim1;->I0:Lxl1;

    .line 30
    .line 31
    iget-boolean v6, v0, Lgx5;->j0:Z

    .line 32
    .line 33
    iget-boolean v9, v0, Lgx5;->r0:Z

    .line 34
    .line 35
    iget-boolean v10, v0, Lgx5;->s0:Z

    .line 36
    .line 37
    iget-boolean v12, v0, Lgx5;->v0:Z

    .line 38
    .line 39
    iget-boolean v13, v0, Lgx5;->t0:Z

    .line 40
    .line 41
    iget-object v14, v0, Lim1;->E0:Lcz5;

    .line 42
    .line 43
    iget-object v15, v0, Lim1;->F0:Lw15;

    .line 44
    .line 45
    iget-object v0, v0, Lim1;->G0:Lux4;

    .line 46
    .line 47
    move-object/from16 v5, p3

    .line 48
    .line 49
    move/from16 v8, p5

    .line 50
    .line 51
    move-object/from16 v7, p6

    .line 52
    .line 53
    move-object/from16 v16, v0

    .line 54
    .line 55
    move-object v0, v1

    .line 56
    move-object/from16 v17, v2

    .line 57
    .line 58
    move-object/from16 v18, v4

    .line 59
    .line 60
    move-object/from16 v1, p1

    .line 61
    .line 62
    move-object/from16 v4, p2

    .line 63
    .line 64
    move-object/from16 v2, p4

    .line 65
    .line 66
    invoke-direct/range {v0 .. v18}, Lim1;-><init>(Led1;Lfx5;Lsm;Lfx4;Lfl1;ZLv15;IZZZZZLcz5;Lw15;Lux4;Ldv8;Lxl1;)V

    .line 67
    .line 68
    .line 69
    return-object v0

    .line 70
    :cond_0
    const/4 v0, 0x0

    .line 71
    throw v0
.end method

.method public final M()Lw15;
    .locals 0

    .line 1
    iget-object p0, p0, Lim1;->F0:Lw15;

    .line 2
    .line 3
    return-object p0
.end method

.method public final N()Lxl1;
    .locals 0

    .line 1
    iget-object p0, p0, Lim1;->I0:Lxl1;

    .line 2
    .line 3
    return-object p0
.end method

.method public final k()Z
    .locals 1

    .line 1
    sget-object v0, Lmd2;->H:Ljd2;

    .line 2
    .line 3
    iget-object p0, p0, Lim1;->E0:Lcz5;

    .line 4
    .line 5
    iget p0, p0, Lcz5;->f0:I

    .line 6
    .line 7
    invoke-virtual {v0, p0}, Ljd2;->l(I)Ljava/lang/Boolean;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    invoke-virtual {p0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 12
    .line 13
    .line 14
    move-result p0

    .line 15
    return p0
.end method

.method public final x()Ld2;
    .locals 0

    .line 1
    iget-object p0, p0, Lim1;->E0:Lcz5;

    .line 2
    .line 3
    return-object p0
.end method
