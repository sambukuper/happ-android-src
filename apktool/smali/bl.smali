.class public final Lbl;
.super Ljava/lang/Object;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"

# interfaces
.implements Lt10;


# instance fields
.field public final X:Ljava/lang/Object;

.field public Y:Z

.field public final Z:Ljava/lang/Object;

.field public f0:Ljava/lang/Object;

.field public g0:Ljava/lang/Object;

.field public final h0:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Ll37;Lz20;)V
    .locals 3

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lbl;->Z:Ljava/lang/Object;

    .line 5
    .line 6
    iput-object p2, p0, Lbl;->f0:Ljava/lang/Object;

    .line 7
    .line 8
    sget-object v0, Lep3;->g0:Lep3;

    .line 9
    .line 10
    iget-object v1, p2, Lz20;->d:Lm85;

    .line 11
    .line 12
    if-eqz v1, :cond_0

    .line 13
    .line 14
    iget-object v2, p2, Lz20;->e:Lal;

    .line 15
    .line 16
    invoke-virtual {v1, v2}, Lm85;->x(Lvj8;)Lep3;

    .line 17
    .line 18
    .line 19
    move-result-object v1

    .line 20
    invoke-virtual {v0, v1}, Lep3;->a(Lep3;)Lep3;

    .line 21
    .line 22
    .line 23
    move-result-object v1

    .line 24
    goto :goto_0

    .line 25
    :cond_0
    move-object v1, v0

    .line 26
    :goto_0
    iget-object p2, p2, Lz20;->a:Ldh8;

    .line 27
    .line 28
    iget-object p2, p2, Ldh8;->j0:Ljava/lang/Class;

    .line 29
    .line 30
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 31
    .line 32
    .line 33
    invoke-virtual {v1, v0}, Lep3;->a(Lep3;)Lep3;

    .line 34
    .line 35
    .line 36
    move-result-object p2

    .line 37
    invoke-virtual {v0, p2}, Lep3;->a(Lep3;)Lep3;

    .line 38
    .line 39
    .line 40
    move-result-object v0

    .line 41
    iput-object v0, p0, Lbl;->h0:Ljava/lang/Object;

    .line 42
    .line 43
    iget-object p2, p2, Lep3;->X:Ldp3;

    .line 44
    .line 45
    sget-object v0, Ldp3;->f0:Ldp3;

    .line 46
    .line 47
    if-ne p2, v0, :cond_1

    .line 48
    .line 49
    const/4 p2, 0x1

    .line 50
    goto :goto_1

    .line 51
    :cond_1
    const/4 p2, 0x0

    .line 52
    :goto_1
    iput-boolean p2, p0, Lbl;->Y:Z

    .line 53
    .line 54
    invoke-virtual {p1}, Lvp4;->d()Lm85;

    .line 55
    .line 56
    .line 57
    move-result-object p1

    .line 58
    iput-object p1, p0, Lbl;->X:Ljava/lang/Object;

    .line 59
    .line 60
    return-void
.end method

.method public constructor <init>(Lrs2;Lis2;Lqn;)V
    .locals 0

    .line 72
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {p1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    iput-object p1, p0, Lbl;->h0:Ljava/lang/Object;

    const/4 p1, 0x0

    iput-object p1, p0, Lbl;->f0:Ljava/lang/Object;

    iput-object p1, p0, Lbl;->g0:Ljava/lang/Object;

    const/4 p1, 0x0

    iput-boolean p1, p0, Lbl;->Y:Z

    iput-object p2, p0, Lbl;->X:Ljava/lang/Object;

    iput-object p3, p0, Lbl;->Z:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Lvp4;Ldh8;Lvp4;)V
    .locals 1

    .line 61
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 62
    iget-object v0, p2, Ldh8;->j0:Ljava/lang/Class;

    .line 63
    iput-object v0, p0, Lbl;->g0:Ljava/lang/Object;

    .line 64
    iput-object p3, p0, Lbl;->Z:Ljava/lang/Object;

    .line 65
    invoke-virtual {p2}, Ldh8;->y0()Lgh8;

    move-result-object p2

    iput-object p2, p0, Lbl;->f0:Ljava/lang/Object;

    .line 66
    sget-object p2, Lxp4;->Z:Lxp4;

    invoke-virtual {p1, p2}, Lvp4;->f(Lxp4;)Z

    move-result p2

    if-eqz p2, :cond_0

    .line 67
    invoke-virtual {p1}, Lvp4;->d()Lm85;

    move-result-object p1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    iput-object p1, p0, Lbl;->X:Ljava/lang/Object;

    .line 68
    check-cast p3, Lwp4;

    .line 69
    iget-object p2, p3, Lwp4;->Z:Lu97;

    invoke-virtual {p2, v0}, Lu97;->a(Ljava/lang/Class;)Ljava/lang/Class;

    move-result-object p2

    .line 70
    iput-object p2, p0, Lbl;->h0:Ljava/lang/Object;

    if-eqz p1, :cond_1

    .line 71
    invoke-static {v0}, Lit0;->q(Ljava/lang/Class;)Z

    move-result p1

    if-nez p1, :cond_1

    const/4 p1, 0x1

    goto :goto_1

    :cond_1
    const/4 p1, 0x0

    :goto_1
    iput-boolean p1, p0, Lbl;->Y:Z

    return-void
.end method

.method public constructor <init>(Lvp4;Ljava/lang/Class;Lrs0;)V
    .locals 2

    .line 73
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 74
    iput-object p2, p0, Lbl;->g0:Ljava/lang/Object;

    .line 75
    iput-object p3, p0, Lbl;->Z:Ljava/lang/Object;

    .line 76
    sget-object v0, Lgh8;->i0:Lgh8;

    .line 77
    iput-object v0, p0, Lbl;->f0:Ljava/lang/Object;

    const/4 v0, 0x0

    if-nez p1, :cond_0

    .line 78
    iput-object v0, p0, Lbl;->X:Ljava/lang/Object;

    .line 79
    iput-object v0, p0, Lbl;->h0:Ljava/lang/Object;

    goto :goto_2

    .line 80
    :cond_0
    sget-object v1, Lxp4;->Z:Lxp4;

    invoke-virtual {p1, v1}, Lvp4;->f(Lxp4;)Z

    move-result v1

    if-eqz v1, :cond_1

    .line 81
    invoke-virtual {p1}, Lvp4;->d()Lm85;

    move-result-object p1

    goto :goto_0

    :cond_1
    move-object p1, v0

    :goto_0
    iput-object p1, p0, Lbl;->X:Ljava/lang/Object;

    if-nez p3, :cond_2

    goto :goto_1

    .line 82
    :cond_2
    invoke-interface {p3, p2}, Lrs0;->a(Ljava/lang/Class;)Ljava/lang/Class;

    move-result-object v0

    :goto_1
    iput-object v0, p0, Lbl;->h0:Ljava/lang/Object;

    move-object v0, p1

    :goto_2
    if-eqz v0, :cond_3

    .line 83
    invoke-static {p2}, Lit0;->q(Ljava/lang/Class;)Z

    move-result p1

    if-nez p1, :cond_3

    const/4 p1, 0x1

    goto :goto_3

    :cond_3
    const/4 p1, 0x0

    :goto_3
    iput-boolean p1, p0, Lbl;->Y:Z

    return-void
.end method

.method public static d(Ldh8;Ljava/util/ArrayList;Z)V
    .locals 4

    .line 1
    iget-object v0, p0, Ldh8;->j0:Ljava/lang/Class;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-eqz p2, :cond_2

    .line 5
    .line 6
    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    .line 7
    .line 8
    .line 9
    move-result p2

    .line 10
    move v2, v1

    .line 11
    :goto_0
    if-ge v2, p2, :cond_1

    .line 12
    .line 13
    invoke-virtual {p1, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object v3

    .line 17
    check-cast v3, Ldh8;

    .line 18
    .line 19
    iget-object v3, v3, Ldh8;->j0:Ljava/lang/Class;

    .line 20
    .line 21
    if-ne v3, v0, :cond_0

    .line 22
    .line 23
    goto :goto_3

    .line 24
    :cond_0
    add-int/lit8 v2, v2, 0x1

    .line 25
    .line 26
    goto :goto_0

    .line 27
    :cond_1
    invoke-virtual {p1, p0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 28
    .line 29
    .line 30
    const-class p2, Ljava/util/List;

    .line 31
    .line 32
    if-eq v0, p2, :cond_6

    .line 33
    .line 34
    const-class p2, Ljava/util/Map;

    .line 35
    .line 36
    if-ne v0, p2, :cond_2

    .line 37
    .line 38
    goto :goto_3

    .line 39
    :cond_2
    iget-object p0, p0, Ldh8;->p0:[Ldh8;

    .line 40
    .line 41
    const/4 p2, 0x1

    .line 42
    if-nez p0, :cond_3

    .line 43
    .line 44
    sget-object p0, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    .line 45
    .line 46
    goto :goto_1

    .line 47
    :cond_3
    array-length v0, p0

    .line 48
    if-eqz v0, :cond_5

    .line 49
    .line 50
    if-eq v0, p2, :cond_4

    .line 51
    .line 52
    invoke-static {p0}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    .line 53
    .line 54
    .line 55
    move-result-object p0

    .line 56
    goto :goto_1

    .line 57
    :cond_4
    aget-object p0, p0, v1

    .line 58
    .line 59
    invoke-static {p0}, Ljava/util/Collections;->singletonList(Ljava/lang/Object;)Ljava/util/List;

    .line 60
    .line 61
    .line 62
    move-result-object p0

    .line 63
    goto :goto_1

    .line 64
    :cond_5
    sget-object p0, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    .line 65
    .line 66
    :goto_1
    invoke-interface {p0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 67
    .line 68
    .line 69
    move-result-object p0

    .line 70
    :goto_2
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 71
    .line 72
    .line 73
    move-result v0

    .line 74
    if-eqz v0, :cond_6

    .line 75
    .line 76
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 77
    .line 78
    .line 79
    move-result-object v0

    .line 80
    check-cast v0, Ldh8;

    .line 81
    .line 82
    invoke-static {v0, p1, p2}, Lbl;->d(Ldh8;Ljava/util/ArrayList;Z)V

    .line 83
    .line 84
    .line 85
    goto :goto_2

    .line 86
    :cond_6
    :goto_3
    return-void
.end method

.method public static e(Ldh8;Ljava/util/ArrayList;Z)V
    .locals 4

    .line 1
    iget-object v0, p0, Ldh8;->j0:Ljava/lang/Class;

    .line 2
    .line 3
    const-class v1, Ljava/lang/Object;

    .line 4
    .line 5
    if-eq v0, v1, :cond_8

    .line 6
    .line 7
    const-class v1, Ljava/lang/Enum;

    .line 8
    .line 9
    if-ne v0, v1, :cond_0

    .line 10
    .line 11
    goto :goto_3

    .line 12
    :cond_0
    const/4 v1, 0x0

    .line 13
    if-eqz p2, :cond_3

    .line 14
    .line 15
    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    .line 16
    .line 17
    .line 18
    move-result p2

    .line 19
    move v2, v1

    .line 20
    :goto_0
    if-ge v2, p2, :cond_2

    .line 21
    .line 22
    invoke-virtual {p1, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 23
    .line 24
    .line 25
    move-result-object v3

    .line 26
    check-cast v3, Ldh8;

    .line 27
    .line 28
    iget-object v3, v3, Ldh8;->j0:Ljava/lang/Class;

    .line 29
    .line 30
    if-ne v3, v0, :cond_1

    .line 31
    .line 32
    goto :goto_3

    .line 33
    :cond_1
    add-int/lit8 v2, v2, 0x1

    .line 34
    .line 35
    goto :goto_0

    .line 36
    :cond_2
    invoke-virtual {p1, p0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 37
    .line 38
    .line 39
    :cond_3
    iget-object p2, p0, Ldh8;->p0:[Ldh8;

    .line 40
    .line 41
    const/4 v0, 0x1

    .line 42
    if-nez p2, :cond_4

    .line 43
    .line 44
    sget-object p2, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    .line 45
    .line 46
    goto :goto_1

    .line 47
    :cond_4
    array-length v2, p2

    .line 48
    if-eqz v2, :cond_6

    .line 49
    .line 50
    if-eq v2, v0, :cond_5

    .line 51
    .line 52
    invoke-static {p2}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    .line 53
    .line 54
    .line 55
    move-result-object p2

    .line 56
    goto :goto_1

    .line 57
    :cond_5
    aget-object p2, p2, v1

    .line 58
    .line 59
    invoke-static {p2}, Ljava/util/Collections;->singletonList(Ljava/lang/Object;)Ljava/util/List;

    .line 60
    .line 61
    .line 62
    move-result-object p2

    .line 63
    goto :goto_1

    .line 64
    :cond_6
    sget-object p2, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    .line 65
    .line 66
    :goto_1
    invoke-interface {p2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 67
    .line 68
    .line 69
    move-result-object p2

    .line 70
    :goto_2
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    .line 71
    .line 72
    .line 73
    move-result v1

    .line 74
    if-eqz v1, :cond_7

    .line 75
    .line 76
    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 77
    .line 78
    .line 79
    move-result-object v1

    .line 80
    check-cast v1, Ldh8;

    .line 81
    .line 82
    invoke-static {v1, p1, v0}, Lbl;->d(Ldh8;Ljava/util/ArrayList;Z)V

    .line 83
    .line 84
    .line 85
    goto :goto_2

    .line 86
    :cond_7
    invoke-virtual {p0}, Ldh8;->E0()Ldh8;

    .line 87
    .line 88
    .line 89
    move-result-object p0

    .line 90
    if-eqz p0, :cond_8

    .line 91
    .line 92
    invoke-static {p0, p1, v0}, Lbl;->e(Ldh8;Ljava/util/ArrayList;Z)V

    .line 93
    .line 94
    .line 95
    :cond_8
    :goto_3
    return-void
.end method

.method public static g(Lvp4;Ldh8;Lvp4;)Lal;
    .locals 13

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget-object v0, p1, Ldh8;->j0:Ljava/lang/Class;

    .line 5
    .line 6
    instance-of v1, p1, Lcu;

    .line 7
    .line 8
    if-eqz v1, :cond_0

    .line 9
    .line 10
    move-object v1, p0

    .line 11
    check-cast v1, Lwp4;

    .line 12
    .line 13
    iget-object v1, v1, Lwp4;->Z:Lu97;

    .line 14
    .line 15
    invoke-virtual {v1, v0}, Lu97;->a(Ljava/lang/Class;)Ljava/lang/Class;

    .line 16
    .line 17
    .line 18
    move-result-object v1

    .line 19
    if-nez v1, :cond_0

    .line 20
    .line 21
    new-instance p0, Lal;

    .line 22
    .line 23
    invoke-direct {p0, v0}, Lal;-><init>(Ljava/lang/Class;)V

    .line 24
    .line 25
    .line 26
    return-object p0

    .line 27
    :cond_0
    new-instance v1, Lbl;

    .line 28
    .line 29
    invoke-direct {v1, p0, p1, p2}, Lbl;-><init>(Lvp4;Ldh8;Lvp4;)V

    .line 30
    .line 31
    .line 32
    new-instance v5, Ljava/util/ArrayList;

    .line 33
    .line 34
    const/16 v2, 0x8

    .line 35
    .line 36
    invoke-direct {v5, v2}, Ljava/util/ArrayList;-><init>(I)V

    .line 37
    .line 38
    .line 39
    const-class v2, Ljava/lang/Object;

    .line 40
    .line 41
    invoke-virtual {p1, v2}, Ldh8;->H0(Ljava/lang/Class;)Z

    .line 42
    .line 43
    .line 44
    move-result v2

    .line 45
    if-nez v2, :cond_2

    .line 46
    .line 47
    invoke-virtual {v0}, Ljava/lang/Class;->isInterface()Z

    .line 48
    .line 49
    .line 50
    move-result v0

    .line 51
    const/4 v2, 0x0

    .line 52
    if-eqz v0, :cond_1

    .line 53
    .line 54
    invoke-static {p1, v5, v2}, Lbl;->d(Ldh8;Ljava/util/ArrayList;Z)V

    .line 55
    .line 56
    .line 57
    goto :goto_0

    .line 58
    :cond_1
    invoke-static {p1, v5, v2}, Lbl;->e(Ldh8;Ljava/util/ArrayList;Z)V

    .line 59
    .line 60
    .line 61
    :cond_2
    :goto_0
    new-instance v2, Lal;

    .line 62
    .line 63
    iget-object v0, v1, Lbl;->g0:Ljava/lang/Object;

    .line 64
    .line 65
    move-object v4, v0

    .line 66
    check-cast v4, Ljava/lang/Class;

    .line 67
    .line 68
    iget-object v0, v1, Lbl;->h0:Ljava/lang/Object;

    .line 69
    .line 70
    move-object v6, v0

    .line 71
    check-cast v6, Ljava/lang/Class;

    .line 72
    .line 73
    invoke-virtual {v1, v5}, Lbl;->h(Ljava/util/List;)Ltm;

    .line 74
    .line 75
    .line 76
    move-result-object v7

    .line 77
    iget-object v0, v1, Lbl;->f0:Ljava/lang/Object;

    .line 78
    .line 79
    move-object v8, v0

    .line 80
    check-cast v8, Lgh8;

    .line 81
    .line 82
    iget-object v0, v1, Lbl;->X:Ljava/lang/Object;

    .line 83
    .line 84
    move-object v9, v0

    .line 85
    check-cast v9, Lm85;

    .line 86
    .line 87
    iget-object p0, p0, Lvp4;->Y:Ll20;

    .line 88
    .line 89
    iget-object v11, p0, Ll20;->X:Luh8;

    .line 90
    .line 91
    iget-boolean v12, v1, Lbl;->Y:Z

    .line 92
    .line 93
    move-object v3, p1

    .line 94
    move-object v10, p2

    .line 95
    invoke-direct/range {v2 .. v12}, Lal;-><init>(Ldh8;Ljava/lang/Class;Ljava/util/List;Ljava/lang/Class;Ltm;Lgh8;Lm85;Lrs0;Luh8;Z)V

    .line 96
    .line 97
    .line 98
    return-object v2
.end method

.method public static i(Lvp4;Ljava/lang/Class;Lvp4;)Lal;
    .locals 12

    .line 1
    invoke-virtual {p1}, Ljava/lang/Class;->isArray()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_1

    .line 6
    .line 7
    if-eqz p0, :cond_0

    .line 8
    .line 9
    move-object v0, p0

    .line 10
    check-cast v0, Lwp4;

    .line 11
    .line 12
    iget-object v0, v0, Lwp4;->Z:Lu97;

    .line 13
    .line 14
    invoke-virtual {v0, p1}, Lu97;->a(Ljava/lang/Class;)Ljava/lang/Class;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    if-nez v0, :cond_1

    .line 19
    .line 20
    :cond_0
    new-instance p0, Lal;

    .line 21
    .line 22
    invoke-direct {p0, p1}, Lal;-><init>(Ljava/lang/Class;)V

    .line 23
    .line 24
    .line 25
    return-object p0

    .line 26
    :cond_1
    new-instance v0, Lbl;

    .line 27
    .line 28
    invoke-direct {v0, p0, p1, p2}, Lbl;-><init>(Lvp4;Ljava/lang/Class;Lrs0;)V

    .line 29
    .line 30
    .line 31
    sget-object v4, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    .line 32
    .line 33
    new-instance v1, Lal;

    .line 34
    .line 35
    iget-object v2, v0, Lbl;->h0:Ljava/lang/Object;

    .line 36
    .line 37
    move-object v5, v2

    .line 38
    check-cast v5, Ljava/lang/Class;

    .line 39
    .line 40
    invoke-virtual {v0, v4}, Lbl;->h(Ljava/util/List;)Ltm;

    .line 41
    .line 42
    .line 43
    move-result-object v6

    .line 44
    iget-object v2, v0, Lbl;->f0:Ljava/lang/Object;

    .line 45
    .line 46
    move-object v7, v2

    .line 47
    check-cast v7, Lgh8;

    .line 48
    .line 49
    iget-object v2, v0, Lbl;->X:Ljava/lang/Object;

    .line 50
    .line 51
    move-object v8, v2

    .line 52
    check-cast v8, Lm85;

    .line 53
    .line 54
    iget-object p0, p0, Lvp4;->Y:Ll20;

    .line 55
    .line 56
    iget-object v10, p0, Ll20;->X:Luh8;

    .line 57
    .line 58
    iget-boolean v11, v0, Lbl;->Y:Z

    .line 59
    .line 60
    const/4 v2, 0x0

    .line 61
    move-object v3, p1

    .line 62
    move-object v9, p2

    .line 63
    invoke-direct/range {v1 .. v11}, Lal;-><init>(Ldh8;Ljava/lang/Class;Ljava/util/List;Ljava/lang/Class;Ltm;Lgh8;Lm85;Lrs0;Luh8;Z)V

    .line 64
    .line 65
    .line 66
    return-object v1
.end method


# virtual methods
.method public A(Lx11;)V
    .locals 3

    .line 1
    new-instance v0, Lzo2;

    .line 2
    .line 3
    const/16 v1, 0x10

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    invoke-direct {v0, v1, p0, p1, v2}, Lzo2;-><init>(BLjava/lang/Object;Ljava/lang/Object;Z)V

    .line 7
    .line 8
    .line 9
    iget-object p0, p0, Lbl;->h0:Ljava/lang/Object;

    .line 10
    .line 11
    check-cast p0, Lrs2;

    .line 12
    .line 13
    iget-object p0, p0, Lrs2;->m:Lf99;

    .line 14
    .line 15
    invoke-virtual {p0, v0}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 16
    .line 17
    .line 18
    return-void
.end method

.method public a(Lch3;[Ljava/lang/annotation/Annotation;)Lch3;
    .locals 4

    .line 1
    if-eqz p2, :cond_1

    .line 2
    .line 3
    array-length v0, p2

    .line 4
    const/4 v1, 0x0

    .line 5
    :goto_0
    if-ge v1, v0, :cond_1

    .line 6
    .line 7
    aget-object v2, p2, v1

    .line 8
    .line 9
    invoke-virtual {p1, v2}, Lch3;->L(Ljava/lang/annotation/Annotation;)Z

    .line 10
    .line 11
    .line 12
    move-result v3

    .line 13
    if-nez v3, :cond_0

    .line 14
    .line 15
    invoke-virtual {p1, v2}, Lch3;->g(Ljava/lang/annotation/Annotation;)Lch3;

    .line 16
    .line 17
    .line 18
    move-result-object p1

    .line 19
    iget-object v3, p0, Lbl;->X:Ljava/lang/Object;

    .line 20
    .line 21
    check-cast v3, Lm85;

    .line 22
    .line 23
    invoke-virtual {v3, v2}, Lm85;->W(Ljava/lang/annotation/Annotation;)Z

    .line 24
    .line 25
    .line 26
    move-result v3

    .line 27
    if-eqz v3, :cond_0

    .line 28
    .line 29
    invoke-virtual {p0, p1, v2}, Lbl;->c(Lch3;Ljava/lang/annotation/Annotation;)Lch3;

    .line 30
    .line 31
    .line 32
    move-result-object p1

    .line 33
    :cond_0
    add-int/lit8 v1, v1, 0x1

    .line 34
    .line 35
    goto :goto_0

    .line 36
    :cond_1
    return-object p1
.end method

.method public b(Lch3;Ljava/lang/Class;Ljava/lang/Class;)Lch3;
    .locals 1

    .line 1
    if-eqz p3, :cond_0

    .line 2
    .line 3
    invoke-static {p3}, Lit0;->i(Ljava/lang/Class;)[Ljava/lang/annotation/Annotation;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-virtual {p0, p1, v0}, Lbl;->a(Lch3;[Ljava/lang/annotation/Annotation;)Lch3;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    const/4 v0, 0x0

    .line 12
    invoke-static {p3, p2, v0}, Lit0;->j(Ljava/lang/Class;Ljava/lang/Class;Z)Ljava/util/ArrayList;

    .line 13
    .line 14
    .line 15
    move-result-object p2

    .line 16
    invoke-virtual {p2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 17
    .line 18
    .line 19
    move-result-object p2

    .line 20
    :goto_0
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    .line 21
    .line 22
    .line 23
    move-result p3

    .line 24
    if-eqz p3, :cond_0

    .line 25
    .line 26
    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    move-result-object p3

    .line 30
    check-cast p3, Ljava/lang/Class;

    .line 31
    .line 32
    invoke-static {p3}, Lit0;->i(Ljava/lang/Class;)[Ljava/lang/annotation/Annotation;

    .line 33
    .line 34
    .line 35
    move-result-object p3

    .line 36
    invoke-virtual {p0, p1, p3}, Lbl;->a(Lch3;[Ljava/lang/annotation/Annotation;)Lch3;

    .line 37
    .line 38
    .line 39
    move-result-object p1

    .line 40
    goto :goto_0

    .line 41
    :cond_0
    return-object p1
.end method

.method public c(Lch3;Ljava/lang/annotation/Annotation;)Lch3;
    .locals 4

    .line 1
    invoke-interface {p2}, Ljava/lang/annotation/Annotation;->annotationType()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    move-result-object p2

    .line 5
    invoke-static {p2}, Lit0;->i(Ljava/lang/Class;)[Ljava/lang/annotation/Annotation;

    .line 6
    .line 7
    .line 8
    move-result-object p2

    .line 9
    array-length v0, p2

    .line 10
    const/4 v1, 0x0

    .line 11
    :goto_0
    if-ge v1, v0, :cond_2

    .line 12
    .line 13
    aget-object v2, p2, v1

    .line 14
    .line 15
    instance-of v3, v2, Ljava/lang/annotation/Target;

    .line 16
    .line 17
    if-nez v3, :cond_1

    .line 18
    .line 19
    instance-of v3, v2, Ljava/lang/annotation/Retention;

    .line 20
    .line 21
    if-eqz v3, :cond_0

    .line 22
    .line 23
    goto :goto_1

    .line 24
    :cond_0
    invoke-virtual {p1, v2}, Lch3;->L(Ljava/lang/annotation/Annotation;)Z

    .line 25
    .line 26
    .line 27
    move-result v3

    .line 28
    if-nez v3, :cond_1

    .line 29
    .line 30
    invoke-virtual {p1, v2}, Lch3;->g(Ljava/lang/annotation/Annotation;)Lch3;

    .line 31
    .line 32
    .line 33
    move-result-object p1

    .line 34
    iget-object v3, p0, Lbl;->X:Ljava/lang/Object;

    .line 35
    .line 36
    check-cast v3, Lm85;

    .line 37
    .line 38
    invoke-virtual {v3, v2}, Lm85;->W(Ljava/lang/annotation/Annotation;)Z

    .line 39
    .line 40
    .line 41
    move-result v3

    .line 42
    if-eqz v3, :cond_1

    .line 43
    .line 44
    invoke-virtual {p0, p1, v2}, Lbl;->c(Lch3;Ljava/lang/annotation/Annotation;)Lch3;

    .line 45
    .line 46
    .line 47
    move-result-object p1

    .line 48
    :cond_1
    :goto_1
    add-int/lit8 v1, v1, 0x1

    .line 49
    .line 50
    goto :goto_0

    .line 51
    :cond_2
    return-object p1
.end method

.method public f(Lgl;ZLdh8;)Ldh8;
    .locals 10

    .line 1
    iget-object v0, p0, Lbl;->X:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lm85;

    .line 4
    .line 5
    iget-object p0, p0, Lbl;->Z:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast p0, Ll37;

    .line 8
    .line 9
    invoke-virtual {v0, p0, p1, p3}, Lm85;->a0(Lvp4;Lvj8;Ldh8;)Ldh8;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    const/4 v1, 0x0

    .line 14
    const/4 v2, 0x1

    .line 15
    if-eq p0, p3, :cond_2

    .line 16
    .line 17
    iget-object p2, p0, Ldh8;->j0:Ljava/lang/Class;

    .line 18
    .line 19
    iget-object p3, p3, Ldh8;->j0:Ljava/lang/Class;

    .line 20
    .line 21
    invoke-virtual {p2, p3}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 22
    .line 23
    .line 24
    move-result v3

    .line 25
    if-eqz v3, :cond_0

    .line 26
    .line 27
    goto :goto_0

    .line 28
    :cond_0
    invoke-virtual {p3, p2}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 29
    .line 30
    .line 31
    move-result v3

    .line 32
    if-eqz v3, :cond_1

    .line 33
    .line 34
    :goto_0
    move-object p3, p0

    .line 35
    move p2, v2

    .line 36
    goto :goto_1

    .line 37
    :cond_1
    invoke-virtual {p1}, Lvj8;->L()Ljava/lang/String;

    .line 38
    .line 39
    .line 40
    move-result-object v5

    .line 41
    invoke-virtual {p2}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 42
    .line 43
    .line 44
    move-result-object v7

    .line 45
    const-string v8, " not a super-type of (declared) class "

    .line 46
    .line 47
    invoke-virtual {p3}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 48
    .line 49
    .line 50
    move-result-object v9

    .line 51
    const-string v4, "Illegal concrete-type annotation for method \'"

    .line 52
    .line 53
    const-string v6, "\': class "

    .line 54
    .line 55
    invoke-static/range {v4 .. v9}, Lu52;->p(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 56
    .line 57
    .line 58
    return-object v1

    .line 59
    :cond_2
    :goto_1
    invoke-virtual {v0, p1}, Lm85;->H(Lvj8;)Lwq3;

    .line 60
    .line 61
    .line 62
    move-result-object p0

    .line 63
    if-eqz p0, :cond_4

    .line 64
    .line 65
    sget-object p1, Lwq3;->Z:Lwq3;

    .line 66
    .line 67
    if-eq p0, p1, :cond_4

    .line 68
    .line 69
    sget-object p1, Lwq3;->Y:Lwq3;

    .line 70
    .line 71
    if-ne p0, p1, :cond_3

    .line 72
    .line 73
    goto :goto_2

    .line 74
    :cond_3
    const/4 v2, 0x0

    .line 75
    :goto_2
    move p2, v2

    .line 76
    :cond_4
    if-eqz p2, :cond_5

    .line 77
    .line 78
    invoke-virtual {p3}, Ldh8;->R0()Ldh8;

    .line 79
    .line 80
    .line 81
    move-result-object p0

    .line 82
    return-object p0

    .line 83
    :cond_5
    return-object v1
.end method

.method public h(Ljava/util/List;)Ltm;
    .locals 7

    .line 1
    iget-object v0, p0, Lbl;->g0:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Ljava/lang/Class;

    .line 4
    .line 5
    sget-object v1, Lch3;->a:Lmd0;

    .line 6
    .line 7
    iget-boolean v2, p0, Lbl;->Y:Z

    .line 8
    .line 9
    iget-object v3, p0, Lbl;->Z:Ljava/lang/Object;

    .line 10
    .line 11
    check-cast v3, Lrs0;

    .line 12
    .line 13
    iget-object v4, p0, Lbl;->X:Ljava/lang/Object;

    .line 14
    .line 15
    check-cast v4, Lm85;

    .line 16
    .line 17
    if-nez v4, :cond_0

    .line 18
    .line 19
    goto :goto_2

    .line 20
    :cond_0
    if-eqz v3, :cond_2

    .line 21
    .line 22
    instance-of v4, v3, Lu97;

    .line 23
    .line 24
    if-eqz v4, :cond_1

    .line 25
    .line 26
    move-object v4, v3

    .line 27
    check-cast v4, Lu97;

    .line 28
    .line 29
    goto :goto_0

    .line 30
    :cond_1
    const/4 v4, 0x1

    .line 31
    goto :goto_1

    .line 32
    :cond_2
    :goto_0
    const/4 v4, 0x0

    .line 33
    :goto_1
    if-nez v4, :cond_3

    .line 34
    .line 35
    if-nez v2, :cond_3

    .line 36
    .line 37
    :goto_2
    return-object v1

    .line 38
    :cond_3
    sget-object v1, Lxl;->i:Lxl;

    .line 39
    .line 40
    iget-object v5, p0, Lbl;->h0:Ljava/lang/Object;

    .line 41
    .line 42
    check-cast v5, Ljava/lang/Class;

    .line 43
    .line 44
    if-eqz v5, :cond_4

    .line 45
    .line 46
    invoke-virtual {p0, v1, v0, v5}, Lbl;->b(Lch3;Ljava/lang/Class;Ljava/lang/Class;)Lch3;

    .line 47
    .line 48
    .line 49
    move-result-object v1

    .line 50
    :cond_4
    if-eqz v2, :cond_5

    .line 51
    .line 52
    invoke-static {v0}, Lit0;->i(Ljava/lang/Class;)[Ljava/lang/annotation/Annotation;

    .line 53
    .line 54
    .line 55
    move-result-object v0

    .line 56
    invoke-virtual {p0, v1, v0}, Lbl;->a(Lch3;[Ljava/lang/annotation/Annotation;)Lch3;

    .line 57
    .line 58
    .line 59
    move-result-object v1

    .line 60
    :cond_5
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 61
    .line 62
    .line 63
    move-result-object p1

    .line 64
    :cond_6
    :goto_3
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 65
    .line 66
    .line 67
    move-result v0

    .line 68
    if-eqz v0, :cond_8

    .line 69
    .line 70
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 71
    .line 72
    .line 73
    move-result-object v0

    .line 74
    check-cast v0, Ldh8;

    .line 75
    .line 76
    if-eqz v4, :cond_7

    .line 77
    .line 78
    iget-object v5, v0, Ldh8;->j0:Ljava/lang/Class;

    .line 79
    .line 80
    invoke-interface {v3, v5}, Lrs0;->a(Ljava/lang/Class;)Ljava/lang/Class;

    .line 81
    .line 82
    .line 83
    move-result-object v6

    .line 84
    invoke-virtual {p0, v1, v5, v6}, Lbl;->b(Lch3;Ljava/lang/Class;Ljava/lang/Class;)Lch3;

    .line 85
    .line 86
    .line 87
    move-result-object v1

    .line 88
    :cond_7
    if-eqz v2, :cond_6

    .line 89
    .line 90
    iget-object v0, v0, Ldh8;->j0:Ljava/lang/Class;

    .line 91
    .line 92
    invoke-static {v0}, Lit0;->i(Ljava/lang/Class;)[Ljava/lang/annotation/Annotation;

    .line 93
    .line 94
    .line 95
    move-result-object v0

    .line 96
    invoke-virtual {p0, v1, v0}, Lbl;->a(Lch3;[Ljava/lang/annotation/Annotation;)Lch3;

    .line 97
    .line 98
    .line 99
    move-result-object v0

    .line 100
    move-object v1, v0

    .line 101
    goto :goto_3

    .line 102
    :cond_8
    if-eqz v4, :cond_9

    .line 103
    .line 104
    const-class p1, Ljava/lang/Object;

    .line 105
    .line 106
    invoke-interface {v3, p1}, Lrs0;->a(Ljava/lang/Class;)Ljava/lang/Class;

    .line 107
    .line 108
    .line 109
    move-result-object v0

    .line 110
    invoke-virtual {p0, v1, p1, v0}, Lbl;->b(Lch3;Ljava/lang/Class;Ljava/lang/Class;)Lch3;

    .line 111
    .line 112
    .line 113
    move-result-object v1

    .line 114
    :cond_9
    invoke-virtual {v1}, Lch3;->j()Ltm;

    .line 115
    .line 116
    .line 117
    move-result-object p0

    .line 118
    return-object p0
.end method

.method public j(Lx11;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lbl;->h0:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lrs2;

    .line 4
    .line 5
    iget-object v0, v0, Lrs2;->j:Ljava/util/concurrent/ConcurrentHashMap;

    .line 6
    .line 7
    iget-object p0, p0, Lbl;->Z:Ljava/lang/Object;

    .line 8
    .line 9
    check-cast p0, Lqn;

    .line 10
    .line 11
    invoke-virtual {v0, p0}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    check-cast p0, Li89;

    .line 16
    .line 17
    if-eqz p0, :cond_0

    .line 18
    .line 19
    invoke-virtual {p0, p1}, Li89;->m(Lx11;)V

    .line 20
    .line 21
    .line 22
    :cond_0
    return-void
.end method
