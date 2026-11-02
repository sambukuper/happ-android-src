.class public final Lem5;
.super Lg2;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"


# instance fields
.field public X:Ldm5;

.field public Y:Ljava/lang/Object;

.field public Z:Ljava/lang/Object;

.field public final f0:Lol5;


# direct methods
.method public constructor <init>(Ldm5;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/util/AbstractMap;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lem5;->X:Ldm5;

    .line 5
    .line 6
    iget-object v0, p1, Ldm5;->X:Ljava/lang/Object;

    .line 7
    .line 8
    iput-object v0, p0, Lem5;->Y:Ljava/lang/Object;

    .line 9
    .line 10
    iget-object v0, p1, Ldm5;->Y:Ljava/lang/Object;

    .line 11
    .line 12
    iput-object v0, p0, Lem5;->Z:Ljava/lang/Object;

    .line 13
    .line 14
    iget-object p1, p1, Ldm5;->Z:Lll5;

    .line 15
    .line 16
    new-instance v0, Lol5;

    .line 17
    .line 18
    invoke-direct {v0, p1}, Lol5;-><init>(Lll5;)V

    .line 19
    .line 20
    .line 21
    iput-object v0, p0, Lem5;->f0:Lol5;

    .line 22
    .line 23
    return-void
.end method


# virtual methods
.method public final a()Ljava/util/Set;
    .locals 2

    .line 1
    new-instance v0, Lrl5;

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    invoke-direct {v0, p0, v1}, Lrl5;-><init>(Lg2;B)V

    .line 5
    .line 6
    .line 7
    return-object v0
.end method

.method public final b()Ljava/util/Set;
    .locals 2

    .line 1
    new-instance v0, Lul5;

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    invoke-direct {v0, p0, v1}, Lul5;-><init>(Lg2;B)V

    .line 5
    .line 6
    .line 7
    return-object v0
.end method

.method public final c()I
    .locals 0

    .line 1
    iget-object p0, p0, Lem5;->f0:Lol5;

    .line 2
    .line 3
    invoke-virtual {p0}, Lol5;->c()I

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    return p0
.end method

.method public final clear()V
    .locals 2

    .line 1
    iget-object v0, p0, Lem5;->f0:Lol5;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/util/AbstractMap;->isEmpty()Z

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    if-nez v1, :cond_0

    .line 8
    .line 9
    const/4 v1, 0x0

    .line 10
    iput-object v1, p0, Lem5;->X:Ldm5;

    .line 11
    .line 12
    :cond_0
    invoke-virtual {v0}, Lol5;->clear()V

    .line 13
    .line 14
    .line 15
    sget-object v0, Lpz2;->N0:Lpz2;

    .line 16
    .line 17
    iput-object v0, p0, Lem5;->Y:Ljava/lang/Object;

    .line 18
    .line 19
    iput-object v0, p0, Lem5;->Z:Ljava/lang/Object;

    .line 20
    .line 21
    return-void
.end method

.method public final containsKey(Ljava/lang/Object;)Z
    .locals 0

    .line 1
    iget-object p0, p0, Lem5;->f0:Lol5;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Lol5;->containsKey(Ljava/lang/Object;)Z

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    return p0
.end method

.method public final e()Ljava/util/Collection;
    .locals 2

    .line 1
    new-instance v0, Lkp4;

    .line 2
    .line 3
    const/4 v1, 0x3

    .line 4
    invoke-direct {v0, p0, v1}, Lkp4;-><init>(Ljava/lang/Object;B)V

    .line 5
    .line 6
    .line 7
    return-object v0
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 4

    .line 1
    if-ne p1, p0, :cond_0

    .line 2
    .line 3
    const/4 p0, 0x1

    .line 4
    return p0

    .line 5
    :cond_0
    instance-of v0, p1, Ljava/util/Map;

    .line 6
    .line 7
    if-nez v0, :cond_1

    .line 8
    .line 9
    goto :goto_0

    .line 10
    :cond_1
    iget-object v0, p0, Lem5;->f0:Lol5;

    .line 11
    .line 12
    invoke-virtual {v0}, Lol5;->c()I

    .line 13
    .line 14
    .line 15
    move-result v1

    .line 16
    move-object v2, p1

    .line 17
    check-cast v2, Ljava/util/Map;

    .line 18
    .line 19
    invoke-interface {v2}, Ljava/util/Map;->size()I

    .line 20
    .line 21
    .line 22
    move-result v3

    .line 23
    if-eq v1, v3, :cond_2

    .line 24
    .line 25
    :goto_0
    const/4 p0, 0x0

    .line 26
    return p0

    .line 27
    :cond_2
    instance-of v1, v2, Ldm5;

    .line 28
    .line 29
    if-eqz v1, :cond_3

    .line 30
    .line 31
    iget-object p0, v0, Lol5;->Z:Lif8;

    .line 32
    .line 33
    check-cast p1, Ldm5;

    .line 34
    .line 35
    iget-object p1, p1, Ldm5;->Z:Lll5;

    .line 36
    .line 37
    iget-object p1, p1, Lll5;->X:Lif8;

    .line 38
    .line 39
    new-instance v0, Lnw2;

    .line 40
    .line 41
    const/16 v1, 0x14

    .line 42
    .line 43
    invoke-direct {v0, v1}, Lnw2;-><init>(B)V

    .line 44
    .line 45
    .line 46
    invoke-virtual {p0, p1, v0}, Lif8;->g(Lif8;Lrn2;)Z

    .line 47
    .line 48
    .line 49
    move-result p0

    .line 50
    return p0

    .line 51
    :cond_3
    instance-of v1, v2, Lem5;

    .line 52
    .line 53
    if-eqz v1, :cond_4

    .line 54
    .line 55
    iget-object p0, v0, Lol5;->Z:Lif8;

    .line 56
    .line 57
    check-cast p1, Lem5;

    .line 58
    .line 59
    iget-object p1, p1, Lem5;->f0:Lol5;

    .line 60
    .line 61
    iget-object p1, p1, Lol5;->Z:Lif8;

    .line 62
    .line 63
    new-instance v0, Lnw2;

    .line 64
    .line 65
    const/16 v1, 0x15

    .line 66
    .line 67
    invoke-direct {v0, v1}, Lnw2;-><init>(B)V

    .line 68
    .line 69
    .line 70
    invoke-virtual {p0, p1, v0}, Lif8;->g(Lif8;Lrn2;)Z

    .line 71
    .line 72
    .line 73
    move-result p0

    .line 74
    return p0

    .line 75
    :cond_4
    instance-of v1, v2, Lll5;

    .line 76
    .line 77
    if-eqz v1, :cond_5

    .line 78
    .line 79
    iget-object p0, v0, Lol5;->Z:Lif8;

    .line 80
    .line 81
    check-cast p1, Lll5;

    .line 82
    .line 83
    iget-object p1, p1, Lll5;->X:Lif8;

    .line 84
    .line 85
    new-instance v0, Lnw2;

    .line 86
    .line 87
    const/16 v1, 0x16

    .line 88
    .line 89
    invoke-direct {v0, v1}, Lnw2;-><init>(B)V

    .line 90
    .line 91
    .line 92
    invoke-virtual {p0, p1, v0}, Lif8;->g(Lif8;Lrn2;)Z

    .line 93
    .line 94
    .line 95
    move-result p0

    .line 96
    return p0

    .line 97
    :cond_5
    instance-of v1, v2, Lol5;

    .line 98
    .line 99
    if-eqz v1, :cond_6

    .line 100
    .line 101
    iget-object p0, v0, Lol5;->Z:Lif8;

    .line 102
    .line 103
    check-cast p1, Lol5;

    .line 104
    .line 105
    iget-object p1, p1, Lol5;->Z:Lif8;

    .line 106
    .line 107
    new-instance v0, Lnw2;

    .line 108
    .line 109
    const/16 v1, 0x17

    .line 110
    .line 111
    invoke-direct {v0, v1}, Lnw2;-><init>(B)V

    .line 112
    .line 113
    .line 114
    invoke-virtual {p0, p1, v0}, Lif8;->g(Lif8;Lrn2;)Z

    .line 115
    .line 116
    .line 117
    move-result p0

    .line 118
    return p0

    .line 119
    :cond_6
    invoke-super {p0, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 120
    .line 121
    .line 122
    move-result p0

    .line 123
    return p0
.end method

.method public final f()Lcm5;
    .locals 4

    .line 1
    iget-object v0, p0, Lem5;->X:Ldm5;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    return-object v0

    .line 6
    :cond_0
    iget-object v0, p0, Lem5;->f0:Lol5;

    .line 7
    .line 8
    invoke-virtual {v0}, Lol5;->f()Lll5;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    new-instance v1, Ldm5;

    .line 13
    .line 14
    iget-object v2, p0, Lem5;->Y:Ljava/lang/Object;

    .line 15
    .line 16
    iget-object v3, p0, Lem5;->Z:Ljava/lang/Object;

    .line 17
    .line 18
    invoke-direct {v1, v2, v3, v0}, Ldm5;-><init>(Ljava/lang/Object;Ljava/lang/Object;Lll5;)V

    .line 19
    .line 20
    .line 21
    iput-object v1, p0, Lem5;->X:Ldm5;

    .line 22
    .line 23
    return-object v1
.end method

.method public final get(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    iget-object p0, p0, Lem5;->f0:Lol5;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Lol5;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Lza4;

    .line 8
    .line 9
    if-eqz p0, :cond_0

    .line 10
    .line 11
    iget-object p0, p0, Lza4;->a:Ljava/lang/Object;

    .line 12
    .line 13
    return-object p0

    .line 14
    :cond_0
    const/4 p0, 0x0

    .line 15
    return-object p0
.end method

.method public final put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    .line 1
    iget-object v0, p0, Lem5;->f0:Lol5;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Lol5;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    check-cast v1, Lza4;

    .line 8
    .line 9
    const/4 v2, 0x0

    .line 10
    if-eqz v1, :cond_1

    .line 11
    .line 12
    iget-object v3, v1, Lza4;->a:Ljava/lang/Object;

    .line 13
    .line 14
    if-ne v3, p2, :cond_0

    .line 15
    .line 16
    return-object p2

    .line 17
    :cond_0
    iput-object v2, p0, Lem5;->X:Ldm5;

    .line 18
    .line 19
    new-instance p0, Lza4;

    .line 20
    .line 21
    iget-object v2, v1, Lza4;->b:Ljava/lang/Object;

    .line 22
    .line 23
    iget-object v1, v1, Lza4;->c:Ljava/lang/Object;

    .line 24
    .line 25
    invoke-direct {p0, p2, v2, v1}, Lza4;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 26
    .line 27
    .line 28
    invoke-virtual {v0, p1, p0}, Lol5;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 29
    .line 30
    .line 31
    return-object v3

    .line 32
    :cond_1
    iput-object v2, p0, Lem5;->X:Ldm5;

    .line 33
    .line 34
    invoke-virtual {p0}, Ljava/util/AbstractMap;->isEmpty()Z

    .line 35
    .line 36
    .line 37
    move-result v1

    .line 38
    if-eqz v1, :cond_2

    .line 39
    .line 40
    iput-object p1, p0, Lem5;->Y:Ljava/lang/Object;

    .line 41
    .line 42
    iput-object p1, p0, Lem5;->Z:Ljava/lang/Object;

    .line 43
    .line 44
    new-instance p0, Lza4;

    .line 45
    .line 46
    invoke-direct {p0, p2}, Lza4;-><init>(Ljava/lang/Object;)V

    .line 47
    .line 48
    .line 49
    invoke-virtual {v0, p1, p0}, Lol5;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 50
    .line 51
    .line 52
    return-object v2

    .line 53
    :cond_2
    iget-object v1, p0, Lem5;->Z:Ljava/lang/Object;

    .line 54
    .line 55
    invoke-virtual {v0, v1}, Lol5;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 56
    .line 57
    .line 58
    move-result-object v3

    .line 59
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 60
    .line 61
    .line 62
    check-cast v3, Lza4;

    .line 63
    .line 64
    new-instance v4, Lza4;

    .line 65
    .line 66
    iget-object v5, v3, Lza4;->a:Ljava/lang/Object;

    .line 67
    .line 68
    iget-object v3, v3, Lza4;->b:Ljava/lang/Object;

    .line 69
    .line 70
    invoke-direct {v4, v5, v3, p1}, Lza4;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 71
    .line 72
    .line 73
    invoke-virtual {v0, v1, v4}, Lol5;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 74
    .line 75
    .line 76
    new-instance v3, Lza4;

    .line 77
    .line 78
    invoke-direct {v3, p2, v1}, Lza4;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 79
    .line 80
    .line 81
    invoke-virtual {v0, p1, v3}, Lol5;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 82
    .line 83
    .line 84
    iput-object p1, p0, Lem5;->Z:Ljava/lang/Object;

    .line 85
    .line 86
    return-object v2
.end method

.method public final remove(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    .line 1
    iget-object v0, p0, Lem5;->f0:Lol5;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Lol5;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    check-cast p1, Lza4;

    .line 8
    .line 9
    const/4 v1, 0x0

    .line 10
    if-nez p1, :cond_0

    .line 11
    .line 12
    return-object v1

    .line 13
    :cond_0
    iget-object v2, p1, Lza4;->c:Ljava/lang/Object;

    .line 14
    .line 15
    iget-object v3, p1, Lza4;->b:Ljava/lang/Object;

    .line 16
    .line 17
    iput-object v1, p0, Lem5;->X:Ldm5;

    .line 18
    .line 19
    sget-object v1, Lpz2;->N0:Lpz2;

    .line 20
    .line 21
    if-eq v3, v1, :cond_1

    .line 22
    .line 23
    invoke-virtual {v0, v3}, Lol5;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    move-result-object v4

    .line 27
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 28
    .line 29
    .line 30
    check-cast v4, Lza4;

    .line 31
    .line 32
    new-instance v5, Lza4;

    .line 33
    .line 34
    iget-object v6, v4, Lza4;->a:Ljava/lang/Object;

    .line 35
    .line 36
    iget-object v4, v4, Lza4;->b:Ljava/lang/Object;

    .line 37
    .line 38
    invoke-direct {v5, v6, v4, v2}, Lza4;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 39
    .line 40
    .line 41
    invoke-virtual {v0, v3, v5}, Lol5;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 42
    .line 43
    .line 44
    goto :goto_0

    .line 45
    :cond_1
    iput-object v2, p0, Lem5;->Y:Ljava/lang/Object;

    .line 46
    .line 47
    :goto_0
    if-eq v2, v1, :cond_2

    .line 48
    .line 49
    invoke-virtual {v0, v2}, Lol5;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 50
    .line 51
    .line 52
    move-result-object p0

    .line 53
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 54
    .line 55
    .line 56
    check-cast p0, Lza4;

    .line 57
    .line 58
    new-instance v1, Lza4;

    .line 59
    .line 60
    iget-object v4, p0, Lza4;->a:Ljava/lang/Object;

    .line 61
    .line 62
    iget-object p0, p0, Lza4;->c:Ljava/lang/Object;

    .line 63
    .line 64
    invoke-direct {v1, v4, v3, p0}, Lza4;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 65
    .line 66
    .line 67
    invoke-virtual {v0, v2, v1}, Lol5;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 68
    .line 69
    .line 70
    goto :goto_1

    .line 71
    :cond_2
    iput-object v3, p0, Lem5;->Z:Ljava/lang/Object;

    .line 72
    .line 73
    :goto_1
    iget-object p0, p1, Lza4;->a:Ljava/lang/Object;

    .line 74
    .line 75
    return-object p0
.end method

.method public final remove(Ljava/lang/Object;Ljava/lang/Object;)Z
    .locals 1

    .line 76
    iget-object v0, p0, Lem5;->f0:Lol5;

    invoke-virtual {v0, p1}, Lol5;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lza4;

    if-nez v0, :cond_0

    goto :goto_0

    .line 77
    :cond_0
    iget-object v0, v0, Lza4;->a:Ljava/lang/Object;

    .line 78
    invoke-static {v0, p2}, Ldh3;->f(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p2

    if-nez p2, :cond_1

    :goto_0
    const/4 p0, 0x0

    return p0

    .line 79
    :cond_1
    invoke-virtual {p0, p1}, Lem5;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    const/4 p0, 0x1

    return p0
.end method
