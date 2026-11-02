.class public final Lla;
.super Ljava/lang/Object;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"


# instance fields
.field public final a:Ly2;

.field public final b:Lm15;

.field public final c:Lrh5;

.field public final d:Lrh5;

.field public final e:Lzi1;

.field public final f:Lnh5;

.field public final g:Lnh5;

.field public final h:Lrh5;

.field public final i:Lrh5;

.field public final j:Lia;


# direct methods
.method public constructor <init>(Ljava/lang/Object;)V
    .locals 3

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Ly2;

    .line 5
    .line 6
    const/4 v1, 0x6

    .line 7
    invoke-direct {v0, v1}, Ly2;-><init>(B)V

    .line 8
    .line 9
    .line 10
    iput-object v0, p0, Lla;->a:Ly2;

    .line 11
    .line 12
    new-instance v0, Lm15;

    .line 13
    .line 14
    invoke-direct {v0}, Lm15;-><init>()V

    .line 15
    .line 16
    .line 17
    iput-object v0, p0, Lla;->b:Lm15;

    .line 18
    .line 19
    invoke-static {p1}, Lz51;->H(Ljava/lang/Object;)Lrh5;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    iput-object v0, p0, Lla;->c:Lrh5;

    .line 24
    .line 25
    invoke-static {p1}, Lz51;->H(Ljava/lang/Object;)Lrh5;

    .line 26
    .line 27
    .line 28
    move-result-object p1

    .line 29
    iput-object p1, p0, Lla;->d:Lrh5;

    .line 30
    .line 31
    new-instance p1, Lba;

    .line 32
    .line 33
    const/4 v0, 0x0

    .line 34
    invoke-direct {p1, p0, v0}, Lba;-><init>(Lla;B)V

    .line 35
    .line 36
    .line 37
    invoke-static {p1}, Lrd7;->b(Ldn2;)Lzi1;

    .line 38
    .line 39
    .line 40
    move-result-object p1

    .line 41
    iput-object p1, p0, Lla;->e:Lzi1;

    .line 42
    .line 43
    new-instance p1, Lnh5;

    .line 44
    .line 45
    const/high16 v1, 0x7fc00000    # Float.NaN

    .line 46
    .line 47
    invoke-direct {p1, v1}, Lnh5;-><init>(F)V

    .line 48
    .line 49
    .line 50
    iput-object p1, p0, Lla;->f:Lnh5;

    .line 51
    .line 52
    new-instance p1, Lrv;

    .line 53
    .line 54
    invoke-direct {p1, v0}, Ljava/util/concurrent/atomic/AtomicInteger;-><init>(I)V

    .line 55
    .line 56
    .line 57
    new-instance p1, Lyi1;

    .line 58
    .line 59
    invoke-static {}, Lkd7;->h()Ldd7;

    .line 60
    .line 61
    .line 62
    move-result-object v1

    .line 63
    invoke-virtual {v1}, Ldd7;->g()J

    .line 64
    .line 65
    .line 66
    move-result-wide v1

    .line 67
    invoke-direct {p1, v1, v2}, Lyi1;-><init>(J)V

    .line 68
    .line 69
    .line 70
    new-instance p1, Lnh5;

    .line 71
    .line 72
    const/4 v1, 0x0

    .line 73
    invoke-direct {p1, v1}, Lnh5;-><init>(F)V

    .line 74
    .line 75
    .line 76
    iput-object p1, p0, Lla;->g:Lnh5;

    .line 77
    .line 78
    const/4 p1, 0x0

    .line 79
    invoke-static {p1}, Lz51;->H(Ljava/lang/Object;)Lrh5;

    .line 80
    .line 81
    .line 82
    move-result-object p1

    .line 83
    iput-object p1, p0, Lla;->h:Lrh5;

    .line 84
    .line 85
    new-instance p1, Lke1;

    .line 86
    .line 87
    sget-object v1, Ld02;->X:Ld02;

    .line 88
    .line 89
    new-array v0, v0, [F

    .line 90
    .line 91
    invoke-direct {p1, v1, v0}, Lke1;-><init>(Ljava/util/List;[F)V

    .line 92
    .line 93
    .line 94
    invoke-static {p1}, Lz51;->H(Ljava/lang/Object;)Lrh5;

    .line 95
    .line 96
    .line 97
    move-result-object p1

    .line 98
    iput-object p1, p0, Lla;->i:Lrh5;

    .line 99
    .line 100
    new-instance p1, Lia;

    .line 101
    .line 102
    invoke-direct {p1, p0}, Lia;-><init>(Lla;)V

    .line 103
    .line 104
    .line 105
    iput-object p1, p0, Lla;->j:Lia;

    .line 106
    .line 107
    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Object;Lf15;Ltn2;Lq51;)Ljava/lang/Object;
    .locals 10

    .line 1
    instance-of v0, p4, Lfa;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p4

    .line 6
    check-cast v0, Lfa;

    .line 7
    .line 8
    iget v1, v0, Lfa;->h0:I

    .line 9
    .line 10
    const/high16 v2, -0x80000000

    .line 11
    .line 12
    and-int v3, v1, v2

    .line 13
    .line 14
    if-eqz v3, :cond_0

    .line 15
    .line 16
    sub-int/2addr v1, v2

    .line 17
    iput v1, v0, Lfa;->h0:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, Lfa;

    .line 21
    .line 22
    invoke-direct {v0, p0, p4}, Lfa;-><init>(Lla;Lq51;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p4, v0, Lfa;->f0:Ljava/lang/Object;

    .line 26
    .line 27
    iget v1, v0, Lfa;->h0:I

    .line 28
    .line 29
    iget-object v2, p0, Lla;->h:Lrh5;

    .line 30
    .line 31
    const/4 v3, 0x1

    .line 32
    const/4 v8, 0x0

    .line 33
    if-eqz v1, :cond_2

    .line 34
    .line 35
    if-ne v1, v3, :cond_1

    .line 36
    .line 37
    :try_start_0
    invoke-static {p4}, Lw39;->n0(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 38
    .line 39
    .line 40
    goto :goto_1

    .line 41
    :catchall_0
    move-exception v0

    .line 42
    move-object p0, v0

    .line 43
    goto :goto_2

    .line 44
    :cond_1
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 45
    .line 46
    invoke-static {p0}, Lbt;->i(Ljava/lang/String;)V

    .line 47
    .line 48
    .line 49
    const/4 p0, 0x0

    .line 50
    return-object p0

    .line 51
    :cond_2
    invoke-static {p4}, Lw39;->n0(Ljava/lang/Object;)V

    .line 52
    .line 53
    .line 54
    invoke-virtual {p0}, Lla;->b()Lke1;

    .line 55
    .line 56
    .line 57
    move-result-object p4

    .line 58
    iget-object p4, p4, Lke1;->a:Ljava/util/List;

    .line 59
    .line 60
    invoke-interface {p4, p1}, Ljava/util/List;->indexOf(Ljava/lang/Object;)I

    .line 61
    .line 62
    .line 63
    move-result p4

    .line 64
    const/4 v1, -0x1

    .line 65
    if-eq p4, v1, :cond_4

    .line 66
    .line 67
    :try_start_1
    iget-object p4, p0, Lla;->b:Lm15;

    .line 68
    .line 69
    new-instance v4, Lga;

    .line 70
    .line 71
    const/4 v9, 0x1

    .line 72
    move-object v5, p0

    .line 73
    move-object v6, p1

    .line 74
    move-object v7, p3

    .line 75
    invoke-direct/range {v4 .. v9}, Lga;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Lq51;B)V

    .line 76
    .line 77
    .line 78
    iput v3, v0, Lfa;->h0:I

    .line 79
    .line 80
    invoke-virtual {p4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 81
    .line 82
    .line 83
    move-object v7, v4

    .line 84
    new-instance v4, Lkg3;

    .line 85
    .line 86
    const/4 v9, 0x1

    .line 87
    move-object v5, p2

    .line 88
    move-object v6, p4

    .line 89
    invoke-direct/range {v4 .. v9}, Lkg3;-><init>(Lf15;Ljava/lang/Object;Lgn2;Lq51;B)V

    .line 90
    .line 91
    .line 92
    invoke-static {v4, v0}, Lgv3;->n(Lrn2;Lq51;)Ljava/lang/Object;

    .line 93
    .line 94
    .line 95
    move-result-object p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 96
    sget-object p1, Lc71;->X:Lc71;

    .line 97
    .line 98
    if-ne p0, p1, :cond_3

    .line 99
    .line 100
    return-object p1

    .line 101
    :cond_3
    :goto_1
    invoke-virtual {v2, v8}, Lrh5;->setValue(Ljava/lang/Object;)V

    .line 102
    .line 103
    .line 104
    goto :goto_3

    .line 105
    :goto_2
    invoke-virtual {v2, v8}, Lrh5;->setValue(Ljava/lang/Object;)V

    .line 106
    .line 107
    .line 108
    throw p0

    .line 109
    :cond_4
    move-object v5, p0

    .line 110
    move-object v6, p1

    .line 111
    iget-object p0, v5, Lla;->d:Lrh5;

    .line 112
    .line 113
    invoke-virtual {p0, v6}, Lrh5;->setValue(Ljava/lang/Object;)V

    .line 114
    .line 115
    .line 116
    iget-object p0, v5, Lla;->c:Lrh5;

    .line 117
    .line 118
    invoke-virtual {p0, v6}, Lrh5;->setValue(Ljava/lang/Object;)V

    .line 119
    .line 120
    .line 121
    :goto_3
    sget-object p0, Ldn8;->a:Ldn8;

    .line 122
    .line 123
    return-object p0
.end method

.method public final b()Lke1;
    .locals 0

    .line 1
    iget-object p0, p0, Lla;->i:Lrh5;

    .line 2
    .line 3
    invoke-virtual {p0}, Lrh5;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Lke1;

    .line 8
    .line 9
    return-object p0
.end method

.method public final c(F)F
    .locals 8

    .line 1
    iget-object v0, p0, Lla;->f:Lnh5;

    .line 2
    .line 3
    invoke-virtual {v0}, Lnh5;->l()F

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    invoke-static {v1}, Ljava/lang/Float;->isNaN(F)Z

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    if-eqz v1, :cond_0

    .line 12
    .line 13
    const/4 v0, 0x0

    .line 14
    goto :goto_0

    .line 15
    :cond_0
    invoke-virtual {v0}, Lnh5;->l()F

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    :goto_0
    add-float/2addr v0, p1

    .line 20
    invoke-virtual {p0}, Lla;->b()Lke1;

    .line 21
    .line 22
    .line 23
    move-result-object p1

    .line 24
    iget-object p1, p1, Lke1;->b:[F

    .line 25
    .line 26
    array-length v1, p1

    .line 27
    const/4 v2, 0x0

    .line 28
    const/high16 v3, 0x7fc00000    # Float.NaN

    .line 29
    .line 30
    const/4 v4, 0x1

    .line 31
    if-nez v1, :cond_1

    .line 32
    .line 33
    move v1, v3

    .line 34
    goto :goto_2

    .line 35
    :cond_1
    aget v1, p1, v2

    .line 36
    .line 37
    array-length v5, p1

    .line 38
    sub-int/2addr v5, v4

    .line 39
    if-gt v4, v5, :cond_2

    .line 40
    .line 41
    move v6, v4

    .line 42
    :goto_1
    aget v7, p1, v6

    .line 43
    .line 44
    invoke-static {v1, v7}, Ljava/lang/Math;->min(FF)F

    .line 45
    .line 46
    .line 47
    move-result v1

    .line 48
    if-eq v6, v5, :cond_2

    .line 49
    .line 50
    add-int/lit8 v6, v6, 0x1

    .line 51
    .line 52
    goto :goto_1

    .line 53
    :cond_2
    :goto_2
    invoke-virtual {p0}, Lla;->b()Lke1;

    .line 54
    .line 55
    .line 56
    move-result-object p0

    .line 57
    iget-object p0, p0, Lke1;->b:[F

    .line 58
    .line 59
    array-length p1, p0

    .line 60
    if-nez p1, :cond_3

    .line 61
    .line 62
    goto :goto_4

    .line 63
    :cond_3
    aget v3, p0, v2

    .line 64
    .line 65
    array-length p1, p0

    .line 66
    sub-int/2addr p1, v4

    .line 67
    if-gt v4, p1, :cond_4

    .line 68
    .line 69
    :goto_3
    aget v2, p0, v4

    .line 70
    .line 71
    invoke-static {v3, v2}, Ljava/lang/Math;->max(FF)F

    .line 72
    .line 73
    .line 74
    move-result v3

    .line 75
    if-eq v4, p1, :cond_4

    .line 76
    .line 77
    add-int/lit8 v4, v4, 0x1

    .line 78
    .line 79
    goto :goto_3

    .line 80
    :cond_4
    :goto_4
    invoke-static {v0, v1, v3}, Lx97;->m(FFF)F

    .line 81
    .line 82
    .line 83
    move-result p0

    .line 84
    return p0
.end method
