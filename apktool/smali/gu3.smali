.class public final Lgu3;
.super Lup2;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"

# interfaces
.implements Lou4;


# instance fields
.field public Y:I

.field public Z:Ljava/util/List;

.field public f0:Ljava/util/List;


# virtual methods
.method public final b()Ld2;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lgu3;->f()Lku3;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-virtual {p0}, Lku3;->d()Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    return-object p0

    .line 12
    :cond_0
    new-instance p0, Lxm8;

    .line 13
    .line 14
    invoke-direct {p0}, Lxm8;-><init>()V

    .line 15
    .line 16
    .line 17
    throw p0
.end method

.method public final c(Liv0;Lr62;)Lup2;
    .locals 2

    .line 1
    const/4 v0, 0x0

    .line 2
    :try_start_0
    sget-object v1, Lku3;->j0:Lau3;

    .line 3
    .line 4
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    new-instance v1, Lku3;

    .line 8
    .line 9
    invoke-direct {v1, p1, p2}, Lku3;-><init>(Liv0;Lr62;)V
    :try_end_0
    .catch Lrh3; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 10
    .line 11
    .line 12
    invoke-virtual {p0, v1}, Lgu3;->g(Lku3;)V

    .line 13
    .line 14
    .line 15
    return-object p0

    .line 16
    :catchall_0
    move-exception p1

    .line 17
    goto :goto_0

    .line 18
    :catch_0
    move-exception p1

    .line 19
    :try_start_1
    iget-object p2, p1, Lrh3;->X:Ld2;

    .line 20
    .line 21
    check-cast p2, Lku3;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 22
    .line 23
    :try_start_2
    throw p1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 24
    :catchall_1
    move-exception p1

    .line 25
    move-object v0, p2

    .line 26
    :goto_0
    if-eqz v0, :cond_0

    .line 27
    .line 28
    invoke-virtual {p0, v0}, Lgu3;->g(Lku3;)V

    .line 29
    .line 30
    .line 31
    :cond_0
    throw p1
.end method

.method public final clone()Ljava/lang/Object;
    .locals 2

    .line 1
    new-instance v0, Lgu3;

    .line 2
    .line 3
    invoke-direct {v0}, Lup2;-><init>()V

    .line 4
    .line 5
    .line 6
    sget-object v1, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    .line 7
    .line 8
    iput-object v1, v0, Lgu3;->Z:Ljava/util/List;

    .line 9
    .line 10
    iput-object v1, v0, Lgu3;->f0:Ljava/util/List;

    .line 11
    .line 12
    invoke-virtual {p0}, Lgu3;->f()Lku3;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    invoke-virtual {v0, p0}, Lgu3;->g(Lku3;)V

    .line 17
    .line 18
    .line 19
    return-object v0
.end method

.method public final bridge synthetic e(Lbq2;)Lup2;
    .locals 0

    .line 1
    check-cast p1, Lku3;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Lgu3;->g(Lku3;)V

    .line 4
    .line 5
    .line 6
    return-object p0
.end method

.method public final f()Lku3;
    .locals 4

    .line 1
    new-instance v0, Lku3;

    .line 2
    .line 3
    invoke-direct {v0, p0}, Lku3;-><init>(Lgu3;)V

    .line 4
    .line 5
    .line 6
    iget v1, p0, Lgu3;->Y:I

    .line 7
    .line 8
    and-int/lit8 v2, v1, 0x1

    .line 9
    .line 10
    const/4 v3, 0x1

    .line 11
    if-ne v2, v3, :cond_0

    .line 12
    .line 13
    iget-object v1, p0, Lgu3;->Z:Ljava/util/List;

    .line 14
    .line 15
    invoke-static {v1}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    .line 16
    .line 17
    .line 18
    move-result-object v1

    .line 19
    iput-object v1, p0, Lgu3;->Z:Ljava/util/List;

    .line 20
    .line 21
    iget v1, p0, Lgu3;->Y:I

    .line 22
    .line 23
    and-int/lit8 v1, v1, -0x2

    .line 24
    .line 25
    iput v1, p0, Lgu3;->Y:I

    .line 26
    .line 27
    :cond_0
    iget-object v2, p0, Lgu3;->Z:Ljava/util/List;

    .line 28
    .line 29
    iput-object v2, v0, Lku3;->Y:Ljava/util/List;

    .line 30
    .line 31
    const/4 v2, 0x2

    .line 32
    and-int/2addr v1, v2

    .line 33
    if-ne v1, v2, :cond_1

    .line 34
    .line 35
    iget-object v1, p0, Lgu3;->f0:Ljava/util/List;

    .line 36
    .line 37
    invoke-static {v1}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    .line 38
    .line 39
    .line 40
    move-result-object v1

    .line 41
    iput-object v1, p0, Lgu3;->f0:Ljava/util/List;

    .line 42
    .line 43
    iget v1, p0, Lgu3;->Y:I

    .line 44
    .line 45
    and-int/lit8 v1, v1, -0x3

    .line 46
    .line 47
    iput v1, p0, Lgu3;->Y:I

    .line 48
    .line 49
    :cond_1
    iget-object p0, p0, Lgu3;->f0:Ljava/util/List;

    .line 50
    .line 51
    iput-object p0, v0, Lku3;->Z:Ljava/util/List;

    .line 52
    .line 53
    return-object v0
.end method

.method public final g(Lku3;)V
    .locals 3

    .line 1
    sget-object v0, Lku3;->i0:Lku3;

    .line 2
    .line 3
    if-ne p1, v0, :cond_0

    .line 4
    .line 5
    return-void

    .line 6
    :cond_0
    iget-object v0, p1, Lku3;->Y:Ljava/util/List;

    .line 7
    .line 8
    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    if-nez v0, :cond_3

    .line 13
    .line 14
    iget-object v0, p0, Lgu3;->Z:Ljava/util/List;

    .line 15
    .line 16
    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    .line 17
    .line 18
    .line 19
    move-result v0

    .line 20
    if-eqz v0, :cond_1

    .line 21
    .line 22
    iget-object v0, p1, Lku3;->Y:Ljava/util/List;

    .line 23
    .line 24
    iput-object v0, p0, Lgu3;->Z:Ljava/util/List;

    .line 25
    .line 26
    iget v0, p0, Lgu3;->Y:I

    .line 27
    .line 28
    and-int/lit8 v0, v0, -0x2

    .line 29
    .line 30
    iput v0, p0, Lgu3;->Y:I

    .line 31
    .line 32
    goto :goto_0

    .line 33
    :cond_1
    iget v0, p0, Lgu3;->Y:I

    .line 34
    .line 35
    const/4 v1, 0x1

    .line 36
    and-int/2addr v0, v1

    .line 37
    if-eq v0, v1, :cond_2

    .line 38
    .line 39
    new-instance v0, Ljava/util/ArrayList;

    .line 40
    .line 41
    iget-object v2, p0, Lgu3;->Z:Ljava/util/List;

    .line 42
    .line 43
    invoke-direct {v0, v2}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 44
    .line 45
    .line 46
    iput-object v0, p0, Lgu3;->Z:Ljava/util/List;

    .line 47
    .line 48
    iget v0, p0, Lgu3;->Y:I

    .line 49
    .line 50
    or-int/2addr v0, v1

    .line 51
    iput v0, p0, Lgu3;->Y:I

    .line 52
    .line 53
    :cond_2
    iget-object v0, p0, Lgu3;->Z:Ljava/util/List;

    .line 54
    .line 55
    iget-object v1, p1, Lku3;->Y:Ljava/util/List;

    .line 56
    .line 57
    invoke-interface {v0, v1}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    .line 58
    .line 59
    .line 60
    :cond_3
    :goto_0
    iget-object v0, p1, Lku3;->Z:Ljava/util/List;

    .line 61
    .line 62
    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    .line 63
    .line 64
    .line 65
    move-result v0

    .line 66
    if-nez v0, :cond_6

    .line 67
    .line 68
    iget-object v0, p0, Lgu3;->f0:Ljava/util/List;

    .line 69
    .line 70
    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    .line 71
    .line 72
    .line 73
    move-result v0

    .line 74
    if-eqz v0, :cond_4

    .line 75
    .line 76
    iget-object v0, p1, Lku3;->Z:Ljava/util/List;

    .line 77
    .line 78
    iput-object v0, p0, Lgu3;->f0:Ljava/util/List;

    .line 79
    .line 80
    iget v0, p0, Lgu3;->Y:I

    .line 81
    .line 82
    and-int/lit8 v0, v0, -0x3

    .line 83
    .line 84
    iput v0, p0, Lgu3;->Y:I

    .line 85
    .line 86
    goto :goto_1

    .line 87
    :cond_4
    iget v0, p0, Lgu3;->Y:I

    .line 88
    .line 89
    const/4 v1, 0x2

    .line 90
    and-int/2addr v0, v1

    .line 91
    if-eq v0, v1, :cond_5

    .line 92
    .line 93
    new-instance v0, Ljava/util/ArrayList;

    .line 94
    .line 95
    iget-object v2, p0, Lgu3;->f0:Ljava/util/List;

    .line 96
    .line 97
    invoke-direct {v0, v2}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 98
    .line 99
    .line 100
    iput-object v0, p0, Lgu3;->f0:Ljava/util/List;

    .line 101
    .line 102
    iget v0, p0, Lgu3;->Y:I

    .line 103
    .line 104
    or-int/2addr v0, v1

    .line 105
    iput v0, p0, Lgu3;->Y:I

    .line 106
    .line 107
    :cond_5
    iget-object v0, p0, Lgu3;->f0:Ljava/util/List;

    .line 108
    .line 109
    iget-object v1, p1, Lku3;->Z:Ljava/util/List;

    .line 110
    .line 111
    invoke-interface {v0, v1}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    .line 112
    .line 113
    .line 114
    :cond_6
    :goto_1
    iget-object v0, p0, Lup2;->X:Ljb0;

    .line 115
    .line 116
    iget-object p1, p1, Lku3;->X:Ljb0;

    .line 117
    .line 118
    invoke-virtual {v0, p1}, Ljb0;->b(Ljb0;)Ljb0;

    .line 119
    .line 120
    .line 121
    move-result-object p1

    .line 122
    iput-object p1, p0, Lup2;->X:Ljb0;

    .line 123
    .line 124
    return-void
.end method
