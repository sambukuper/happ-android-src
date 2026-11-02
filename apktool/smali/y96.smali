.class public final Ly96;
.super Ljava/lang/Object;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"

# interfaces
.implements Lz82;


# instance fields
.field public final a:Li1;

.field public final b:Z


# direct methods
.method public constructor <init>(Z)V
    .locals 1

    .line 1
    sget-object v0, La79;->a:Lhq2;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, Ly96;->a:Li1;

    .line 10
    .line 11
    iput-boolean p1, p0, Ly96;->b:Z

    .line 12
    .line 13
    return-void
.end method


# virtual methods
.method public final a()Lrj2;
    .locals 9

    .line 1
    new-instance v0, Lc11;

    .line 2
    .line 3
    new-instance v1, Lal5;

    .line 4
    .line 5
    iget-object p0, p0, Ly96;->a:Li1;

    .line 6
    .line 7
    invoke-virtual {p0}, Li1;->a()Lbx5;

    .line 8
    .line 9
    .line 10
    move-result-object v3

    .line 11
    const/4 v7, 0x0

    .line 12
    const/4 v8, 0x5

    .line 13
    const/4 v2, 0x1

    .line 14
    const-class v4, Lbx5;

    .line 15
    .line 16
    const-string v5, "getterNotNull"

    .line 17
    .line 18
    const-string v6, "getterNotNull(Ljava/lang/Object;)Ljava/lang/Object;"

    .line 19
    .line 20
    invoke-direct/range {v1 .. v8}, Lal5;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 21
    .line 22
    .line 23
    const/4 p0, 0x3

    .line 24
    invoke-direct {v0, v1, p0}, Lc11;-><init>(Ljava/lang/Object;B)V

    .line 25
    .line 26
    .line 27
    return-object v0
.end method

.method public final b()Lli5;
    .locals 15

    .line 1
    iget-object p0, p0, Ly96;->a:Li1;

    .line 2
    .line 3
    invoke-virtual {p0}, Li1;->a()Lbx5;

    .line 4
    .line 5
    .line 6
    move-result-object v3

    .line 7
    invoke-virtual {p0}, Li1;->c()Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    move-result-object v4

    .line 11
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 12
    .line 13
    .line 14
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 15
    .line 16
    .line 17
    new-instance p0, Lli5;

    .line 18
    .line 19
    new-instance v6, Lli5;

    .line 20
    .line 21
    new-instance v0, Lw75;

    .line 22
    .line 23
    new-instance v1, Lx96;

    .line 24
    .line 25
    invoke-direct {v1, v3, v4}, Lx96;-><init>(Lbx5;Ljava/lang/String;)V

    .line 26
    .line 27
    .line 28
    invoke-static {v1}, Li21;->K(Ljava/lang/Object;)Ljava/util/List;

    .line 29
    .line 30
    .line 31
    move-result-object v1

    .line 32
    invoke-direct {v0, v1}, Lw75;-><init>(Ljava/util/List;)V

    .line 33
    .line 34
    .line 35
    invoke-static {v0}, Li21;->K(Ljava/lang/Object;)Ljava/util/List;

    .line 36
    .line 37
    .line 38
    move-result-object v0

    .line 39
    sget-object v7, Ld02;->X:Ld02;

    .line 40
    .line 41
    invoke-direct {v6, v0, v7}, Lli5;-><init>(Ljava/util/List;Ljava/util/List;)V

    .line 42
    .line 43
    .line 44
    new-instance v8, Lli5;

    .line 45
    .line 46
    new-instance v9, Lko5;

    .line 47
    .line 48
    const-string v0, "+"

    .line 49
    .line 50
    invoke-direct {v9, v0}, Lko5;-><init>(Ljava/lang/String;)V

    .line 51
    .line 52
    .line 53
    new-instance v10, Lw75;

    .line 54
    .line 55
    new-instance v0, Leo8;

    .line 56
    .line 57
    const/4 v2, 0x0

    .line 58
    const/4 v5, 0x0

    .line 59
    const/4 v1, 0x0

    .line 60
    invoke-direct/range {v0 .. v5}, Leo8;-><init>(Ljava/lang/Integer;Ljava/lang/Integer;Lbx5;Ljava/lang/String;Z)V

    .line 61
    .line 62
    .line 63
    invoke-static {v0}, Li21;->K(Ljava/lang/Object;)Ljava/util/List;

    .line 64
    .line 65
    .line 66
    move-result-object v0

    .line 67
    invoke-direct {v10, v0}, Lw75;-><init>(Ljava/util/List;)V

    .line 68
    .line 69
    .line 70
    const/4 v11, 0x2

    .line 71
    new-array v0, v11, [Lki5;

    .line 72
    .line 73
    const/4 v12, 0x0

    .line 74
    aput-object v9, v0, v12

    .line 75
    .line 76
    const/4 v9, 0x1

    .line 77
    aput-object v10, v0, v9

    .line 78
    .line 79
    invoke-static {v0}, Li21;->L([Ljava/lang/Object;)Ljava/util/List;

    .line 80
    .line 81
    .line 82
    move-result-object v0

    .line 83
    invoke-direct {v8, v0, v7}, Lli5;-><init>(Ljava/util/List;Ljava/util/List;)V

    .line 84
    .line 85
    .line 86
    new-instance v10, Lli5;

    .line 87
    .line 88
    new-instance v13, Lko5;

    .line 89
    .line 90
    const-string v0, "-"

    .line 91
    .line 92
    invoke-direct {v13, v0}, Lko5;-><init>(Ljava/lang/String;)V

    .line 93
    .line 94
    .line 95
    new-instance v14, Lw75;

    .line 96
    .line 97
    new-instance v0, Leo8;

    .line 98
    .line 99
    const/4 v5, 0x1

    .line 100
    invoke-direct/range {v0 .. v5}, Leo8;-><init>(Ljava/lang/Integer;Ljava/lang/Integer;Lbx5;Ljava/lang/String;Z)V

    .line 101
    .line 102
    .line 103
    invoke-static {v0}, Li21;->K(Ljava/lang/Object;)Ljava/util/List;

    .line 104
    .line 105
    .line 106
    move-result-object v0

    .line 107
    invoke-direct {v14, v0}, Lw75;-><init>(Ljava/util/List;)V

    .line 108
    .line 109
    .line 110
    new-array v0, v11, [Lki5;

    .line 111
    .line 112
    aput-object v13, v0, v12

    .line 113
    .line 114
    aput-object v14, v0, v9

    .line 115
    .line 116
    invoke-static {v0}, Li21;->L([Ljava/lang/Object;)Ljava/util/List;

    .line 117
    .line 118
    .line 119
    move-result-object v0

    .line 120
    invoke-direct {v10, v0, v7}, Lli5;-><init>(Ljava/util/List;Ljava/util/List;)V

    .line 121
    .line 122
    .line 123
    filled-new-array {v6, v8, v10}, [Lli5;

    .line 124
    .line 125
    .line 126
    move-result-object v0

    .line 127
    invoke-static {v0}, Li21;->L([Ljava/lang/Object;)Ljava/util/List;

    .line 128
    .line 129
    .line 130
    move-result-object v0

    .line 131
    invoke-direct {p0, v7, v0}, Lli5;-><init>(Ljava/util/List;Ljava/util/List;)V

    .line 132
    .line 133
    .line 134
    return-object p0
.end method

.method public final c()Li1;
    .locals 0

    .line 1
    iget-object p0, p0, Ly96;->a:Li1;

    .line 2
    .line 3
    return-object p0
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 1

    .line 1
    instance-of v0, p1, Ly96;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    check-cast p1, Ly96;

    .line 6
    .line 7
    iget-boolean p0, p0, Ly96;->b:Z

    .line 8
    .line 9
    iget-boolean p1, p1, Ly96;->b:Z

    .line 10
    .line 11
    if-ne p0, p1, :cond_0

    .line 12
    .line 13
    const/4 p0, 0x1

    .line 14
    return p0

    .line 15
    :cond_0
    const/4 p0, 0x0

    .line 16
    return p0
.end method

.method public final hashCode()I
    .locals 1

    .line 1
    const/16 v0, 0x7d0

    .line 2
    .line 3
    invoke-static {v0}, Ljava/lang/Integer;->hashCode(I)I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    mul-int/lit8 v0, v0, 0x1f

    .line 8
    .line 9
    iget-boolean p0, p0, Ly96;->b:Z

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
