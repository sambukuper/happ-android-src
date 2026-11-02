.class public final Ly66;
.super Ljava/lang/Object;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"


# instance fields
.field public final a:[Lwg;

.field public final b:I


# direct methods
.method public constructor <init>(Lc24;)V
    .locals 6

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iget-object p1, p1, Lc24;->X:Ljava/io/Serializable;

    .line 5
    .line 6
    check-cast p1, Lwu5;

    .line 7
    .line 8
    iget-object v0, p1, Lwu5;->X:Ljava/util/concurrent/ConcurrentHashMap;

    .line 9
    .line 10
    invoke-virtual {v0}, Ljava/util/concurrent/ConcurrentHashMap;->size()I

    .line 11
    .line 12
    .line 13
    move-result v0

    .line 14
    const/16 v1, 0x40

    .line 15
    .line 16
    if-gt v0, v1, :cond_0

    .line 17
    .line 18
    add-int/2addr v0, v0

    .line 19
    goto :goto_0

    .line 20
    :cond_0
    shr-int/lit8 v1, v0, 0x2

    .line 21
    .line 22
    add-int/2addr v0, v1

    .line 23
    :goto_0
    const/16 v1, 0x8

    .line 24
    .line 25
    :goto_1
    if-ge v1, v0, :cond_1

    .line 26
    .line 27
    add-int/2addr v1, v1

    .line 28
    goto :goto_1

    .line 29
    :cond_1
    add-int/lit8 v0, v1, -0x1

    .line 30
    .line 31
    iput v0, p0, Ly66;->b:I

    .line 32
    .line 33
    new-array v0, v1, [Lwg;

    .line 34
    .line 35
    invoke-virtual {p1}, Lwu5;->entrySet()Ljava/util/Set;

    .line 36
    .line 37
    .line 38
    move-result-object p1

    .line 39
    check-cast p1, Lru5;

    .line 40
    .line 41
    invoke-virtual {p1}, Lru5;->iterator()Ljava/util/Iterator;

    .line 42
    .line 43
    .line 44
    move-result-object p1

    .line 45
    :goto_2
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 46
    .line 47
    .line 48
    move-result v1

    .line 49
    if-eqz v1, :cond_2

    .line 50
    .line 51
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 52
    .line 53
    .line 54
    move-result-object v1

    .line 55
    check-cast v1, Ljava/util/Map$Entry;

    .line 56
    .line 57
    invoke-interface {v1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 58
    .line 59
    .line 60
    move-result-object v2

    .line 61
    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 62
    .line 63
    .line 64
    move-result-object v1

    .line 65
    check-cast v2, Ldi8;

    .line 66
    .line 67
    check-cast v1, Lar3;

    .line 68
    .line 69
    iget v3, v2, Ldi8;->a:I

    .line 70
    .line 71
    iget v4, p0, Ly66;->b:I

    .line 72
    .line 73
    and-int/2addr v3, v4

    .line 74
    new-instance v4, Lwg;

    .line 75
    .line 76
    aget-object v5, v0, v3

    .line 77
    .line 78
    invoke-direct {v4}, Ljava/lang/Object;-><init>()V

    .line 79
    .line 80
    .line 81
    iput-object v5, v4, Lwg;->c:Ljava/lang/Object;

    .line 82
    .line 83
    iput-object v1, v4, Lwg;->b:Ljava/lang/Object;

    .line 84
    .line 85
    iget-boolean v1, v2, Ldi8;->d:Z

    .line 86
    .line 87
    iput-boolean v1, v4, Lwg;->a:Z

    .line 88
    .line 89
    iget-object v1, v2, Ldi8;->b:Ljava/lang/Class;

    .line 90
    .line 91
    iput-object v1, v4, Lwg;->d:Ljava/lang/Object;

    .line 92
    .line 93
    iget-object v1, v2, Ldi8;->c:Ldh8;

    .line 94
    .line 95
    iput-object v1, v4, Lwg;->e:Ljava/lang/Object;

    .line 96
    .line 97
    aput-object v4, v0, v3

    .line 98
    .line 99
    goto :goto_2

    .line 100
    :cond_2
    iput-object v0, p0, Ly66;->a:[Lwg;

    .line 101
    .line 102
    return-void
.end method


# virtual methods
.method public final a(Ldh8;)Lar3;
    .locals 2

    .line 1
    invoke-virtual {p1}, Ldh8;->hashCode()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    add-int/lit8 v0, v0, -0x1

    .line 6
    .line 7
    iget v1, p0, Ly66;->b:I

    .line 8
    .line 9
    and-int/2addr v0, v1

    .line 10
    iget-object p0, p0, Ly66;->a:[Lwg;

    .line 11
    .line 12
    aget-object p0, p0, v0

    .line 13
    .line 14
    if-nez p0, :cond_0

    .line 15
    .line 16
    goto :goto_0

    .line 17
    :cond_0
    iget-boolean v0, p0, Lwg;->a:Z

    .line 18
    .line 19
    if-nez v0, :cond_1

    .line 20
    .line 21
    iget-object v0, p0, Lwg;->e:Ljava/lang/Object;

    .line 22
    .line 23
    check-cast v0, Ldh8;

    .line 24
    .line 25
    invoke-virtual {p1, v0}, Ldh8;->equals(Ljava/lang/Object;)Z

    .line 26
    .line 27
    .line 28
    move-result v0

    .line 29
    if-eqz v0, :cond_1

    .line 30
    .line 31
    iget-object p0, p0, Lwg;->b:Ljava/lang/Object;

    .line 32
    .line 33
    check-cast p0, Lar3;

    .line 34
    .line 35
    return-object p0

    .line 36
    :cond_1
    iget-object p0, p0, Lwg;->c:Ljava/lang/Object;

    .line 37
    .line 38
    check-cast p0, Lwg;

    .line 39
    .line 40
    if-eqz p0, :cond_2

    .line 41
    .line 42
    iget-boolean v0, p0, Lwg;->a:Z

    .line 43
    .line 44
    if-nez v0, :cond_1

    .line 45
    .line 46
    iget-object v0, p0, Lwg;->e:Ljava/lang/Object;

    .line 47
    .line 48
    check-cast v0, Ldh8;

    .line 49
    .line 50
    invoke-virtual {p1, v0}, Ldh8;->equals(Ljava/lang/Object;)Z

    .line 51
    .line 52
    .line 53
    move-result v0

    .line 54
    if-eqz v0, :cond_1

    .line 55
    .line 56
    iget-object p0, p0, Lwg;->b:Ljava/lang/Object;

    .line 57
    .line 58
    check-cast p0, Lar3;

    .line 59
    .line 60
    return-object p0

    .line 61
    :cond_2
    :goto_0
    const/4 p0, 0x0

    .line 62
    return-object p0
.end method

.method public final b(Ljava/lang/Class;)Lar3;
    .locals 2

    .line 1
    invoke-virtual {p1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    iget v1, p0, Ly66;->b:I

    .line 10
    .line 11
    and-int/2addr v0, v1

    .line 12
    iget-object p0, p0, Ly66;->a:[Lwg;

    .line 13
    .line 14
    aget-object p0, p0, v0

    .line 15
    .line 16
    if-nez p0, :cond_0

    .line 17
    .line 18
    goto :goto_0

    .line 19
    :cond_0
    iget-object v0, p0, Lwg;->d:Ljava/lang/Object;

    .line 20
    .line 21
    check-cast v0, Ljava/lang/Class;

    .line 22
    .line 23
    if-ne v0, p1, :cond_1

    .line 24
    .line 25
    iget-boolean v0, p0, Lwg;->a:Z

    .line 26
    .line 27
    if-nez v0, :cond_1

    .line 28
    .line 29
    iget-object p0, p0, Lwg;->b:Ljava/lang/Object;

    .line 30
    .line 31
    check-cast p0, Lar3;

    .line 32
    .line 33
    return-object p0

    .line 34
    :cond_1
    iget-object p0, p0, Lwg;->c:Ljava/lang/Object;

    .line 35
    .line 36
    check-cast p0, Lwg;

    .line 37
    .line 38
    if-eqz p0, :cond_2

    .line 39
    .line 40
    iget-object v0, p0, Lwg;->d:Ljava/lang/Object;

    .line 41
    .line 42
    check-cast v0, Ljava/lang/Class;

    .line 43
    .line 44
    if-ne v0, p1, :cond_1

    .line 45
    .line 46
    iget-boolean v0, p0, Lwg;->a:Z

    .line 47
    .line 48
    if-nez v0, :cond_1

    .line 49
    .line 50
    iget-object p0, p0, Lwg;->b:Ljava/lang/Object;

    .line 51
    .line 52
    check-cast p0, Lar3;

    .line 53
    .line 54
    return-object p0

    .line 55
    :cond_2
    :goto_0
    const/4 p0, 0x0

    .line 56
    return-object p0
.end method
