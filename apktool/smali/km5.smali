.class public final Lkm5;
.super Lz2;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"

# interfaces
.implements Lc83;
.implements Lx73;


# static fields
.field public static final f0:Lkm5;


# instance fields
.field public final X:Ljava/lang/Object;

.field public final Y:Ljava/lang/Object;

.field public final Z:Lll5;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 1
    new-instance v0, Lkm5;

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
    invoke-direct {v0, v1, v1, v2}, Lkm5;-><init>(Ljava/lang/Object;Ljava/lang/Object;Lll5;)V

    .line 11
    .line 12
    .line 13
    sput-object v0, Lkm5;->f0:Lkm5;

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
    iput-object p1, p0, Lkm5;->X:Ljava/lang/Object;

    .line 5
    .line 6
    iput-object p2, p0, Lkm5;->Y:Ljava/lang/Object;

    .line 7
    .line 8
    iput-object p3, p0, Lkm5;->Z:Lll5;

    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final a()I
    .locals 0

    .line 1
    iget-object p0, p0, Lkm5;->Z:Lll5;

    .line 2
    .line 3
    iget p0, p0, Lll5;->Y:I

    .line 4
    .line 5
    return p0
.end method

.method public final b(Ljava/lang/String;)Lkm5;
    .locals 4

    .line 1
    iget-object v0, p0, Lkm5;->Z:Lll5;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Lll5;->containsKey(Ljava/lang/Object;)Z

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    if-eqz v1, :cond_0

    .line 8
    .line 9
    return-object p0

    .line 10
    :cond_0
    invoke-virtual {p0}, Lz0;->isEmpty()Z

    .line 11
    .line 12
    .line 13
    move-result v1

    .line 14
    if-eqz v1, :cond_1

    .line 15
    .line 16
    new-instance p0, Lab4;

    .line 17
    .line 18
    invoke-direct {p0}, Lab4;-><init>()V

    .line 19
    .line 20
    .line 21
    invoke-virtual {v0, p1, p0}, Lll5;->f(Ljava/lang/Object;Ljava/lang/Object;)Lll5;

    .line 22
    .line 23
    .line 24
    move-result-object p0

    .line 25
    new-instance v0, Lkm5;

    .line 26
    .line 27
    invoke-direct {v0, p1, p1, p0}, Lkm5;-><init>(Ljava/lang/Object;Ljava/lang/Object;Lll5;)V

    .line 28
    .line 29
    .line 30
    return-object v0

    .line 31
    :cond_1
    iget-object v1, p0, Lkm5;->Y:Ljava/lang/Object;

    .line 32
    .line 33
    invoke-virtual {v0, v1}, Lll5;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 34
    .line 35
    .line 36
    move-result-object v2

    .line 37
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 38
    .line 39
    .line 40
    check-cast v2, Lab4;

    .line 41
    .line 42
    new-instance v3, Lab4;

    .line 43
    .line 44
    iget-object v2, v2, Lab4;->a:Ljava/lang/Object;

    .line 45
    .line 46
    invoke-direct {v3, v2, p1}, Lab4;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 47
    .line 48
    .line 49
    invoke-virtual {v0, v1, v3}, Lll5;->f(Ljava/lang/Object;Ljava/lang/Object;)Lll5;

    .line 50
    .line 51
    .line 52
    move-result-object v0

    .line 53
    new-instance v2, Lab4;

    .line 54
    .line 55
    invoke-direct {v2, v1}, Lab4;-><init>(Ljava/lang/Object;)V

    .line 56
    .line 57
    .line 58
    invoke-virtual {v0, p1, v2}, Lll5;->f(Ljava/lang/Object;Ljava/lang/Object;)Lll5;

    .line 59
    .line 60
    .line 61
    move-result-object v0

    .line 62
    new-instance v1, Lkm5;

    .line 63
    .line 64
    iget-object p0, p0, Lkm5;->X:Ljava/lang/Object;

    .line 65
    .line 66
    invoke-direct {v1, p0, p1, v0}, Lkm5;-><init>(Ljava/lang/Object;Ljava/lang/Object;Lll5;)V

    .line 67
    .line 68
    .line 69
    return-object v1
.end method

.method public final contains(Ljava/lang/Object;)Z
    .locals 0

    .line 1
    iget-object p0, p0, Lkm5;->Z:Lll5;

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

.method public final equals(Ljava/lang/Object;)Z
    .locals 4

    .line 1
    iget-object v0, p0, Lkm5;->Z:Lll5;

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
    instance-of v2, p1, Ljava/util/Set;

    .line 10
    .line 11
    if-nez v2, :cond_1

    .line 12
    .line 13
    goto :goto_0

    .line 14
    :cond_1
    iget v0, v0, Lll5;->Y:I

    .line 15
    .line 16
    move-object v2, p1

    .line 17
    check-cast v2, Ljava/util/Set;

    .line 18
    .line 19
    invoke-interface {v2}, Ljava/util/Set;->size()I

    .line 20
    .line 21
    .line 22
    move-result v3

    .line 23
    if-eq v0, v3, :cond_2

    .line 24
    .line 25
    :goto_0
    const/4 p0, 0x0

    .line 26
    return p0

    .line 27
    :cond_2
    instance-of v0, v2, Lkm5;

    .line 28
    .line 29
    if-eqz v0, :cond_3

    .line 30
    .line 31
    check-cast p1, Lkm5;

    .line 32
    .line 33
    iget-object p0, p1, Lkm5;->Z:Lll5;

    .line 34
    .line 35
    iget-object p0, p0, Lll5;->X:Lif8;

    .line 36
    .line 37
    new-instance p1, Lnw2;

    .line 38
    .line 39
    const/16 v0, 0x18

    .line 40
    .line 41
    invoke-direct {p1, v0}, Lnw2;-><init>(B)V

    .line 42
    .line 43
    .line 44
    invoke-virtual {v1, p0, p1}, Lif8;->g(Lif8;Lrn2;)Z

    .line 45
    .line 46
    .line 47
    move-result p0

    .line 48
    return p0

    .line 49
    :cond_3
    instance-of v0, v2, Lmm5;

    .line 50
    .line 51
    if-eqz v0, :cond_4

    .line 52
    .line 53
    check-cast p1, Lmm5;

    .line 54
    .line 55
    iget-object p0, p1, Lmm5;->f0:Lol5;

    .line 56
    .line 57
    iget-object p0, p0, Lol5;->Z:Lif8;

    .line 58
    .line 59
    new-instance p1, Lnw2;

    .line 60
    .line 61
    const/16 v0, 0x19

    .line 62
    .line 63
    invoke-direct {p1, v0}, Lnw2;-><init>(B)V

    .line 64
    .line 65
    .line 66
    invoke-virtual {v1, p0, p1}, Lif8;->g(Lif8;Lrn2;)Z

    .line 67
    .line 68
    .line 69
    move-result p0

    .line 70
    return p0

    .line 71
    :cond_4
    invoke-super {p0, p1}, Lz2;->equals(Ljava/lang/Object;)Z

    .line 72
    .line 73
    .line 74
    move-result p0

    .line 75
    return p0
.end method

.method public final iterator()Ljava/util/Iterator;
    .locals 3

    .line 1
    new-instance v0, Ljm5;

    .line 2
    .line 3
    iget-object v1, p0, Lkm5;->Z:Lll5;

    .line 4
    .line 5
    const/4 v2, 0x1

    .line 6
    iget-object p0, p0, Lkm5;->X:Ljava/lang/Object;

    .line 7
    .line 8
    invoke-direct {v0, p0, v1, v2}, Ljm5;-><init>(Ljava/lang/Object;Ljava/util/Map;B)V

    .line 9
    .line 10
    .line 11
    return-object v0
.end method
