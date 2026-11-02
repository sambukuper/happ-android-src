.class public final Lhm1;
.super Lgm1;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"


# instance fields
.field public final g:Ltf5;

.field public final h:Lzy5;

.field public final i:Ljava/lang/String;

.field public final j:Lfk2;


# direct methods
.method public constructor <init>(Ltf5;Lzy5;Lw15;Ls50;Lst3;Lhl1;Ljava/lang/String;Ldn2;)V
    .locals 10

    .line 1
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    invoke-virtual {p4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    invoke-virtual/range {p6 .. p6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 11
    .line 12
    .line 13
    new-instance v4, Lux4;

    .line 14
    .line 15
    iget-object v0, p2, Lzy5;->i0:Ltz5;

    .line 16
    .line 17
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 18
    .line 19
    .line 20
    invoke-direct {v4, v0}, Lux4;-><init>(Ltz5;)V

    .line 21
    .line 22
    .line 23
    sget-object v0, Ldv8;->b:Ldv8;

    .line 24
    .line 25
    iget-object v0, p2, Lzy5;->j0:La06;

    .line 26
    .line 27
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 28
    .line 29
    .line 30
    invoke-static {v0}, Lz38;->b(La06;)Ldv8;

    .line 31
    .line 32
    .line 33
    move-result-object v5

    .line 34
    new-instance v0, Ljl1;

    .line 35
    .line 36
    const/4 v8, 0x0

    .line 37
    sget-object v9, Ld02;->X:Ld02;

    .line 38
    .line 39
    move-object v3, p1

    .line 40
    move-object v2, p3

    .line 41
    move-object v6, p4

    .line 42
    move-object v7, p5

    .line 43
    move-object/from16 v1, p6

    .line 44
    .line 45
    invoke-direct/range {v0 .. v9}, Ljl1;-><init>(Lhl1;Lw15;Led1;Lux4;Ldv8;Ls50;Lxl1;Lfc8;Ljava/util/List;)V

    .line 46
    .line 47
    .line 48
    iget-object v2, p2, Lzy5;->f0:Ljava/util/List;

    .line 49
    .line 50
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 51
    .line 52
    .line 53
    iget-object v3, p2, Lzy5;->g0:Ljava/util/List;

    .line 54
    .line 55
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 56
    .line 57
    .line 58
    iget-object v4, p2, Lzy5;->h0:Ljava/util/List;

    .line 59
    .line 60
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 61
    .line 62
    .line 63
    move-object/from16 v5, p8

    .line 64
    .line 65
    move-object v1, v0

    .line 66
    move-object v0, p0

    .line 67
    invoke-direct/range {v0 .. v5}, Lgm1;-><init>(Ljl1;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ldn2;)V

    .line 68
    .line 69
    .line 70
    iput-object p1, p0, Lhm1;->g:Ltf5;

    .line 71
    .line 72
    iput-object p2, p0, Lhm1;->h:Lzy5;

    .line 73
    .line 74
    move-object/from16 v1, p7

    .line 75
    .line 76
    iput-object v1, p0, Lhm1;->i:Ljava/lang/String;

    .line 77
    .line 78
    move-object v1, p1

    .line 79
    check-cast v1, Luf5;

    .line 80
    .line 81
    iget-object v1, v1, Luf5;->i0:Lfk2;

    .line 82
    .line 83
    iput-object v1, p0, Lhm1;->j:Lfk2;

    .line 84
    .line 85
    return-void
.end method


# virtual methods
.method public final a(Lpk1;Lgn2;)Ljava/util/Collection;
    .locals 3

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0, p1, p2}, Lgm1;->i(Lpk1;Lgn2;)Ljava/util/List;

    .line 5
    .line 6
    .line 7
    move-result-object p1

    .line 8
    iget-object p2, p0, Lgm1;->b:Ljl1;

    .line 9
    .line 10
    iget-object p2, p2, Ljl1;->X:Ljava/lang/Object;

    .line 11
    .line 12
    check-cast p2, Lhl1;

    .line 13
    .line 14
    iget-object p2, p2, Lhl1;->k:Ljava/lang/Iterable;

    .line 15
    .line 16
    new-instance v0, Ljava/util/ArrayList;

    .line 17
    .line 18
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 19
    .line 20
    .line 21
    invoke-interface {p2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 22
    .line 23
    .line 24
    move-result-object p2

    .line 25
    :goto_0
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    .line 26
    .line 27
    .line 28
    move-result v1

    .line 29
    if-eqz v1, :cond_0

    .line 30
    .line 31
    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object v1

    .line 35
    check-cast v1, Lls0;

    .line 36
    .line 37
    iget-object v2, p0, Lhm1;->j:Lfk2;

    .line 38
    .line 39
    invoke-interface {v1, v2}, Lls0;->b(Lfk2;)Ljava/util/Collection;

    .line 40
    .line 41
    .line 42
    move-result-object v1

    .line 43
    check-cast v1, Ljava/lang/Iterable;

    .line 44
    .line 45
    invoke-static {v0, v1}, Lbw0;->d0(Ljava/util/Collection;Ljava/lang/Iterable;)V

    .line 46
    .line 47
    .line 48
    goto :goto_0

    .line 49
    :cond_0
    invoke-static {p1, v0}, Lwv0;->H0(Ljava/util/Collection;Ljava/lang/Iterable;)Ljava/util/ArrayList;

    .line 50
    .line 51
    .line 52
    move-result-object p0

    .line 53
    return-object p0
.end method

.method public final e(Lv15;Lx45;)Lot0;
    .locals 2

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    iget-object v0, p0, Lgm1;->b:Ljl1;

    .line 8
    .line 9
    iget-object v0, v0, Ljl1;->X:Ljava/lang/Object;

    .line 10
    .line 11
    check-cast v0, Lhl1;

    .line 12
    .line 13
    iget-object v0, v0, Lhl1;->i:Lqe4;

    .line 14
    .line 15
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 16
    .line 17
    .line 18
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 19
    .line 20
    .line 21
    iget-object v0, p0, Lhm1;->g:Ltf5;

    .line 22
    .line 23
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 24
    .line 25
    .line 26
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 27
    .line 28
    .line 29
    check-cast v0, Luf5;

    .line 30
    .line 31
    iget-object v0, v0, Luf5;->i0:Lfk2;

    .line 32
    .line 33
    iget-object v0, v0, Lfk2;->a:Lgk2;

    .line 34
    .line 35
    iget-object v0, v0, Lgk2;->a:Ljava/lang/String;

    .line 36
    .line 37
    invoke-virtual {p1}, Lv15;->b()Ljava/lang/String;

    .line 38
    .line 39
    .line 40
    move-result-object v1

    .line 41
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 42
    .line 43
    .line 44
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 45
    .line 46
    .line 47
    invoke-super {p0, p1, p2}, Lgm1;->e(Lv15;Lx45;)Lot0;

    .line 48
    .line 49
    .line 50
    move-result-object p0

    .line 51
    return-object p0
.end method

.method public final h(Ljava/util/ArrayList;Lgn2;)V
    .locals 0

    .line 1
    return-void
.end method

.method public final l(Lv15;)Lqs0;
    .locals 1

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    new-instance v0, Lqs0;

    .line 5
    .line 6
    iget-object p0, p0, Lhm1;->j:Lfk2;

    .line 7
    .line 8
    invoke-direct {v0, p0, p1}, Lqs0;-><init>(Lfk2;Lv15;)V

    .line 9
    .line 10
    .line 11
    return-object v0
.end method

.method public final n()Ljava/util/Set;
    .locals 0

    .line 1
    sget-object p0, Lm02;->X:Lm02;

    .line 2
    .line 3
    return-object p0
.end method

.method public final o()Ljava/util/Set;
    .locals 0

    .line 1
    sget-object p0, Lm02;->X:Lm02;

    .line 2
    .line 3
    return-object p0
.end method

.method public final p()Ljava/util/Set;
    .locals 0

    .line 1
    sget-object p0, Lm02;->X:Lm02;

    .line 2
    .line 3
    return-object p0
.end method

.method public final q(Lv15;)Z
    .locals 3

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Lgm1;->m()Ljava/util/Set;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    invoke-interface {v0, p1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    if-nez v0, :cond_3

    .line 13
    .line 14
    iget-object v0, p0, Lgm1;->b:Ljl1;

    .line 15
    .line 16
    iget-object v0, v0, Ljl1;->X:Ljava/lang/Object;

    .line 17
    .line 18
    check-cast v0, Lhl1;

    .line 19
    .line 20
    iget-object v0, v0, Lhl1;->k:Ljava/lang/Iterable;

    .line 21
    .line 22
    instance-of v1, v0, Ljava/util/Collection;

    .line 23
    .line 24
    if-eqz v1, :cond_0

    .line 25
    .line 26
    move-object v1, v0

    .line 27
    check-cast v1, Ljava/util/Collection;

    .line 28
    .line 29
    invoke-interface {v1}, Ljava/util/Collection;->isEmpty()Z

    .line 30
    .line 31
    .line 32
    move-result v1

    .line 33
    if-eqz v1, :cond_0

    .line 34
    .line 35
    goto :goto_0

    .line 36
    :cond_0
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 37
    .line 38
    .line 39
    move-result-object v0

    .line 40
    :cond_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 41
    .line 42
    .line 43
    move-result v1

    .line 44
    if-eqz v1, :cond_2

    .line 45
    .line 46
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 47
    .line 48
    .line 49
    move-result-object v1

    .line 50
    check-cast v1, Lls0;

    .line 51
    .line 52
    iget-object v2, p0, Lhm1;->j:Lfk2;

    .line 53
    .line 54
    invoke-interface {v1, v2, p1}, Lls0;->c(Lfk2;Lv15;)Z

    .line 55
    .line 56
    .line 57
    move-result v1

    .line 58
    if-eqz v1, :cond_1

    .line 59
    .line 60
    goto :goto_1

    .line 61
    :cond_2
    :goto_0
    const/4 p0, 0x0

    .line 62
    return p0

    .line 63
    :cond_3
    :goto_1
    const/4 p0, 0x1

    .line 64
    return p0
.end method

.method public final toString()Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Lhm1;->i:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
.end method
