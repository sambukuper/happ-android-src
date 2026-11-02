.class public final Ls69;
.super Ljava/lang/Object;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"

# interfaces
.implements Lz82;


# instance fields
.field public final a:Li1;

.field public final b:Ljava/lang/Integer;

.field public final c:Ljava/lang/Integer;

.field public final d:Ldg5;

.field public final e:Z


# direct methods
.method public constructor <init>(Ldg5;Z)V
    .locals 4

    .line 1
    sget-object v0, La79;->a:Lhq2;

    .line 2
    .line 3
    const/4 v1, 0x4

    .line 4
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 5
    .line 6
    .line 7
    move-result-object v2

    .line 8
    sget-object v3, Ldg5;->Y:Ldg5;

    .line 9
    .line 10
    if-ne p1, v3, :cond_0

    .line 11
    .line 12
    goto :goto_0

    .line 13
    :cond_0
    const/4 v1, 0x1

    .line 14
    :goto_0
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 15
    .line 16
    .line 17
    move-result-object v1

    .line 18
    sget-object v3, Ldg5;->Z:Ldg5;

    .line 19
    .line 20
    if-ne p1, v3, :cond_1

    .line 21
    .line 22
    goto :goto_1

    .line 23
    :cond_1
    const/4 v2, 0x0

    .line 24
    :goto_1
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 25
    .line 26
    .line 27
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 28
    .line 29
    .line 30
    iput-object v0, p0, Ls69;->a:Li1;

    .line 31
    .line 32
    iput-object v1, p0, Ls69;->b:Ljava/lang/Integer;

    .line 33
    .line 34
    iput-object v2, p0, Ls69;->c:Ljava/lang/Integer;

    .line 35
    .line 36
    iput-object p1, p0, Ls69;->d:Ldg5;

    .line 37
    .line 38
    iput-boolean p2, p0, Ls69;->e:Z

    .line 39
    .line 40
    return-void
.end method


# virtual methods
.method public final a()Lrj2;
    .locals 9

    .line 1
    new-instance v0, Lk97;

    .line 2
    .line 3
    new-instance v1, Lal5;

    .line 4
    .line 5
    iget-object v2, p0, Ls69;->a:Li1;

    .line 6
    .line 7
    invoke-virtual {v2}, Li1;->a()Lbx5;

    .line 8
    .line 9
    .line 10
    move-result-object v3

    .line 11
    const/4 v7, 0x0

    .line 12
    const/16 v8, 0xd

    .line 13
    .line 14
    const/4 v2, 0x1

    .line 15
    const-class v4, Lbx5;

    .line 16
    .line 17
    const-string v5, "getterNotNull"

    .line 18
    .line 19
    const-string v6, "getterNotNull(Ljava/lang/Object;)Ljava/lang/Object;"

    .line 20
    .line 21
    invoke-direct/range {v1 .. v8}, Lal5;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 22
    .line 23
    .line 24
    iget-object v2, p0, Ls69;->b:Ljava/lang/Integer;

    .line 25
    .line 26
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    .line 27
    .line 28
    .line 29
    move-result v2

    .line 30
    invoke-direct {v0, v1, v2}, Lk97;-><init>(Lal5;I)V

    .line 31
    .line 32
    .line 33
    iget-object p0, p0, Ls69;->c:Ljava/lang/Integer;

    .line 34
    .line 35
    if-eqz p0, :cond_0

    .line 36
    .line 37
    new-instance v1, Lk97;

    .line 38
    .line 39
    invoke-virtual {p0}, Ljava/lang/Integer;->intValue()I

    .line 40
    .line 41
    .line 42
    move-result p0

    .line 43
    invoke-direct {v1, v0, p0}, Lk97;-><init>(Lrj2;I)V

    .line 44
    .line 45
    .line 46
    return-object v1

    .line 47
    :cond_0
    return-object v0
.end method

.method public final b()Lli5;
    .locals 10

    .line 1
    iget-object v0, p0, Ls69;->a:Li1;

    .line 2
    .line 3
    invoke-virtual {v0}, Li1;->a()Lbx5;

    .line 4
    .line 5
    .line 6
    move-result-object v4

    .line 7
    invoke-virtual {v0}, Li1;->c()Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    move-result-object v5

    .line 11
    const/4 v0, 0x4

    .line 12
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 17
    .line 18
    .line 19
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 20
    .line 21
    .line 22
    const/4 v6, 0x1

    .line 23
    iget-object v1, p0, Ls69;->b:Ljava/lang/Integer;

    .line 24
    .line 25
    const/4 v2, 0x0

    .line 26
    iget-object v3, p0, Ls69;->c:Ljava/lang/Integer;

    .line 27
    .line 28
    invoke-static/range {v1 .. v6}, Lu70;->p0(Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Lbx5;Ljava/lang/String;Z)Lli5;

    .line 29
    .line 30
    .line 31
    move-result-object p0

    .line 32
    move-object v7, v2

    .line 33
    filled-new-array {p0}, [Lli5;

    .line 34
    .line 35
    .line 36
    move-result-object p0

    .line 37
    invoke-static {p0}, Li21;->N([Ljava/lang/Object;)Ljava/util/ArrayList;

    .line 38
    .line 39
    .line 40
    move-result-object p0

    .line 41
    const/4 v6, 0x0

    .line 42
    move-object v2, v0

    .line 43
    invoke-static/range {v1 .. v6}, Lu70;->p0(Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Lbx5;Ljava/lang/String;Z)Lli5;

    .line 44
    .line 45
    .line 46
    move-result-object v0

    .line 47
    invoke-virtual {p0, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 48
    .line 49
    .line 50
    new-instance v0, Lli5;

    .line 51
    .line 52
    new-instance v8, Lko5;

    .line 53
    .line 54
    const-string v1, "+"

    .line 55
    .line 56
    invoke-direct {v8, v1}, Lko5;-><init>(Ljava/lang/String;)V

    .line 57
    .line 58
    .line 59
    new-instance v9, Lw75;

    .line 60
    .line 61
    new-instance v1, Leo8;

    .line 62
    .line 63
    const/4 v2, 0x5

    .line 64
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 65
    .line 66
    .line 67
    move-result-object v2

    .line 68
    move-object v3, v7

    .line 69
    invoke-direct/range {v1 .. v6}, Leo8;-><init>(Ljava/lang/Integer;Ljava/lang/Integer;Lbx5;Ljava/lang/String;Z)V

    .line 70
    .line 71
    .line 72
    invoke-static {v1}, Li21;->K(Ljava/lang/Object;)Ljava/util/List;

    .line 73
    .line 74
    .line 75
    move-result-object v1

    .line 76
    invoke-direct {v9, v1}, Lw75;-><init>(Ljava/util/List;)V

    .line 77
    .line 78
    .line 79
    const/4 v1, 0x2

    .line 80
    new-array v1, v1, [Lki5;

    .line 81
    .line 82
    const/4 v2, 0x0

    .line 83
    aput-object v8, v1, v2

    .line 84
    .line 85
    const/4 v2, 0x1

    .line 86
    aput-object v9, v1, v2

    .line 87
    .line 88
    invoke-static {v1}, Li21;->L([Ljava/lang/Object;)Ljava/util/List;

    .line 89
    .line 90
    .line 91
    move-result-object v1

    .line 92
    sget-object v2, Ld02;->X:Ld02;

    .line 93
    .line 94
    invoke-direct {v0, v1, v2}, Lli5;-><init>(Ljava/util/List;Ljava/util/List;)V

    .line 95
    .line 96
    .line 97
    invoke-virtual {p0, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 98
    .line 99
    .line 100
    new-instance v0, Lli5;

    .line 101
    .line 102
    invoke-direct {v0, v2, p0}, Lli5;-><init>(Ljava/util/List;Ljava/util/List;)V

    .line 103
    .line 104
    .line 105
    return-object v0
.end method

.method public final c()Li1;
    .locals 0

    .line 1
    iget-object p0, p0, Ls69;->a:Li1;

    .line 2
    .line 3
    return-object p0
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 2

    .line 1
    instance-of v0, p1, Ls69;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    check-cast p1, Ls69;

    .line 6
    .line 7
    iget-object v0, p1, Ls69;->d:Ldg5;

    .line 8
    .line 9
    iget-object v1, p0, Ls69;->d:Ldg5;

    .line 10
    .line 11
    if-ne v1, v0, :cond_0

    .line 12
    .line 13
    iget-boolean p0, p0, Ls69;->e:Z

    .line 14
    .line 15
    iget-boolean p1, p1, Ls69;->e:Z

    .line 16
    .line 17
    if-ne p0, p1, :cond_0

    .line 18
    .line 19
    const/4 p0, 0x1

    .line 20
    return p0

    .line 21
    :cond_0
    const/4 p0, 0x0

    .line 22
    return p0
.end method

.method public final hashCode()I
    .locals 1

    .line 1
    iget-object v0, p0, Ls69;->d:Ldg5;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    mul-int/lit8 v0, v0, 0x1f

    .line 8
    .line 9
    iget-boolean p0, p0, Ls69;->e:Z

    .line 10
    .line 11
    invoke-static {p0}, Ljava/lang/Boolean;->hashCode(Z)I

    .line 12
    .line 13
    .line 14
    move-result p0

    .line 15
    add-int/2addr p0, v0

    .line 16
    return p0
.end method
