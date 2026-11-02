.class public abstract Lq06;
.super Ljava/lang/Object;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"


# instance fields
.field public final a:Lx74;


# direct methods
.method public constructor <init>(Ldn2;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Lx74;

    .line 5
    .line 6
    invoke-direct {v0, p1}, Lx74;-><init>(Ldn2;)V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, Lq06;->a:Lx74;

    .line 10
    .line 11
    return-void
.end method


# virtual methods
.method public a(Ljava/lang/Object;)Lt06;
    .locals 7

    .line 1
    new-instance v0, Lt06;

    .line 2
    .line 3
    if-nez p1, :cond_0

    .line 4
    .line 5
    const/4 v1, 0x1

    .line 6
    :goto_0
    move v3, v1

    .line 7
    goto :goto_1

    .line 8
    :cond_0
    const/4 v1, 0x0

    .line 9
    goto :goto_0

    .line 10
    :goto_1
    const/4 v5, 0x0

    .line 11
    const/4 v6, 0x1

    .line 12
    const/4 v4, 0x0

    .line 13
    move-object v1, p0

    .line 14
    move-object v2, p1

    .line 15
    invoke-direct/range {v0 .. v6}, Lt06;-><init>(Lq06;Ljava/lang/Object;ZLqd7;Lgn2;Z)V

    .line 16
    .line 17
    .line 18
    return-object v0
.end method

.method public b()Ljt8;
    .locals 0

    .line 1
    iget-object p0, p0, Lq06;->a:Lx74;

    .line 2
    .line 3
    return-object p0
.end method

.method public final c(Lgn2;)Lt06;
    .locals 7

    .line 1
    new-instance v0, Lt06;

    .line 2
    .line 3
    const/4 v4, 0x0

    .line 4
    const/4 v6, 0x0

    .line 5
    const/4 v2, 0x0

    .line 6
    const/4 v3, 0x0

    .line 7
    move-object v1, p0

    .line 8
    move-object v5, p1

    .line 9
    invoke-direct/range {v0 .. v6}, Lt06;-><init>(Lq06;Ljava/lang/Object;ZLqd7;Lgn2;Z)V

    .line 10
    .line 11
    .line 12
    return-object v0
.end method

.method public final d(Lt06;Ljt8;)Ljt8;
    .locals 2

    .line 1
    instance-of p0, p2, Lvx1;

    .line 2
    .line 3
    const/4 v0, 0x0

    .line 4
    if-eqz p0, :cond_0

    .line 5
    .line 6
    iget-boolean p0, p1, Lt06;->e:Z

    .line 7
    .line 8
    if-eqz p0, :cond_3

    .line 9
    .line 10
    move-object v0, p2

    .line 11
    check-cast v0, Lvx1;

    .line 12
    .line 13
    iget-object p0, v0, Lvx1;->a:Lrh5;

    .line 14
    .line 15
    invoke-virtual {p1}, Lt06;->a()Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    move-result-object p2

    .line 19
    invoke-virtual {p0, p2}, Lrh5;->setValue(Ljava/lang/Object;)V

    .line 20
    .line 21
    .line 22
    goto :goto_1

    .line 23
    :cond_0
    instance-of p0, p2, Lli7;

    .line 24
    .line 25
    if-eqz p0, :cond_2

    .line 26
    .line 27
    iget-boolean p0, p1, Lt06;->b:Z

    .line 28
    .line 29
    if-nez p0, :cond_1

    .line 30
    .line 31
    iget-object p0, p1, Lt06;->f:Ljava/lang/Object;

    .line 32
    .line 33
    if-eqz p0, :cond_3

    .line 34
    .line 35
    :cond_1
    iget-boolean p0, p1, Lt06;->e:Z

    .line 36
    .line 37
    if-nez p0, :cond_3

    .line 38
    .line 39
    invoke-virtual {p1}, Lt06;->a()Ljava/lang/Object;

    .line 40
    .line 41
    .line 42
    move-result-object p0

    .line 43
    check-cast p2, Lli7;

    .line 44
    .line 45
    iget-object v1, p2, Lli7;->a:Ljava/lang/Object;

    .line 46
    .line 47
    invoke-static {p0, v1}, Ldh3;->f(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 48
    .line 49
    .line 50
    move-result p0

    .line 51
    if-eqz p0, :cond_3

    .line 52
    .line 53
    :goto_0
    move-object v0, p2

    .line 54
    goto :goto_1

    .line 55
    :cond_2
    instance-of p0, p2, La11;

    .line 56
    .line 57
    if-eqz p0, :cond_3

    .line 58
    .line 59
    iget-object p0, p1, Lt06;->d:Lgn2;

    .line 60
    .line 61
    check-cast p2, La11;

    .line 62
    .line 63
    iget-object v1, p2, La11;->a:Lgn2;

    .line 64
    .line 65
    if-ne p0, v1, :cond_3

    .line 66
    .line 67
    goto :goto_0

    .line 68
    :cond_3
    :goto_1
    if-nez v0, :cond_7

    .line 69
    .line 70
    iget-boolean p0, p1, Lt06;->e:Z

    .line 71
    .line 72
    if-eqz p0, :cond_5

    .line 73
    .line 74
    new-instance p0, Lvx1;

    .line 75
    .line 76
    iget-object p2, p1, Lt06;->f:Ljava/lang/Object;

    .line 77
    .line 78
    iget-object p1, p1, Lt06;->c:Lqd7;

    .line 79
    .line 80
    if-nez p1, :cond_4

    .line 81
    .line 82
    sget-object p1, Lqe4;->v0:Lqe4;

    .line 83
    .line 84
    :cond_4
    new-instance v0, Lrh5;

    .line 85
    .line 86
    invoke-direct {v0, p2, p1}, Lrh5;-><init>(Ljava/lang/Object;Lqd7;)V

    .line 87
    .line 88
    .line 89
    invoke-direct {p0, v0}, Lvx1;-><init>(Lrh5;)V

    .line 90
    .line 91
    .line 92
    return-object p0

    .line 93
    :cond_5
    iget-object p0, p1, Lt06;->d:Lgn2;

    .line 94
    .line 95
    if-eqz p0, :cond_6

    .line 96
    .line 97
    new-instance p1, La11;

    .line 98
    .line 99
    invoke-direct {p1, p0}, La11;-><init>(Lgn2;)V

    .line 100
    .line 101
    .line 102
    return-object p1

    .line 103
    :cond_6
    new-instance p0, Lli7;

    .line 104
    .line 105
    invoke-virtual {p1}, Lt06;->a()Ljava/lang/Object;

    .line 106
    .line 107
    .line 108
    move-result-object p1

    .line 109
    invoke-direct {p0, p1}, Lli7;-><init>(Ljava/lang/Object;)V

    .line 110
    .line 111
    .line 112
    return-object p0

    .line 113
    :cond_7
    return-object v0
.end method
