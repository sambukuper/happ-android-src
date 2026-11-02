.class public final Lib1;
.super Ljava/lang/Object;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"

# interfaces
.implements Lna1;


# instance fields
.field public final X:Lm92;

.field public final Y:Lk71;

.field public final Z:Lb71;

.field public final f0:Lj31;

.field public final g0:Lq15;

.field public h0:I

.field public i0:Log7;

.field public final j0:Ljb1;

.field public final k0:Lz47;

.field public final l0:Lvz7;

.field public final m0:Lvz7;

.field public final n0:Lyr6;


# direct methods
.method public constructor <init>(Lm92;Ljava/util/List;Lk71;Lb71;)V
    .locals 3

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lib1;->X:Lm92;

    .line 5
    .line 6
    iput-object p3, p0, Lib1;->Y:Lk71;

    .line 7
    .line 8
    iput-object p4, p0, Lib1;->Z:Lb71;

    .line 9
    .line 10
    new-instance p1, Lbv;

    .line 11
    .line 12
    const/4 p3, 0x3

    .line 13
    const/4 v0, 0x0

    .line 14
    invoke-direct {p1, p0, v0, p3}, Lbv;-><init>(Ljava/lang/Object;Lq51;B)V

    .line 15
    .line 16
    .line 17
    new-instance p3, Lj31;

    .line 18
    .line 19
    const/4 v1, 0x7

    .line 20
    invoke-direct {p3, p1, v1}, Lj31;-><init>(Ljava/lang/Object;B)V

    .line 21
    .line 22
    .line 23
    iput-object p3, p0, Lib1;->f0:Lj31;

    .line 24
    .line 25
    invoke-static {}, Lr15;->a()Lq15;

    .line 26
    .line 27
    .line 28
    move-result-object p1

    .line 29
    iput-object p1, p0, Lib1;->g0:Lq15;

    .line 30
    .line 31
    new-instance p1, Ljb1;

    .line 32
    .line 33
    invoke-direct {p1}, Ljb1;-><init>()V

    .line 34
    .line 35
    .line 36
    iput-object p1, p0, Lib1;->j0:Ljb1;

    .line 37
    .line 38
    new-instance p1, Lz47;

    .line 39
    .line 40
    invoke-direct {p1, p0, p2}, Lz47;-><init>(Lib1;Ljava/util/List;)V

    .line 41
    .line 42
    .line 43
    iput-object p1, p0, Lib1;->k0:Lz47;

    .line 44
    .line 45
    new-instance p1, Loa1;

    .line 46
    .line 47
    const/4 p2, 0x0

    .line 48
    invoke-direct {p1, p0, p2}, Loa1;-><init>(Lib1;B)V

    .line 49
    .line 50
    .line 51
    new-instance p2, Lvz7;

    .line 52
    .line 53
    invoke-direct {p2, p1}, Lvz7;-><init>(Ldn2;)V

    .line 54
    .line 55
    .line 56
    iput-object p2, p0, Lib1;->l0:Lvz7;

    .line 57
    .line 58
    new-instance p1, Loa1;

    .line 59
    .line 60
    const/4 p2, 0x1

    .line 61
    invoke-direct {p1, p0, p2}, Loa1;-><init>(Lib1;B)V

    .line 62
    .line 63
    .line 64
    new-instance p2, Lvz7;

    .line 65
    .line 66
    invoke-direct {p2, p1}, Lvz7;-><init>(Ldn2;)V

    .line 67
    .line 68
    .line 69
    iput-object p2, p0, Lib1;->m0:Lvz7;

    .line 70
    .line 71
    new-instance p1, Lyr6;

    .line 72
    .line 73
    new-instance p2, Ly0;

    .line 74
    .line 75
    const/16 p3, 0x14

    .line 76
    .line 77
    invoke-direct {p2, p0, p3}, Ly0;-><init>(Ljava/lang/Object;B)V

    .line 78
    .line 79
    .line 80
    new-instance p3, Ldx0;

    .line 81
    .line 82
    const/16 v1, 0x1a

    .line 83
    .line 84
    invoke-direct {p3, v1}, Ldx0;-><init>(B)V

    .line 85
    .line 86
    .line 87
    new-instance v1, Lq0;

    .line 88
    .line 89
    const/16 v2, 0x13

    .line 90
    .line 91
    invoke-direct {v1, p0, v0, v2}, Lq0;-><init>(Ljava/lang/Object;Lq51;B)V

    .line 92
    .line 93
    .line 94
    invoke-direct {p1, p4, p2, p3, v1}, Lyr6;-><init>(Lb71;Ly0;Ldx0;Lq0;)V

    .line 95
    .line 96
    .line 97
    iput-object p1, p0, Lib1;->n0:Lyr6;

    .line 98
    .line 99
    return-void
.end method


# virtual methods
.method public final a(Ls51;)Ljava/lang/Object;
    .locals 4

    .line 1
    instance-of v0, p1, Lwa1;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p1

    .line 6
    check-cast v0, Lwa1;

    .line 7
    .line 8
    iget v1, v0, Lwa1;->i0:I

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
    iput v1, v0, Lwa1;->i0:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, Lwa1;

    .line 21
    .line 22
    invoke-direct {v0, p0, p1}, Lwa1;-><init>(Lib1;Ls51;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p1, v0, Lwa1;->g0:Ljava/lang/Object;

    .line 26
    .line 27
    iget v1, v0, Lwa1;->i0:I

    .line 28
    .line 29
    const/4 v2, 0x1

    .line 30
    const/4 v3, 0x0

    .line 31
    if-eqz v1, :cond_2

    .line 32
    .line 33
    if-ne v1, v2, :cond_1

    .line 34
    .line 35
    iget-object v0, v0, Lwa1;->f0:Lq15;

    .line 36
    .line 37
    invoke-static {p1}, Lw39;->n0(Ljava/lang/Object;)V

    .line 38
    .line 39
    .line 40
    goto :goto_1

    .line 41
    :cond_1
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 42
    .line 43
    invoke-static {p0}, Lbt;->i(Ljava/lang/String;)V

    .line 44
    .line 45
    .line 46
    return-object v3

    .line 47
    :cond_2
    invoke-static {p1}, Lw39;->n0(Ljava/lang/Object;)V

    .line 48
    .line 49
    .line 50
    iget-object p1, p0, Lib1;->g0:Lq15;

    .line 51
    .line 52
    iput-object p1, v0, Lwa1;->f0:Lq15;

    .line 53
    .line 54
    iput v2, v0, Lwa1;->i0:I

    .line 55
    .line 56
    invoke-virtual {p1, v0}, Lq15;->g(Lq51;)Ljava/lang/Object;

    .line 57
    .line 58
    .line 59
    move-result-object v0

    .line 60
    sget-object v1, Lc71;->X:Lc71;

    .line 61
    .line 62
    if-ne v0, v1, :cond_3

    .line 63
    .line 64
    return-object v1

    .line 65
    :cond_3
    move-object v0, p1

    .line 66
    :goto_1
    :try_start_0
    iget p1, p0, Lib1;->h0:I

    .line 67
    .line 68
    add-int/lit8 p1, p1, -0x1

    .line 69
    .line 70
    iput p1, p0, Lib1;->h0:I

    .line 71
    .line 72
    if-nez p1, :cond_5

    .line 73
    .line 74
    iget-object p1, p0, Lib1;->i0:Log7;

    .line 75
    .line 76
    if-eqz p1, :cond_4

    .line 77
    .line 78
    invoke-virtual {p1, v3}, Lrm3;->m(Ljava/util/concurrent/CancellationException;)V

    .line 79
    .line 80
    .line 81
    goto :goto_2

    .line 82
    :catchall_0
    move-exception p0

    .line 83
    goto :goto_3

    .line 84
    :cond_4
    :goto_2
    iput-object v3, p0, Lib1;->i0:Log7;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 85
    .line 86
    :cond_5
    invoke-interface {v0, v3}, Lo15;->m(Ljava/lang/Object;)V

    .line 87
    .line 88
    .line 89
    sget-object p0, Ldn8;->a:Ldn8;

    .line 90
    .line 91
    return-object p0

    .line 92
    :goto_3
    invoke-interface {v0, v3}, Lo15;->m(Ljava/lang/Object;)V

    .line 93
    .line 94
    .line 95
    throw p0
.end method

.method public final b()Lja7;
    .locals 0

    .line 1
    iget-object p0, p0, Lib1;->m0:Lvz7;

    .line 2
    .line 3
    invoke-virtual {p0}, Lvz7;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Lja7;

    .line 8
    .line 9
    return-object p0
.end method

.method public final c(Lmu4;Ls51;)Ljava/lang/Object;
    .locals 7

    .line 1
    instance-of v0, p2, Lxa1;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p2

    .line 6
    check-cast v0, Lxa1;

    .line 7
    .line 8
    iget v1, v0, Lxa1;->i0:I

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
    iput v1, v0, Lxa1;->i0:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, Lxa1;

    .line 21
    .line 22
    invoke-direct {v0, p0, p2}, Lxa1;-><init>(Lib1;Ls51;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p2, v0, Lxa1;->g0:Ljava/lang/Object;

    .line 26
    .line 27
    iget v1, v0, Lxa1;->i0:I

    .line 28
    .line 29
    const/4 v2, 0x0

    .line 30
    const/4 v3, 0x1

    .line 31
    if-eqz v1, :cond_2

    .line 32
    .line 33
    if-ne v1, v3, :cond_1

    .line 34
    .line 35
    iget-object p0, v0, Lxa1;->f0:Lux0;

    .line 36
    .line 37
    :try_start_0
    invoke-static {p2}, Lw39;->n0(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 38
    .line 39
    .line 40
    goto :goto_3

    .line 41
    :catchall_0
    move-exception p1

    .line 42
    goto :goto_2

    .line 43
    :cond_1
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 44
    .line 45
    invoke-static {p0}, Lbt;->i(Ljava/lang/String;)V

    .line 46
    .line 47
    .line 48
    return-object v2

    .line 49
    :cond_2
    invoke-static {p2}, Lw39;->n0(Ljava/lang/Object;)V

    .line 50
    .line 51
    .line 52
    iget-object p2, p1, Lmu4;->b:Lux0;

    .line 53
    .line 54
    :try_start_1
    iget-object v1, p1, Lmu4;->d:Ls61;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 55
    .line 56
    :try_start_2
    iget-object v4, v0, Ls51;->Y:Ls61;

    .line 57
    .line 58
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 59
    .line 60
    .line 61
    :try_start_3
    invoke-interface {v1, v4}, Ls61;->B0(Ls61;)Ls61;

    .line 62
    .line 63
    .line 64
    move-result-object v1

    .line 65
    new-instance v4, Ly9;

    .line 66
    .line 67
    const/4 v5, 0x3

    .line 68
    invoke-direct {v4, p0, p1, v2, v5}, Ly9;-><init>(Ljava/lang/Object;Ljava/lang/Object;Lq51;B)V

    .line 69
    .line 70
    .line 71
    iput-object p2, v0, Lxa1;->f0:Lux0;

    .line 72
    .line 73
    iput v3, v0, Lxa1;->i0:I

    .line 74
    .line 75
    invoke-static {v1, v4, v0}, Lw51;->W(Ls61;Lrn2;Lq51;)Ljava/lang/Object;

    .line 76
    .line 77
    .line 78
    move-result-object p0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 79
    sget-object p1, Lc71;->X:Lc71;

    .line 80
    .line 81
    if-ne p0, p1, :cond_3

    .line 82
    .line 83
    return-object p1

    .line 84
    :cond_3
    move-object v6, p2

    .line 85
    move-object p2, p0

    .line 86
    move-object p0, v6

    .line 87
    goto :goto_3

    .line 88
    :catchall_1
    move-exception p1

    .line 89
    :goto_1
    move-object p0, p2

    .line 90
    goto :goto_2

    .line 91
    :catchall_2
    move-exception p0

    .line 92
    move-object p1, p0

    .line 93
    goto :goto_1

    .line 94
    :goto_2
    new-instance p2, Lrj6;

    .line 95
    .line 96
    invoke-direct {p2, p1}, Lrj6;-><init>(Ljava/lang/Throwable;)V

    .line 97
    .line 98
    .line 99
    :goto_3
    invoke-static {p2}, Lsj6;->a(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 100
    .line 101
    .line 102
    move-result-object p1

    .line 103
    if-nez p1, :cond_4

    .line 104
    .line 105
    invoke-virtual {p0, p2}, Lrm3;->V(Ljava/lang/Object;)Z

    .line 106
    .line 107
    .line 108
    goto :goto_4

    .line 109
    :cond_4
    invoke-virtual {p0, p1}, Lux0;->l0(Ljava/lang/Throwable;)Z

    .line 110
    .line 111
    .line 112
    :goto_4
    sget-object p0, Ldn8;->a:Ldn8;

    .line 113
    .line 114
    return-object p0
.end method

.method public final d(Ls51;)Ljava/lang/Object;
    .locals 4

    .line 1
    instance-of v0, p1, Lya1;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p1

    .line 6
    check-cast v0, Lya1;

    .line 7
    .line 8
    iget v1, v0, Lya1;->i0:I

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
    iput v1, v0, Lya1;->i0:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, Lya1;

    .line 21
    .line 22
    invoke-direct {v0, p0, p1}, Lya1;-><init>(Lib1;Ls51;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p1, v0, Lya1;->g0:Ljava/lang/Object;

    .line 26
    .line 27
    iget v1, v0, Lya1;->i0:I

    .line 28
    .line 29
    const/4 v2, 0x1

    .line 30
    const/4 v3, 0x0

    .line 31
    if-eqz v1, :cond_2

    .line 32
    .line 33
    if-ne v1, v2, :cond_1

    .line 34
    .line 35
    iget-object v0, v0, Lya1;->f0:Lq15;

    .line 36
    .line 37
    invoke-static {p1}, Lw39;->n0(Ljava/lang/Object;)V

    .line 38
    .line 39
    .line 40
    goto :goto_1

    .line 41
    :cond_1
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 42
    .line 43
    invoke-static {p0}, Lbt;->i(Ljava/lang/String;)V

    .line 44
    .line 45
    .line 46
    return-object v3

    .line 47
    :cond_2
    invoke-static {p1}, Lw39;->n0(Ljava/lang/Object;)V

    .line 48
    .line 49
    .line 50
    iget-object p1, p0, Lib1;->g0:Lq15;

    .line 51
    .line 52
    iput-object p1, v0, Lya1;->f0:Lq15;

    .line 53
    .line 54
    iput v2, v0, Lya1;->i0:I

    .line 55
    .line 56
    invoke-virtual {p1, v0}, Lq15;->g(Lq51;)Ljava/lang/Object;

    .line 57
    .line 58
    .line 59
    move-result-object v0

    .line 60
    sget-object v1, Lc71;->X:Lc71;

    .line 61
    .line 62
    if-ne v0, v1, :cond_3

    .line 63
    .line 64
    return-object v1

    .line 65
    :cond_3
    move-object v0, p1

    .line 66
    :goto_1
    :try_start_0
    iget p1, p0, Lib1;->h0:I

    .line 67
    .line 68
    add-int/2addr p1, v2

    .line 69
    iput p1, p0, Lib1;->h0:I

    .line 70
    .line 71
    if-ne p1, v2, :cond_4

    .line 72
    .line 73
    iget-object p1, p0, Lib1;->Z:Lb71;

    .line 74
    .line 75
    new-instance v1, Lza1;

    .line 76
    .line 77
    const/4 v2, 0x0

    .line 78
    invoke-direct {v1, p0, v3, v2}, Lza1;-><init>(Lib1;Lq51;B)V

    .line 79
    .line 80
    .line 81
    const/4 v2, 0x3

    .line 82
    invoke-static {p1, v3, v3, v1, v2}, Lw51;->G(Lb71;Ls61;Le71;Lrn2;I)Log7;

    .line 83
    .line 84
    .line 85
    move-result-object p1

    .line 86
    iput-object p1, p0, Lib1;->i0:Log7;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 87
    .line 88
    goto :goto_2

    .line 89
    :catchall_0
    move-exception p0

    .line 90
    goto :goto_3

    .line 91
    :cond_4
    :goto_2
    invoke-interface {v0, v3}, Lo15;->m(Ljava/lang/Object;)V

    .line 92
    .line 93
    .line 94
    sget-object p0, Ldn8;->a:Ldn8;

    .line 95
    .line 96
    return-object p0

    .line 97
    :goto_3
    invoke-interface {v0, v3}, Lo15;->m(Ljava/lang/Object;)V

    .line 98
    .line 99
    .line 100
    throw p0
.end method

.method public final e(Ls51;)Ljava/lang/Object;
    .locals 6

    .line 1
    instance-of v0, p1, Lab1;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p1

    .line 6
    check-cast v0, Lab1;

    .line 7
    .line 8
    iget v1, v0, Lab1;->i0:I

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
    iput v1, v0, Lab1;->i0:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, Lab1;

    .line 21
    .line 22
    invoke-direct {v0, p0, p1}, Lab1;-><init>(Lib1;Ls51;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p1, v0, Lab1;->g0:Ljava/lang/Object;

    .line 26
    .line 27
    iget v1, v0, Lab1;->i0:I

    .line 28
    .line 29
    const/4 v2, 0x2

    .line 30
    const/4 v3, 0x1

    .line 31
    sget-object v4, Lc71;->X:Lc71;

    .line 32
    .line 33
    if-eqz v1, :cond_3

    .line 34
    .line 35
    if-eq v1, v3, :cond_2

    .line 36
    .line 37
    if-ne v1, v2, :cond_1

    .line 38
    .line 39
    iget v0, v0, Lab1;->f0:I

    .line 40
    .line 41
    :try_start_0
    invoke-static {p1}, Lw39;->n0(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 42
    .line 43
    .line 44
    goto :goto_3

    .line 45
    :catchall_0
    move-exception p1

    .line 46
    goto :goto_4

    .line 47
    :cond_1
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 48
    .line 49
    invoke-static {p0}, Lbt;->i(Ljava/lang/String;)V

    .line 50
    .line 51
    .line 52
    const/4 p0, 0x0

    .line 53
    return-object p0

    .line 54
    :cond_2
    invoke-static {p1}, Lw39;->n0(Ljava/lang/Object;)V

    .line 55
    .line 56
    .line 57
    goto :goto_1

    .line 58
    :cond_3
    invoke-static {p1}, Lw39;->n0(Ljava/lang/Object;)V

    .line 59
    .line 60
    .line 61
    invoke-virtual {p0}, Lib1;->b()Lja7;

    .line 62
    .line 63
    .line 64
    move-result-object p1

    .line 65
    iput v3, v0, Lab1;->i0:I

    .line 66
    .line 67
    invoke-virtual {p1}, Lja7;->a()Ljava/lang/Integer;

    .line 68
    .line 69
    .line 70
    move-result-object p1

    .line 71
    if-ne p1, v4, :cond_4

    .line 72
    .line 73
    goto :goto_2

    .line 74
    :cond_4
    :goto_1
    check-cast p1, Ljava/lang/Number;

    .line 75
    .line 76
    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    .line 77
    .line 78
    .line 79
    move-result p1

    .line 80
    :try_start_1
    iget-object v1, p0, Lib1;->k0:Lz47;

    .line 81
    .line 82
    iput p1, v0, Lab1;->f0:I

    .line 83
    .line 84
    iput v2, v0, Lab1;->i0:I

    .line 85
    .line 86
    invoke-virtual {v1, v0}, Lz47;->Q(Ls51;)Ljava/lang/Object;

    .line 87
    .line 88
    .line 89
    move-result-object p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 90
    if-ne p0, v4, :cond_5

    .line 91
    .line 92
    :goto_2
    return-object v4

    .line 93
    :cond_5
    :goto_3
    sget-object p0, Ldn8;->a:Ldn8;

    .line 94
    .line 95
    return-object p0

    .line 96
    :catchall_1
    move-exception v0

    .line 97
    move-object v5, v0

    .line 98
    move v0, p1

    .line 99
    move-object p1, v5

    .line 100
    :goto_4
    new-instance v1, Lu66;

    .line 101
    .line 102
    invoke-direct {v1, p1, v0}, Lu66;-><init>(Ljava/lang/Throwable;I)V

    .line 103
    .line 104
    .line 105
    iget-object p0, p0, Lib1;->j0:Ljb1;

    .line 106
    .line 107
    invoke-virtual {p0, v1}, Ljb1;->c(Lhh7;)V

    .line 108
    .line 109
    .line 110
    throw p1
.end method

.method public final f(ZLq51;)Ljava/lang/Object;
    .locals 9

    .line 1
    instance-of v0, p2, Lbb1;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p2

    .line 6
    check-cast v0, Lbb1;

    .line 7
    .line 8
    iget v1, v0, Lbb1;->j0:I

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
    iput v1, v0, Lbb1;->j0:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, Lbb1;

    .line 21
    .line 22
    invoke-direct {v0, p0, p2}, Lbb1;-><init>(Lib1;Lq51;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p2, v0, Lbb1;->h0:Ljava/lang/Object;

    .line 26
    .line 27
    iget v1, v0, Lbb1;->j0:I

    .line 28
    .line 29
    iget-object v2, p0, Lib1;->j0:Ljb1;

    .line 30
    .line 31
    const/4 v3, 0x3

    .line 32
    const/4 v4, 0x2

    .line 33
    const/4 v5, 0x1

    .line 34
    const/4 v6, 0x0

    .line 35
    sget-object v7, Lc71;->X:Lc71;

    .line 36
    .line 37
    if-eqz v1, :cond_4

    .line 38
    .line 39
    if-eq v1, v5, :cond_3

    .line 40
    .line 41
    if-eq v1, v4, :cond_2

    .line 42
    .line 43
    if-ne v1, v3, :cond_1

    .line 44
    .line 45
    invoke-static {p2}, Lw39;->n0(Ljava/lang/Object;)V

    .line 46
    .line 47
    .line 48
    goto/16 :goto_5

    .line 49
    .line 50
    :cond_1
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 51
    .line 52
    invoke-static {p0}, Lbt;->i(Ljava/lang/String;)V

    .line 53
    .line 54
    .line 55
    return-object v6

    .line 56
    :cond_2
    invoke-static {p2}, Lw39;->n0(Ljava/lang/Object;)V

    .line 57
    .line 58
    .line 59
    goto :goto_3

    .line 60
    :cond_3
    iget-boolean p1, v0, Lbb1;->f0:Z

    .line 61
    .line 62
    iget-object v1, v0, Lbb1;->g0:Lhh7;

    .line 63
    .line 64
    invoke-static {p2}, Lw39;->n0(Ljava/lang/Object;)V

    .line 65
    .line 66
    .line 67
    goto :goto_1

    .line 68
    :cond_4
    invoke-static {p2}, Lw39;->n0(Ljava/lang/Object;)V

    .line 69
    .line 70
    .line 71
    invoke-virtual {v2}, Ljb1;->b()Lhh7;

    .line 72
    .line 73
    .line 74
    move-result-object v1

    .line 75
    instance-of p2, v1, Lsl8;

    .line 76
    .line 77
    if-nez p2, :cond_c

    .line 78
    .line 79
    invoke-virtual {p0}, Lib1;->b()Lja7;

    .line 80
    .line 81
    .line 82
    move-result-object p2

    .line 83
    iput-object v1, v0, Lbb1;->g0:Lhh7;

    .line 84
    .line 85
    iput-boolean p1, v0, Lbb1;->f0:Z

    .line 86
    .line 87
    iput v5, v0, Lbb1;->j0:I

    .line 88
    .line 89
    invoke-virtual {p2}, Lja7;->a()Ljava/lang/Integer;

    .line 90
    .line 91
    .line 92
    move-result-object p2

    .line 93
    if-ne p2, v7, :cond_5

    .line 94
    .line 95
    goto :goto_4

    .line 96
    :cond_5
    :goto_1
    check-cast p2, Ljava/lang/Number;

    .line 97
    .line 98
    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    .line 99
    .line 100
    .line 101
    move-result p2

    .line 102
    instance-of v5, v1, Lv91;

    .line 103
    .line 104
    if-eqz v5, :cond_6

    .line 105
    .line 106
    move-object v8, v1

    .line 107
    check-cast v8, Lv91;

    .line 108
    .line 109
    iget v8, v8, Lhh7;->a:I

    .line 110
    .line 111
    goto :goto_2

    .line 112
    :cond_6
    const/4 v8, -0x1

    .line 113
    :goto_2
    if-eqz v5, :cond_7

    .line 114
    .line 115
    if-ne p2, v8, :cond_7

    .line 116
    .line 117
    return-object v1

    .line 118
    :cond_7
    const/4 p2, 0x0

    .line 119
    if-eqz p1, :cond_9

    .line 120
    .line 121
    invoke-virtual {p0}, Lib1;->b()Lja7;

    .line 122
    .line 123
    .line 124
    move-result-object p1

    .line 125
    new-instance v1, Lcb1;

    .line 126
    .line 127
    invoke-direct {v1, p0, v6, p2}, Lcb1;-><init>(Ljava/lang/Object;Lq51;B)V

    .line 128
    .line 129
    .line 130
    iput-object v6, v0, Lbb1;->g0:Lhh7;

    .line 131
    .line 132
    iput v4, v0, Lbb1;->j0:I

    .line 133
    .line 134
    invoke-virtual {p1, v1, v0}, Lja7;->b(Lgn2;Ls51;)Ljava/lang/Object;

    .line 135
    .line 136
    .line 137
    move-result-object p2

    .line 138
    if-ne p2, v7, :cond_8

    .line 139
    .line 140
    goto :goto_4

    .line 141
    :cond_8
    :goto_3
    check-cast p2, Lqg5;

    .line 142
    .line 143
    goto :goto_6

    .line 144
    :cond_9
    invoke-virtual {p0}, Lib1;->b()Lja7;

    .line 145
    .line 146
    .line 147
    move-result-object p1

    .line 148
    new-instance v1, Ldb1;

    .line 149
    .line 150
    invoke-direct {v1, p0, v8, v6, p2}, Ldb1;-><init>(Lib1;ILq51;B)V

    .line 151
    .line 152
    .line 153
    iput-object v6, v0, Lbb1;->g0:Lhh7;

    .line 154
    .line 155
    iput v3, v0, Lbb1;->j0:I

    .line 156
    .line 157
    invoke-virtual {p1, v1, v0}, Lja7;->c(Lrn2;Ls51;)Ljava/lang/Object;

    .line 158
    .line 159
    .line 160
    move-result-object p2

    .line 161
    if-ne p2, v7, :cond_a

    .line 162
    .line 163
    :goto_4
    return-object v7

    .line 164
    :cond_a
    :goto_5
    check-cast p2, Lqg5;

    .line 165
    .line 166
    :goto_6
    iget-object p0, p2, Lqg5;->X:Ljava/lang/Object;

    .line 167
    .line 168
    check-cast p0, Lhh7;

    .line 169
    .line 170
    iget-object p1, p2, Lqg5;->Y:Ljava/lang/Object;

    .line 171
    .line 172
    check-cast p1, Ljava/lang/Boolean;

    .line 173
    .line 174
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 175
    .line 176
    .line 177
    move-result p1

    .line 178
    if-eqz p1, :cond_b

    .line 179
    .line 180
    invoke-virtual {v2, p0}, Ljb1;->c(Lhh7;)V

    .line 181
    .line 182
    .line 183
    :cond_b
    return-object p0

    .line 184
    :cond_c
    const-string p0, "This is a bug in DataStore. Please file a bug at: https://issuetracker.google.com/issues/new?component=907884&template=1466542"

    .line 185
    .line 186
    invoke-static {p0}, Lbt;->i(Ljava/lang/String;)V

    .line 187
    .line 188
    .line 189
    return-object v6
.end method

.method public final g(ZLs51;)Ljava/lang/Object;
    .locals 10

    .line 1
    instance-of v0, p2, Leb1;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p2

    .line 6
    check-cast v0, Leb1;

    .line 7
    .line 8
    iget v1, v0, Leb1;->m0:I

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
    iput v1, v0, Leb1;->m0:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, Leb1;

    .line 21
    .line 22
    invoke-direct {v0, p0, p2}, Leb1;-><init>(Lib1;Ls51;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p2, v0, Leb1;->k0:Ljava/lang/Object;

    .line 26
    .line 27
    iget v1, v0, Leb1;->m0:I

    .line 28
    .line 29
    const/4 v2, 0x2

    .line 30
    const/4 v3, 0x1

    .line 31
    const/4 v4, 0x0

    .line 32
    const/4 v5, 0x0

    .line 33
    sget-object v6, Lc71;->X:Lc71;

    .line 34
    .line 35
    packed-switch v1, :pswitch_data_0

    .line 36
    .line 37
    .line 38
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 39
    .line 40
    invoke-static {p0}, Lbt;->i(Ljava/lang/String;)V

    .line 41
    .line 42
    .line 43
    return-object v5

    .line 44
    :pswitch_0
    iget-object p0, v0, Leb1;->i0:Ljava/io/Serializable;

    .line 45
    .line 46
    check-cast p0, Lca6;

    .line 47
    .line 48
    iget-object p1, v0, Leb1;->h0:Lea6;

    .line 49
    .line 50
    iget-object v0, v0, Leb1;->g0:Ljava/lang/Object;

    .line 51
    .line 52
    check-cast v0, Lj71;

    .line 53
    .line 54
    :try_start_0
    invoke-static {p2}, Lw39;->n0(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 55
    .line 56
    .line 57
    goto/16 :goto_a

    .line 58
    .line 59
    :catchall_0
    move-exception p0

    .line 60
    goto/16 :goto_c

    .line 61
    .line 62
    :pswitch_1
    iget-boolean p1, v0, Leb1;->f0:Z

    .line 63
    .line 64
    iget-object v1, v0, Leb1;->i0:Ljava/io/Serializable;

    .line 65
    .line 66
    check-cast v1, Lea6;

    .line 67
    .line 68
    iget-object v3, v0, Leb1;->h0:Lea6;

    .line 69
    .line 70
    iget-object v7, v0, Leb1;->g0:Ljava/lang/Object;

    .line 71
    .line 72
    check-cast v7, Lj71;

    .line 73
    .line 74
    invoke-static {p2}, Lw39;->n0(Ljava/lang/Object;)V

    .line 75
    .line 76
    .line 77
    move-object v9, v3

    .line 78
    move-object v3, v1

    .line 79
    move-object v1, v9

    .line 80
    goto/16 :goto_7

    .line 81
    .line 82
    :pswitch_2
    iget-boolean p1, v0, Leb1;->f0:Z

    .line 83
    .line 84
    :try_start_1
    invoke-static {p2}, Lw39;->n0(Ljava/lang/Object;)V
    :try_end_1
    .catch Lj71; {:try_start_1 .. :try_end_1} :catch_0

    .line 85
    .line 86
    .line 87
    goto/16 :goto_5

    .line 88
    .line 89
    :catch_0
    move-exception p2

    .line 90
    goto/16 :goto_6

    .line 91
    .line 92
    :pswitch_3
    iget-boolean p1, v0, Leb1;->f0:Z

    .line 93
    .line 94
    :try_start_2
    invoke-static {p2}, Lw39;->n0(Ljava/lang/Object;)V
    :try_end_2
    .catch Lj71; {:try_start_2 .. :try_end_2} :catch_0

    .line 95
    .line 96
    .line 97
    goto/16 :goto_4

    .line 98
    .line 99
    :pswitch_4
    iget p1, v0, Leb1;->j0:I

    .line 100
    .line 101
    iget-boolean v1, v0, Leb1;->f0:Z

    .line 102
    .line 103
    iget-object v3, v0, Leb1;->g0:Ljava/lang/Object;

    .line 104
    .line 105
    :try_start_3
    invoke-static {p2}, Lw39;->n0(Ljava/lang/Object;)V
    :try_end_3
    .catch Lj71; {:try_start_3 .. :try_end_3} :catch_1

    .line 106
    .line 107
    .line 108
    goto :goto_3

    .line 109
    :catch_1
    move-exception p2

    .line 110
    move p1, v1

    .line 111
    goto/16 :goto_6

    .line 112
    .line 113
    :pswitch_5
    iget-boolean p1, v0, Leb1;->f0:Z

    .line 114
    .line 115
    :try_start_4
    invoke-static {p2}, Lw39;->n0(Ljava/lang/Object;)V
    :try_end_4
    .catch Lj71; {:try_start_4 .. :try_end_4} :catch_0

    .line 116
    .line 117
    .line 118
    goto :goto_1

    .line 119
    :pswitch_6
    invoke-static {p2}, Lw39;->n0(Ljava/lang/Object;)V

    .line 120
    .line 121
    .line 122
    const/4 p2, 0x3

    .line 123
    if-eqz p1, :cond_4

    .line 124
    .line 125
    :try_start_5
    iput-boolean p1, v0, Leb1;->f0:Z

    .line 126
    .line 127
    iput v3, v0, Leb1;->m0:I

    .line 128
    .line 129
    iget-object v1, p0, Lib1;->l0:Lvz7;

    .line 130
    .line 131
    invoke-virtual {v1}, Lvz7;->getValue()Ljava/lang/Object;

    .line 132
    .line 133
    .line 134
    move-result-object v1

    .line 135
    check-cast v1, Lp92;

    .line 136
    .line 137
    new-instance v3, Lta1;

    .line 138
    .line 139
    invoke-direct {v3, p2, v5}, Lta1;-><init>(ILq51;)V

    .line 140
    .line 141
    .line 142
    invoke-virtual {v1, v3, v0}, Lp92;->a(Lta1;Ls51;)Ljava/lang/Object;

    .line 143
    .line 144
    .line 145
    move-result-object p2

    .line 146
    if-ne p2, v6, :cond_1

    .line 147
    .line 148
    goto/16 :goto_9

    .line 149
    .line 150
    :cond_1
    :goto_1
    if-eqz p2, :cond_2

    .line 151
    .line 152
    invoke-virtual {p2}, Ljava/lang/Object;->hashCode()I

    .line 153
    .line 154
    .line 155
    move-result v1

    .line 156
    goto :goto_2

    .line 157
    :cond_2
    move v1, v4

    .line 158
    :goto_2
    invoke-virtual {p0}, Lib1;->b()Lja7;

    .line 159
    .line 160
    .line 161
    move-result-object v3

    .line 162
    iput-object p2, v0, Leb1;->g0:Ljava/lang/Object;

    .line 163
    .line 164
    iput-boolean p1, v0, Leb1;->f0:Z

    .line 165
    .line 166
    iput v1, v0, Leb1;->j0:I

    .line 167
    .line 168
    iput v2, v0, Leb1;->m0:I

    .line 169
    .line 170
    invoke-virtual {v3}, Lja7;->a()Ljava/lang/Integer;

    .line 171
    .line 172
    .line 173
    move-result-object v3
    :try_end_5
    .catch Lj71; {:try_start_5 .. :try_end_5} :catch_0

    .line 174
    if-ne v3, v6, :cond_3

    .line 175
    .line 176
    goto/16 :goto_9

    .line 177
    .line 178
    :cond_3
    move v9, v1

    .line 179
    move v1, p1

    .line 180
    move p1, v9

    .line 181
    move-object v9, v3

    .line 182
    move-object v3, p2

    .line 183
    move-object p2, v9

    .line 184
    :goto_3
    :try_start_6
    check-cast p2, Ljava/lang/Number;

    .line 185
    .line 186
    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    .line 187
    .line 188
    .line 189
    move-result p2

    .line 190
    new-instance v7, Lv91;

    .line 191
    .line 192
    invoke-direct {v7, p1, p2, v3}, Lv91;-><init>(IILjava/lang/Object;)V
    :try_end_6
    .catch Lj71; {:try_start_6 .. :try_end_6} :catch_1

    .line 193
    .line 194
    .line 195
    return-object v7

    .line 196
    :cond_4
    :try_start_7
    invoke-virtual {p0}, Lib1;->b()Lja7;

    .line 197
    .line 198
    .line 199
    move-result-object v1

    .line 200
    iput-boolean p1, v0, Leb1;->f0:Z

    .line 201
    .line 202
    iput p2, v0, Leb1;->m0:I

    .line 203
    .line 204
    invoke-virtual {v1}, Lja7;->a()Ljava/lang/Integer;

    .line 205
    .line 206
    .line 207
    move-result-object p2

    .line 208
    if-ne p2, v6, :cond_5

    .line 209
    .line 210
    goto :goto_9

    .line 211
    :cond_5
    :goto_4
    check-cast p2, Ljava/lang/Number;

    .line 212
    .line 213
    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    .line 214
    .line 215
    .line 216
    move-result p2

    .line 217
    invoke-virtual {p0}, Lib1;->b()Lja7;

    .line 218
    .line 219
    .line 220
    move-result-object v1

    .line 221
    new-instance v7, Ldb1;

    .line 222
    .line 223
    invoke-direct {v7, p0, p2, v5, v3}, Ldb1;-><init>(Lib1;ILq51;B)V

    .line 224
    .line 225
    .line 226
    iput-boolean p1, v0, Leb1;->f0:Z

    .line 227
    .line 228
    const/4 p2, 0x4

    .line 229
    iput p2, v0, Leb1;->m0:I

    .line 230
    .line 231
    invoke-virtual {v1, v7, v0}, Lja7;->c(Lrn2;Ls51;)Ljava/lang/Object;

    .line 232
    .line 233
    .line 234
    move-result-object p2

    .line 235
    if-ne p2, v6, :cond_6

    .line 236
    .line 237
    goto :goto_9

    .line 238
    :cond_6
    :goto_5
    check-cast p2, Lv91;
    :try_end_7
    .catch Lj71; {:try_start_7 .. :try_end_7} :catch_0

    .line 239
    .line 240
    return-object p2

    .line 241
    :goto_6
    new-instance v1, Lea6;

    .line 242
    .line 243
    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    .line 244
    .line 245
    .line 246
    iput-object p2, v0, Leb1;->g0:Ljava/lang/Object;

    .line 247
    .line 248
    iput-object v1, v0, Leb1;->h0:Lea6;

    .line 249
    .line 250
    iput-object v1, v0, Leb1;->i0:Ljava/io/Serializable;

    .line 251
    .line 252
    iput-boolean p1, v0, Leb1;->f0:Z

    .line 253
    .line 254
    const/4 v3, 0x5

    .line 255
    iput v3, v0, Leb1;->m0:I

    .line 256
    .line 257
    iget-object v3, p0, Lib1;->Y:Lk71;

    .line 258
    .line 259
    invoke-interface {v3, p2}, Lk71;->j(Lj71;)Ljava/lang/Object;

    .line 260
    .line 261
    .line 262
    move-result-object v3

    .line 263
    if-ne v3, v6, :cond_7

    .line 264
    .line 265
    goto :goto_9

    .line 266
    :cond_7
    move-object v7, p2

    .line 267
    move-object p2, v3

    .line 268
    move-object v3, v1

    .line 269
    :goto_7
    iput-object p2, v3, Lea6;->X:Ljava/lang/Object;

    .line 270
    .line 271
    new-instance p2, Lca6;

    .line 272
    .line 273
    invoke-direct {p2}, Ljava/lang/Object;-><init>()V

    .line 274
    .line 275
    .line 276
    :try_start_8
    new-instance v3, Lfb1;

    .line 277
    .line 278
    invoke-direct {v3, v1, p0, p2, v5}, Lfb1;-><init>(Lea6;Lib1;Lca6;Lq51;)V

    .line 279
    .line 280
    .line 281
    iput-object v7, v0, Leb1;->g0:Ljava/lang/Object;

    .line 282
    .line 283
    iput-object v1, v0, Leb1;->h0:Lea6;

    .line 284
    .line 285
    iput-object p2, v0, Leb1;->i0:Ljava/io/Serializable;

    .line 286
    .line 287
    const/4 v8, 0x6

    .line 288
    iput v8, v0, Leb1;->m0:I

    .line 289
    .line 290
    if-eqz p1, :cond_8

    .line 291
    .line 292
    invoke-virtual {v3, v0}, Lfb1;->B(Ljava/lang/Object;)Ljava/lang/Object;

    .line 293
    .line 294
    .line 295
    move-result-object p0

    .line 296
    goto :goto_8

    .line 297
    :cond_8
    invoke-virtual {p0}, Lib1;->b()Lja7;

    .line 298
    .line 299
    .line 300
    move-result-object p0

    .line 301
    new-instance p1, Lrf0;

    .line 302
    .line 303
    invoke-direct {p1, v3, v5, v2}, Lrf0;-><init>(Ljava/lang/Object;Lq51;B)V

    .line 304
    .line 305
    .line 306
    invoke-virtual {p0, p1, v0}, Lja7;->b(Lgn2;Ls51;)Ljava/lang/Object;

    .line 307
    .line 308
    .line 309
    move-result-object p0
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_1

    .line 310
    :goto_8
    if-ne p0, v6, :cond_9

    .line 311
    .line 312
    :goto_9
    return-object v6

    .line 313
    :cond_9
    move-object p0, p2

    .line 314
    move-object p1, v1

    .line 315
    :goto_a
    new-instance p2, Lv91;

    .line 316
    .line 317
    iget-object p1, p1, Lea6;->X:Ljava/lang/Object;

    .line 318
    .line 319
    if-eqz p1, :cond_a

    .line 320
    .line 321
    invoke-virtual {p1}, Ljava/lang/Object;->hashCode()I

    .line 322
    .line 323
    .line 324
    move-result v4

    .line 325
    :cond_a
    iget p0, p0, Lca6;->X:I

    .line 326
    .line 327
    invoke-direct {p2, v4, p0, p1}, Lv91;-><init>(IILjava/lang/Object;)V

    .line 328
    .line 329
    .line 330
    return-object p2

    .line 331
    :goto_b
    move-object v0, v7

    .line 332
    goto :goto_c

    .line 333
    :catchall_1
    move-exception p0

    .line 334
    goto :goto_b

    .line 335
    :goto_c
    invoke-static {v0, p0}, Lgv3;->g(Ljava/lang/Throwable;Ljava/lang/Throwable;)V

    .line 336
    .line 337
    .line 338
    throw v0

    .line 339
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final h(Ljava/lang/Object;ZLs51;)Ljava/lang/Object;
    .locals 9

    .line 1
    instance-of v0, p3, Lgb1;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p3

    .line 6
    check-cast v0, Lgb1;

    .line 7
    .line 8
    iget v1, v0, Lgb1;->i0:I

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
    iput v1, v0, Lgb1;->i0:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, Lgb1;

    .line 21
    .line 22
    invoke-direct {v0, p0, p3}, Lgb1;-><init>(Lib1;Ls51;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p3, v0, Lgb1;->g0:Ljava/lang/Object;

    .line 26
    .line 27
    iget v1, v0, Lgb1;->i0:I

    .line 28
    .line 29
    const/4 v2, 0x1

    .line 30
    if-eqz v1, :cond_2

    .line 31
    .line 32
    if-ne v1, v2, :cond_1

    .line 33
    .line 34
    iget-object p0, v0, Lgb1;->f0:Lca6;

    .line 35
    .line 36
    invoke-static {p3}, Lw39;->n0(Ljava/lang/Object;)V

    .line 37
    .line 38
    .line 39
    goto :goto_1

    .line 40
    :cond_1
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 41
    .line 42
    invoke-static {p0}, Lbt;->i(Ljava/lang/String;)V

    .line 43
    .line 44
    .line 45
    const/4 p0, 0x0

    .line 46
    return-object p0

    .line 47
    :cond_2
    invoke-static {p3}, Lw39;->n0(Ljava/lang/Object;)V

    .line 48
    .line 49
    .line 50
    new-instance v4, Lca6;

    .line 51
    .line 52
    invoke-direct {v4}, Ljava/lang/Object;-><init>()V

    .line 53
    .line 54
    .line 55
    iget-object p3, p0, Lib1;->l0:Lvz7;

    .line 56
    .line 57
    invoke-virtual {p3}, Lvz7;->getValue()Ljava/lang/Object;

    .line 58
    .line 59
    .line 60
    move-result-object p3

    .line 61
    check-cast p3, Lp92;

    .line 62
    .line 63
    new-instance v3, Lhb1;

    .line 64
    .line 65
    const/4 v8, 0x0

    .line 66
    move-object v5, p0

    .line 67
    move-object v6, p1

    .line 68
    move v7, p2

    .line 69
    invoke-direct/range {v3 .. v8}, Lhb1;-><init>(Lca6;Lib1;Ljava/lang/Object;ZLq51;)V

    .line 70
    .line 71
    .line 72
    iput-object v4, v0, Lgb1;->f0:Lca6;

    .line 73
    .line 74
    iput v2, v0, Lgb1;->i0:I

    .line 75
    .line 76
    invoke-virtual {p3, v3, v0}, Lp92;->b(Lhb1;Ls51;)Ljava/lang/Object;

    .line 77
    .line 78
    .line 79
    move-result-object p0

    .line 80
    sget-object p1, Lc71;->X:Lc71;

    .line 81
    .line 82
    if-ne p0, p1, :cond_3

    .line 83
    .line 84
    return-object p1

    .line 85
    :cond_3
    move-object p0, v4

    .line 86
    :goto_1
    iget p0, p0, Lca6;->X:I

    .line 87
    .line 88
    new-instance p1, Ljava/lang/Integer;

    .line 89
    .line 90
    invoke-direct {p1, p0}, Ljava/lang/Integer;-><init>(I)V

    .line 91
    .line 92
    .line 93
    return-object p1
.end method

.method public final j()Lxe2;
    .locals 0

    .line 1
    iget-object p0, p0, Lib1;->f0:Lj31;

    .line 2
    .line 3
    return-object p0
.end method

.method public final u(Lrn2;Ls51;)Ljava/lang/Object;
    .locals 4

    .line 1
    invoke-interface {p2}, Lq51;->w()Ls61;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    sget-object v1, Lqe4;->C0:Lqe4;

    .line 6
    .line 7
    invoke-interface {v0, v1}, Ls61;->H0(Lr61;)Lq61;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    check-cast v0, Lzp8;

    .line 12
    .line 13
    if-eqz v0, :cond_0

    .line 14
    .line 15
    invoke-virtual {v0, p0}, Lzp8;->a(Lib1;)V

    .line 16
    .line 17
    .line 18
    :cond_0
    new-instance v1, Lzp8;

    .line 19
    .line 20
    invoke-direct {v1, v0, p0}, Lzp8;-><init>(Lzp8;Lib1;)V

    .line 21
    .line 22
    .line 23
    new-instance v0, Lr0;

    .line 24
    .line 25
    const/4 v2, 0x0

    .line 26
    const/16 v3, 0xc

    .line 27
    .line 28
    invoke-direct {v0, p0, p1, v2, v3}, Lr0;-><init>(Ljava/lang/Object;Ljava/lang/Object;Lq51;B)V

    .line 29
    .line 30
    .line 31
    invoke-static {v1, v0, p2}, Lw51;->W(Ls61;Lrn2;Lq51;)Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object p0

    .line 35
    return-object p0
.end method
