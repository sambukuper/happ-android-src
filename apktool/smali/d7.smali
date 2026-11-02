.class public Ld7;
.super Ljava/lang/Object;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"


# instance fields
.field public final synthetic a:B

.field public b:I

.field public c:Ljava/lang/Object;

.field public d:Ljava/lang/Object;

.field public e:Ljava/lang/Object;

.field public f:Ljava/lang/Object;

.field public g:Ljava/lang/Object;


# direct methods
.method public constructor <init>()V
    .locals 2

    const/4 v0, 0x3

    iput-byte v0, p0, Ld7;->a:B

    .line 107
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/16 v0, 0x20

    .line 108
    new-array v1, v0, [Lw03;

    iput-object v1, p0, Ld7;->c:Ljava/lang/Object;

    .line 109
    new-array v1, v0, [F

    iput-object v1, p0, Ld7;->d:Ljava/lang/Object;

    .line 110
    new-array v0, v0, [B

    iput-object v0, p0, Ld7;->e:Ljava/lang/Object;

    .line 111
    sget-object v0, Lvw6;->a:Lt05;

    .line 112
    new-instance v0, Lt05;

    invoke-direct {v0}, Lt05;-><init>()V

    .line 113
    iput-object v0, p0, Ld7;->f:Ljava/lang/Object;

    .line 114
    new-instance v0, Lt05;

    invoke-direct {v0}, Lt05;-><init>()V

    .line 115
    iput-object v0, p0, Ld7;->g:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Landroid/view/View;)V
    .locals 1

    const/4 v0, 0x1

    iput-byte v0, p0, Ld7;->a:B

    .line 92
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, -0x1

    .line 93
    iput v0, p0, Ld7;->b:I

    .line 94
    iput-object p1, p0, Ld7;->c:Ljava/lang/Object;

    .line 95
    invoke-static {}, Laq;->a()Laq;

    move-result-object p1

    iput-object p1, p0, Ld7;->d:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Lj7;Ljf6;Lm76;)V
    .locals 0

    .line 1
    const/4 p3, 0x2

    .line 2
    iput-byte p3, p0, Ld7;->a:B

    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-object p1, p0, Ld7;->c:Ljava/lang/Object;

    .line 8
    .line 9
    iput-object p2, p0, Ld7;->e:Ljava/lang/Object;

    .line 10
    .line 11
    sget-object p2, Ld02;->X:Ld02;

    .line 12
    .line 13
    iput-object p2, p0, Ld7;->f:Ljava/lang/Object;

    .line 14
    .line 15
    iput-object p2, p0, Ld7;->g:Ljava/lang/Object;

    .line 16
    .line 17
    new-instance p2, Ljava/util/ArrayList;

    .line 18
    .line 19
    invoke-direct {p2}, Ljava/util/ArrayList;-><init>()V

    .line 20
    .line 21
    .line 22
    iput-object p2, p0, Ld7;->d:Ljava/lang/Object;

    .line 23
    .line 24
    iget-object p2, p1, Lj7;->h:Lu23;

    .line 25
    .line 26
    iget-object p3, p1, Lj7;->f:Ljava/net/Proxy;

    .line 27
    .line 28
    if-eqz p3, :cond_0

    .line 29
    .line 30
    invoke-static {p3}, Li21;->K(Ljava/lang/Object;)Ljava/util/List;

    .line 31
    .line 32
    .line 33
    move-result-object p1

    .line 34
    goto :goto_1

    .line 35
    :cond_0
    invoke-virtual {p2}, Lu23;->f()Ljava/net/URI;

    .line 36
    .line 37
    .line 38
    move-result-object p2

    .line 39
    invoke-virtual {p2}, Ljava/net/URI;->getHost()Ljava/lang/String;

    .line 40
    .line 41
    .line 42
    move-result-object p3

    .line 43
    if-nez p3, :cond_1

    .line 44
    .line 45
    sget-object p1, Ljava/net/Proxy;->NO_PROXY:Ljava/net/Proxy;

    .line 46
    .line 47
    filled-new-array {p1}, [Ljava/net/Proxy;

    .line 48
    .line 49
    .line 50
    move-result-object p1

    .line 51
    invoke-static {p1}, Lks8;->j([Ljava/lang/Object;)Ljava/util/List;

    .line 52
    .line 53
    .line 54
    move-result-object p1

    .line 55
    goto :goto_1

    .line 56
    :cond_1
    iget-object p1, p1, Lj7;->g:Ljava/net/ProxySelector;

    .line 57
    .line 58
    invoke-virtual {p1, p2}, Ljava/net/ProxySelector;->select(Ljava/net/URI;)Ljava/util/List;

    .line 59
    .line 60
    .line 61
    move-result-object p1

    .line 62
    if-eqz p1, :cond_3

    .line 63
    .line 64
    invoke-interface {p1}, Ljava/util/Collection;->isEmpty()Z

    .line 65
    .line 66
    .line 67
    move-result p2

    .line 68
    if-eqz p2, :cond_2

    .line 69
    .line 70
    goto :goto_0

    .line 71
    :cond_2
    invoke-static {p1}, Lks8;->u(Ljava/util/List;)Ljava/util/List;

    .line 72
    .line 73
    .line 74
    move-result-object p1

    .line 75
    goto :goto_1

    .line 76
    :cond_3
    :goto_0
    sget-object p1, Ljava/net/Proxy;->NO_PROXY:Ljava/net/Proxy;

    .line 77
    .line 78
    filled-new-array {p1}, [Ljava/net/Proxy;

    .line 79
    .line 80
    .line 81
    move-result-object p1

    .line 82
    invoke-static {p1}, Lks8;->j([Ljava/lang/Object;)Ljava/util/List;

    .line 83
    .line 84
    .line 85
    move-result-object p1

    .line 86
    :goto_1
    iput-object p1, p0, Ld7;->f:Ljava/lang/Object;

    .line 87
    .line 88
    const/4 p1, 0x0

    .line 89
    iput p1, p0, Ld7;->b:I

    .line 90
    .line 91
    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Lmn3;)V
    .locals 1

    const/4 v0, 0x4

    iput-byte v0, p0, Ld7;->a:B

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 103
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Ld7;->c:Ljava/lang/Object;

    .line 104
    new-instance v0, Leb9;

    invoke-direct {v0, p2}, Leb9;-><init>(Lmn3;)V

    iput-object v0, p0, Ld7;->d:Ljava/lang/Object;

    .line 105
    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    iput-object p2, p0, Ld7;->f:Ljava/lang/Object;

    .line 106
    iput-object p1, p0, Ld7;->g:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Lx86;)V
    .locals 3

    const/4 v0, 0x0

    iput-byte v0, p0, Ld7;->a:B

    .line 96
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 97
    new-instance v1, Ler5;

    const/16 v2, 0x1e

    invoke-direct {v1, v2}, Ler5;-><init>(I)V

    iput-object v1, p0, Ld7;->c:Ljava/lang/Object;

    .line 98
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    iput-object v1, p0, Ld7;->d:Ljava/lang/Object;

    .line 99
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    iput-object v1, p0, Ld7;->e:Ljava/lang/Object;

    .line 100
    iput v0, p0, Ld7;->b:I

    .line 101
    iput-object p1, p0, Ld7;->f:Ljava/lang/Object;

    .line 102
    new-instance p1, Lq02;

    const/16 v0, 0x1b

    invoke-direct {p1, p0, v0}, Lq02;-><init>(Ljava/lang/Object;B)V

    iput-object p1, p0, Ld7;->g:Ljava/lang/Object;

    return-void
.end method

.method public static synthetic s(Ld7;Ljava/lang/String;ILjava/lang/String;I)V
    .locals 1

    .line 1
    and-int/lit8 v0, p4, 0x2

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    iget p2, p0, Ld7;->b:I

    .line 6
    .line 7
    :cond_0
    and-int/lit8 p4, p4, 0x4

    .line 8
    .line 9
    const/4 v0, 0x0

    .line 10
    if-eqz p4, :cond_1

    .line 11
    .line 12
    move-object p3, v0

    .line 13
    :cond_1
    invoke-virtual {p0, p1, p2, p3}, Ld7;->r(Ljava/lang/String;ILjava/lang/String;)V

    .line 14
    .line 15
    .line 16
    throw v0
.end method


# virtual methods
.method public A(Ljava/lang/Object;III)Lc7;
    .locals 0

    .line 1
    iget-object p0, p0, Ld7;->c:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, Ler5;

    .line 4
    .line 5
    invoke-virtual {p0}, Ler5;->a()Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    check-cast p0, Lc7;

    .line 10
    .line 11
    if-nez p0, :cond_0

    .line 12
    .line 13
    new-instance p0, Lc7;

    .line 14
    .line 15
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 16
    .line 17
    .line 18
    iput-byte p2, p0, Lc7;->a:B

    .line 19
    .line 20
    iput p3, p0, Lc7;->b:I

    .line 21
    .line 22
    iput p4, p0, Lc7;->d:I

    .line 23
    .line 24
    iput-object p1, p0, Lc7;->c:Ljava/lang/Object;

    .line 25
    .line 26
    return-object p0

    .line 27
    :cond_0
    iput-byte p2, p0, Lc7;->a:B

    .line 28
    .line 29
    iput p3, p0, Lc7;->b:I

    .line 30
    .line 31
    iput p4, p0, Lc7;->d:I

    .line 32
    .line 33
    iput-object p1, p0, Lc7;->c:Ljava/lang/Object;

    .line 34
    .line 35
    return-object p0
.end method

.method public B()V
    .locals 1

    .line 1
    const/4 v0, -0x1

    .line 2
    iput v0, p0, Ld7;->b:I

    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    invoke-virtual {p0, v0}, Ld7;->L(Landroid/content/res/ColorStateList;)V

    .line 6
    .line 7
    .line 8
    invoke-virtual {p0}, Ld7;->b()V

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method public C(I)V
    .locals 3

    .line 1
    iput p1, p0, Ld7;->b:I

    .line 2
    .line 3
    iget-object v0, p0, Ld7;->d:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast v0, Laq;

    .line 6
    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    iget-object v1, p0, Ld7;->c:Ljava/lang/Object;

    .line 10
    .line 11
    check-cast v1, Landroid/view/View;

    .line 12
    .line 13
    invoke-virtual {v1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    monitor-enter v0

    .line 18
    :try_start_0
    iget-object v2, v0, Laq;->a:Lrf6;

    .line 19
    .line 20
    invoke-virtual {v2, v1, p1}, Lrf6;->f(Landroid/content/Context;I)Landroid/content/res/ColorStateList;

    .line 21
    .line 22
    .line 23
    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 24
    monitor-exit v0

    .line 25
    goto :goto_0

    .line 26
    :catchall_0
    move-exception p0

    .line 27
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 28
    throw p0

    .line 29
    :cond_0
    const/4 p1, 0x0

    .line 30
    :goto_0
    invoke-virtual {p0, p1}, Ld7;->L(Landroid/content/res/ColorStateList;)V

    .line 31
    .line 32
    .line 33
    invoke-virtual {p0}, Ld7;->b()V

    .line 34
    .line 35
    .line 36
    return-void
.end method

.method public D(Ljava/lang/String;Z)Ljava/lang/String;
    .locals 4

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget v0, p0, Ld7;->b:I

    .line 5
    .line 6
    const/4 v1, 0x0

    .line 7
    :try_start_0
    invoke-virtual {p0}, Ld7;->g()B

    .line 8
    .line 9
    .line 10
    move-result v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 11
    const/4 v3, 0x6

    .line 12
    if-eq v2, v3, :cond_0

    .line 13
    .line 14
    :goto_0
    iput v0, p0, Ld7;->b:I

    .line 15
    .line 16
    iput-object v1, p0, Ld7;->e:Ljava/lang/Object;

    .line 17
    .line 18
    return-object v1

    .line 19
    :cond_0
    :try_start_1
    invoke-virtual {p0, p2}, Ld7;->F(Z)Ljava/lang/String;

    .line 20
    .line 21
    .line 22
    move-result-object v2

    .line 23
    invoke-static {v2, p1}, Ldh3;->f(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 24
    .line 25
    .line 26
    move-result p1

    .line 27
    if-nez p1, :cond_1

    .line 28
    .line 29
    goto :goto_0

    .line 30
    :cond_1
    iput-object v1, p0, Ld7;->e:Ljava/lang/Object;

    .line 31
    .line 32
    invoke-virtual {p0}, Ld7;->g()B

    .line 33
    .line 34
    .line 35
    move-result p1

    .line 36
    const/4 v2, 0x5

    .line 37
    if-eq p1, v2, :cond_2

    .line 38
    .line 39
    goto :goto_0

    .line 40
    :cond_2
    invoke-virtual {p0, p2}, Ld7;->F(Z)Ljava/lang/String;

    .line 41
    .line 42
    .line 43
    move-result-object p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 44
    iput v0, p0, Ld7;->b:I

    .line 45
    .line 46
    iput-object v1, p0, Ld7;->e:Ljava/lang/Object;

    .line 47
    .line 48
    return-object p1

    .line 49
    :catchall_0
    move-exception p1

    .line 50
    iput v0, p0, Ld7;->b:I

    .line 51
    .line 52
    iput-object v1, p0, Ld7;->e:Ljava/lang/Object;

    .line 53
    .line 54
    throw p1
.end method

.method public E()B
    .locals 5

    .line 1
    iget-object v0, p0, Ld7;->g:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Ljava/lang/String;

    .line 4
    .line 5
    iget v1, p0, Ld7;->b:I

    .line 6
    .line 7
    :goto_0
    invoke-virtual {p0, v1}, Ld7;->I(I)I

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    const/4 v2, -0x1

    .line 12
    const/16 v3, 0xa

    .line 13
    .line 14
    if-eq v1, v2, :cond_1

    .line 15
    .line 16
    invoke-virtual {v0, v1}, Ljava/lang/String;->charAt(I)C

    .line 17
    .line 18
    .line 19
    move-result v2

    .line 20
    const/16 v4, 0x9

    .line 21
    .line 22
    if-eq v2, v4, :cond_0

    .line 23
    .line 24
    if-eq v2, v3, :cond_0

    .line 25
    .line 26
    const/16 v3, 0xd

    .line 27
    .line 28
    if-eq v2, v3, :cond_0

    .line 29
    .line 30
    const/16 v3, 0x20

    .line 31
    .line 32
    if-eq v2, v3, :cond_0

    .line 33
    .line 34
    iput v1, p0, Ld7;->b:I

    .line 35
    .line 36
    invoke-static {v2}, Lx97;->g(C)B

    .line 37
    .line 38
    .line 39
    move-result p0

    .line 40
    return p0

    .line 41
    :cond_0
    add-int/lit8 v1, v1, 0x1

    .line 42
    .line 43
    goto :goto_0

    .line 44
    :cond_1
    iput v1, p0, Ld7;->b:I

    .line 45
    .line 46
    return v3
.end method

.method public F(Z)Ljava/lang/String;
    .locals 2

    .line 1
    invoke-virtual {p0}, Ld7;->E()B

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x1

    .line 6
    if-eqz p1, :cond_1

    .line 7
    .line 8
    if-eq v0, v1, :cond_0

    .line 9
    .line 10
    if-eqz v0, :cond_0

    .line 11
    .line 12
    goto :goto_0

    .line 13
    :cond_0
    invoke-virtual {p0}, Ld7;->m()Ljava/lang/String;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    goto :goto_1

    .line 18
    :cond_1
    if-eq v0, v1, :cond_2

    .line 19
    .line 20
    :goto_0
    const/4 p0, 0x0

    .line 21
    return-object p0

    .line 22
    :cond_2
    invoke-virtual {p0}, Ld7;->l()Ljava/lang/String;

    .line 23
    .line 24
    .line 25
    move-result-object p1

    .line 26
    :goto_1
    iput-object p1, p0, Ld7;->e:Ljava/lang/Object;

    .line 27
    .line 28
    return-object p1
.end method

.method public G(Lc7;)V
    .locals 3

    .line 1
    iget-object v0, p0, Ld7;->f:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lx86;

    .line 4
    .line 5
    iget-object p0, p0, Ld7;->e:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast p0, Ljava/util/ArrayList;

    .line 8
    .line 9
    invoke-virtual {p0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 10
    .line 11
    .line 12
    iget-byte p0, p1, Lc7;->a:B

    .line 13
    .line 14
    const/4 v1, 0x1

    .line 15
    if-eq p0, v1, :cond_3

    .line 16
    .line 17
    const/4 v2, 0x2

    .line 18
    if-eq p0, v2, :cond_2

    .line 19
    .line 20
    const/4 v1, 0x4

    .line 21
    if-eq p0, v1, :cond_1

    .line 22
    .line 23
    const/16 v1, 0x8

    .line 24
    .line 25
    if-ne p0, v1, :cond_0

    .line 26
    .line 27
    iget p0, p1, Lc7;->b:I

    .line 28
    .line 29
    iget p1, p1, Lc7;->d:I

    .line 30
    .line 31
    invoke-virtual {v0, p0, p1}, Lx86;->e(II)V

    .line 32
    .line 33
    .line 34
    return-void

    .line 35
    :cond_0
    const-string p0, "Unknown update op type for "

    .line 36
    .line 37
    invoke-static {p1, p0}, Lu52;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 38
    .line 39
    .line 40
    return-void

    .line 41
    :cond_1
    iget p0, p1, Lc7;->b:I

    .line 42
    .line 43
    iget v1, p1, Lc7;->d:I

    .line 44
    .line 45
    iget-object p1, p1, Lc7;->c:Ljava/lang/Object;

    .line 46
    .line 47
    invoke-virtual {v0, p0, v1, p1}, Lx86;->c(IILjava/lang/Object;)V

    .line 48
    .line 49
    .line 50
    return-void

    .line 51
    :cond_2
    iget p0, p1, Lc7;->b:I

    .line 52
    .line 53
    iget p1, p1, Lc7;->d:I

    .line 54
    .line 55
    iget-object v0, v0, Lx86;->X:Landroidx/recyclerview/widget/RecyclerView;

    .line 56
    .line 57
    const/4 v2, 0x0

    .line 58
    invoke-virtual {v0, p0, p1, v2}, Landroidx/recyclerview/widget/RecyclerView;->U(IIZ)V

    .line 59
    .line 60
    .line 61
    iput-boolean v1, v0, Landroidx/recyclerview/widget/RecyclerView;->n1:Z

    .line 62
    .line 63
    return-void

    .line 64
    :cond_3
    iget p0, p1, Lc7;->b:I

    .line 65
    .line 66
    iget p1, p1, Lc7;->d:I

    .line 67
    .line 68
    invoke-virtual {v0, p0, p1}, Lx86;->d(II)V

    .line 69
    .line 70
    .line 71
    return-void
.end method

.method public H()V
    .locals 20

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-object v1, v0, Ld7;->c:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast v1, Ler5;

    .line 6
    .line 7
    iget-object v2, v0, Ld7;->f:Ljava/lang/Object;

    .line 8
    .line 9
    check-cast v2, Lx86;

    .line 10
    .line 11
    iget-object v3, v0, Ld7;->g:Ljava/lang/Object;

    .line 12
    .line 13
    check-cast v3, Lq02;

    .line 14
    .line 15
    iget-object v4, v0, Ld7;->d:Ljava/lang/Object;

    .line 16
    .line 17
    check-cast v4, Ljava/util/ArrayList;

    .line 18
    .line 19
    :cond_0
    :goto_0
    invoke-virtual {v4}, Ljava/util/ArrayList;->size()I

    .line 20
    .line 21
    .line 22
    move-result v5

    .line 23
    const/4 v6, 0x1

    .line 24
    sub-int/2addr v5, v6

    .line 25
    const/4 v8, 0x0

    .line 26
    :goto_1
    const/16 v9, 0x8

    .line 27
    .line 28
    const/4 v10, -0x1

    .line 29
    if-ltz v5, :cond_3

    .line 30
    .line 31
    invoke-virtual {v4, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object v11

    .line 35
    check-cast v11, Lc7;

    .line 36
    .line 37
    iget-byte v11, v11, Lc7;->a:B

    .line 38
    .line 39
    if-ne v11, v9, :cond_1

    .line 40
    .line 41
    if-eqz v8, :cond_2

    .line 42
    .line 43
    goto :goto_2

    .line 44
    :cond_1
    move v8, v6

    .line 45
    :cond_2
    add-int/lit8 v5, v5, -0x1

    .line 46
    .line 47
    goto :goto_1

    .line 48
    :cond_3
    move v5, v10

    .line 49
    :goto_2
    const/4 v8, 0x2

    .line 50
    const/4 v11, 0x4

    .line 51
    if-eq v5, v10, :cond_22

    .line 52
    .line 53
    add-int/lit8 v9, v5, 0x1

    .line 54
    .line 55
    iget-object v13, v3, Lq02;->Y:Ljava/lang/Object;

    .line 56
    .line 57
    check-cast v13, Ld7;

    .line 58
    .line 59
    iget-object v14, v13, Ld7;->c:Ljava/lang/Object;

    .line 60
    .line 61
    check-cast v14, Ler5;

    .line 62
    .line 63
    invoke-virtual {v4, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 64
    .line 65
    .line 66
    move-result-object v15

    .line 67
    check-cast v15, Lc7;

    .line 68
    .line 69
    invoke-virtual {v4, v9}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 70
    .line 71
    .line 72
    move-result-object v16

    .line 73
    move-object/from16 v7, v16

    .line 74
    .line 75
    check-cast v7, Lc7;

    .line 76
    .line 77
    iget-byte v10, v7, Lc7;->a:B

    .line 78
    .line 79
    if-eq v10, v6, :cond_1d

    .line 80
    .line 81
    if-eq v10, v8, :cond_b

    .line 82
    .line 83
    if-eq v10, v11, :cond_4

    .line 84
    .line 85
    goto :goto_0

    .line 86
    :cond_4
    iget v8, v15, Lc7;->d:I

    .line 87
    .line 88
    iget v10, v7, Lc7;->b:I

    .line 89
    .line 90
    if-ge v8, v10, :cond_5

    .line 91
    .line 92
    add-int/lit8 v10, v10, -0x1

    .line 93
    .line 94
    iput v10, v7, Lc7;->b:I

    .line 95
    .line 96
    goto :goto_3

    .line 97
    :cond_5
    iget v12, v7, Lc7;->d:I

    .line 98
    .line 99
    add-int/2addr v10, v12

    .line 100
    if-ge v8, v10, :cond_6

    .line 101
    .line 102
    add-int/lit8 v12, v12, -0x1

    .line 103
    .line 104
    iput v12, v7, Lc7;->d:I

    .line 105
    .line 106
    iget v8, v15, Lc7;->b:I

    .line 107
    .line 108
    iget-object v10, v7, Lc7;->c:Ljava/lang/Object;

    .line 109
    .line 110
    invoke-virtual {v13, v10, v11, v8, v6}, Ld7;->A(Ljava/lang/Object;III)Lc7;

    .line 111
    .line 112
    .line 113
    move-result-object v6

    .line 114
    goto :goto_4

    .line 115
    :cond_6
    :goto_3
    const/4 v6, 0x0

    .line 116
    :goto_4
    iget v8, v15, Lc7;->b:I

    .line 117
    .line 118
    iget v10, v7, Lc7;->b:I

    .line 119
    .line 120
    if-gt v8, v10, :cond_7

    .line 121
    .line 122
    add-int/lit8 v10, v10, 0x1

    .line 123
    .line 124
    iput v10, v7, Lc7;->b:I

    .line 125
    .line 126
    goto :goto_5

    .line 127
    :cond_7
    iget v12, v7, Lc7;->d:I

    .line 128
    .line 129
    add-int/2addr v10, v12

    .line 130
    if-ge v8, v10, :cond_8

    .line 131
    .line 132
    sub-int/2addr v10, v8

    .line 133
    add-int/lit8 v8, v8, 0x1

    .line 134
    .line 135
    iget-object v12, v7, Lc7;->c:Ljava/lang/Object;

    .line 136
    .line 137
    invoke-virtual {v13, v12, v11, v8, v10}, Ld7;->A(Ljava/lang/Object;III)Lc7;

    .line 138
    .line 139
    .line 140
    move-result-object v8

    .line 141
    iget v11, v7, Lc7;->d:I

    .line 142
    .line 143
    sub-int/2addr v11, v10

    .line 144
    iput v11, v7, Lc7;->d:I

    .line 145
    .line 146
    goto :goto_6

    .line 147
    :cond_8
    :goto_5
    const/4 v8, 0x0

    .line 148
    :goto_6
    invoke-virtual {v4, v9, v15}, Ljava/util/ArrayList;->set(ILjava/lang/Object;)Ljava/lang/Object;

    .line 149
    .line 150
    .line 151
    iget v9, v7, Lc7;->d:I

    .line 152
    .line 153
    if-lez v9, :cond_9

    .line 154
    .line 155
    invoke-virtual {v4, v5, v7}, Ljava/util/ArrayList;->set(ILjava/lang/Object;)Ljava/lang/Object;

    .line 156
    .line 157
    .line 158
    goto :goto_7

    .line 159
    :cond_9
    invoke-virtual {v4, v5}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    .line 160
    .line 161
    .line 162
    const/4 v9, 0x0

    .line 163
    iput-object v9, v7, Lc7;->c:Ljava/lang/Object;

    .line 164
    .line 165
    invoke-virtual {v14, v7}, Ler5;->d(Ljava/lang/Object;)Z

    .line 166
    .line 167
    .line 168
    :goto_7
    if-eqz v6, :cond_a

    .line 169
    .line 170
    invoke-virtual {v4, v5, v6}, Ljava/util/ArrayList;->add(ILjava/lang/Object;)V

    .line 171
    .line 172
    .line 173
    :cond_a
    if-eqz v8, :cond_0

    .line 174
    .line 175
    invoke-virtual {v4, v5, v8}, Ljava/util/ArrayList;->add(ILjava/lang/Object;)V

    .line 176
    .line 177
    .line 178
    goto/16 :goto_0

    .line 179
    .line 180
    :cond_b
    iget v10, v15, Lc7;->b:I

    .line 181
    .line 182
    iget v11, v15, Lc7;->d:I

    .line 183
    .line 184
    iget v12, v7, Lc7;->b:I

    .line 185
    .line 186
    if-ge v10, v11, :cond_d

    .line 187
    .line 188
    if-ne v12, v10, :cond_c

    .line 189
    .line 190
    iget v6, v7, Lc7;->d:I

    .line 191
    .line 192
    sub-int v10, v11, v10

    .line 193
    .line 194
    if-ne v6, v10, :cond_c

    .line 195
    .line 196
    const/4 v6, 0x0

    .line 197
    :goto_8
    const/16 v17, 0x1

    .line 198
    .line 199
    goto :goto_a

    .line 200
    :cond_c
    const/4 v6, 0x0

    .line 201
    :goto_9
    const/16 v17, 0x0

    .line 202
    .line 203
    goto :goto_a

    .line 204
    :cond_d
    add-int/lit8 v6, v11, 0x1

    .line 205
    .line 206
    if-ne v12, v6, :cond_e

    .line 207
    .line 208
    iget v6, v7, Lc7;->d:I

    .line 209
    .line 210
    sub-int/2addr v10, v11

    .line 211
    if-ne v6, v10, :cond_e

    .line 212
    .line 213
    const/4 v6, 0x1

    .line 214
    goto :goto_8

    .line 215
    :cond_e
    const/4 v6, 0x1

    .line 216
    goto :goto_9

    .line 217
    :goto_a
    if-ge v11, v12, :cond_f

    .line 218
    .line 219
    add-int/lit8 v12, v12, -0x1

    .line 220
    .line 221
    iput v12, v7, Lc7;->b:I

    .line 222
    .line 223
    goto :goto_b

    .line 224
    :cond_f
    iget v10, v7, Lc7;->d:I

    .line 225
    .line 226
    add-int v8, v12, v10

    .line 227
    .line 228
    if-ge v11, v8, :cond_10

    .line 229
    .line 230
    add-int/lit8 v10, v10, -0x1

    .line 231
    .line 232
    iput v10, v7, Lc7;->d:I

    .line 233
    .line 234
    const/4 v5, 0x2

    .line 235
    iput-byte v5, v15, Lc7;->a:B

    .line 236
    .line 237
    const/4 v5, 0x1

    .line 238
    iput v5, v15, Lc7;->d:I

    .line 239
    .line 240
    iget v5, v7, Lc7;->d:I

    .line 241
    .line 242
    if-nez v5, :cond_0

    .line 243
    .line 244
    invoke-virtual {v4, v9}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    .line 245
    .line 246
    .line 247
    const/4 v9, 0x0

    .line 248
    iput-object v9, v7, Lc7;->c:Ljava/lang/Object;

    .line 249
    .line 250
    invoke-virtual {v14, v7}, Ler5;->d(Ljava/lang/Object;)Z

    .line 251
    .line 252
    .line 253
    goto/16 :goto_0

    .line 254
    .line 255
    :cond_10
    :goto_b
    iget v8, v15, Lc7;->b:I

    .line 256
    .line 257
    if-gt v8, v12, :cond_12

    .line 258
    .line 259
    add-int/lit8 v12, v12, 0x1

    .line 260
    .line 261
    iput v12, v7, Lc7;->b:I

    .line 262
    .line 263
    :cond_11
    const/4 v10, 0x0

    .line 264
    goto :goto_c

    .line 265
    :cond_12
    iget v10, v7, Lc7;->d:I

    .line 266
    .line 267
    add-int/2addr v12, v10

    .line 268
    if-ge v8, v12, :cond_11

    .line 269
    .line 270
    sub-int/2addr v12, v8

    .line 271
    add-int/lit8 v8, v8, 0x1

    .line 272
    .line 273
    const/4 v10, 0x0

    .line 274
    const/4 v11, 0x2

    .line 275
    invoke-virtual {v13, v10, v11, v8, v12}, Ld7;->A(Ljava/lang/Object;III)Lc7;

    .line 276
    .line 277
    .line 278
    move-result-object v18

    .line 279
    iget v8, v15, Lc7;->b:I

    .line 280
    .line 281
    iget v11, v7, Lc7;->b:I

    .line 282
    .line 283
    sub-int/2addr v8, v11

    .line 284
    iput v8, v7, Lc7;->d:I

    .line 285
    .line 286
    move-object/from16 v8, v18

    .line 287
    .line 288
    goto :goto_d

    .line 289
    :goto_c
    move-object v8, v10

    .line 290
    :goto_d
    if-eqz v17, :cond_13

    .line 291
    .line 292
    invoke-virtual {v4, v5, v7}, Ljava/util/ArrayList;->set(ILjava/lang/Object;)Ljava/lang/Object;

    .line 293
    .line 294
    .line 295
    invoke-virtual {v4, v9}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    .line 296
    .line 297
    .line 298
    iput-object v10, v15, Lc7;->c:Ljava/lang/Object;

    .line 299
    .line 300
    invoke-virtual {v14, v15}, Ler5;->d(Ljava/lang/Object;)Z

    .line 301
    .line 302
    .line 303
    goto/16 :goto_0

    .line 304
    .line 305
    :cond_13
    if-eqz v6, :cond_17

    .line 306
    .line 307
    if-eqz v8, :cond_15

    .line 308
    .line 309
    iget v6, v15, Lc7;->b:I

    .line 310
    .line 311
    iget v10, v8, Lc7;->b:I

    .line 312
    .line 313
    if-le v6, v10, :cond_14

    .line 314
    .line 315
    iget v10, v8, Lc7;->d:I

    .line 316
    .line 317
    sub-int/2addr v6, v10

    .line 318
    iput v6, v15, Lc7;->b:I

    .line 319
    .line 320
    :cond_14
    iget v6, v15, Lc7;->d:I

    .line 321
    .line 322
    iget v10, v8, Lc7;->b:I

    .line 323
    .line 324
    if-le v6, v10, :cond_15

    .line 325
    .line 326
    iget v10, v8, Lc7;->d:I

    .line 327
    .line 328
    sub-int/2addr v6, v10

    .line 329
    iput v6, v15, Lc7;->d:I

    .line 330
    .line 331
    :cond_15
    iget v6, v15, Lc7;->b:I

    .line 332
    .line 333
    iget v10, v7, Lc7;->b:I

    .line 334
    .line 335
    if-le v6, v10, :cond_16

    .line 336
    .line 337
    iget v10, v7, Lc7;->d:I

    .line 338
    .line 339
    sub-int/2addr v6, v10

    .line 340
    iput v6, v15, Lc7;->b:I

    .line 341
    .line 342
    :cond_16
    iget v6, v15, Lc7;->d:I

    .line 343
    .line 344
    iget v10, v7, Lc7;->b:I

    .line 345
    .line 346
    if-le v6, v10, :cond_1b

    .line 347
    .line 348
    iget v10, v7, Lc7;->d:I

    .line 349
    .line 350
    sub-int/2addr v6, v10

    .line 351
    iput v6, v15, Lc7;->d:I

    .line 352
    .line 353
    goto :goto_e

    .line 354
    :cond_17
    if-eqz v8, :cond_19

    .line 355
    .line 356
    iget v6, v15, Lc7;->b:I

    .line 357
    .line 358
    iget v10, v8, Lc7;->b:I

    .line 359
    .line 360
    if-lt v6, v10, :cond_18

    .line 361
    .line 362
    iget v10, v8, Lc7;->d:I

    .line 363
    .line 364
    sub-int/2addr v6, v10

    .line 365
    iput v6, v15, Lc7;->b:I

    .line 366
    .line 367
    :cond_18
    iget v6, v15, Lc7;->d:I

    .line 368
    .line 369
    iget v10, v8, Lc7;->b:I

    .line 370
    .line 371
    if-lt v6, v10, :cond_19

    .line 372
    .line 373
    iget v10, v8, Lc7;->d:I

    .line 374
    .line 375
    sub-int/2addr v6, v10

    .line 376
    iput v6, v15, Lc7;->d:I

    .line 377
    .line 378
    :cond_19
    iget v6, v15, Lc7;->b:I

    .line 379
    .line 380
    iget v10, v7, Lc7;->b:I

    .line 381
    .line 382
    if-lt v6, v10, :cond_1a

    .line 383
    .line 384
    iget v10, v7, Lc7;->d:I

    .line 385
    .line 386
    sub-int/2addr v6, v10

    .line 387
    iput v6, v15, Lc7;->b:I

    .line 388
    .line 389
    :cond_1a
    iget v6, v15, Lc7;->d:I

    .line 390
    .line 391
    iget v10, v7, Lc7;->b:I

    .line 392
    .line 393
    if-lt v6, v10, :cond_1b

    .line 394
    .line 395
    iget v10, v7, Lc7;->d:I

    .line 396
    .line 397
    sub-int/2addr v6, v10

    .line 398
    iput v6, v15, Lc7;->d:I

    .line 399
    .line 400
    :cond_1b
    :goto_e
    invoke-virtual {v4, v5, v7}, Ljava/util/ArrayList;->set(ILjava/lang/Object;)Ljava/lang/Object;

    .line 401
    .line 402
    .line 403
    iget v6, v15, Lc7;->b:I

    .line 404
    .line 405
    iget v7, v15, Lc7;->d:I

    .line 406
    .line 407
    if-eq v6, v7, :cond_1c

    .line 408
    .line 409
    invoke-virtual {v4, v9, v15}, Ljava/util/ArrayList;->set(ILjava/lang/Object;)Ljava/lang/Object;

    .line 410
    .line 411
    .line 412
    goto :goto_f

    .line 413
    :cond_1c
    invoke-virtual {v4, v9}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    .line 414
    .line 415
    .line 416
    :goto_f
    if-eqz v8, :cond_0

    .line 417
    .line 418
    invoke-virtual {v4, v5, v8}, Ljava/util/ArrayList;->add(ILjava/lang/Object;)V

    .line 419
    .line 420
    .line 421
    goto/16 :goto_0

    .line 422
    .line 423
    :cond_1d
    iget v6, v15, Lc7;->d:I

    .line 424
    .line 425
    iget v8, v7, Lc7;->b:I

    .line 426
    .line 427
    if-ge v6, v8, :cond_1e

    .line 428
    .line 429
    const/16 v16, -0x1

    .line 430
    .line 431
    goto :goto_10

    .line 432
    :cond_1e
    const/16 v16, 0x0

    .line 433
    .line 434
    :goto_10
    iget v10, v15, Lc7;->b:I

    .line 435
    .line 436
    if-ge v10, v8, :cond_1f

    .line 437
    .line 438
    add-int/lit8 v16, v16, 0x1

    .line 439
    .line 440
    :cond_1f
    if-gt v8, v10, :cond_20

    .line 441
    .line 442
    iget v8, v7, Lc7;->d:I

    .line 443
    .line 444
    add-int/2addr v10, v8

    .line 445
    iput v10, v15, Lc7;->b:I

    .line 446
    .line 447
    :cond_20
    iget v8, v7, Lc7;->b:I

    .line 448
    .line 449
    if-gt v8, v6, :cond_21

    .line 450
    .line 451
    iget v10, v7, Lc7;->d:I

    .line 452
    .line 453
    add-int/2addr v6, v10

    .line 454
    iput v6, v15, Lc7;->d:I

    .line 455
    .line 456
    :cond_21
    add-int v8, v8, v16

    .line 457
    .line 458
    iput v8, v7, Lc7;->b:I

    .line 459
    .line 460
    invoke-virtual {v4, v5, v7}, Ljava/util/ArrayList;->set(ILjava/lang/Object;)Ljava/lang/Object;

    .line 461
    .line 462
    .line 463
    invoke-virtual {v4, v9, v15}, Ljava/util/ArrayList;->set(ILjava/lang/Object;)Ljava/lang/Object;

    .line 464
    .line 465
    .line 466
    goto/16 :goto_0

    .line 467
    .line 468
    :cond_22
    invoke-virtual {v4}, Ljava/util/ArrayList;->size()I

    .line 469
    .line 470
    .line 471
    move-result v3

    .line 472
    const/4 v5, 0x0

    .line 473
    :goto_11
    if-ge v5, v3, :cond_36

    .line 474
    .line 475
    invoke-virtual {v4, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 476
    .line 477
    .line 478
    move-result-object v6

    .line 479
    check-cast v6, Lc7;

    .line 480
    .line 481
    iget-byte v7, v6, Lc7;->a:B

    .line 482
    .line 483
    const/4 v8, 0x1

    .line 484
    if-eq v7, v8, :cond_35

    .line 485
    .line 486
    const/4 v8, 0x2

    .line 487
    if-eq v7, v8, :cond_2c

    .line 488
    .line 489
    if-eq v7, v11, :cond_24

    .line 490
    .line 491
    if-eq v7, v9, :cond_23

    .line 492
    .line 493
    :goto_12
    const/4 v8, 0x2

    .line 494
    const/4 v15, 0x0

    .line 495
    const/16 v19, 0x1

    .line 496
    .line 497
    goto/16 :goto_1f

    .line 498
    .line 499
    :cond_23
    invoke-virtual {v0, v6}, Ld7;->G(Lc7;)V

    .line 500
    .line 501
    .line 502
    goto :goto_12

    .line 503
    :cond_24
    iget v7, v6, Lc7;->b:I

    .line 504
    .line 505
    iget v8, v6, Lc7;->d:I

    .line 506
    .line 507
    add-int/2addr v8, v7

    .line 508
    move v10, v7

    .line 509
    const/4 v12, 0x0

    .line 510
    const/4 v13, -0x1

    .line 511
    :goto_13
    if-ge v7, v8, :cond_29

    .line 512
    .line 513
    invoke-virtual {v2, v7}, Lx86;->b(I)Landroidx/recyclerview/widget/l;

    .line 514
    .line 515
    .line 516
    move-result-object v14

    .line 517
    if-nez v14, :cond_27

    .line 518
    .line 519
    invoke-virtual {v0, v7}, Ld7;->d(I)Z

    .line 520
    .line 521
    .line 522
    move-result v14

    .line 523
    if-eqz v14, :cond_25

    .line 524
    .line 525
    goto :goto_15

    .line 526
    :cond_25
    const/4 v14, 0x1

    .line 527
    if-ne v13, v14, :cond_26

    .line 528
    .line 529
    iget-object v13, v6, Lc7;->c:Ljava/lang/Object;

    .line 530
    .line 531
    invoke-virtual {v0, v13, v11, v10, v12}, Ld7;->A(Ljava/lang/Object;III)Lc7;

    .line 532
    .line 533
    .line 534
    move-result-object v10

    .line 535
    invoke-virtual {v0, v10}, Ld7;->G(Lc7;)V

    .line 536
    .line 537
    .line 538
    move v10, v7

    .line 539
    const/4 v12, 0x0

    .line 540
    :cond_26
    const/4 v13, 0x0

    .line 541
    :goto_14
    const/16 v19, 0x1

    .line 542
    .line 543
    goto :goto_16

    .line 544
    :cond_27
    :goto_15
    if-nez v13, :cond_28

    .line 545
    .line 546
    iget-object v13, v6, Lc7;->c:Ljava/lang/Object;

    .line 547
    .line 548
    invoke-virtual {v0, v13, v11, v10, v12}, Ld7;->A(Ljava/lang/Object;III)Lc7;

    .line 549
    .line 550
    .line 551
    move-result-object v10

    .line 552
    invoke-virtual {v0, v10}, Ld7;->p(Lc7;)V

    .line 553
    .line 554
    .line 555
    move v10, v7

    .line 556
    const/4 v12, 0x0

    .line 557
    :cond_28
    const/4 v13, 0x1

    .line 558
    goto :goto_14

    .line 559
    :goto_16
    add-int/lit8 v12, v12, 0x1

    .line 560
    .line 561
    add-int/lit8 v7, v7, 0x1

    .line 562
    .line 563
    goto :goto_13

    .line 564
    :cond_29
    iget v7, v6, Lc7;->d:I

    .line 565
    .line 566
    if-eq v12, v7, :cond_2a

    .line 567
    .line 568
    iget-object v7, v6, Lc7;->c:Ljava/lang/Object;

    .line 569
    .line 570
    const/4 v8, 0x0

    .line 571
    iput-object v8, v6, Lc7;->c:Ljava/lang/Object;

    .line 572
    .line 573
    invoke-virtual {v1, v6}, Ler5;->d(Ljava/lang/Object;)Z

    .line 574
    .line 575
    .line 576
    invoke-virtual {v0, v7, v11, v10, v12}, Ld7;->A(Ljava/lang/Object;III)Lc7;

    .line 577
    .line 578
    .line 579
    move-result-object v6

    .line 580
    :cond_2a
    if-nez v13, :cond_2b

    .line 581
    .line 582
    invoke-virtual {v0, v6}, Ld7;->p(Lc7;)V

    .line 583
    .line 584
    .line 585
    goto :goto_12

    .line 586
    :cond_2b
    invoke-virtual {v0, v6}, Ld7;->G(Lc7;)V

    .line 587
    .line 588
    .line 589
    goto :goto_12

    .line 590
    :cond_2c
    iget v7, v6, Lc7;->b:I

    .line 591
    .line 592
    iget v8, v6, Lc7;->d:I

    .line 593
    .line 594
    add-int/2addr v8, v7

    .line 595
    move v10, v7

    .line 596
    const/4 v12, 0x0

    .line 597
    const/4 v13, -0x1

    .line 598
    :goto_17
    if-ge v10, v8, :cond_32

    .line 599
    .line 600
    invoke-virtual {v2, v10}, Lx86;->b(I)Landroidx/recyclerview/widget/l;

    .line 601
    .line 602
    .line 603
    move-result-object v14

    .line 604
    if-nez v14, :cond_2d

    .line 605
    .line 606
    invoke-virtual {v0, v10}, Ld7;->d(I)Z

    .line 607
    .line 608
    .line 609
    move-result v14

    .line 610
    if-eqz v14, :cond_2e

    .line 611
    .line 612
    :cond_2d
    const/4 v14, 0x2

    .line 613
    const/4 v15, 0x0

    .line 614
    goto :goto_19

    .line 615
    :cond_2e
    const/4 v14, 0x1

    .line 616
    if-ne v13, v14, :cond_2f

    .line 617
    .line 618
    const/4 v14, 0x2

    .line 619
    const/4 v15, 0x0

    .line 620
    invoke-virtual {v0, v15, v14, v7, v12}, Ld7;->A(Ljava/lang/Object;III)Lc7;

    .line 621
    .line 622
    .line 623
    move-result-object v13

    .line 624
    invoke-virtual {v0, v13}, Ld7;->G(Lc7;)V

    .line 625
    .line 626
    .line 627
    const/4 v13, 0x1

    .line 628
    goto :goto_18

    .line 629
    :cond_2f
    const/4 v14, 0x2

    .line 630
    const/4 v15, 0x0

    .line 631
    const/4 v13, 0x0

    .line 632
    :goto_18
    const/4 v14, 0x0

    .line 633
    goto :goto_1b

    .line 634
    :goto_19
    if-nez v13, :cond_30

    .line 635
    .line 636
    invoke-virtual {v0, v15, v14, v7, v12}, Ld7;->A(Ljava/lang/Object;III)Lc7;

    .line 637
    .line 638
    .line 639
    move-result-object v13

    .line 640
    invoke-virtual {v0, v13}, Ld7;->p(Lc7;)V

    .line 641
    .line 642
    .line 643
    const/4 v13, 0x1

    .line 644
    goto :goto_1a

    .line 645
    :cond_30
    const/4 v13, 0x0

    .line 646
    :goto_1a
    const/4 v14, 0x1

    .line 647
    :goto_1b
    if-eqz v13, :cond_31

    .line 648
    .line 649
    sub-int/2addr v10, v12

    .line 650
    sub-int/2addr v8, v12

    .line 651
    const/4 v12, 0x1

    .line 652
    :goto_1c
    const/16 v19, 0x1

    .line 653
    .line 654
    goto :goto_1d

    .line 655
    :cond_31
    add-int/lit8 v12, v12, 0x1

    .line 656
    .line 657
    goto :goto_1c

    .line 658
    :goto_1d
    add-int/lit8 v10, v10, 0x1

    .line 659
    .line 660
    move v13, v14

    .line 661
    goto :goto_17

    .line 662
    :cond_32
    const/16 v19, 0x1

    .line 663
    .line 664
    iget v8, v6, Lc7;->d:I

    .line 665
    .line 666
    if-eq v12, v8, :cond_33

    .line 667
    .line 668
    const/4 v15, 0x0

    .line 669
    iput-object v15, v6, Lc7;->c:Ljava/lang/Object;

    .line 670
    .line 671
    invoke-virtual {v1, v6}, Ler5;->d(Ljava/lang/Object;)Z

    .line 672
    .line 673
    .line 674
    const/4 v8, 0x2

    .line 675
    invoke-virtual {v0, v15, v8, v7, v12}, Ld7;->A(Ljava/lang/Object;III)Lc7;

    .line 676
    .line 677
    .line 678
    move-result-object v6

    .line 679
    goto :goto_1e

    .line 680
    :cond_33
    const/4 v8, 0x2

    .line 681
    const/4 v15, 0x0

    .line 682
    :goto_1e
    if-nez v13, :cond_34

    .line 683
    .line 684
    invoke-virtual {v0, v6}, Ld7;->p(Lc7;)V

    .line 685
    .line 686
    .line 687
    goto :goto_1f

    .line 688
    :cond_34
    invoke-virtual {v0, v6}, Ld7;->G(Lc7;)V

    .line 689
    .line 690
    .line 691
    goto :goto_1f

    .line 692
    :cond_35
    move/from16 v19, v8

    .line 693
    .line 694
    const/4 v8, 0x2

    .line 695
    const/4 v15, 0x0

    .line 696
    invoke-virtual {v0, v6}, Ld7;->G(Lc7;)V

    .line 697
    .line 698
    .line 699
    :goto_1f
    add-int/lit8 v5, v5, 0x1

    .line 700
    .line 701
    goto/16 :goto_11

    .line 702
    .line 703
    :cond_36
    invoke-virtual {v4}, Ljava/util/ArrayList;->clear()V

    .line 704
    .line 705
    .line 706
    return-void
.end method

.method public I(I)I
    .locals 0

    .line 1
    iget-object p0, p0, Ld7;->g:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, Ljava/lang/String;

    .line 4
    .line 5
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    .line 6
    .line 7
    .line 8
    move-result p0

    .line 9
    if-ge p1, p0, :cond_0

    .line 10
    .line 11
    return p1

    .line 12
    :cond_0
    const/4 p0, -0x1

    .line 13
    return p0
.end method

.method public J(Ljava/util/ArrayList;)V
    .locals 4

    .line 1
    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x0

    .line 6
    :goto_0
    if-ge v1, v0, :cond_0

    .line 7
    .line 8
    invoke-virtual {p1, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    move-result-object v2

    .line 12
    check-cast v2, Lc7;

    .line 13
    .line 14
    const/4 v3, 0x0

    .line 15
    iput-object v3, v2, Lc7;->c:Ljava/lang/Object;

    .line 16
    .line 17
    iget-object v3, p0, Ld7;->c:Ljava/lang/Object;

    .line 18
    .line 19
    check-cast v3, Ler5;

    .line 20
    .line 21
    invoke-virtual {v3, v2}, Ler5;->d(Ljava/lang/Object;)Z

    .line 22
    .line 23
    .line 24
    add-int/lit8 v1, v1, 0x1

    .line 25
    .line 26
    goto :goto_0

    .line 27
    :cond_0
    invoke-virtual {p1}, Ljava/util/ArrayList;->clear()V

    .line 28
    .line 29
    .line 30
    return-void
.end method

.method public K(Lw03;)V
    .locals 5

    .line 1
    iget-object v0, p0, Ld7;->c:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, [Lw03;

    .line 4
    .line 5
    invoke-static {p1, v0}, Leu;->v0(Ljava/lang/Object;[Ljava/lang/Object;)I

    .line 6
    .line 7
    .line 8
    move-result p1

    .line 9
    if-ltz p1, :cond_0

    .line 10
    .line 11
    iget-object v0, p0, Ld7;->c:Ljava/lang/Object;

    .line 12
    .line 13
    check-cast v0, [Lw03;

    .line 14
    .line 15
    add-int/lit8 v1, p1, 0x1

    .line 16
    .line 17
    iget v2, p0, Ld7;->b:I

    .line 18
    .line 19
    invoke-static {v0, v0, p1, v1, v2}, Leu;->g0([Ljava/lang/Object;[Ljava/lang/Object;III)V

    .line 20
    .line 21
    .line 22
    iget-object v0, p0, Ld7;->c:Ljava/lang/Object;

    .line 23
    .line 24
    check-cast v0, [Lw03;

    .line 25
    .line 26
    iget v2, p0, Ld7;->b:I

    .line 27
    .line 28
    add-int/lit8 v3, v2, -0x1

    .line 29
    .line 30
    const/4 v4, 0x0

    .line 31
    aput-object v4, v0, v3

    .line 32
    .line 33
    iget-object v0, p0, Ld7;->d:Ljava/lang/Object;

    .line 34
    .line 35
    check-cast v0, [F

    .line 36
    .line 37
    sub-int/2addr v2, v1

    .line 38
    invoke-static {v0, v1, v0, p1, v2}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 39
    .line 40
    .line 41
    iget-object v0, p0, Ld7;->e:Ljava/lang/Object;

    .line 42
    .line 43
    check-cast v0, [B

    .line 44
    .line 45
    iget v2, p0, Ld7;->b:I

    .line 46
    .line 47
    invoke-static {p1, v1, v2, v0, v0}, Leu;->d0(III[B[B)V

    .line 48
    .line 49
    .line 50
    iget p1, p0, Ld7;->b:I

    .line 51
    .line 52
    add-int/lit8 p1, p1, -0x1

    .line 53
    .line 54
    iput p1, p0, Ld7;->b:I

    .line 55
    .line 56
    :cond_0
    return-void
.end method

.method public L(Landroid/content/res/ColorStateList;)V
    .locals 1

    .line 1
    if-eqz p1, :cond_1

    .line 2
    .line 3
    iget-object v0, p0, Ld7;->e:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast v0, Lz11;

    .line 6
    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    new-instance v0, Lz11;

    .line 10
    .line 11
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 12
    .line 13
    .line 14
    iput-object v0, p0, Ld7;->e:Ljava/lang/Object;

    .line 15
    .line 16
    :cond_0
    iput-object p1, v0, Lz11;->c:Ljava/lang/Object;

    .line 17
    .line 18
    const/4 p1, 0x1

    .line 19
    iput-boolean p1, v0, Lz11;->b:Z

    .line 20
    .line 21
    goto :goto_0

    .line 22
    :cond_1
    const/4 p1, 0x0

    .line 23
    iput-object p1, p0, Ld7;->e:Ljava/lang/Object;

    .line 24
    .line 25
    :goto_0
    invoke-virtual {p0}, Ld7;->b()V

    .line 26
    .line 27
    .line 28
    return-void
.end method

.method public M(Landroid/content/res/ColorStateList;)V
    .locals 1

    .line 1
    iget-object v0, p0, Ld7;->f:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lz11;

    .line 4
    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    new-instance v0, Lz11;

    .line 8
    .line 9
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 10
    .line 11
    .line 12
    iput-object v0, p0, Ld7;->f:Ljava/lang/Object;

    .line 13
    .line 14
    :cond_0
    iput-object p1, v0, Lz11;->c:Ljava/lang/Object;

    .line 15
    .line 16
    const/4 p1, 0x1

    .line 17
    iput-boolean p1, v0, Lz11;->b:Z

    .line 18
    .line 19
    invoke-virtual {p0}, Ld7;->b()V

    .line 20
    .line 21
    .line 22
    return-void
.end method

.method public N(Landroid/graphics/PorterDuff$Mode;)V
    .locals 1

    .line 1
    iget-object v0, p0, Ld7;->f:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lz11;

    .line 4
    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    new-instance v0, Lz11;

    .line 8
    .line 9
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 10
    .line 11
    .line 12
    iput-object v0, p0, Ld7;->f:Ljava/lang/Object;

    .line 13
    .line 14
    :cond_0
    iput-object p1, v0, Lz11;->d:Ljava/io/Serializable;

    .line 15
    .line 16
    const/4 p1, 0x1

    .line 17
    iput-boolean p1, v0, Lz11;->a:Z

    .line 18
    .line 19
    invoke-virtual {p0}, Ld7;->b()V

    .line 20
    .line 21
    .line 22
    return-void
.end method

.method public O()I
    .locals 4

    .line 1
    iget v0, p0, Ld7;->b:I

    .line 2
    .line 3
    const/4 v1, -0x1

    .line 4
    if-ne v0, v1, :cond_0

    .line 5
    .line 6
    return v0

    .line 7
    :cond_0
    iget-object v1, p0, Ld7;->g:Ljava/lang/Object;

    .line 8
    .line 9
    check-cast v1, Ljava/lang/String;

    .line 10
    .line 11
    :goto_0
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    .line 12
    .line 13
    .line 14
    move-result v2

    .line 15
    if-ge v0, v2, :cond_2

    .line 16
    .line 17
    invoke-virtual {v1, v0}, Ljava/lang/String;->charAt(I)C

    .line 18
    .line 19
    .line 20
    move-result v2

    .line 21
    const/16 v3, 0x20

    .line 22
    .line 23
    if-eq v2, v3, :cond_1

    .line 24
    .line 25
    const/16 v3, 0xa

    .line 26
    .line 27
    if-eq v2, v3, :cond_1

    .line 28
    .line 29
    const/16 v3, 0xd

    .line 30
    .line 31
    if-eq v2, v3, :cond_1

    .line 32
    .line 33
    const/16 v3, 0x9

    .line 34
    .line 35
    if-ne v2, v3, :cond_2

    .line 36
    .line 37
    :cond_1
    add-int/lit8 v0, v0, 0x1

    .line 38
    .line 39
    goto :goto_0

    .line 40
    :cond_2
    iput v0, p0, Ld7;->b:I

    .line 41
    .line 42
    return v0
.end method

.method public P()Z
    .locals 4

    .line 1
    invoke-virtual {p0}, Ld7;->O()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    iget-object v1, p0, Ld7;->g:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast v1, Ljava/lang/String;

    .line 8
    .line 9
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    .line 10
    .line 11
    .line 12
    move-result v2

    .line 13
    const/4 v3, 0x0

    .line 14
    if-ge v0, v2, :cond_1

    .line 15
    .line 16
    const/4 v2, -0x1

    .line 17
    if-ne v0, v2, :cond_0

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    invoke-virtual {v1, v0}, Ljava/lang/String;->charAt(I)C

    .line 21
    .line 22
    .line 23
    move-result v0

    .line 24
    const/16 v1, 0x2c

    .line 25
    .line 26
    if-ne v0, v1, :cond_1

    .line 27
    .line 28
    iget v0, p0, Ld7;->b:I

    .line 29
    .line 30
    const/4 v1, 0x1

    .line 31
    add-int/2addr v0, v1

    .line 32
    iput v0, p0, Ld7;->b:I

    .line 33
    .line 34
    return v1

    .line 35
    :cond_1
    :goto_0
    return v3
.end method

.method public Q(C)V
    .locals 6

    .line 1
    iget-object v0, p0, Ld7;->g:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Ljava/lang/String;

    .line 4
    .line 5
    iget v1, p0, Ld7;->b:I

    .line 6
    .line 7
    const/4 v2, 0x0

    .line 8
    if-lez v1, :cond_1

    .line 9
    .line 10
    const/16 v3, 0x22

    .line 11
    .line 12
    if-ne p1, v3, :cond_1

    .line 13
    .line 14
    add-int/lit8 v3, v1, -0x1

    .line 15
    .line 16
    :try_start_0
    iput v3, p0, Ld7;->b:I

    .line 17
    .line 18
    invoke-virtual {p0}, Ld7;->m()Ljava/lang/String;

    .line 19
    .line 20
    .line 21
    move-result-object v3
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 22
    iput v1, p0, Ld7;->b:I

    .line 23
    .line 24
    const-string v1, "null"

    .line 25
    .line 26
    invoke-static {v3, v1}, Ldh3;->f(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 27
    .line 28
    .line 29
    move-result v1

    .line 30
    if-nez v1, :cond_0

    .line 31
    .line 32
    goto :goto_0

    .line 33
    :cond_0
    iget p1, p0, Ld7;->b:I

    .line 34
    .line 35
    add-int/lit8 p1, p1, -0x1

    .line 36
    .line 37
    const-string v0, "Use \'coerceInputValues = true\' in \'Json {}\' builder to coerce nulls if property has a default value."

    .line 38
    .line 39
    const-string v1, "Expected string literal but \'null\' literal was found"

    .line 40
    .line 41
    invoke-virtual {p0, v1, p1, v0}, Ld7;->r(Ljava/lang/String;ILjava/lang/String;)V

    .line 42
    .line 43
    .line 44
    throw v2

    .line 45
    :catchall_0
    move-exception p1

    .line 46
    iput v1, p0, Ld7;->b:I

    .line 47
    .line 48
    throw p1

    .line 49
    :cond_1
    :goto_0
    invoke-static {p1}, Lx97;->g(C)B

    .line 50
    .line 51
    .line 52
    move-result p1

    .line 53
    invoke-static {p1}, Lx97;->Z(B)Ljava/lang/String;

    .line 54
    .line 55
    .line 56
    move-result-object p1

    .line 57
    iget v1, p0, Ld7;->b:I

    .line 58
    .line 59
    if-lez v1, :cond_2

    .line 60
    .line 61
    add-int/lit8 v3, v1, -0x1

    .line 62
    .line 63
    goto :goto_1

    .line 64
    :cond_2
    move v3, v1

    .line 65
    :goto_1
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 66
    .line 67
    .line 68
    move-result v4

    .line 69
    if-eq v1, v4, :cond_4

    .line 70
    .line 71
    if-gez v3, :cond_3

    .line 72
    .line 73
    goto :goto_2

    .line 74
    :cond_3
    invoke-virtual {v0, v3}, Ljava/lang/String;->charAt(I)C

    .line 75
    .line 76
    .line 77
    move-result v0

    .line 78
    invoke-static {v0}, Ljava/lang/String;->valueOf(C)Ljava/lang/String;

    .line 79
    .line 80
    .line 81
    move-result-object v0

    .line 82
    goto :goto_3

    .line 83
    :cond_4
    :goto_2
    const-string v0, "EOF"

    .line 84
    .line 85
    :goto_3
    const-string v1, ", but had \'"

    .line 86
    .line 87
    const-string v4, "\' instead"

    .line 88
    .line 89
    const-string v5, "Expected "

    .line 90
    .line 91
    invoke-static {v5, p1, v1, v0, v4}, Lpc6;->q(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 92
    .line 93
    .line 94
    move-result-object p1

    .line 95
    const/4 v0, 0x4

    .line 96
    invoke-static {p0, p1, v3, v2, v0}, Ld7;->s(Ld7;Ljava/lang/String;ILjava/lang/String;I)V

    .line 97
    .line 98
    .line 99
    throw v2
.end method

.method public R(II)I
    .locals 9

    .line 1
    iget-object v0, p0, Ld7;->c:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Ler5;

    .line 4
    .line 5
    iget-object p0, p0, Ld7;->e:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast p0, Ljava/util/ArrayList;

    .line 8
    .line 9
    invoke-virtual {p0}, Ljava/util/ArrayList;->size()I

    .line 10
    .line 11
    .line 12
    move-result v1

    .line 13
    const/4 v2, 0x1

    .line 14
    sub-int/2addr v1, v2

    .line 15
    :goto_0
    const/16 v3, 0x8

    .line 16
    .line 17
    if-ltz v1, :cond_d

    .line 18
    .line 19
    invoke-virtual {p0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    move-result-object v4

    .line 23
    check-cast v4, Lc7;

    .line 24
    .line 25
    iget-byte v5, v4, Lc7;->a:B

    .line 26
    .line 27
    iget v6, v4, Lc7;->b:I

    .line 28
    .line 29
    const/4 v7, 0x2

    .line 30
    if-ne v5, v3, :cond_8

    .line 31
    .line 32
    iget v3, v4, Lc7;->d:I

    .line 33
    .line 34
    if-ge v6, v3, :cond_0

    .line 35
    .line 36
    move v8, v3

    .line 37
    move v5, v6

    .line 38
    goto :goto_1

    .line 39
    :cond_0
    move v5, v3

    .line 40
    move v8, v6

    .line 41
    :goto_1
    if-lt p1, v5, :cond_6

    .line 42
    .line 43
    if-gt p1, v8, :cond_6

    .line 44
    .line 45
    if-ne v5, v6, :cond_3

    .line 46
    .line 47
    if-ne p2, v2, :cond_1

    .line 48
    .line 49
    add-int/lit8 v3, v3, 0x1

    .line 50
    .line 51
    iput v3, v4, Lc7;->d:I

    .line 52
    .line 53
    goto :goto_2

    .line 54
    :cond_1
    if-ne p2, v7, :cond_2

    .line 55
    .line 56
    add-int/lit8 v3, v3, -0x1

    .line 57
    .line 58
    iput v3, v4, Lc7;->d:I

    .line 59
    .line 60
    :cond_2
    :goto_2
    add-int/lit8 p1, p1, 0x1

    .line 61
    .line 62
    goto :goto_4

    .line 63
    :cond_3
    if-ne p2, v2, :cond_4

    .line 64
    .line 65
    add-int/lit8 v6, v6, 0x1

    .line 66
    .line 67
    iput v6, v4, Lc7;->b:I

    .line 68
    .line 69
    goto :goto_3

    .line 70
    :cond_4
    if-ne p2, v7, :cond_5

    .line 71
    .line 72
    add-int/lit8 v6, v6, -0x1

    .line 73
    .line 74
    iput v6, v4, Lc7;->b:I

    .line 75
    .line 76
    :cond_5
    :goto_3
    add-int/lit8 p1, p1, -0x1

    .line 77
    .line 78
    goto :goto_4

    .line 79
    :cond_6
    if-ge p1, v6, :cond_c

    .line 80
    .line 81
    if-ne p2, v2, :cond_7

    .line 82
    .line 83
    add-int/lit8 v6, v6, 0x1

    .line 84
    .line 85
    iput v6, v4, Lc7;->b:I

    .line 86
    .line 87
    add-int/lit8 v3, v3, 0x1

    .line 88
    .line 89
    iput v3, v4, Lc7;->d:I

    .line 90
    .line 91
    goto :goto_4

    .line 92
    :cond_7
    if-ne p2, v7, :cond_c

    .line 93
    .line 94
    add-int/lit8 v6, v6, -0x1

    .line 95
    .line 96
    iput v6, v4, Lc7;->b:I

    .line 97
    .line 98
    add-int/lit8 v3, v3, -0x1

    .line 99
    .line 100
    iput v3, v4, Lc7;->d:I

    .line 101
    .line 102
    goto :goto_4

    .line 103
    :cond_8
    if-gt v6, p1, :cond_a

    .line 104
    .line 105
    if-ne v5, v2, :cond_9

    .line 106
    .line 107
    iget v3, v4, Lc7;->d:I

    .line 108
    .line 109
    sub-int/2addr p1, v3

    .line 110
    goto :goto_4

    .line 111
    :cond_9
    if-ne v5, v7, :cond_c

    .line 112
    .line 113
    iget v3, v4, Lc7;->d:I

    .line 114
    .line 115
    add-int/2addr p1, v3

    .line 116
    goto :goto_4

    .line 117
    :cond_a
    if-ne p2, v2, :cond_b

    .line 118
    .line 119
    add-int/lit8 v6, v6, 0x1

    .line 120
    .line 121
    iput v6, v4, Lc7;->b:I

    .line 122
    .line 123
    goto :goto_4

    .line 124
    :cond_b
    if-ne p2, v7, :cond_c

    .line 125
    .line 126
    add-int/lit8 v6, v6, -0x1

    .line 127
    .line 128
    iput v6, v4, Lc7;->b:I

    .line 129
    .line 130
    :cond_c
    :goto_4
    add-int/lit8 v1, v1, -0x1

    .line 131
    .line 132
    goto :goto_0

    .line 133
    :cond_d
    invoke-virtual {p0}, Ljava/util/ArrayList;->size()I

    .line 134
    .line 135
    .line 136
    move-result p2

    .line 137
    sub-int/2addr p2, v2

    .line 138
    :goto_5
    if-ltz p2, :cond_11

    .line 139
    .line 140
    invoke-virtual {p0, p2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 141
    .line 142
    .line 143
    move-result-object v1

    .line 144
    check-cast v1, Lc7;

    .line 145
    .line 146
    iget-byte v2, v1, Lc7;->a:B

    .line 147
    .line 148
    iget v4, v1, Lc7;->d:I

    .line 149
    .line 150
    const/4 v5, 0x0

    .line 151
    if-ne v2, v3, :cond_f

    .line 152
    .line 153
    iget v2, v1, Lc7;->b:I

    .line 154
    .line 155
    if-eq v4, v2, :cond_e

    .line 156
    .line 157
    if-gez v4, :cond_10

    .line 158
    .line 159
    :cond_e
    invoke-virtual {p0, p2}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    .line 160
    .line 161
    .line 162
    iput-object v5, v1, Lc7;->c:Ljava/lang/Object;

    .line 163
    .line 164
    invoke-virtual {v0, v1}, Ler5;->d(Ljava/lang/Object;)Z

    .line 165
    .line 166
    .line 167
    goto :goto_6

    .line 168
    :cond_f
    if-gtz v4, :cond_10

    .line 169
    .line 170
    invoke-virtual {p0, p2}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    .line 171
    .line 172
    .line 173
    iput-object v5, v1, Lc7;->c:Ljava/lang/Object;

    .line 174
    .line 175
    invoke-virtual {v0, v1}, Ler5;->d(Ljava/lang/Object;)Z

    .line 176
    .line 177
    .line 178
    :cond_10
    :goto_6
    add-int/lit8 p2, p2, -0x1

    .line 179
    .line 180
    goto :goto_5

    .line 181
    :cond_11
    return p1
.end method

.method public a(Ljava/lang/CharSequence;I)I
    .locals 4

    .line 1
    add-int/lit8 v0, p2, 0x4

    .line 2
    .line 3
    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    if-lt v0, v1, :cond_1

    .line 8
    .line 9
    iput p2, p0, Ld7;->b:I

    .line 10
    .line 11
    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    .line 12
    .line 13
    .line 14
    move-result p2

    .line 15
    if-ge v0, p2, :cond_0

    .line 16
    .line 17
    iget p2, p0, Ld7;->b:I

    .line 18
    .line 19
    invoke-virtual {p0, p1, p2}, Ld7;->a(Ljava/lang/CharSequence;I)I

    .line 20
    .line 21
    .line 22
    move-result p0

    .line 23
    return p0

    .line 24
    :cond_0
    const/4 p1, 0x0

    .line 25
    const/4 p2, 0x6

    .line 26
    const-string v0, "Unexpected EOF during unicode escape"

    .line 27
    .line 28
    const/4 v1, 0x0

    .line 29
    invoke-static {p0, v0, p1, v1, p2}, Ld7;->s(Ld7;Ljava/lang/String;ILjava/lang/String;I)V

    .line 30
    .line 31
    .line 32
    throw v1

    .line 33
    :cond_1
    iget-object v1, p0, Ld7;->f:Ljava/lang/Object;

    .line 34
    .line 35
    check-cast v1, Ljava/lang/StringBuilder;

    .line 36
    .line 37
    invoke-virtual {p0, p1, p2}, Ld7;->u(Ljava/lang/CharSequence;I)I

    .line 38
    .line 39
    .line 40
    move-result v2

    .line 41
    shl-int/lit8 v2, v2, 0xc

    .line 42
    .line 43
    add-int/lit8 v3, p2, 0x1

    .line 44
    .line 45
    invoke-virtual {p0, p1, v3}, Ld7;->u(Ljava/lang/CharSequence;I)I

    .line 46
    .line 47
    .line 48
    move-result v3

    .line 49
    shl-int/lit8 v3, v3, 0x8

    .line 50
    .line 51
    add-int/2addr v2, v3

    .line 52
    add-int/lit8 v3, p2, 0x2

    .line 53
    .line 54
    invoke-virtual {p0, p1, v3}, Ld7;->u(Ljava/lang/CharSequence;I)I

    .line 55
    .line 56
    .line 57
    move-result v3

    .line 58
    shl-int/lit8 v3, v3, 0x4

    .line 59
    .line 60
    add-int/2addr v2, v3

    .line 61
    add-int/lit8 p2, p2, 0x3

    .line 62
    .line 63
    invoke-virtual {p0, p1, p2}, Ld7;->u(Ljava/lang/CharSequence;I)I

    .line 64
    .line 65
    .line 66
    move-result p0

    .line 67
    add-int/2addr p0, v2

    .line 68
    int-to-char p0, p0

    .line 69
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 70
    .line 71
    .line 72
    return v0
.end method

.method public b()V
    .locals 5

    .line 1
    iget-object v0, p0, Ld7;->c:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Landroid/view/View;

    .line 4
    .line 5
    invoke-virtual {v0}, Landroid/view/View;->getBackground()Landroid/graphics/drawable/Drawable;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    if-eqz v1, :cond_6

    .line 10
    .line 11
    iget-object v2, p0, Ld7;->e:Ljava/lang/Object;

    .line 12
    .line 13
    check-cast v2, Lz11;

    .line 14
    .line 15
    if-eqz v2, :cond_4

    .line 16
    .line 17
    iget-object v2, p0, Ld7;->g:Ljava/lang/Object;

    .line 18
    .line 19
    check-cast v2, Lz11;

    .line 20
    .line 21
    if-nez v2, :cond_0

    .line 22
    .line 23
    new-instance v2, Lz11;

    .line 24
    .line 25
    invoke-direct {v2}, Ljava/lang/Object;-><init>()V

    .line 26
    .line 27
    .line 28
    iput-object v2, p0, Ld7;->g:Ljava/lang/Object;

    .line 29
    .line 30
    :cond_0
    const/4 v3, 0x0

    .line 31
    iput-object v3, v2, Lz11;->c:Ljava/lang/Object;

    .line 32
    .line 33
    const/4 v4, 0x0

    .line 34
    iput-boolean v4, v2, Lz11;->b:Z

    .line 35
    .line 36
    iput-object v3, v2, Lz11;->d:Ljava/io/Serializable;

    .line 37
    .line 38
    iput-boolean v4, v2, Lz11;->a:Z

    .line 39
    .line 40
    sget-object v3, Lcw8;->a:Ljava/util/WeakHashMap;

    .line 41
    .line 42
    invoke-virtual {v0}, Landroid/view/View;->getBackgroundTintList()Landroid/content/res/ColorStateList;

    .line 43
    .line 44
    .line 45
    move-result-object v3

    .line 46
    const/4 v4, 0x1

    .line 47
    if-eqz v3, :cond_1

    .line 48
    .line 49
    iput-boolean v4, v2, Lz11;->b:Z

    .line 50
    .line 51
    iput-object v3, v2, Lz11;->c:Ljava/lang/Object;

    .line 52
    .line 53
    :cond_1
    invoke-virtual {v0}, Landroid/view/View;->getBackgroundTintMode()Landroid/graphics/PorterDuff$Mode;

    .line 54
    .line 55
    .line 56
    move-result-object v3

    .line 57
    if-eqz v3, :cond_2

    .line 58
    .line 59
    iput-boolean v4, v2, Lz11;->a:Z

    .line 60
    .line 61
    iput-object v3, v2, Lz11;->d:Ljava/io/Serializable;

    .line 62
    .line 63
    :cond_2
    iget-boolean v3, v2, Lz11;->b:Z

    .line 64
    .line 65
    if-nez v3, :cond_3

    .line 66
    .line 67
    iget-boolean v3, v2, Lz11;->a:Z

    .line 68
    .line 69
    if-eqz v3, :cond_4

    .line 70
    .line 71
    :cond_3
    invoke-virtual {v0}, Landroid/view/View;->getDrawableState()[I

    .line 72
    .line 73
    .line 74
    move-result-object p0

    .line 75
    sget-object v0, Laq;->b:Landroid/graphics/PorterDuff$Mode;

    .line 76
    .line 77
    invoke-static {v1, v2, p0}, Lrf6;->h(Landroid/graphics/drawable/Drawable;Lz11;[I)V

    .line 78
    .line 79
    .line 80
    return-void

    .line 81
    :cond_4
    iget-object v2, p0, Ld7;->f:Ljava/lang/Object;

    .line 82
    .line 83
    check-cast v2, Lz11;

    .line 84
    .line 85
    if-eqz v2, :cond_5

    .line 86
    .line 87
    invoke-virtual {v0}, Landroid/view/View;->getDrawableState()[I

    .line 88
    .line 89
    .line 90
    move-result-object p0

    .line 91
    sget-object v0, Laq;->b:Landroid/graphics/PorterDuff$Mode;

    .line 92
    .line 93
    invoke-static {v1, v2, p0}, Lrf6;->h(Landroid/graphics/drawable/Drawable;Lz11;[I)V

    .line 94
    .line 95
    .line 96
    return-void

    .line 97
    :cond_5
    iget-object p0, p0, Ld7;->e:Ljava/lang/Object;

    .line 98
    .line 99
    check-cast p0, Lz11;

    .line 100
    .line 101
    if-eqz p0, :cond_6

    .line 102
    .line 103
    invoke-virtual {v0}, Landroid/view/View;->getDrawableState()[I

    .line 104
    .line 105
    .line 106
    move-result-object v0

    .line 107
    sget-object v2, Laq;->b:Landroid/graphics/PorterDuff$Mode;

    .line 108
    .line 109
    invoke-static {v1, p0, v0}, Lrf6;->h(Landroid/graphics/drawable/Drawable;Lz11;[I)V

    .line 110
    .line 111
    .line 112
    :cond_6
    return-void
.end method

.method public c()Z
    .locals 5

    .line 1
    iget v0, p0, Ld7;->b:I

    .line 2
    .line 3
    const/4 v1, -0x1

    .line 4
    const/4 v2, 0x0

    .line 5
    if-ne v0, v1, :cond_0

    .line 6
    .line 7
    return v2

    .line 8
    :cond_0
    iget-object v1, p0, Ld7;->g:Ljava/lang/Object;

    .line 9
    .line 10
    check-cast v1, Ljava/lang/String;

    .line 11
    .line 12
    :goto_0
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    .line 13
    .line 14
    .line 15
    move-result v3

    .line 16
    if-ge v0, v3, :cond_4

    .line 17
    .line 18
    invoke-virtual {v1, v0}, Ljava/lang/String;->charAt(I)C

    .line 19
    .line 20
    .line 21
    move-result v3

    .line 22
    const/16 v4, 0x20

    .line 23
    .line 24
    if-eq v3, v4, :cond_3

    .line 25
    .line 26
    const/16 v4, 0xa

    .line 27
    .line 28
    if-eq v3, v4, :cond_3

    .line 29
    .line 30
    const/16 v4, 0xd

    .line 31
    .line 32
    if-eq v3, v4, :cond_3

    .line 33
    .line 34
    const/16 v4, 0x9

    .line 35
    .line 36
    if-ne v3, v4, :cond_1

    .line 37
    .line 38
    goto :goto_1

    .line 39
    :cond_1
    iput v0, p0, Ld7;->b:I

    .line 40
    .line 41
    const/16 p0, 0x2c

    .line 42
    .line 43
    if-eq v3, p0, :cond_2

    .line 44
    .line 45
    const/16 p0, 0x3a

    .line 46
    .line 47
    if-eq v3, p0, :cond_2

    .line 48
    .line 49
    const/16 p0, 0x5d

    .line 50
    .line 51
    if-eq v3, p0, :cond_2

    .line 52
    .line 53
    const/16 p0, 0x7d

    .line 54
    .line 55
    if-eq v3, p0, :cond_2

    .line 56
    .line 57
    const/4 p0, 0x1

    .line 58
    return p0

    .line 59
    :cond_2
    return v2

    .line 60
    :cond_3
    :goto_1
    add-int/lit8 v0, v0, 0x1

    .line 61
    .line 62
    goto :goto_0

    .line 63
    :cond_4
    iput v0, p0, Ld7;->b:I

    .line 64
    .line 65
    return v2
.end method

.method public d(I)Z
    .locals 8

    .line 1
    iget-object v0, p0, Ld7;->e:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Ljava/util/ArrayList;

    .line 4
    .line 5
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    const/4 v2, 0x0

    .line 10
    move v3, v2

    .line 11
    :goto_0
    if-ge v3, v1, :cond_3

    .line 12
    .line 13
    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object v4

    .line 17
    check-cast v4, Lc7;

    .line 18
    .line 19
    iget-byte v5, v4, Lc7;->a:B

    .line 20
    .line 21
    const/16 v6, 0x8

    .line 22
    .line 23
    const/4 v7, 0x1

    .line 24
    if-ne v5, v6, :cond_0

    .line 25
    .line 26
    iget v4, v4, Lc7;->d:I

    .line 27
    .line 28
    add-int/lit8 v5, v3, 0x1

    .line 29
    .line 30
    invoke-virtual {p0, v4, v5}, Ld7;->t(II)I

    .line 31
    .line 32
    .line 33
    move-result v4

    .line 34
    if-ne v4, p1, :cond_2

    .line 35
    .line 36
    goto :goto_2

    .line 37
    :cond_0
    if-ne v5, v7, :cond_2

    .line 38
    .line 39
    iget v5, v4, Lc7;->b:I

    .line 40
    .line 41
    iget v4, v4, Lc7;->d:I

    .line 42
    .line 43
    add-int/2addr v4, v5

    .line 44
    :goto_1
    if-ge v5, v4, :cond_2

    .line 45
    .line 46
    add-int/lit8 v6, v3, 0x1

    .line 47
    .line 48
    invoke-virtual {p0, v5, v6}, Ld7;->t(II)I

    .line 49
    .line 50
    .line 51
    move-result v6

    .line 52
    if-ne v6, p1, :cond_1

    .line 53
    .line 54
    :goto_2
    return v7

    .line 55
    :cond_1
    add-int/lit8 v5, v5, 0x1

    .line 56
    .line 57
    goto :goto_1

    .line 58
    :cond_2
    add-int/lit8 v3, v3, 0x1

    .line 59
    .line 60
    goto :goto_0

    .line 61
    :cond_3
    return v2
.end method

.method public e(ILjava/lang/String;)V
    .locals 8

    .line 1
    iget-object v0, p0, Ld7;->g:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Ljava/lang/String;

    .line 4
    .line 5
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    sub-int/2addr v1, p1

    .line 10
    invoke-virtual {p2}, Ljava/lang/String;->length()I

    .line 11
    .line 12
    .line 13
    move-result v2

    .line 14
    const/4 v3, 0x6

    .line 15
    const/4 v4, 0x0

    .line 16
    const/4 v5, 0x0

    .line 17
    if-lt v1, v2, :cond_2

    .line 18
    .line 19
    invoke-virtual {p2}, Ljava/lang/String;->length()I

    .line 20
    .line 21
    .line 22
    move-result v1

    .line 23
    move v2, v4

    .line 24
    :goto_0
    if-ge v2, v1, :cond_1

    .line 25
    .line 26
    invoke-virtual {p2, v2}, Ljava/lang/String;->charAt(I)C

    .line 27
    .line 28
    .line 29
    move-result v6

    .line 30
    add-int v7, p1, v2

    .line 31
    .line 32
    invoke-virtual {v0, v7}, Ljava/lang/String;->charAt(I)C

    .line 33
    .line 34
    .line 35
    move-result v7

    .line 36
    or-int/lit8 v7, v7, 0x20

    .line 37
    .line 38
    if-ne v6, v7, :cond_0

    .line 39
    .line 40
    add-int/lit8 v2, v2, 0x1

    .line 41
    .line 42
    goto :goto_0

    .line 43
    :cond_0
    new-instance p1, Ljava/lang/StringBuilder;

    .line 44
    .line 45
    const-string p2, "Expected valid boolean literal prefix, but had \'"

    .line 46
    .line 47
    invoke-direct {p1, p2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 48
    .line 49
    .line 50
    invoke-virtual {p0}, Ld7;->m()Ljava/lang/String;

    .line 51
    .line 52
    .line 53
    move-result-object p2

    .line 54
    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 55
    .line 56
    .line 57
    const/16 p2, 0x27

    .line 58
    .line 59
    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 60
    .line 61
    .line 62
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 63
    .line 64
    .line 65
    move-result-object p1

    .line 66
    invoke-static {p0, p1, v4, v5, v3}, Ld7;->s(Ld7;Ljava/lang/String;ILjava/lang/String;I)V

    .line 67
    .line 68
    .line 69
    throw v5

    .line 70
    :cond_1
    invoke-virtual {p2}, Ljava/lang/String;->length()I

    .line 71
    .line 72
    .line 73
    move-result p2

    .line 74
    add-int/2addr p2, p1

    .line 75
    iput p2, p0, Ld7;->b:I

    .line 76
    .line 77
    return-void

    .line 78
    :cond_2
    const-string p1, "Unexpected end of boolean literal"

    .line 79
    .line 80
    invoke-static {p0, p1, v4, v5, v3}, Ld7;->s(Ld7;Ljava/lang/String;ILjava/lang/String;I)V

    .line 81
    .line 82
    .line 83
    throw v5
.end method

.method public f()Ljava/lang/String;
    .locals 14

    .line 1
    iget-object v0, p0, Ld7;->f:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Ljava/lang/StringBuilder;

    .line 4
    .line 5
    iget-object v1, p0, Ld7;->g:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast v1, Ljava/lang/String;

    .line 8
    .line 9
    const/16 v2, 0x22

    .line 10
    .line 11
    invoke-virtual {p0, v2}, Ld7;->i(C)V

    .line 12
    .line 13
    .line 14
    iget v3, p0, Ld7;->b:I

    .line 15
    .line 16
    const/4 v4, 0x4

    .line 17
    invoke-static {v1, v2, v3, v4}, Lfm7;->l0(Ljava/lang/CharSequence;CII)I

    .line 18
    .line 19
    .line 20
    move-result v5

    .line 21
    const/4 v6, 0x0

    .line 22
    const/4 v7, -0x1

    .line 23
    if-ne v5, v7, :cond_2

    .line 24
    .line 25
    invoke-virtual {p0}, Ld7;->m()Ljava/lang/String;

    .line 26
    .line 27
    .line 28
    iget v0, p0, Ld7;->b:I

    .line 29
    .line 30
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    .line 31
    .line 32
    .line 33
    move-result v2

    .line 34
    if-eq v0, v2, :cond_1

    .line 35
    .line 36
    if-gez v0, :cond_0

    .line 37
    .line 38
    goto :goto_0

    .line 39
    :cond_0
    invoke-virtual {v1, v0}, Ljava/lang/String;->charAt(I)C

    .line 40
    .line 41
    .line 42
    move-result v1

    .line 43
    invoke-static {v1}, Ljava/lang/String;->valueOf(C)Ljava/lang/String;

    .line 44
    .line 45
    .line 46
    move-result-object v1

    .line 47
    goto :goto_1

    .line 48
    :cond_1
    :goto_0
    const-string v1, "EOF"

    .line 49
    .line 50
    :goto_1
    const-string v2, "Expected quotation mark \'\"\', but had \'"

    .line 51
    .line 52
    const-string v3, "\' instead"

    .line 53
    .line 54
    invoke-static {v2, v1, v3}, Lpc6;->p(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 55
    .line 56
    .line 57
    move-result-object v1

    .line 58
    invoke-static {p0, v1, v0, v6, v4}, Ld7;->s(Ld7;Ljava/lang/String;ILjava/lang/String;I)V

    .line 59
    .line 60
    .line 61
    throw v6

    .line 62
    :cond_2
    move v8, v3

    .line 63
    :goto_2
    if-ge v8, v5, :cond_e

    .line 64
    .line 65
    invoke-virtual {v1, v8}, Ljava/lang/String;->charAt(I)C

    .line 66
    .line 67
    .line 68
    move-result v9

    .line 69
    const/16 v10, 0x5c

    .line 70
    .line 71
    if-ne v9, v10, :cond_d

    .line 72
    .line 73
    iget v3, p0, Ld7;->b:I

    .line 74
    .line 75
    invoke-virtual {v1, v8}, Ljava/lang/String;->charAt(I)C

    .line 76
    .line 77
    .line 78
    move-result v5

    .line 79
    const/4 v9, 0x0

    .line 80
    move v11, v9

    .line 81
    :goto_3
    const/4 v12, 0x1

    .line 82
    if-eq v5, v2, :cond_b

    .line 83
    .line 84
    const-string v13, "Unexpected EOF"

    .line 85
    .line 86
    if-ne v5, v10, :cond_8

    .line 87
    .line 88
    invoke-virtual {v0, v1, v3, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/CharSequence;II)Ljava/lang/StringBuilder;

    .line 89
    .line 90
    .line 91
    add-int/lit8 v8, v8, 0x1

    .line 92
    .line 93
    invoke-virtual {p0, v8}, Ld7;->I(I)I

    .line 94
    .line 95
    .line 96
    move-result v3

    .line 97
    const/4 v5, 0x6

    .line 98
    if-eq v3, v7, :cond_7

    .line 99
    .line 100
    add-int/lit8 v8, v3, 0x1

    .line 101
    .line 102
    invoke-virtual {v1, v3}, Ljava/lang/String;->charAt(I)C

    .line 103
    .line 104
    .line 105
    move-result v3

    .line 106
    const/16 v11, 0x75

    .line 107
    .line 108
    if-ne v3, v11, :cond_3

    .line 109
    .line 110
    invoke-virtual {p0, v1, v8}, Ld7;->a(Ljava/lang/CharSequence;I)I

    .line 111
    .line 112
    .line 113
    move-result v8

    .line 114
    goto :goto_5

    .line 115
    :cond_3
    if-ge v3, v11, :cond_4

    .line 116
    .line 117
    sget-object v11, Lzp0;->a:[C

    .line 118
    .line 119
    aget-char v11, v11, v3

    .line 120
    .line 121
    goto :goto_4

    .line 122
    :cond_4
    move v11, v9

    .line 123
    :goto_4
    if-eqz v11, :cond_6

    .line 124
    .line 125
    invoke-virtual {v0, v11}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 126
    .line 127
    .line 128
    :goto_5
    invoke-virtual {p0, v8}, Ld7;->I(I)I

    .line 129
    .line 130
    .line 131
    move-result v3

    .line 132
    if-eq v3, v7, :cond_5

    .line 133
    .line 134
    :goto_6
    move v8, v3

    .line 135
    move v11, v12

    .line 136
    goto :goto_7

    .line 137
    :cond_5
    invoke-static {p0, v13, v3, v6, v4}, Ld7;->s(Ld7;Ljava/lang/String;ILjava/lang/String;I)V

    .line 138
    .line 139
    .line 140
    throw v6

    .line 141
    :cond_6
    new-instance v0, Ljava/lang/StringBuilder;

    .line 142
    .line 143
    const-string v1, "Invalid escaped char \'"

    .line 144
    .line 145
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 146
    .line 147
    .line 148
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 149
    .line 150
    .line 151
    const/16 v1, 0x27

    .line 152
    .line 153
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 154
    .line 155
    .line 156
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 157
    .line 158
    .line 159
    move-result-object v0

    .line 160
    invoke-static {p0, v0, v9, v6, v5}, Ld7;->s(Ld7;Ljava/lang/String;ILjava/lang/String;I)V

    .line 161
    .line 162
    .line 163
    throw v6

    .line 164
    :cond_7
    const-string v0, "Expected escape sequence to continue, got EOF"

    .line 165
    .line 166
    invoke-static {p0, v0, v9, v6, v5}, Ld7;->s(Ld7;Ljava/lang/String;ILjava/lang/String;I)V

    .line 167
    .line 168
    .line 169
    throw v6

    .line 170
    :cond_8
    add-int/lit8 v8, v8, 0x1

    .line 171
    .line 172
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    .line 173
    .line 174
    .line 175
    move-result v5

    .line 176
    if-lt v8, v5, :cond_a

    .line 177
    .line 178
    invoke-virtual {v0, v1, v3, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/CharSequence;II)Ljava/lang/StringBuilder;

    .line 179
    .line 180
    .line 181
    invoke-virtual {p0, v8}, Ld7;->I(I)I

    .line 182
    .line 183
    .line 184
    move-result v3

    .line 185
    if-eq v3, v7, :cond_9

    .line 186
    .line 187
    goto :goto_6

    .line 188
    :cond_9
    invoke-static {p0, v13, v3, v6, v4}, Ld7;->s(Ld7;Ljava/lang/String;ILjava/lang/String;I)V

    .line 189
    .line 190
    .line 191
    throw v6

    .line 192
    :cond_a
    :goto_7
    invoke-virtual {v1, v8}, Ljava/lang/String;->charAt(I)C

    .line 193
    .line 194
    .line 195
    move-result v5

    .line 196
    goto :goto_3

    .line 197
    :cond_b
    if-nez v11, :cond_c

    .line 198
    .line 199
    invoke-virtual {v1, v3, v8}, Ljava/lang/String;->subSequence(II)Ljava/lang/CharSequence;

    .line 200
    .line 201
    .line 202
    move-result-object v0

    .line 203
    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 204
    .line 205
    .line 206
    move-result-object v0

    .line 207
    goto :goto_8

    .line 208
    :cond_c
    invoke-virtual {v0, v1, v3, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/CharSequence;II)Ljava/lang/StringBuilder;

    .line 209
    .line 210
    .line 211
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 212
    .line 213
    .line 214
    move-result-object v1

    .line 215
    invoke-virtual {v0, v9}, Ljava/lang/StringBuilder;->setLength(I)V

    .line 216
    .line 217
    .line 218
    move-object v0, v1

    .line 219
    :goto_8
    add-int/2addr v8, v12

    .line 220
    iput v8, p0, Ld7;->b:I

    .line 221
    .line 222
    return-object v0

    .line 223
    :cond_d
    add-int/lit8 v8, v8, 0x1

    .line 224
    .line 225
    goto/16 :goto_2

    .line 226
    .line 227
    :cond_e
    add-int/lit8 v0, v5, 0x1

    .line 228
    .line 229
    iput v0, p0, Ld7;->b:I

    .line 230
    .line 231
    invoke-virtual {v1, v3, v5}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 232
    .line 233
    .line 234
    move-result-object p0

    .line 235
    return-object p0
.end method

.method public g()B
    .locals 5

    .line 1
    iget-object v0, p0, Ld7;->g:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Ljava/lang/String;

    .line 4
    .line 5
    iget v1, p0, Ld7;->b:I

    .line 6
    .line 7
    :goto_0
    const/4 v2, -0x1

    .line 8
    const/16 v3, 0xa

    .line 9
    .line 10
    if-eq v1, v2, :cond_2

    .line 11
    .line 12
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 13
    .line 14
    .line 15
    move-result v2

    .line 16
    if-ge v1, v2, :cond_2

    .line 17
    .line 18
    add-int/lit8 v2, v1, 0x1

    .line 19
    .line 20
    invoke-virtual {v0, v1}, Ljava/lang/String;->charAt(I)C

    .line 21
    .line 22
    .line 23
    move-result v1

    .line 24
    const/16 v4, 0x20

    .line 25
    .line 26
    if-eq v1, v4, :cond_1

    .line 27
    .line 28
    if-eq v1, v3, :cond_1

    .line 29
    .line 30
    const/16 v3, 0xd

    .line 31
    .line 32
    if-eq v1, v3, :cond_1

    .line 33
    .line 34
    const/16 v3, 0x9

    .line 35
    .line 36
    if-ne v1, v3, :cond_0

    .line 37
    .line 38
    goto :goto_1

    .line 39
    :cond_0
    iput v2, p0, Ld7;->b:I

    .line 40
    .line 41
    invoke-static {v1}, Lx97;->g(C)B

    .line 42
    .line 43
    .line 44
    move-result p0

    .line 45
    return p0

    .line 46
    :cond_1
    :goto_1
    move v1, v2

    .line 47
    goto :goto_0

    .line 48
    :cond_2
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 49
    .line 50
    .line 51
    move-result v0

    .line 52
    iput v0, p0, Ld7;->b:I

    .line 53
    .line 54
    return v3
.end method

.method public h(B)B
    .locals 5

    .line 1
    iget-object v0, p0, Ld7;->g:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Ljava/lang/String;

    .line 4
    .line 5
    invoke-virtual {p0}, Ld7;->g()B

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    if-eq v1, p1, :cond_3

    .line 10
    .line 11
    invoke-static {p1}, Lx97;->Z(B)Ljava/lang/String;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    iget v1, p0, Ld7;->b:I

    .line 16
    .line 17
    if-lez v1, :cond_0

    .line 18
    .line 19
    add-int/lit8 v2, v1, -0x1

    .line 20
    .line 21
    goto :goto_0

    .line 22
    :cond_0
    move v2, v1

    .line 23
    :goto_0
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 24
    .line 25
    .line 26
    move-result v3

    .line 27
    if-eq v1, v3, :cond_2

    .line 28
    .line 29
    if-gez v2, :cond_1

    .line 30
    .line 31
    goto :goto_1

    .line 32
    :cond_1
    invoke-virtual {v0, v2}, Ljava/lang/String;->charAt(I)C

    .line 33
    .line 34
    .line 35
    move-result v0

    .line 36
    invoke-static {v0}, Ljava/lang/String;->valueOf(C)Ljava/lang/String;

    .line 37
    .line 38
    .line 39
    move-result-object v0

    .line 40
    goto :goto_2

    .line 41
    :cond_2
    :goto_1
    const-string v0, "EOF"

    .line 42
    .line 43
    :goto_2
    const-string v1, ", but had \'"

    .line 44
    .line 45
    const-string v3, "\' instead"

    .line 46
    .line 47
    const-string v4, "Expected "

    .line 48
    .line 49
    invoke-static {v4, p1, v1, v0, v3}, Lpc6;->q(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 50
    .line 51
    .line 52
    move-result-object p1

    .line 53
    const/4 v0, 0x4

    .line 54
    const/4 v1, 0x0

    .line 55
    invoke-static {p0, p1, v2, v1, v0}, Ld7;->s(Ld7;Ljava/lang/String;ILjava/lang/String;I)V

    .line 56
    .line 57
    .line 58
    throw v1

    .line 59
    :cond_3
    return v1
.end method

.method public i(C)V
    .locals 6

    .line 1
    iget v0, p0, Ld7;->b:I

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const/4 v2, -0x1

    .line 5
    if-eq v0, v2, :cond_4

    .line 6
    .line 7
    iget-object v3, p0, Ld7;->g:Ljava/lang/Object;

    .line 8
    .line 9
    check-cast v3, Ljava/lang/String;

    .line 10
    .line 11
    :goto_0
    invoke-virtual {v3}, Ljava/lang/String;->length()I

    .line 12
    .line 13
    .line 14
    move-result v4

    .line 15
    if-ge v0, v4, :cond_3

    .line 16
    .line 17
    add-int/lit8 v4, v0, 0x1

    .line 18
    .line 19
    invoke-virtual {v3, v0}, Ljava/lang/String;->charAt(I)C

    .line 20
    .line 21
    .line 22
    move-result v0

    .line 23
    const/16 v5, 0x20

    .line 24
    .line 25
    if-eq v0, v5, :cond_2

    .line 26
    .line 27
    const/16 v5, 0xa

    .line 28
    .line 29
    if-eq v0, v5, :cond_2

    .line 30
    .line 31
    const/16 v5, 0xd

    .line 32
    .line 33
    if-eq v0, v5, :cond_2

    .line 34
    .line 35
    const/16 v5, 0x9

    .line 36
    .line 37
    if-ne v0, v5, :cond_0

    .line 38
    .line 39
    goto :goto_1

    .line 40
    :cond_0
    iput v4, p0, Ld7;->b:I

    .line 41
    .line 42
    if-ne v0, p1, :cond_1

    .line 43
    .line 44
    return-void

    .line 45
    :cond_1
    invoke-virtual {p0, p1}, Ld7;->Q(C)V

    .line 46
    .line 47
    .line 48
    throw v1

    .line 49
    :cond_2
    :goto_1
    move v0, v4

    .line 50
    goto :goto_0

    .line 51
    :cond_3
    iput v2, p0, Ld7;->b:I

    .line 52
    .line 53
    invoke-virtual {p0, p1}, Ld7;->Q(C)V

    .line 54
    .line 55
    .line 56
    throw v1

    .line 57
    :cond_4
    invoke-virtual {p0, p1}, Ld7;->Q(C)V

    .line 58
    .line 59
    .line 60
    throw v1
.end method

.method public j()J
    .locals 22

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    invoke-virtual {v0}, Ld7;->O()I

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    invoke-virtual {v0, v1}, Ld7;->I(I)I

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    iget-object v2, v0, Ld7;->g:Ljava/lang/Object;

    .line 12
    .line 13
    check-cast v2, Ljava/lang/String;

    .line 14
    .line 15
    invoke-virtual {v2}, Ljava/lang/String;->length()I

    .line 16
    .line 17
    .line 18
    move-result v3

    .line 19
    const-string v4, "EOF"

    .line 20
    .line 21
    const/4 v5, 0x6

    .line 22
    const/4 v6, 0x0

    .line 23
    const/4 v7, 0x0

    .line 24
    if-ge v1, v3, :cond_1d

    .line 25
    .line 26
    const/4 v3, -0x1

    .line 27
    if-eq v1, v3, :cond_1d

    .line 28
    .line 29
    invoke-virtual {v2, v1}, Ljava/lang/String;->charAt(I)C

    .line 30
    .line 31
    .line 32
    move-result v3

    .line 33
    const/16 v8, 0x22

    .line 34
    .line 35
    if-ne v3, v8, :cond_1

    .line 36
    .line 37
    add-int/lit8 v1, v1, 0x1

    .line 38
    .line 39
    invoke-virtual {v2}, Ljava/lang/String;->length()I

    .line 40
    .line 41
    .line 42
    move-result v3

    .line 43
    if-eq v1, v3, :cond_0

    .line 44
    .line 45
    const/4 v3, 0x1

    .line 46
    goto :goto_0

    .line 47
    :cond_0
    invoke-static {v0, v4, v7, v6, v5}, Ld7;->s(Ld7;Ljava/lang/String;ILjava/lang/String;I)V

    .line 48
    .line 49
    .line 50
    throw v6

    .line 51
    :cond_1
    move v3, v7

    .line 52
    :goto_0
    move v12, v1

    .line 53
    move v11, v7

    .line 54
    move v13, v11

    .line 55
    move v14, v13

    .line 56
    const-wide/16 v9, 0x0

    .line 57
    .line 58
    const-wide/16 v16, 0x0

    .line 59
    .line 60
    const-wide/16 v18, 0x0

    .line 61
    .line 62
    :goto_1
    invoke-virtual {v2}, Ljava/lang/String;->length()I

    .line 63
    .line 64
    .line 65
    move-result v15

    .line 66
    const-string v8, "Numeric value overflow"

    .line 67
    .line 68
    if-eq v12, v15, :cond_e

    .line 69
    .line 70
    invoke-virtual {v2, v12}, Ljava/lang/String;->charAt(I)C

    .line 71
    .line 72
    .line 73
    move-result v15

    .line 74
    const/16 v7, 0x65

    .line 75
    .line 76
    const-string v5, "\' in numeric literal"

    .line 77
    .line 78
    const-string v6, "Unexpected symbol \'"

    .line 79
    .line 80
    if-eq v15, v7, :cond_3

    .line 81
    .line 82
    const/16 v7, 0x45

    .line 83
    .line 84
    if-ne v15, v7, :cond_2

    .line 85
    .line 86
    goto :goto_2

    .line 87
    :cond_2
    move/from16 v20, v3

    .line 88
    .line 89
    const/4 v7, 0x4

    .line 90
    goto :goto_3

    .line 91
    :cond_3
    :goto_2
    if-nez v13, :cond_2

    .line 92
    .line 93
    if-eq v12, v1, :cond_4

    .line 94
    .line 95
    add-int/lit8 v12, v12, 0x1

    .line 96
    .line 97
    const/4 v5, 0x6

    .line 98
    const/4 v6, 0x0

    .line 99
    const/4 v7, 0x0

    .line 100
    const/16 v8, 0x22

    .line 101
    .line 102
    const/4 v11, 0x1

    .line 103
    const/4 v13, 0x1

    .line 104
    goto :goto_1

    .line 105
    :cond_4
    new-instance v1, Ljava/lang/StringBuilder;

    .line 106
    .line 107
    invoke-direct {v1, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 108
    .line 109
    .line 110
    invoke-virtual {v1, v15}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 111
    .line 112
    .line 113
    invoke-virtual {v1, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 114
    .line 115
    .line 116
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 117
    .line 118
    .line 119
    move-result-object v1

    .line 120
    const/4 v2, 0x0

    .line 121
    const/4 v7, 0x4

    .line 122
    invoke-static {v0, v1, v12, v2, v7}, Ld7;->s(Ld7;Ljava/lang/String;ILjava/lang/String;I)V

    .line 123
    .line 124
    .line 125
    throw v2

    .line 126
    :goto_3
    const-string v3, "Unexpected symbol \'-\' in numeric literal"

    .line 127
    .line 128
    const/16 v7, 0x2d

    .line 129
    .line 130
    if-ne v15, v7, :cond_6

    .line 131
    .line 132
    if-eqz v13, :cond_6

    .line 133
    .line 134
    if-eq v12, v1, :cond_5

    .line 135
    .line 136
    add-int/lit8 v12, v12, 0x1

    .line 137
    .line 138
    move/from16 v3, v20

    .line 139
    .line 140
    const/4 v5, 0x6

    .line 141
    const/4 v6, 0x0

    .line 142
    const/4 v7, 0x0

    .line 143
    const/16 v8, 0x22

    .line 144
    .line 145
    const/4 v11, 0x0

    .line 146
    goto :goto_1

    .line 147
    :cond_5
    const/4 v5, 0x0

    .line 148
    const/4 v7, 0x4

    .line 149
    invoke-static {v0, v3, v12, v5, v7}, Ld7;->s(Ld7;Ljava/lang/String;ILjava/lang/String;I)V

    .line 150
    .line 151
    .line 152
    throw v5

    .line 153
    :cond_6
    const/4 v7, 0x0

    .line 154
    const/16 v7, 0x2b

    .line 155
    .line 156
    if-ne v15, v7, :cond_8

    .line 157
    .line 158
    if-eqz v13, :cond_8

    .line 159
    .line 160
    if-eq v12, v1, :cond_7

    .line 161
    .line 162
    add-int/lit8 v12, v12, 0x1

    .line 163
    .line 164
    move/from16 v3, v20

    .line 165
    .line 166
    const/4 v5, 0x6

    .line 167
    const/4 v6, 0x0

    .line 168
    const/4 v7, 0x0

    .line 169
    const/16 v8, 0x22

    .line 170
    .line 171
    const/4 v11, 0x1

    .line 172
    goto :goto_1

    .line 173
    :cond_7
    const-string v1, "Unexpected symbol \'+\' in numeric literal"

    .line 174
    .line 175
    const/4 v2, 0x0

    .line 176
    const/4 v7, 0x4

    .line 177
    invoke-static {v0, v1, v12, v2, v7}, Ld7;->s(Ld7;Ljava/lang/String;ILjava/lang/String;I)V

    .line 178
    .line 179
    .line 180
    throw v2

    .line 181
    :cond_8
    move/from16 v21, v13

    .line 182
    .line 183
    const/4 v13, 0x0

    .line 184
    const/16 v7, 0x2d

    .line 185
    .line 186
    if-ne v15, v7, :cond_a

    .line 187
    .line 188
    if-ne v12, v1, :cond_9

    .line 189
    .line 190
    add-int/lit8 v12, v12, 0x1

    .line 191
    .line 192
    move-object v6, v13

    .line 193
    move/from16 v3, v20

    .line 194
    .line 195
    move/from16 v13, v21

    .line 196
    .line 197
    const/4 v5, 0x6

    .line 198
    const/4 v7, 0x0

    .line 199
    const/16 v8, 0x22

    .line 200
    .line 201
    const/4 v14, 0x1

    .line 202
    goto/16 :goto_1

    .line 203
    .line 204
    :cond_9
    const/4 v7, 0x4

    .line 205
    invoke-static {v0, v3, v12, v13, v7}, Ld7;->s(Ld7;Ljava/lang/String;ILjava/lang/String;I)V

    .line 206
    .line 207
    .line 208
    throw v13

    .line 209
    :cond_a
    invoke-static {v15}, Lx97;->g(C)B

    .line 210
    .line 211
    .line 212
    move-result v3

    .line 213
    if-nez v3, :cond_f

    .line 214
    .line 215
    add-int/lit8 v3, v12, 0x1

    .line 216
    .line 217
    add-int/lit8 v7, v15, -0x30

    .line 218
    .line 219
    if-ltz v7, :cond_d

    .line 220
    .line 221
    const/16 v13, 0xa

    .line 222
    .line 223
    if-ge v7, v13, :cond_d

    .line 224
    .line 225
    const-wide/16 v5, 0xa

    .line 226
    .line 227
    if-eqz v21, :cond_b

    .line 228
    .line 229
    mul-long/2addr v9, v5

    .line 230
    int-to-long v5, v7

    .line 231
    add-long/2addr v9, v5

    .line 232
    :goto_4
    move v12, v3

    .line 233
    move/from16 v3, v20

    .line 234
    .line 235
    move/from16 v13, v21

    .line 236
    .line 237
    const/4 v5, 0x6

    .line 238
    const/4 v6, 0x0

    .line 239
    const/4 v7, 0x0

    .line 240
    const/16 v8, 0x22

    .line 241
    .line 242
    goto/16 :goto_1

    .line 243
    .line 244
    :cond_b
    mul-long v16, v16, v5

    .line 245
    .line 246
    int-to-long v5, v7

    .line 247
    sub-long v16, v16, v5

    .line 248
    .line 249
    cmp-long v5, v16, v18

    .line 250
    .line 251
    if-gtz v5, :cond_c

    .line 252
    .line 253
    goto :goto_4

    .line 254
    :cond_c
    const/4 v3, 0x6

    .line 255
    const/4 v5, 0x0

    .line 256
    const/4 v7, 0x0

    .line 257
    invoke-static {v0, v8, v5, v7, v3}, Ld7;->s(Ld7;Ljava/lang/String;ILjava/lang/String;I)V

    .line 258
    .line 259
    .line 260
    throw v7

    .line 261
    :cond_d
    const/4 v7, 0x0

    .line 262
    new-instance v1, Ljava/lang/StringBuilder;

    .line 263
    .line 264
    invoke-direct {v1, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 265
    .line 266
    .line 267
    invoke-virtual {v1, v15}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 268
    .line 269
    .line 270
    invoke-virtual {v1, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 271
    .line 272
    .line 273
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 274
    .line 275
    .line 276
    move-result-object v1

    .line 277
    const/4 v2, 0x4

    .line 278
    invoke-static {v0, v1, v12, v7, v2}, Ld7;->s(Ld7;Ljava/lang/String;ILjava/lang/String;I)V

    .line 279
    .line 280
    .line 281
    throw v7

    .line 282
    :cond_e
    move/from16 v20, v3

    .line 283
    .line 284
    move/from16 v21, v13

    .line 285
    .line 286
    :cond_f
    if-eq v12, v1, :cond_10

    .line 287
    .line 288
    const/4 v3, 0x1

    .line 289
    goto :goto_5

    .line 290
    :cond_10
    const/4 v3, 0x0

    .line 291
    :goto_5
    if-eq v1, v12, :cond_11

    .line 292
    .line 293
    if-eqz v14, :cond_12

    .line 294
    .line 295
    add-int/lit8 v5, v12, -0x1

    .line 296
    .line 297
    if-eq v1, v5, :cond_11

    .line 298
    .line 299
    goto :goto_6

    .line 300
    :cond_11
    const/4 v7, 0x0

    .line 301
    goto/16 :goto_b

    .line 302
    .line 303
    :cond_12
    :goto_6
    if-eqz v20, :cond_15

    .line 304
    .line 305
    if-eqz v3, :cond_14

    .line 306
    .line 307
    invoke-virtual {v2, v12}, Ljava/lang/String;->charAt(I)C

    .line 308
    .line 309
    .line 310
    move-result v1

    .line 311
    const/16 v2, 0x22

    .line 312
    .line 313
    if-ne v1, v2, :cond_13

    .line 314
    .line 315
    add-int/lit8 v12, v12, 0x1

    .line 316
    .line 317
    goto :goto_7

    .line 318
    :cond_13
    const-string v1, "Expected closing quotation mark"

    .line 319
    .line 320
    const/4 v2, 0x0

    .line 321
    const/4 v7, 0x4

    .line 322
    invoke-static {v0, v1, v12, v2, v7}, Ld7;->s(Ld7;Ljava/lang/String;ILjava/lang/String;I)V

    .line 323
    .line 324
    .line 325
    throw v2

    .line 326
    :cond_14
    const/4 v2, 0x0

    .line 327
    const/4 v3, 0x6

    .line 328
    const/4 v5, 0x0

    .line 329
    invoke-static {v0, v4, v5, v2, v3}, Ld7;->s(Ld7;Ljava/lang/String;ILjava/lang/String;I)V

    .line 330
    .line 331
    .line 332
    throw v2

    .line 333
    :cond_15
    :goto_7
    iput v12, v0, Ld7;->b:I

    .line 334
    .line 335
    move-wide/from16 v1, v16

    .line 336
    .line 337
    if-eqz v21, :cond_1a

    .line 338
    .line 339
    long-to-double v1, v1

    .line 340
    const-wide/high16 v3, 0x4024000000000000L    # 10.0

    .line 341
    .line 342
    if-nez v11, :cond_16

    .line 343
    .line 344
    long-to-double v5, v9

    .line 345
    neg-double v5, v5

    .line 346
    invoke-static {v3, v4, v5, v6}, Ljava/lang/Math;->pow(DD)D

    .line 347
    .line 348
    .line 349
    move-result-wide v3

    .line 350
    goto :goto_8

    .line 351
    :cond_16
    const/4 v5, 0x1

    .line 352
    if-ne v11, v5, :cond_19

    .line 353
    .line 354
    long-to-double v5, v9

    .line 355
    invoke-static {v3, v4, v5, v6}, Ljava/lang/Math;->pow(DD)D

    .line 356
    .line 357
    .line 358
    move-result-wide v3

    .line 359
    :goto_8
    mul-double/2addr v1, v3

    .line 360
    const-wide/high16 v3, 0x43e0000000000000L    # 9.223372036854776E18

    .line 361
    .line 362
    cmpl-double v3, v1, v3

    .line 363
    .line 364
    if-gtz v3, :cond_18

    .line 365
    .line 366
    const-wide/high16 v3, -0x3c20000000000000L    # -9.223372036854776E18

    .line 367
    .line 368
    cmpg-double v3, v1, v3

    .line 369
    .line 370
    if-ltz v3, :cond_18

    .line 371
    .line 372
    invoke-static {v1, v2}, Ljava/lang/Math;->floor(D)D

    .line 373
    .line 374
    .line 375
    move-result-wide v3

    .line 376
    cmpg-double v3, v3, v1

    .line 377
    .line 378
    if-nez v3, :cond_17

    .line 379
    .line 380
    double-to-long v10, v1

    .line 381
    :goto_9
    const/4 v7, 0x0

    .line 382
    goto :goto_a

    .line 383
    :cond_17
    new-instance v3, Ljava/lang/StringBuilder;

    .line 384
    .line 385
    const-string v4, "Can\'t convert "

    .line 386
    .line 387
    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 388
    .line 389
    .line 390
    invoke-virtual {v3, v1, v2}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    .line 391
    .line 392
    .line 393
    const-string v1, " to Long"

    .line 394
    .line 395
    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 396
    .line 397
    .line 398
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 399
    .line 400
    .line 401
    move-result-object v1

    .line 402
    const/4 v3, 0x6

    .line 403
    const/4 v5, 0x0

    .line 404
    const/4 v7, 0x0

    .line 405
    invoke-static {v0, v1, v5, v7, v3}, Ld7;->s(Ld7;Ljava/lang/String;ILjava/lang/String;I)V

    .line 406
    .line 407
    .line 408
    throw v7

    .line 409
    :cond_18
    const/4 v3, 0x6

    .line 410
    const/4 v5, 0x0

    .line 411
    const/4 v7, 0x0

    .line 412
    invoke-static {v0, v8, v5, v7, v3}, Ld7;->s(Ld7;Ljava/lang/String;ILjava/lang/String;I)V

    .line 413
    .line 414
    .line 415
    throw v7

    .line 416
    :cond_19
    invoke-static {}, Lb61;->c()V

    .line 417
    .line 418
    .line 419
    return-wide v18

    .line 420
    :cond_1a
    move-wide v10, v1

    .line 421
    goto :goto_9

    .line 422
    :goto_a
    if-eqz v14, :cond_1b

    .line 423
    .line 424
    return-wide v10

    .line 425
    :cond_1b
    const-wide/high16 v1, -0x8000000000000000L

    .line 426
    .line 427
    cmp-long v1, v10, v1

    .line 428
    .line 429
    if-eqz v1, :cond_1c

    .line 430
    .line 431
    neg-long v0, v10

    .line 432
    return-wide v0

    .line 433
    :cond_1c
    const/4 v3, 0x6

    .line 434
    const/4 v5, 0x0

    .line 435
    invoke-static {v0, v8, v5, v7, v3}, Ld7;->s(Ld7;Ljava/lang/String;ILjava/lang/String;I)V

    .line 436
    .line 437
    .line 438
    throw v7

    .line 439
    :goto_b
    const-string v1, "Expected numeric literal"

    .line 440
    .line 441
    const/4 v2, 0x4

    .line 442
    invoke-static {v0, v1, v12, v7, v2}, Ld7;->s(Ld7;Ljava/lang/String;ILjava/lang/String;I)V

    .line 443
    .line 444
    .line 445
    throw v7

    .line 446
    :cond_1d
    move v3, v5

    .line 447
    move v5, v7

    .line 448
    move-object v7, v6

    .line 449
    invoke-static {v0, v4, v5, v7, v3}, Ld7;->s(Ld7;Ljava/lang/String;ILjava/lang/String;I)V

    .line 450
    .line 451
    .line 452
    throw v7
.end method

.method public k()V
    .locals 6

    .line 1
    iget-object v0, p0, Ld7;->e:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Ljava/util/ArrayList;

    .line 4
    .line 5
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    const/4 v2, 0x0

    .line 10
    move v3, v2

    .line 11
    :goto_0
    if-ge v3, v1, :cond_0

    .line 12
    .line 13
    iget-object v4, p0, Ld7;->f:Ljava/lang/Object;

    .line 14
    .line 15
    check-cast v4, Lx86;

    .line 16
    .line 17
    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object v5

    .line 21
    check-cast v5, Lc7;

    .line 22
    .line 23
    invoke-virtual {v4, v5}, Lx86;->a(Lc7;)V

    .line 24
    .line 25
    .line 26
    add-int/lit8 v3, v3, 0x1

    .line 27
    .line 28
    goto :goto_0

    .line 29
    :cond_0
    invoke-virtual {p0, v0}, Ld7;->J(Ljava/util/ArrayList;)V

    .line 30
    .line 31
    .line 32
    iput v2, p0, Ld7;->b:I

    .line 33
    .line 34
    return-void
.end method

.method public l()Ljava/lang/String;
    .locals 2

    .line 1
    iget-object v0, p0, Ld7;->e:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Ljava/lang/String;

    .line 4
    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    const/4 v1, 0x0

    .line 11
    iput-object v1, p0, Ld7;->e:Ljava/lang/Object;

    .line 12
    .line 13
    return-object v0

    .line 14
    :cond_0
    invoke-virtual {p0}, Ld7;->f()Ljava/lang/String;

    .line 15
    .line 16
    .line 17
    move-result-object p0

    .line 18
    return-object p0
.end method

.method public m()Ljava/lang/String;
    .locals 8

    .line 1
    iget-object v0, p0, Ld7;->f:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Ljava/lang/StringBuilder;

    .line 4
    .line 5
    iget-object v1, p0, Ld7;->g:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast v1, Ljava/lang/String;

    .line 8
    .line 9
    iget-object v2, p0, Ld7;->e:Ljava/lang/Object;

    .line 10
    .line 11
    check-cast v2, Ljava/lang/String;

    .line 12
    .line 13
    const/4 v3, 0x0

    .line 14
    if-eqz v2, :cond_0

    .line 15
    .line 16
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 17
    .line 18
    .line 19
    iput-object v3, p0, Ld7;->e:Ljava/lang/Object;

    .line 20
    .line 21
    return-object v2

    .line 22
    :cond_0
    invoke-virtual {p0}, Ld7;->O()I

    .line 23
    .line 24
    .line 25
    move-result v2

    .line 26
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    .line 27
    .line 28
    .line 29
    move-result v4

    .line 30
    if-ge v2, v4, :cond_7

    .line 31
    .line 32
    const/4 v4, -0x1

    .line 33
    if-eq v2, v4, :cond_7

    .line 34
    .line 35
    invoke-virtual {v1, v2}, Ljava/lang/String;->charAt(I)C

    .line 36
    .line 37
    .line 38
    move-result v5

    .line 39
    invoke-static {v5}, Lx97;->g(C)B

    .line 40
    .line 41
    .line 42
    move-result v5

    .line 43
    const/4 v6, 0x1

    .line 44
    if-ne v5, v6, :cond_1

    .line 45
    .line 46
    invoke-virtual {p0}, Ld7;->l()Ljava/lang/String;

    .line 47
    .line 48
    .line 49
    move-result-object p0

    .line 50
    return-object p0

    .line 51
    :cond_1
    const/4 v7, 0x0

    .line 52
    if-nez v5, :cond_6

    .line 53
    .line 54
    move v3, v7

    .line 55
    :cond_2
    :goto_0
    invoke-virtual {v1, v2}, Ljava/lang/String;->charAt(I)C

    .line 56
    .line 57
    .line 58
    move-result v5

    .line 59
    invoke-static {v5}, Lx97;->g(C)B

    .line 60
    .line 61
    .line 62
    move-result v5

    .line 63
    if-nez v5, :cond_4

    .line 64
    .line 65
    add-int/lit8 v2, v2, 0x1

    .line 66
    .line 67
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    .line 68
    .line 69
    .line 70
    move-result v5

    .line 71
    if-lt v2, v5, :cond_2

    .line 72
    .line 73
    iget v3, p0, Ld7;->b:I

    .line 74
    .line 75
    invoke-virtual {v0, v1, v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/CharSequence;II)Ljava/lang/StringBuilder;

    .line 76
    .line 77
    .line 78
    invoke-virtual {p0, v2}, Ld7;->I(I)I

    .line 79
    .line 80
    .line 81
    move-result v3

    .line 82
    if-ne v3, v4, :cond_3

    .line 83
    .line 84
    iput v2, p0, Ld7;->b:I

    .line 85
    .line 86
    invoke-virtual {v0, v1, v7, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/CharSequence;II)Ljava/lang/StringBuilder;

    .line 87
    .line 88
    .line 89
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 90
    .line 91
    .line 92
    move-result-object p0

    .line 93
    invoke-virtual {v0, v7}, Ljava/lang/StringBuilder;->setLength(I)V

    .line 94
    .line 95
    .line 96
    return-object p0

    .line 97
    :cond_3
    move v2, v3

    .line 98
    move v3, v6

    .line 99
    goto :goto_0

    .line 100
    :cond_4
    iget v4, p0, Ld7;->b:I

    .line 101
    .line 102
    if-nez v3, :cond_5

    .line 103
    .line 104
    invoke-virtual {v1, v4, v2}, Ljava/lang/String;->subSequence(II)Ljava/lang/CharSequence;

    .line 105
    .line 106
    .line 107
    move-result-object v0

    .line 108
    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 109
    .line 110
    .line 111
    move-result-object v0

    .line 112
    goto :goto_1

    .line 113
    :cond_5
    invoke-virtual {v0, v1, v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/CharSequence;II)Ljava/lang/StringBuilder;

    .line 114
    .line 115
    .line 116
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 117
    .line 118
    .line 119
    move-result-object v1

    .line 120
    invoke-virtual {v0, v7}, Ljava/lang/StringBuilder;->setLength(I)V

    .line 121
    .line 122
    .line 123
    move-object v0, v1

    .line 124
    :goto_1
    iput v2, p0, Ld7;->b:I

    .line 125
    .line 126
    return-object v0

    .line 127
    :cond_6
    new-instance v0, Ljava/lang/StringBuilder;

    .line 128
    .line 129
    const-string v4, "Expected beginning of the string, but got "

    .line 130
    .line 131
    invoke-direct {v0, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 132
    .line 133
    .line 134
    invoke-virtual {v1, v2}, Ljava/lang/String;->charAt(I)C

    .line 135
    .line 136
    .line 137
    move-result v1

    .line 138
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 139
    .line 140
    .line 141
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 142
    .line 143
    .line 144
    move-result-object v0

    .line 145
    const/4 v1, 0x6

    .line 146
    invoke-static {p0, v0, v7, v3, v1}, Ld7;->s(Ld7;Ljava/lang/String;ILjava/lang/String;I)V

    .line 147
    .line 148
    .line 149
    throw v3

    .line 150
    :cond_7
    const-string v0, "EOF"

    .line 151
    .line 152
    const/4 v1, 0x4

    .line 153
    invoke-static {p0, v0, v2, v3, v1}, Ld7;->s(Ld7;Ljava/lang/String;ILjava/lang/String;I)V

    .line 154
    .line 155
    .line 156
    throw v3
.end method

.method public n()Ljava/lang/String;
    .locals 4

    .line 1
    invoke-virtual {p0}, Ld7;->m()Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const-string v1, "null"

    .line 6
    .line 7
    invoke-static {v0, v1}, Ldh3;->f(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    if-eqz v1, :cond_1

    .line 12
    .line 13
    iget-object v1, p0, Ld7;->g:Ljava/lang/Object;

    .line 14
    .line 15
    check-cast v1, Ljava/lang/String;

    .line 16
    .line 17
    iget v2, p0, Ld7;->b:I

    .line 18
    .line 19
    add-int/lit8 v2, v2, -0x1

    .line 20
    .line 21
    invoke-virtual {v1, v2}, Ljava/lang/String;->charAt(I)C

    .line 22
    .line 23
    .line 24
    move-result v1

    .line 25
    const/16 v2, 0x22

    .line 26
    .line 27
    if-ne v1, v2, :cond_0

    .line 28
    .line 29
    goto :goto_0

    .line 30
    :cond_0
    const/4 v0, 0x0

    .line 31
    const/4 v1, 0x6

    .line 32
    const-string v2, "Unexpected \'null\' value instead of string literal"

    .line 33
    .line 34
    const/4 v3, 0x0

    .line 35
    invoke-static {p0, v2, v0, v3, v1}, Ld7;->s(Ld7;Ljava/lang/String;ILjava/lang/String;I)V

    .line 36
    .line 37
    .line 38
    throw v3

    .line 39
    :cond_1
    :goto_0
    return-object v0
.end method

.method public o()V
    .locals 9

    .line 1
    iget-object v0, p0, Ld7;->f:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lx86;

    .line 4
    .line 5
    invoke-virtual {p0}, Ld7;->k()V

    .line 6
    .line 7
    .line 8
    iget-object v1, p0, Ld7;->d:Ljava/lang/Object;

    .line 9
    .line 10
    check-cast v1, Ljava/util/ArrayList;

    .line 11
    .line 12
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    .line 13
    .line 14
    .line 15
    move-result v2

    .line 16
    const/4 v3, 0x0

    .line 17
    move v4, v3

    .line 18
    :goto_0
    if-ge v4, v2, :cond_4

    .line 19
    .line 20
    invoke-virtual {v1, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 21
    .line 22
    .line 23
    move-result-object v5

    .line 24
    check-cast v5, Lc7;

    .line 25
    .line 26
    iget-byte v6, v5, Lc7;->a:B

    .line 27
    .line 28
    const/4 v7, 0x1

    .line 29
    if-eq v6, v7, :cond_3

    .line 30
    .line 31
    const/4 v8, 0x2

    .line 32
    if-eq v6, v8, :cond_2

    .line 33
    .line 34
    const/4 v7, 0x4

    .line 35
    if-eq v6, v7, :cond_1

    .line 36
    .line 37
    const/16 v7, 0x8

    .line 38
    .line 39
    if-eq v6, v7, :cond_0

    .line 40
    .line 41
    goto :goto_1

    .line 42
    :cond_0
    invoke-virtual {v0, v5}, Lx86;->a(Lc7;)V

    .line 43
    .line 44
    .line 45
    iget v6, v5, Lc7;->b:I

    .line 46
    .line 47
    iget v5, v5, Lc7;->d:I

    .line 48
    .line 49
    invoke-virtual {v0, v6, v5}, Lx86;->e(II)V

    .line 50
    .line 51
    .line 52
    goto :goto_1

    .line 53
    :cond_1
    invoke-virtual {v0, v5}, Lx86;->a(Lc7;)V

    .line 54
    .line 55
    .line 56
    iget v6, v5, Lc7;->b:I

    .line 57
    .line 58
    iget v7, v5, Lc7;->d:I

    .line 59
    .line 60
    iget-object v5, v5, Lc7;->c:Ljava/lang/Object;

    .line 61
    .line 62
    invoke-virtual {v0, v6, v7, v5}, Lx86;->c(IILjava/lang/Object;)V

    .line 63
    .line 64
    .line 65
    goto :goto_1

    .line 66
    :cond_2
    invoke-virtual {v0, v5}, Lx86;->a(Lc7;)V

    .line 67
    .line 68
    .line 69
    iget v6, v5, Lc7;->b:I

    .line 70
    .line 71
    iget v5, v5, Lc7;->d:I

    .line 72
    .line 73
    iget-object v8, v0, Lx86;->X:Landroidx/recyclerview/widget/RecyclerView;

    .line 74
    .line 75
    invoke-virtual {v8, v6, v5, v7}, Landroidx/recyclerview/widget/RecyclerView;->U(IIZ)V

    .line 76
    .line 77
    .line 78
    iput-boolean v7, v8, Landroidx/recyclerview/widget/RecyclerView;->n1:Z

    .line 79
    .line 80
    iget-object v6, v8, Landroidx/recyclerview/widget/RecyclerView;->k1:Lq96;

    .line 81
    .line 82
    iget v7, v6, Lq96;->c:I

    .line 83
    .line 84
    add-int/2addr v7, v5

    .line 85
    iput v7, v6, Lq96;->c:I

    .line 86
    .line 87
    goto :goto_1

    .line 88
    :cond_3
    invoke-virtual {v0, v5}, Lx86;->a(Lc7;)V

    .line 89
    .line 90
    .line 91
    iget v6, v5, Lc7;->b:I

    .line 92
    .line 93
    iget v5, v5, Lc7;->d:I

    .line 94
    .line 95
    invoke-virtual {v0, v6, v5}, Lx86;->d(II)V

    .line 96
    .line 97
    .line 98
    :goto_1
    add-int/lit8 v4, v4, 0x1

    .line 99
    .line 100
    goto :goto_0

    .line 101
    :cond_4
    invoke-virtual {p0, v1}, Ld7;->J(Ljava/util/ArrayList;)V

    .line 102
    .line 103
    .line 104
    iput v3, p0, Ld7;->b:I

    .line 105
    .line 106
    return-void
.end method

.method public p(Lc7;)V
    .locals 13

    .line 1
    iget-object v0, p0, Ld7;->c:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Ler5;

    .line 4
    .line 5
    iget-byte v1, p1, Lc7;->a:B

    .line 6
    .line 7
    const/4 v2, 0x1

    .line 8
    if-eq v1, v2, :cond_8

    .line 9
    .line 10
    const/16 v3, 0x8

    .line 11
    .line 12
    if-eq v1, v3, :cond_8

    .line 13
    .line 14
    iget v3, p1, Lc7;->b:I

    .line 15
    .line 16
    invoke-virtual {p0, v3, v1}, Ld7;->R(II)I

    .line 17
    .line 18
    .line 19
    move-result v1

    .line 20
    iget v3, p1, Lc7;->b:I

    .line 21
    .line 22
    iget-byte v4, p1, Lc7;->a:B

    .line 23
    .line 24
    const/4 v5, 0x2

    .line 25
    const/4 v6, 0x4

    .line 26
    if-eq v4, v5, :cond_1

    .line 27
    .line 28
    if-ne v4, v6, :cond_0

    .line 29
    .line 30
    move v4, v2

    .line 31
    goto :goto_0

    .line 32
    :cond_0
    const-string p0, "op should be remove or update."

    .line 33
    .line 34
    invoke-static {p1, p0}, Lu52;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 35
    .line 36
    .line 37
    return-void

    .line 38
    :cond_1
    const/4 v4, 0x0

    .line 39
    :goto_0
    move v7, v2

    .line 40
    move v8, v7

    .line 41
    :goto_1
    iget v9, p1, Lc7;->d:I

    .line 42
    .line 43
    const/4 v10, 0x0

    .line 44
    if-ge v7, v9, :cond_6

    .line 45
    .line 46
    iget v9, p1, Lc7;->b:I

    .line 47
    .line 48
    mul-int v11, v4, v7

    .line 49
    .line 50
    add-int/2addr v11, v9

    .line 51
    iget-byte v9, p1, Lc7;->a:B

    .line 52
    .line 53
    invoke-virtual {p0, v11, v9}, Ld7;->R(II)I

    .line 54
    .line 55
    .line 56
    move-result v9

    .line 57
    iget-byte v11, p1, Lc7;->a:B

    .line 58
    .line 59
    if-eq v11, v5, :cond_3

    .line 60
    .line 61
    if-eq v11, v6, :cond_2

    .line 62
    .line 63
    goto :goto_3

    .line 64
    :cond_2
    add-int/lit8 v12, v1, 0x1

    .line 65
    .line 66
    if-ne v9, v12, :cond_4

    .line 67
    .line 68
    goto :goto_2

    .line 69
    :cond_3
    if-ne v9, v1, :cond_4

    .line 70
    .line 71
    :goto_2
    add-int/lit8 v8, v8, 0x1

    .line 72
    .line 73
    goto :goto_4

    .line 74
    :cond_4
    :goto_3
    iget-object v12, p1, Lc7;->c:Ljava/lang/Object;

    .line 75
    .line 76
    invoke-virtual {p0, v12, v11, v1, v8}, Ld7;->A(Ljava/lang/Object;III)Lc7;

    .line 77
    .line 78
    .line 79
    move-result-object v1

    .line 80
    invoke-virtual {p0, v1, v3}, Ld7;->q(Lc7;I)V

    .line 81
    .line 82
    .line 83
    iput-object v10, v1, Lc7;->c:Ljava/lang/Object;

    .line 84
    .line 85
    invoke-virtual {v0, v1}, Ler5;->d(Ljava/lang/Object;)Z

    .line 86
    .line 87
    .line 88
    iget-byte v1, p1, Lc7;->a:B

    .line 89
    .line 90
    if-ne v1, v6, :cond_5

    .line 91
    .line 92
    add-int/2addr v3, v8

    .line 93
    :cond_5
    move v8, v2

    .line 94
    move v1, v9

    .line 95
    :goto_4
    add-int/lit8 v7, v7, 0x1

    .line 96
    .line 97
    goto :goto_1

    .line 98
    :cond_6
    iget-object v2, p1, Lc7;->c:Ljava/lang/Object;

    .line 99
    .line 100
    iput-object v10, p1, Lc7;->c:Ljava/lang/Object;

    .line 101
    .line 102
    invoke-virtual {v0, p1}, Ler5;->d(Ljava/lang/Object;)Z

    .line 103
    .line 104
    .line 105
    if-lez v8, :cond_7

    .line 106
    .line 107
    iget-byte p1, p1, Lc7;->a:B

    .line 108
    .line 109
    invoke-virtual {p0, v2, p1, v1, v8}, Ld7;->A(Ljava/lang/Object;III)Lc7;

    .line 110
    .line 111
    .line 112
    move-result-object p1

    .line 113
    invoke-virtual {p0, p1, v3}, Ld7;->q(Lc7;I)V

    .line 114
    .line 115
    .line 116
    iput-object v10, p1, Lc7;->c:Ljava/lang/Object;

    .line 117
    .line 118
    invoke-virtual {v0, p1}, Ler5;->d(Ljava/lang/Object;)Z

    .line 119
    .line 120
    .line 121
    :cond_7
    return-void

    .line 122
    :cond_8
    const-string p0, "should not dispatch add or move for pre layout"

    .line 123
    .line 124
    invoke-static {p0}, Lbt;->q(Ljava/lang/String;)V

    .line 125
    .line 126
    .line 127
    return-void
.end method

.method public q(Lc7;I)V
    .locals 2

    .line 1
    iget-object p0, p0, Ld7;->f:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, Lx86;

    .line 4
    .line 5
    invoke-virtual {p0, p1}, Lx86;->a(Lc7;)V

    .line 6
    .line 7
    .line 8
    iget-byte v0, p1, Lc7;->a:B

    .line 9
    .line 10
    const/4 v1, 0x2

    .line 11
    if-eq v0, v1, :cond_1

    .line 12
    .line 13
    const/4 v1, 0x4

    .line 14
    if-ne v0, v1, :cond_0

    .line 15
    .line 16
    iget v0, p1, Lc7;->d:I

    .line 17
    .line 18
    iget-object p1, p1, Lc7;->c:Ljava/lang/Object;

    .line 19
    .line 20
    invoke-virtual {p0, p2, v0, p1}, Lx86;->c(IILjava/lang/Object;)V

    .line 21
    .line 22
    .line 23
    return-void

    .line 24
    :cond_0
    const-string p0, "only remove and update ops can be dispatched in first pass"

    .line 25
    .line 26
    invoke-static {p0}, Lbt;->q(Ljava/lang/String;)V

    .line 27
    .line 28
    .line 29
    return-void

    .line 30
    :cond_1
    iget p1, p1, Lc7;->d:I

    .line 31
    .line 32
    iget-object p0, p0, Lx86;->X:Landroidx/recyclerview/widget/RecyclerView;

    .line 33
    .line 34
    const/4 v0, 0x1

    .line 35
    invoke-virtual {p0, p2, p1, v0}, Landroidx/recyclerview/widget/RecyclerView;->U(IIZ)V

    .line 36
    .line 37
    .line 38
    iput-boolean v0, p0, Landroidx/recyclerview/widget/RecyclerView;->n1:Z

    .line 39
    .line 40
    iget-object p0, p0, Landroidx/recyclerview/widget/RecyclerView;->k1:Lq96;

    .line 41
    .line 42
    iget p2, p0, Lq96;->c:I

    .line 43
    .line 44
    add-int/2addr p2, p1

    .line 45
    iput p2, p0, Lq96;->c:I

    .line 46
    .line 47
    return-void
.end method

.method public r(Ljava/lang/String;ILjava/lang/String;)V
    .locals 2

    .line 1
    iget-object v0, p0, Ld7;->d:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Leb9;

    .line 4
    .line 5
    invoke-virtual {v0}, Leb9;->l()Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    iget-object v1, p0, Ld7;->g:Ljava/lang/Object;

    .line 10
    .line 11
    check-cast v1, Ljava/lang/String;

    .line 12
    .line 13
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 14
    .line 15
    .line 16
    iget-object p0, p0, Ld7;->c:Ljava/lang/Object;

    .line 17
    .line 18
    check-cast p0, Lmn3;

    .line 19
    .line 20
    iget-boolean p0, p0, Lmn3;->h:Z

    .line 21
    .line 22
    if-eqz p0, :cond_0

    .line 23
    .line 24
    invoke-static {v1, p2}, Lys0;->J(Ljava/lang/CharSequence;I)Ljava/lang/CharSequence;

    .line 25
    .line 26
    .line 27
    move-result-object p0

    .line 28
    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 29
    .line 30
    .line 31
    move-result-object p0

    .line 32
    goto :goto_0

    .line 33
    :cond_0
    const/4 p0, 0x0

    .line 34
    :goto_0
    new-instance v1, Lvn3;

    .line 35
    .line 36
    invoke-static {p2, p1, v0, p3, p0}, Lys0;->t(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 37
    .line 38
    .line 39
    move-result-object p0

    .line 40
    invoke-direct {v1, p0}, Lho3;-><init>(Ljava/lang/String;)V

    .line 41
    .line 42
    .line 43
    throw v1
.end method

.method public t(II)I
    .locals 5

    .line 1
    iget-object p0, p0, Ld7;->e:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, Ljava/util/ArrayList;

    .line 4
    .line 5
    invoke-virtual {p0}, Ljava/util/ArrayList;->size()I

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    :goto_0
    if-ge p2, v0, :cond_6

    .line 10
    .line 11
    invoke-virtual {p0, p2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object v1

    .line 15
    check-cast v1, Lc7;

    .line 16
    .line 17
    iget-byte v2, v1, Lc7;->a:B

    .line 18
    .line 19
    iget v3, v1, Lc7;->b:I

    .line 20
    .line 21
    const/16 v4, 0x8

    .line 22
    .line 23
    if-ne v2, v4, :cond_2

    .line 24
    .line 25
    if-ne v3, p1, :cond_0

    .line 26
    .line 27
    iget p1, v1, Lc7;->d:I

    .line 28
    .line 29
    goto :goto_1

    .line 30
    :cond_0
    if-ge v3, p1, :cond_1

    .line 31
    .line 32
    add-int/lit8 p1, p1, -0x1

    .line 33
    .line 34
    :cond_1
    iget v1, v1, Lc7;->d:I

    .line 35
    .line 36
    if-gt v1, p1, :cond_5

    .line 37
    .line 38
    add-int/lit8 p1, p1, 0x1

    .line 39
    .line 40
    goto :goto_1

    .line 41
    :cond_2
    if-gt v3, p1, :cond_5

    .line 42
    .line 43
    const/4 v4, 0x2

    .line 44
    if-ne v2, v4, :cond_4

    .line 45
    .line 46
    iget v1, v1, Lc7;->d:I

    .line 47
    .line 48
    add-int/2addr v3, v1

    .line 49
    if-ge p1, v3, :cond_3

    .line 50
    .line 51
    const/4 p0, -0x1

    .line 52
    return p0

    .line 53
    :cond_3
    sub-int/2addr p1, v1

    .line 54
    goto :goto_1

    .line 55
    :cond_4
    const/4 v3, 0x1

    .line 56
    if-ne v2, v3, :cond_5

    .line 57
    .line 58
    iget v1, v1, Lc7;->d:I

    .line 59
    .line 60
    add-int/2addr p1, v1

    .line 61
    :cond_5
    :goto_1
    add-int/lit8 p2, p2, 0x1

    .line 62
    .line 63
    goto :goto_0

    .line 64
    :cond_6
    return p1
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    .line 1
    iget-byte v0, p0, Ld7;->a:B

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    invoke-super {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    return-object p0

    .line 11
    :pswitch_0
    new-instance v0, Ljava/lang/StringBuilder;

    .line 12
    .line 13
    const-string v1, "JsonReader(source=\'"

    .line 14
    .line 15
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 16
    .line 17
    .line 18
    iget-object v1, p0, Ld7;->g:Ljava/lang/Object;

    .line 19
    .line 20
    check-cast v1, Ljava/lang/String;

    .line 21
    .line 22
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 23
    .line 24
    .line 25
    const-string v1, "\', currentPosition="

    .line 26
    .line 27
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 28
    .line 29
    .line 30
    iget p0, p0, Ld7;->b:I

    .line 31
    .line 32
    const/16 v1, 0x29

    .line 33
    .line 34
    invoke-static {v0, p0, v1}, Lpc6;->r(Ljava/lang/StringBuilder;IC)Ljava/lang/String;

    .line 35
    .line 36
    .line 37
    move-result-object p0

    .line 38
    return-object p0

    .line 39
    :pswitch_data_0
    .packed-switch 0x4
        :pswitch_0
    .end packed-switch
.end method

.method public u(Ljava/lang/CharSequence;I)I
    .locals 2

    .line 1
    invoke-interface {p1, p2}, Ljava/lang/CharSequence;->charAt(I)C

    .line 2
    .line 3
    .line 4
    move-result p1

    .line 5
    const/16 p2, 0x30

    .line 6
    .line 7
    if-gt p2, p1, :cond_0

    .line 8
    .line 9
    const/16 v0, 0x3a

    .line 10
    .line 11
    if-ge p1, v0, :cond_0

    .line 12
    .line 13
    sub-int/2addr p1, p2

    .line 14
    return p1

    .line 15
    :cond_0
    const/16 p2, 0x61

    .line 16
    .line 17
    if-gt p2, p1, :cond_1

    .line 18
    .line 19
    const/16 p2, 0x67

    .line 20
    .line 21
    if-ge p1, p2, :cond_1

    .line 22
    .line 23
    add-int/lit8 p1, p1, -0x57

    .line 24
    .line 25
    return p1

    .line 26
    :cond_1
    const/16 p2, 0x41

    .line 27
    .line 28
    if-gt p2, p1, :cond_2

    .line 29
    .line 30
    const/16 p2, 0x47

    .line 31
    .line 32
    if-ge p1, p2, :cond_2

    .line 33
    .line 34
    add-int/lit8 p1, p1, -0x37

    .line 35
    .line 36
    return p1

    .line 37
    :cond_2
    new-instance p2, Ljava/lang/StringBuilder;

    .line 38
    .line 39
    const-string v0, "Invalid toHexChar char \'"

    .line 40
    .line 41
    invoke-direct {p2, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 42
    .line 43
    .line 44
    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 45
    .line 46
    .line 47
    const-string p1, "\' in unicode escape"

    .line 48
    .line 49
    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 50
    .line 51
    .line 52
    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 53
    .line 54
    .line 55
    move-result-object p1

    .line 56
    const/4 p2, 0x0

    .line 57
    const/4 v0, 0x6

    .line 58
    const/4 v1, 0x0

    .line 59
    invoke-static {p0, p1, p2, v1, v0}, Ld7;->s(Ld7;Ljava/lang/String;ILjava/lang/String;I)V

    .line 60
    .line 61
    .line 62
    throw v1
.end method

.method public v()Landroid/content/res/ColorStateList;
    .locals 0

    .line 1
    iget-object p0, p0, Ld7;->f:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, Lz11;

    .line 4
    .line 5
    if-eqz p0, :cond_0

    .line 6
    .line 7
    iget-object p0, p0, Lz11;->c:Ljava/lang/Object;

    .line 8
    .line 9
    check-cast p0, Landroid/content/res/ColorStateList;

    .line 10
    .line 11
    return-object p0

    .line 12
    :cond_0
    const/4 p0, 0x0

    .line 13
    return-object p0
.end method

.method public w()Landroid/graphics/PorterDuff$Mode;
    .locals 0

    .line 1
    iget-object p0, p0, Ld7;->f:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, Lz11;

    .line 4
    .line 5
    if-eqz p0, :cond_0

    .line 6
    .line 7
    iget-object p0, p0, Lz11;->d:Ljava/io/Serializable;

    .line 8
    .line 9
    check-cast p0, Landroid/graphics/PorterDuff$Mode;

    .line 10
    .line 11
    return-object p0

    .line 12
    :cond_0
    const/4 p0, 0x0

    .line 13
    return-object p0
.end method

.method public x()Z
    .locals 2

    .line 1
    iget v0, p0, Ld7;->b:I

    .line 2
    .line 3
    iget-object v1, p0, Ld7;->f:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast v1, Ljava/util/List;

    .line 6
    .line 7
    invoke-interface {v1}, Ljava/util/List;->size()I

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    if-ge v0, v1, :cond_0

    .line 12
    .line 13
    goto :goto_0

    .line 14
    :cond_0
    iget-object p0, p0, Ld7;->d:Ljava/lang/Object;

    .line 15
    .line 16
    check-cast p0, Ljava/util/ArrayList;

    .line 17
    .line 18
    invoke-virtual {p0}, Ljava/util/ArrayList;->isEmpty()Z

    .line 19
    .line 20
    .line 21
    move-result p0

    .line 22
    if-nez p0, :cond_1

    .line 23
    .line 24
    :goto_0
    const/4 p0, 0x1

    .line 25
    return p0

    .line 26
    :cond_1
    const/4 p0, 0x0

    .line 27
    return p0
.end method

.method public y()Z
    .locals 0

    .line 1
    iget-object p0, p0, Ld7;->d:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, Ljava/util/ArrayList;

    .line 4
    .line 5
    invoke-virtual {p0}, Ljava/util/ArrayList;->size()I

    .line 6
    .line 7
    .line 8
    move-result p0

    .line 9
    if-lez p0, :cond_0

    .line 10
    .line 11
    const/4 p0, 0x1

    .line 12
    return p0

    .line 13
    :cond_0
    const/4 p0, 0x0

    .line 14
    return p0
.end method

.method public z(Landroid/util/AttributeSet;I)V
    .locals 10

    .line 1
    iget-object v0, p0, Ld7;->c:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Landroid/view/View;

    .line 4
    .line 5
    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    sget-object v2, Lh66;->ViewBackgroundHelper:[I

    .line 10
    .line 11
    const/4 v3, 0x0

    .line 12
    invoke-static {p2, v3, v1, p1, v2}, Lzv7;->r(IILandroid/content/Context;Landroid/util/AttributeSet;[I)Lzv7;

    .line 13
    .line 14
    .line 15
    move-result-object v1

    .line 16
    iget-object v2, v1, Lzv7;->Y:Ljava/lang/Object;

    .line 17
    .line 18
    check-cast v2, Landroid/content/res/TypedArray;

    .line 19
    .line 20
    iget-object v3, p0, Ld7;->c:Ljava/lang/Object;

    .line 21
    .line 22
    move-object v4, v3

    .line 23
    check-cast v4, Landroid/view/View;

    .line 24
    .line 25
    invoke-virtual {v4}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 26
    .line 27
    .line 28
    move-result-object v5

    .line 29
    sget-object v6, Lh66;->ViewBackgroundHelper:[I

    .line 30
    .line 31
    iget-object v3, v1, Lzv7;->Y:Ljava/lang/Object;

    .line 32
    .line 33
    move-object v8, v3

    .line 34
    check-cast v8, Landroid/content/res/TypedArray;

    .line 35
    .line 36
    move-object v7, p1

    .line 37
    move v9, p2

    .line 38
    invoke-static/range {v4 .. v9}, Lcw8;->m(Landroid/view/View;Landroid/content/Context;[ILandroid/util/AttributeSet;Landroid/content/res/TypedArray;I)V

    .line 39
    .line 40
    .line 41
    :try_start_0
    sget p1, Lh66;->ViewBackgroundHelper_android_background:I

    .line 42
    .line 43
    invoke-virtual {v2, p1}, Landroid/content/res/TypedArray;->hasValue(I)Z

    .line 44
    .line 45
    .line 46
    move-result p1

    .line 47
    const/4 p2, -0x1

    .line 48
    if-eqz p1, :cond_0

    .line 49
    .line 50
    sget p1, Lh66;->ViewBackgroundHelper_android_background:I

    .line 51
    .line 52
    invoke-virtual {v2, p1, p2}, Landroid/content/res/TypedArray;->getResourceId(II)I

    .line 53
    .line 54
    .line 55
    move-result p1

    .line 56
    iput p1, p0, Ld7;->b:I

    .line 57
    .line 58
    iget-object p1, p0, Ld7;->d:Ljava/lang/Object;

    .line 59
    .line 60
    check-cast p1, Laq;

    .line 61
    .line 62
    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 63
    .line 64
    .line 65
    move-result-object v3

    .line 66
    iget v4, p0, Ld7;->b:I

    .line 67
    .line 68
    monitor-enter p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 69
    :try_start_1
    iget-object v5, p1, Laq;->a:Lrf6;

    .line 70
    .line 71
    invoke-virtual {v5, v3, v4}, Lrf6;->f(Landroid/content/Context;I)Landroid/content/res/ColorStateList;

    .line 72
    .line 73
    .line 74
    move-result-object v3
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 75
    :try_start_2
    monitor-exit p1

    .line 76
    if-eqz v3, :cond_0

    .line 77
    .line 78
    invoke-virtual {p0, v3}, Ld7;->L(Landroid/content/res/ColorStateList;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 79
    .line 80
    .line 81
    goto :goto_0

    .line 82
    :catchall_0
    move-exception v0

    .line 83
    move-object p0, v0

    .line 84
    goto :goto_1

    .line 85
    :catchall_1
    move-exception v0

    .line 86
    move-object p0, v0

    .line 87
    :try_start_3
    monitor-exit p1
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 88
    :try_start_4
    throw p0

    .line 89
    :cond_0
    :goto_0
    sget p0, Lh66;->ViewBackgroundHelper_backgroundTint:I

    .line 90
    .line 91
    invoke-virtual {v2, p0}, Landroid/content/res/TypedArray;->hasValue(I)Z

    .line 92
    .line 93
    .line 94
    move-result p0

    .line 95
    if-eqz p0, :cond_1

    .line 96
    .line 97
    sget p0, Lh66;->ViewBackgroundHelper_backgroundTint:I

    .line 98
    .line 99
    invoke-virtual {v1, p0}, Lzv7;->c(I)Landroid/content/res/ColorStateList;

    .line 100
    .line 101
    .line 102
    move-result-object p0

    .line 103
    invoke-virtual {v0, p0}, Landroid/view/View;->setBackgroundTintList(Landroid/content/res/ColorStateList;)V

    .line 104
    .line 105
    .line 106
    :cond_1
    sget p0, Lh66;->ViewBackgroundHelper_backgroundTintMode:I

    .line 107
    .line 108
    invoke-virtual {v2, p0}, Landroid/content/res/TypedArray;->hasValue(I)Z

    .line 109
    .line 110
    .line 111
    move-result p0

    .line 112
    if-eqz p0, :cond_2

    .line 113
    .line 114
    sget p0, Lh66;->ViewBackgroundHelper_backgroundTintMode:I

    .line 115
    .line 116
    invoke-virtual {v2, p0, p2}, Landroid/content/res/TypedArray;->getInt(II)I

    .line 117
    .line 118
    .line 119
    move-result p0

    .line 120
    const/4 p1, 0x0

    .line 121
    invoke-static {p0, p1}, Ldw1;->c(ILandroid/graphics/PorterDuff$Mode;)Landroid/graphics/PorterDuff$Mode;

    .line 122
    .line 123
    .line 124
    move-result-object p0

    .line 125
    invoke-virtual {v0, p0}, Landroid/view/View;->setBackgroundTintMode(Landroid/graphics/PorterDuff$Mode;)V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 126
    .line 127
    .line 128
    :cond_2
    invoke-virtual {v1}, Lzv7;->v()V

    .line 129
    .line 130
    .line 131
    return-void

    .line 132
    :goto_1
    invoke-virtual {v1}, Lzv7;->v()V

    .line 133
    .line 134
    .line 135
    throw p0
.end method
