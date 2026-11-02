.class public abstract Le1;
.super Lrm3;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"

# interfaces
.implements Lq51;
.implements Lb71;


# instance fields
.field public final f0:Ls61;


# direct methods
.method public constructor <init>(Ls61;Z)V
    .locals 0

    .line 1
    invoke-direct {p0, p2}, Lrm3;-><init>(Z)V

    .line 2
    .line 3
    .line 4
    sget-object p2, Loy1;->E0:Loy1;

    .line 5
    .line 6
    invoke-interface {p1, p2}, Ls61;->H0(Lr61;)Lq61;

    .line 7
    .line 8
    .line 9
    move-result-object p2

    .line 10
    check-cast p2, Lbm3;

    .line 11
    .line 12
    invoke-virtual {p0, p2}, Lrm3;->P(Lbm3;)V

    .line 13
    .line 14
    .line 15
    invoke-interface {p1, p0}, Ls61;->B0(Ls61;)Ls61;

    .line 16
    .line 17
    .line 18
    move-result-object p1

    .line 19
    iput-object p1, p0, Le1;->f0:Ls61;

    .line 20
    .line 21
    return-void
.end method


# virtual methods
.method public final O(Lyx0;)V
    .locals 0

    .line 1
    iget-object p0, p0, Le1;->f0:Ls61;

    .line 2
    .line 3
    invoke-static {p0, p1}, Lvr3;->F(Ls61;Ljava/lang/Throwable;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public X()Ljava/lang/String;
    .locals 0

    .line 1
    invoke-super {p0}, Lrm3;->X()Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public final d0(Ljava/lang/Object;)V
    .locals 4

    .line 1
    instance-of v0, p1, Lxx0;

    .line 2
    .line 3
    if-eqz v0, :cond_1

    .line 4
    .line 5
    check-cast p1, Lxx0;

    .line 6
    .line 7
    iget-object v0, p1, Lxx0;->a:Ljava/lang/Throwable;

    .line 8
    .line 9
    sget-object v1, Liu;->a:Lsun/misc/Unsafe;

    .line 10
    .line 11
    sget-wide v2, Lxx0;->b:J

    .line 12
    .line 13
    invoke-virtual {v1, p1, v2, v3}, Lsun/misc/Unsafe;->getIntVolatile(Ljava/lang/Object;J)I

    .line 14
    .line 15
    .line 16
    move-result p1

    .line 17
    const/4 v1, 0x1

    .line 18
    if-ne p1, v1, :cond_0

    .line 19
    .line 20
    goto :goto_0

    .line 21
    :cond_0
    const/4 v1, 0x0

    .line 22
    :goto_0
    invoke-virtual {p0, v0, v1}, Le1;->l0(Ljava/lang/Throwable;Z)V

    .line 23
    .line 24
    .line 25
    return-void

    .line 26
    :cond_1
    invoke-virtual {p0, p1}, Le1;->m0(Ljava/lang/Object;)V

    .line 27
    .line 28
    .line 29
    return-void
.end method

.method public final f(Ljava/lang/Object;)V
    .locals 2

    .line 1
    invoke-static {p1}, Lsj6;->a(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    goto :goto_0

    .line 8
    :cond_0
    new-instance p1, Lxx0;

    .line 9
    .line 10
    const/4 v1, 0x0

    .line 11
    invoke-direct {p1, v0, v1}, Lxx0;-><init>(Ljava/lang/Throwable;Z)V

    .line 12
    .line 13
    .line 14
    :goto_0
    invoke-virtual {p0, p1}, Lrm3;->W(Ljava/lang/Object;)Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    move-result-object p1

    .line 18
    sget-object v0, Lsm3;->b:Lz31;

    .line 19
    .line 20
    if-ne p1, v0, :cond_1

    .line 21
    .line 22
    return-void

    .line 23
    :cond_1
    invoke-virtual {p0, p1}, Le1;->e(Ljava/lang/Object;)V

    .line 24
    .line 25
    .line 26
    return-void
.end method

.method public final getCoroutineContext()Ls61;
    .locals 0

    .line 1
    iget-object p0, p0, Le1;->f0:Ls61;

    .line 2
    .line 3
    return-object p0
.end method

.method public l0(Ljava/lang/Throwable;Z)V
    .locals 0

    .line 1
    return-void
.end method

.method public m0(Ljava/lang/Object;)V
    .locals 0

    .line 1
    return-void
.end method

.method public final n0(Le71;Le1;Lrn2;)V
    .locals 3

    .line 1
    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    .line 2
    .line 3
    .line 4
    move-result p1

    .line 5
    sget-object v0, Ldn8;->a:Ldn8;

    .line 6
    .line 7
    if-eqz p1, :cond_5

    .line 8
    .line 9
    const/4 v1, 0x1

    .line 10
    if-eq p1, v1, :cond_4

    .line 11
    .line 12
    const/4 v1, 0x2

    .line 13
    if-eq p1, v1, :cond_3

    .line 14
    .line 15
    const/4 v0, 0x3

    .line 16
    if-ne p1, v0, :cond_2

    .line 17
    .line 18
    :try_start_0
    iget-object p1, p0, Le1;->f0:Ls61;

    .line 19
    .line 20
    const/4 v0, 0x0

    .line 21
    invoke-static {p1, v0}, Lg98;->c(Ls61;Ljava/lang/Object;)Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 25
    :try_start_1
    instance-of v2, p3, Lr10;

    .line 26
    .line 27
    if-nez v2, :cond_0

    .line 28
    .line 29
    invoke-static {p3, p2, p0}, Lmb6;->k0(Lrn2;Ljava/lang/Object;Lq51;)Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    move-result-object p2

    .line 33
    goto :goto_0

    .line 34
    :catchall_0
    move-exception p2

    .line 35
    goto :goto_1

    .line 36
    :cond_0
    invoke-static {v1, p3}, Lci8;->i(ILjava/lang/Object;)Ljava/lang/Object;

    .line 37
    .line 38
    .line 39
    check-cast p3, Lrn2;

    .line 40
    .line 41
    invoke-interface {p3, p2, p0}, Lrn2;->K(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 42
    .line 43
    .line 44
    move-result-object p2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 45
    :goto_0
    :try_start_2
    invoke-static {p1, v0}, Lg98;->a(Ls61;Ljava/lang/Object;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 46
    .line 47
    .line 48
    sget-object p1, Lc71;->X:Lc71;

    .line 49
    .line 50
    if-eq p2, p1, :cond_4

    .line 51
    .line 52
    invoke-virtual {p0, p2}, Le1;->f(Ljava/lang/Object;)V

    .line 53
    .line 54
    .line 55
    return-void

    .line 56
    :catchall_1
    move-exception p1

    .line 57
    goto :goto_2

    .line 58
    :goto_1
    :try_start_3
    invoke-static {p1, v0}, Lg98;->a(Ls61;Ljava/lang/Object;)V

    .line 59
    .line 60
    .line 61
    throw p2
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 62
    :goto_2
    instance-of p2, p1, Lmp1;

    .line 63
    .line 64
    if-eqz p2, :cond_1

    .line 65
    .line 66
    check-cast p1, Lmp1;

    .line 67
    .line 68
    iget-object p1, p1, Lmp1;->X:Ljava/lang/Throwable;

    .line 69
    .line 70
    :cond_1
    new-instance p2, Lrj6;

    .line 71
    .line 72
    invoke-direct {p2, p1}, Lrj6;-><init>(Ljava/lang/Throwable;)V

    .line 73
    .line 74
    .line 75
    invoke-virtual {p0, p2}, Le1;->f(Ljava/lang/Object;)V

    .line 76
    .line 77
    .line 78
    return-void

    .line 79
    :cond_2
    invoke-static {}, Lb61;->c()V

    .line 80
    .line 81
    .line 82
    return-void

    .line 83
    :cond_3
    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 84
    .line 85
    .line 86
    invoke-static {p2, p0, p3}, Lmb6;->w(Lq51;Lq51;Lrn2;)Lq51;

    .line 87
    .line 88
    .line 89
    move-result-object p0

    .line 90
    invoke-static {p0}, Lmb6;->H(Lq51;)Lq51;

    .line 91
    .line 92
    .line 93
    move-result-object p0

    .line 94
    invoke-interface {p0, v0}, Lq51;->f(Ljava/lang/Object;)V

    .line 95
    .line 96
    .line 97
    :cond_4
    return-void

    .line 98
    :cond_5
    :try_start_4
    invoke-static {p2, p0, p3}, Lmb6;->w(Lq51;Lq51;Lrn2;)Lq51;

    .line 99
    .line 100
    .line 101
    move-result-object p1

    .line 102
    invoke-static {p1}, Lmb6;->H(Lq51;)Lq51;

    .line 103
    .line 104
    .line 105
    move-result-object p1

    .line 106
    invoke-static {p1, v0}, Lop1;->a(Lq51;Ljava/lang/Object;)V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    .line 107
    .line 108
    .line 109
    return-void

    .line 110
    :catchall_2
    move-exception p1

    .line 111
    instance-of p2, p1, Lmp1;

    .line 112
    .line 113
    if-eqz p2, :cond_6

    .line 114
    .line 115
    check-cast p1, Lmp1;

    .line 116
    .line 117
    iget-object p1, p1, Lmp1;->X:Ljava/lang/Throwable;

    .line 118
    .line 119
    :cond_6
    new-instance p2, Lrj6;

    .line 120
    .line 121
    invoke-direct {p2, p1}, Lrj6;-><init>(Ljava/lang/Throwable;)V

    .line 122
    .line 123
    .line 124
    invoke-virtual {p0, p2}, Le1;->f(Ljava/lang/Object;)V

    .line 125
    .line 126
    .line 127
    throw p1
.end method

.method public final v()Ljava/lang/String;
    .locals 1

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-virtual {p0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    const-string v0, " was cancelled"

    .line 10
    .line 11
    invoke-virtual {p0, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    return-object p0
.end method

.method public final w()Ls61;
    .locals 0

    .line 1
    iget-object p0, p0, Le1;->f0:Ls61;

    .line 2
    .line 3
    return-object p0
.end method
