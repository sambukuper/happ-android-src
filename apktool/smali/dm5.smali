.class public final Ldm5;
.super Lb2;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"

# interfaces
.implements Lcm5;


# static fields
.field public static final f0:Ldm5;


# instance fields
.field public final X:Ljava/lang/Object;

.field public final Y:Ljava/lang/Object;

.field public final Z:Lll5;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 1
    new-instance v0, Ldm5;

    .line 2
    .line 3
    sget-object v1, Lpz2;->N0:Lpz2;

    .line 4
    .line 5
    sget-object v2, Lll5;->Z:Lll5;

    .line 6
    .line 7
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    invoke-direct {v0, v1, v1, v2}, Ldm5;-><init>(Ljava/lang/Object;Ljava/lang/Object;Lll5;)V

    .line 11
    .line 12
    .line 13
    sput-object v0, Ldm5;->f0:Ldm5;

    .line 14
    .line 15
    return-void
.end method

.method public constructor <init>(Ljava/lang/Object;Ljava/lang/Object;Lll5;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Ldm5;->X:Ljava/lang/Object;

    .line 5
    .line 6
    iput-object p2, p0, Ldm5;->Y:Ljava/lang/Object;

    .line 7
    .line 8
    iput-object p3, p0, Ldm5;->Z:Lll5;

    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final a()Ljava/util/Set;
    .locals 2

    .line 1
    new-instance v0, Lhm5;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, p0, v1}, Lhm5;-><init>(Ldm5;B)V

    .line 5
    .line 6
    .line 7
    return-object v0
.end method

.method public final b()Ljava/util/Set;
    .locals 2

    .line 1
    new-instance v0, Lhm5;

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    invoke-direct {v0, p0, v1}, Lhm5;-><init>(Ldm5;B)V

    .line 5
    .line 6
    .line 7
    return-object v0
.end method

.method public final c()I
    .locals 0

    .line 1
    iget-object p0, p0, Ldm5;->Z:Lll5;

    .line 2
    .line 3
    invoke-virtual {p0}, Lll5;->c()I

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    return p0
.end method

.method public final containsKey(Ljava/lang/Object;)Z
    .locals 0

    .line 1
    iget-object p0, p0, Ldm5;->Z:Lll5;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Lll5;->containsKey(Ljava/lang/Object;)Z

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    return p0
.end method

.method public final d(Landroid/os/Parcelable;Ljava/lang/Object;)Lcm5;
    .locals 5

    .line 1
    invoke-virtual {p0}, Lb2;->isEmpty()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    iget-object v1, p0, Ldm5;->Z:Lll5;

    .line 6
    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    new-instance p0, Lza4;

    .line 10
    .line 11
    invoke-direct {p0, p2}, Lza4;-><init>(Ljava/lang/Object;)V

    .line 12
    .line 13
    .line 14
    invoke-virtual {v1, p1, p0}, Lll5;->f(Ljava/lang/Object;Ljava/lang/Object;)Lll5;

    .line 15
    .line 16
    .line 17
    move-result-object p0

    .line 18
    new-instance p2, Ldm5;

    .line 19
    .line 20
    invoke-direct {p2, p1, p1, p0}, Ldm5;-><init>(Ljava/lang/Object;Ljava/lang/Object;Lll5;)V

    .line 21
    .line 22
    .line 23
    return-object p2

    .line 24
    :cond_0
    invoke-virtual {v1, p1}, Lll5;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    move-result-object v0

    .line 28
    check-cast v0, Lza4;

    .line 29
    .line 30
    iget-object v2, p0, Ldm5;->Y:Ljava/lang/Object;

    .line 31
    .line 32
    iget-object v3, p0, Ldm5;->X:Ljava/lang/Object;

    .line 33
    .line 34
    if-eqz v0, :cond_2

    .line 35
    .line 36
    iget-object v4, v0, Lza4;->a:Ljava/lang/Object;

    .line 37
    .line 38
    if-ne v4, p2, :cond_1

    .line 39
    .line 40
    return-object p0

    .line 41
    :cond_1
    new-instance p0, Lza4;

    .line 42
    .line 43
    iget-object v4, v0, Lza4;->b:Ljava/lang/Object;

    .line 44
    .line 45
    iget-object v0, v0, Lza4;->c:Ljava/lang/Object;

    .line 46
    .line 47
    invoke-direct {p0, p2, v4, v0}, Lza4;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 48
    .line 49
    .line 50
    invoke-virtual {v1, p1, p0}, Lll5;->f(Ljava/lang/Object;Ljava/lang/Object;)Lll5;

    .line 51
    .line 52
    .line 53
    move-result-object p0

    .line 54
    new-instance p1, Ldm5;

    .line 55
    .line 56
    invoke-direct {p1, v3, v2, p0}, Ldm5;-><init>(Ljava/lang/Object;Ljava/lang/Object;Lll5;)V

    .line 57
    .line 58
    .line 59
    return-object p1

    .line 60
    :cond_2
    invoke-virtual {v1, v2}, Lll5;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 61
    .line 62
    .line 63
    move-result-object p0

    .line 64
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 65
    .line 66
    .line 67
    check-cast p0, Lza4;

    .line 68
    .line 69
    new-instance v0, Lza4;

    .line 70
    .line 71
    iget-object v4, p0, Lza4;->a:Ljava/lang/Object;

    .line 72
    .line 73
    iget-object p0, p0, Lza4;->b:Ljava/lang/Object;

    .line 74
    .line 75
    invoke-direct {v0, v4, p0, p1}, Lza4;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 76
    .line 77
    .line 78
    invoke-virtual {v1, v2, v0}, Lll5;->f(Ljava/lang/Object;Ljava/lang/Object;)Lll5;

    .line 79
    .line 80
    .line 81
    move-result-object p0

    .line 82
    new-instance v0, Lza4;

    .line 83
    .line 84
    invoke-direct {v0, p2, v2}, Lza4;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 85
    .line 86
    .line 87
    invoke-virtual {p0, p1, v0}, Lll5;->f(Ljava/lang/Object;Ljava/lang/Object;)Lll5;

    .line 88
    .line 89
    .line 90
    move-result-object p0

    .line 91
    new-instance p2, Ldm5;

    .line 92
    .line 93
    invoke-direct {p2, v3, p1, p0}, Ldm5;-><init>(Ljava/lang/Object;Ljava/lang/Object;Lll5;)V

    .line 94
    .line 95
    .line 96
    return-object p2
.end method

.method public final e()Ljava/util/Collection;
    .locals 2

    .line 1
    new-instance v0, Lbm5;

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    invoke-direct {v0, p0, v1}, Lbm5;-><init>(Lb2;B)V

    .line 5
    .line 6
    .line 7
    return-object v0
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 4

    .line 1
    iget-object v0, p0, Ldm5;->Z:Lll5;

    .line 2
    .line 3
    iget-object v1, v0, Lll5;->X:Lif8;

    .line 4
    .line 5
    if-ne p1, p0, :cond_0

    .line 6
    .line 7
    const/4 p0, 0x1

    .line 8
    return p0

    .line 9
    :cond_0
    instance-of v2, p1, Ljava/util/Map;

    .line 10
    .line 11
    if-nez v2, :cond_1

    .line 12
    .line 13
    goto :goto_0

    .line 14
    :cond_1
    invoke-virtual {v0}, Lll5;->c()I

    .line 15
    .line 16
    .line 17
    move-result v0

    .line 18
    move-object v2, p1

    .line 19
    check-cast v2, Ljava/util/Map;

    .line 20
    .line 21
    invoke-interface {v2}, Ljava/util/Map;->size()I

    .line 22
    .line 23
    .line 24
    move-result v3

    .line 25
    if-eq v0, v3, :cond_2

    .line 26
    .line 27
    :goto_0
    const/4 p0, 0x0

    .line 28
    return p0

    .line 29
    :cond_2
    instance-of v0, v2, Ldm5;

    .line 30
    .line 31
    if-eqz v0, :cond_3

    .line 32
    .line 33
    check-cast p1, Ldm5;

    .line 34
    .line 35
    iget-object p0, p1, Ldm5;->Z:Lll5;

    .line 36
    .line 37
    iget-object p0, p0, Lll5;->X:Lif8;

    .line 38
    .line 39
    new-instance p1, Lnw2;

    .line 40
    .line 41
    const/16 v0, 0x10

    .line 42
    .line 43
    invoke-direct {p1, v0}, Lnw2;-><init>(B)V

    .line 44
    .line 45
    .line 46
    invoke-virtual {v1, p0, p1}, Lif8;->g(Lif8;Lrn2;)Z

    .line 47
    .line 48
    .line 49
    move-result p0

    .line 50
    return p0

    .line 51
    :cond_3
    instance-of v0, v2, Lem5;

    .line 52
    .line 53
    if-eqz v0, :cond_4

    .line 54
    .line 55
    check-cast p1, Lem5;

    .line 56
    .line 57
    iget-object p0, p1, Lem5;->f0:Lol5;

    .line 58
    .line 59
    iget-object p0, p0, Lol5;->Z:Lif8;

    .line 60
    .line 61
    new-instance p1, Lnw2;

    .line 62
    .line 63
    const/16 v0, 0x11

    .line 64
    .line 65
    invoke-direct {p1, v0}, Lnw2;-><init>(B)V

    .line 66
    .line 67
    .line 68
    invoke-virtual {v1, p0, p1}, Lif8;->g(Lif8;Lrn2;)Z

    .line 69
    .line 70
    .line 71
    move-result p0

    .line 72
    return p0

    .line 73
    :cond_4
    instance-of v0, v2, Lll5;

    .line 74
    .line 75
    if-eqz v0, :cond_5

    .line 76
    .line 77
    check-cast p1, Lll5;

    .line 78
    .line 79
    iget-object p0, p1, Lll5;->X:Lif8;

    .line 80
    .line 81
    new-instance p1, Lnw2;

    .line 82
    .line 83
    const/16 v0, 0x12

    .line 84
    .line 85
    invoke-direct {p1, v0}, Lnw2;-><init>(B)V

    .line 86
    .line 87
    .line 88
    invoke-virtual {v1, p0, p1}, Lif8;->g(Lif8;Lrn2;)Z

    .line 89
    .line 90
    .line 91
    move-result p0

    .line 92
    return p0

    .line 93
    :cond_5
    instance-of v0, v2, Lol5;

    .line 94
    .line 95
    if-eqz v0, :cond_6

    .line 96
    .line 97
    check-cast p1, Lol5;

    .line 98
    .line 99
    iget-object p0, p1, Lol5;->Z:Lif8;

    .line 100
    .line 101
    new-instance p1, Lnw2;

    .line 102
    .line 103
    const/16 v0, 0x13

    .line 104
    .line 105
    invoke-direct {p1, v0}, Lnw2;-><init>(B)V

    .line 106
    .line 107
    .line 108
    invoke-virtual {v1, p0, p1}, Lif8;->g(Lif8;Lrn2;)Z

    .line 109
    .line 110
    .line 111
    move-result p0

    .line 112
    return p0

    .line 113
    :cond_6
    invoke-super {p0, p1}, Lb2;->equals(Ljava/lang/Object;)Z

    .line 114
    .line 115
    .line 116
    move-result p0

    .line 117
    return p0
.end method

.method public final get(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    iget-object p0, p0, Ldm5;->Z:Lll5;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Lll5;->get(Ljava/lang/Object;)Ljava/lang/Object;

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

.method public final l(Landroid/os/Parcelable;)Lcm5;
    .locals 6

    .line 1
    iget-object v0, p0, Ldm5;->Z:Lll5;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Lll5;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    check-cast v1, Lza4;

    .line 8
    .line 9
    if-nez v1, :cond_0

    .line 10
    .line 11
    return-object p0

    .line 12
    :cond_0
    iget-object v2, v1, Lza4;->b:Ljava/lang/Object;

    .line 13
    .line 14
    iget-object v1, v1, Lza4;->c:Ljava/lang/Object;

    .line 15
    .line 16
    invoke-virtual {v0, p1}, Lll5;->g(Ljava/lang/Object;)Lll5;

    .line 17
    .line 18
    .line 19
    move-result-object p1

    .line 20
    sget-object v0, Lpz2;->N0:Lpz2;

    .line 21
    .line 22
    if-eq v2, v0, :cond_1

    .line 23
    .line 24
    invoke-virtual {p1, v2}, Lll5;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    move-result-object v3

    .line 28
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 29
    .line 30
    .line 31
    check-cast v3, Lza4;

    .line 32
    .line 33
    new-instance v4, Lza4;

    .line 34
    .line 35
    iget-object v5, v3, Lza4;->a:Ljava/lang/Object;

    .line 36
    .line 37
    iget-object v3, v3, Lza4;->b:Ljava/lang/Object;

    .line 38
    .line 39
    invoke-direct {v4, v5, v3, v1}, Lza4;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 40
    .line 41
    .line 42
    invoke-virtual {p1, v2, v4}, Lll5;->f(Ljava/lang/Object;Ljava/lang/Object;)Lll5;

    .line 43
    .line 44
    .line 45
    move-result-object p1

    .line 46
    :cond_1
    if-eq v1, v0, :cond_2

    .line 47
    .line 48
    invoke-virtual {p1, v1}, Lll5;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 49
    .line 50
    .line 51
    move-result-object v3

    .line 52
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 53
    .line 54
    .line 55
    check-cast v3, Lza4;

    .line 56
    .line 57
    new-instance v4, Lza4;

    .line 58
    .line 59
    iget-object v5, v3, Lza4;->a:Ljava/lang/Object;

    .line 60
    .line 61
    iget-object v3, v3, Lza4;->c:Ljava/lang/Object;

    .line 62
    .line 63
    invoke-direct {v4, v5, v2, v3}, Lza4;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 64
    .line 65
    .line 66
    invoke-virtual {p1, v1, v4}, Lll5;->f(Ljava/lang/Object;Ljava/lang/Object;)Lll5;

    .line 67
    .line 68
    .line 69
    move-result-object p1

    .line 70
    :cond_2
    if-eq v2, v0, :cond_3

    .line 71
    .line 72
    iget-object v3, p0, Ldm5;->X:Ljava/lang/Object;

    .line 73
    .line 74
    goto :goto_0

    .line 75
    :cond_3
    move-object v3, v1

    .line 76
    :goto_0
    if-eq v1, v0, :cond_4

    .line 77
    .line 78
    iget-object v2, p0, Ldm5;->Y:Ljava/lang/Object;

    .line 79
    .line 80
    :cond_4
    new-instance p0, Ldm5;

    .line 81
    .line 82
    invoke-direct {p0, v3, v2, p1}, Ldm5;-><init>(Ljava/lang/Object;Ljava/lang/Object;Lll5;)V

    .line 83
    .line 84
    .line 85
    return-object p0
.end method
