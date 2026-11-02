.class public final Lll5;
.super Lb2;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"

# interfaces
.implements Lcm5;


# static fields
.field public static final Z:Lll5;


# instance fields
.field public final X:Lif8;

.field public final Y:I


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 1
    new-instance v0, Lll5;

    .line 2
    .line 3
    sget-object v1, Lif8;->e:Lif8;

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    invoke-direct {v0, v1, v2}, Lll5;-><init>(Lif8;I)V

    .line 7
    .line 8
    .line 9
    sput-object v0, Lll5;->Z:Lll5;

    .line 10
    .line 11
    return-void
.end method

.method public constructor <init>(Lif8;I)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-object p1, p0, Lll5;->X:Lif8;

    .line 8
    .line 9
    iput p2, p0, Lll5;->Y:I

    .line 10
    .line 11
    return-void
.end method


# virtual methods
.method public final a()Ljava/util/Set;
    .locals 2

    .line 1
    new-instance v0, Lxl5;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, p0, v1}, Lxl5;-><init>(Lll5;B)V

    .line 5
    .line 6
    .line 7
    return-object v0
.end method

.method public final b()Ljava/util/Set;
    .locals 2

    .line 1
    new-instance v0, Lxl5;

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    invoke-direct {v0, p0, v1}, Lxl5;-><init>(Lll5;B)V

    .line 5
    .line 6
    .line 7
    return-object v0
.end method

.method public final c()I
    .locals 0

    .line 1
    iget p0, p0, Lll5;->Y:I

    .line 2
    .line 3
    return p0
.end method

.method public final containsKey(Ljava/lang/Object;)Z
    .locals 2

    .line 1
    const/4 v0, 0x0

    .line 2
    if-eqz p1, :cond_0

    .line 3
    .line 4
    invoke-virtual {p1}, Ljava/lang/Object;->hashCode()I

    .line 5
    .line 6
    .line 7
    move-result v1

    .line 8
    goto :goto_0

    .line 9
    :cond_0
    move v1, v0

    .line 10
    :goto_0
    iget-object p0, p0, Lll5;->X:Lif8;

    .line 11
    .line 12
    invoke-virtual {p0, v1, v0, p1}, Lif8;->d(IILjava/lang/Object;)Z

    .line 13
    .line 14
    .line 15
    move-result p0

    .line 16
    return p0
.end method

.method public final d(Landroid/os/Parcelable;Ljava/lang/Object;)Lcm5;
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2}, Lll5;->f(Ljava/lang/Object;Ljava/lang/Object;)Lll5;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 3

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
    move-object v0, p1

    .line 11
    check-cast v0, Ljava/util/Map;

    .line 12
    .line 13
    invoke-interface {v0}, Ljava/util/Map;->size()I

    .line 14
    .line 15
    .line 16
    move-result v1

    .line 17
    iget v2, p0, Lll5;->Y:I

    .line 18
    .line 19
    if-eq v2, v1, :cond_2

    .line 20
    .line 21
    :goto_0
    const/4 p0, 0x0

    .line 22
    return p0

    .line 23
    :cond_2
    instance-of v1, v0, Ldm5;

    .line 24
    .line 25
    iget-object v2, p0, Lll5;->X:Lif8;

    .line 26
    .line 27
    if-eqz v1, :cond_3

    .line 28
    .line 29
    check-cast p1, Ldm5;

    .line 30
    .line 31
    iget-object p0, p1, Ldm5;->Z:Lll5;

    .line 32
    .line 33
    iget-object p0, p0, Lll5;->X:Lif8;

    .line 34
    .line 35
    new-instance p1, Lnw2;

    .line 36
    .line 37
    const/16 v0, 0x8

    .line 38
    .line 39
    invoke-direct {p1, v0}, Lnw2;-><init>(B)V

    .line 40
    .line 41
    .line 42
    invoke-virtual {v2, p0, p1}, Lif8;->g(Lif8;Lrn2;)Z

    .line 43
    .line 44
    .line 45
    move-result p0

    .line 46
    return p0

    .line 47
    :cond_3
    instance-of v1, v0, Lem5;

    .line 48
    .line 49
    if-eqz v1, :cond_4

    .line 50
    .line 51
    check-cast p1, Lem5;

    .line 52
    .line 53
    iget-object p0, p1, Lem5;->f0:Lol5;

    .line 54
    .line 55
    iget-object p0, p0, Lol5;->Z:Lif8;

    .line 56
    .line 57
    new-instance p1, Lnw2;

    .line 58
    .line 59
    const/16 v0, 0x9

    .line 60
    .line 61
    invoke-direct {p1, v0}, Lnw2;-><init>(B)V

    .line 62
    .line 63
    .line 64
    invoke-virtual {v2, p0, p1}, Lif8;->g(Lif8;Lrn2;)Z

    .line 65
    .line 66
    .line 67
    move-result p0

    .line 68
    return p0

    .line 69
    :cond_4
    instance-of v1, v0, Lll5;

    .line 70
    .line 71
    if-eqz v1, :cond_5

    .line 72
    .line 73
    check-cast p1, Lll5;

    .line 74
    .line 75
    iget-object p0, p1, Lll5;->X:Lif8;

    .line 76
    .line 77
    new-instance p1, Lnw2;

    .line 78
    .line 79
    const/16 v0, 0xa

    .line 80
    .line 81
    invoke-direct {p1, v0}, Lnw2;-><init>(B)V

    .line 82
    .line 83
    .line 84
    invoke-virtual {v2, p0, p1}, Lif8;->g(Lif8;Lrn2;)Z

    .line 85
    .line 86
    .line 87
    move-result p0

    .line 88
    return p0

    .line 89
    :cond_5
    instance-of v0, v0, Lol5;

    .line 90
    .line 91
    if-eqz v0, :cond_6

    .line 92
    .line 93
    check-cast p1, Lol5;

    .line 94
    .line 95
    iget-object p0, p1, Lol5;->Z:Lif8;

    .line 96
    .line 97
    new-instance p1, Lnw2;

    .line 98
    .line 99
    const/16 v0, 0xb

    .line 100
    .line 101
    invoke-direct {p1, v0}, Lnw2;-><init>(B)V

    .line 102
    .line 103
    .line 104
    invoke-virtual {v2, p0, p1}, Lif8;->g(Lif8;Lrn2;)Z

    .line 105
    .line 106
    .line 107
    move-result p0

    .line 108
    return p0

    .line 109
    :cond_6
    invoke-super {p0, p1}, Lb2;->equals(Ljava/lang/Object;)Z

    .line 110
    .line 111
    .line 112
    move-result p0

    .line 113
    return p0
.end method

.method public final f(Ljava/lang/Object;Ljava/lang/Object;)Lll5;
    .locals 3

    .line 1
    const/4 v0, 0x0

    .line 2
    if-eqz p1, :cond_0

    .line 3
    .line 4
    invoke-virtual {p1}, Ljava/lang/Object;->hashCode()I

    .line 5
    .line 6
    .line 7
    move-result v1

    .line 8
    goto :goto_0

    .line 9
    :cond_0
    move v1, v0

    .line 10
    :goto_0
    iget-object v2, p0, Lll5;->X:Lif8;

    .line 11
    .line 12
    invoke-virtual {v2, v1, v0, p1, p2}, Lif8;->v(IILjava/lang/Object;Ljava/lang/Object;)Lh70;

    .line 13
    .line 14
    .line 15
    move-result-object p1

    .line 16
    if-nez p1, :cond_1

    .line 17
    .line 18
    return-object p0

    .line 19
    :cond_1
    new-instance p2, Lll5;

    .line 20
    .line 21
    iget-object v0, p1, Lh70;->Z:Ljava/lang/Object;

    .line 22
    .line 23
    check-cast v0, Lif8;

    .line 24
    .line 25
    iget p0, p0, Lll5;->Y:I

    .line 26
    .line 27
    iget-boolean p1, p1, Lh70;->Y:Z

    .line 28
    .line 29
    add-int/2addr p0, p1

    .line 30
    invoke-direct {p2, v0, p0}, Lll5;-><init>(Lif8;I)V

    .line 31
    .line 32
    .line 33
    return-object p2
.end method

.method public final g(Ljava/lang/Object;)Lll5;
    .locals 3

    .line 1
    const/4 v0, 0x0

    .line 2
    if-eqz p1, :cond_0

    .line 3
    .line 4
    invoke-virtual {p1}, Ljava/lang/Object;->hashCode()I

    .line 5
    .line 6
    .line 7
    move-result v1

    .line 8
    goto :goto_0

    .line 9
    :cond_0
    move v1, v0

    .line 10
    :goto_0
    iget-object v2, p0, Lll5;->X:Lif8;

    .line 11
    .line 12
    invoke-virtual {v2, v1, v0, p1}, Lif8;->w(IILjava/lang/Object;)Lif8;

    .line 13
    .line 14
    .line 15
    move-result-object p1

    .line 16
    if-ne v2, p1, :cond_1

    .line 17
    .line 18
    return-object p0

    .line 19
    :cond_1
    if-nez p1, :cond_2

    .line 20
    .line 21
    sget-object p0, Lll5;->Z:Lll5;

    .line 22
    .line 23
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 24
    .line 25
    .line 26
    return-object p0

    .line 27
    :cond_2
    new-instance v0, Lll5;

    .line 28
    .line 29
    invoke-virtual {p0}, Lll5;->c()I

    .line 30
    .line 31
    .line 32
    move-result p0

    .line 33
    add-int/lit8 p0, p0, -0x1

    .line 34
    .line 35
    invoke-direct {v0, p1, p0}, Lll5;-><init>(Lif8;I)V

    .line 36
    .line 37
    .line 38
    return-object v0
.end method

.method public final get(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    .line 1
    const/4 v0, 0x0

    .line 2
    if-eqz p1, :cond_0

    .line 3
    .line 4
    invoke-virtual {p1}, Ljava/lang/Object;->hashCode()I

    .line 5
    .line 6
    .line 7
    move-result v1

    .line 8
    goto :goto_0

    .line 9
    :cond_0
    move v1, v0

    .line 10
    :goto_0
    iget-object p0, p0, Lll5;->X:Lif8;

    .line 11
    .line 12
    invoke-virtual {p0, v1, v0, p1}, Lif8;->h(IILjava/lang/Object;)Ljava/lang/Object;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    return-object p0
.end method

.method public final l(Landroid/os/Parcelable;)Lcm5;
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lll5;->g(Ljava/lang/Object;)Lll5;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method
