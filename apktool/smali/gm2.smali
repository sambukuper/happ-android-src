.class public final Lgm2;
.super Ljava/lang/Object;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"

# interfaces
.implements Liz2;
.implements Lyv6;
.implements Lfx8;


# instance fields
.field public final X:Lqk2;

.field public final Y:Lex8;

.field public final Z:Ljk2;

.field public f0:Lbx8;

.field public g0:Lg94;

.field public h0:Lxd6;


# direct methods
.method public constructor <init>(Lqk2;Lex8;Ljk2;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    iput-object v0, p0, Lgm2;->g0:Lg94;

    .line 6
    .line 7
    iput-object v0, p0, Lgm2;->h0:Lxd6;

    .line 8
    .line 9
    iput-object p1, p0, Lgm2;->X:Lqk2;

    .line 10
    .line 11
    iput-object p2, p0, Lgm2;->Y:Lex8;

    .line 12
    .line 13
    iput-object p3, p0, Lgm2;->Z:Ljk2;

    .line 14
    .line 15
    return-void
.end method


# virtual methods
.method public final a(Ln84;)V
    .locals 0

    .line 1
    iget-object p0, p0, Lgm2;->g0:Lg94;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Lg94;->d(Ln84;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final c()Lbx8;
    .locals 4

    .line 1
    iget-object v0, p0, Lgm2;->X:Lqk2;

    .line 2
    .line 3
    invoke-virtual {v0}, Lqk2;->c()Lbx8;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    iget-object v2, v0, Lqk2;->W0:Lzv6;

    .line 8
    .line 9
    if-eq v1, v2, :cond_0

    .line 10
    .line 11
    iput-object v1, p0, Lgm2;->f0:Lbx8;

    .line 12
    .line 13
    return-object v1

    .line 14
    :cond_0
    iget-object v1, p0, Lgm2;->f0:Lbx8;

    .line 15
    .line 16
    if-nez v1, :cond_3

    .line 17
    .line 18
    invoke-virtual {v0}, Lqk2;->N()Landroid/content/Context;

    .line 19
    .line 20
    .line 21
    move-result-object v1

    .line 22
    invoke-virtual {v1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 23
    .line 24
    .line 25
    move-result-object v1

    .line 26
    :goto_0
    instance-of v2, v1, Landroid/content/ContextWrapper;

    .line 27
    .line 28
    if-eqz v2, :cond_2

    .line 29
    .line 30
    instance-of v2, v1, Landroid/app/Application;

    .line 31
    .line 32
    if-eqz v2, :cond_1

    .line 33
    .line 34
    check-cast v1, Landroid/app/Application;

    .line 35
    .line 36
    goto :goto_1

    .line 37
    :cond_1
    check-cast v1, Landroid/content/ContextWrapper;

    .line 38
    .line 39
    invoke-virtual {v1}, Landroid/content/ContextWrapper;->getBaseContext()Landroid/content/Context;

    .line 40
    .line 41
    .line 42
    move-result-object v1

    .line 43
    goto :goto_0

    .line 44
    :cond_2
    const/4 v1, 0x0

    .line 45
    :goto_1
    new-instance v2, Lzv6;

    .line 46
    .line 47
    iget-object v3, v0, Lqk2;->h0:Landroid/os/Bundle;

    .line 48
    .line 49
    invoke-direct {v2, v1, v0, v3}, Lzv6;-><init>(Landroid/app/Application;Lyv6;Landroid/os/Bundle;)V

    .line 50
    .line 51
    .line 52
    iput-object v2, p0, Lgm2;->f0:Lbx8;

    .line 53
    .line 54
    return-object v2

    .line 55
    :cond_3
    return-object v1
.end method

.method public final d()Lsz4;
    .locals 5

    .line 1
    iget-object v0, p0, Lgm2;->X:Lqk2;

    .line 2
    .line 3
    invoke-virtual {v0}, Lqk2;->N()Landroid/content/Context;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    invoke-virtual {v1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    :goto_0
    instance-of v2, v1, Landroid/content/ContextWrapper;

    .line 12
    .line 13
    if-eqz v2, :cond_1

    .line 14
    .line 15
    instance-of v2, v1, Landroid/app/Application;

    .line 16
    .line 17
    if-eqz v2, :cond_0

    .line 18
    .line 19
    check-cast v1, Landroid/app/Application;

    .line 20
    .line 21
    goto :goto_1

    .line 22
    :cond_0
    check-cast v1, Landroid/content/ContextWrapper;

    .line 23
    .line 24
    invoke-virtual {v1}, Landroid/content/ContextWrapper;->getBaseContext()Landroid/content/Context;

    .line 25
    .line 26
    .line 27
    move-result-object v1

    .line 28
    goto :goto_0

    .line 29
    :cond_1
    const/4 v1, 0x0

    .line 30
    :goto_1
    new-instance v2, Lsz4;

    .line 31
    .line 32
    const/4 v3, 0x0

    .line 33
    invoke-direct {v2, v3}, Lsz4;-><init>(I)V

    .line 34
    .line 35
    .line 36
    iget-object v3, v2, Lo71;->a:Ljava/util/LinkedHashMap;

    .line 37
    .line 38
    if-eqz v1, :cond_2

    .line 39
    .line 40
    sget-object v4, Lax8;->d:Lf08;

    .line 41
    .line 42
    invoke-interface {v3, v4, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 43
    .line 44
    .line 45
    :cond_2
    sget-object v1, Lsv6;->a:Lwe5;

    .line 46
    .line 47
    invoke-interface {v3, v1, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 48
    .line 49
    .line 50
    sget-object v1, Lsv6;->b:Lg55;

    .line 51
    .line 52
    invoke-interface {v3, v1, p0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 53
    .line 54
    .line 55
    iget-object p0, v0, Lqk2;->h0:Landroid/os/Bundle;

    .line 56
    .line 57
    if-eqz p0, :cond_3

    .line 58
    .line 59
    sget-object v0, Lsv6;->c:Lwe5;

    .line 60
    .line 61
    invoke-interface {v3, v0, p0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 62
    .line 63
    .line 64
    :cond_3
    return-object v2
.end method

.method public final e()Lex8;
    .locals 0

    .line 1
    invoke-virtual {p0}, Lgm2;->g()V

    .line 2
    .line 3
    .line 4
    iget-object p0, p0, Lgm2;->Y:Lex8;

    .line 5
    .line 6
    return-object p0
.end method

.method public final f()Lxd6;
    .locals 0

    .line 1
    invoke-virtual {p0}, Lgm2;->g()V

    .line 2
    .line 3
    .line 4
    iget-object p0, p0, Lgm2;->h0:Lxd6;

    .line 5
    .line 6
    iget-object p0, p0, Lxd6;->Z:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast p0, Lxd6;

    .line 9
    .line 10
    return-object p0
.end method

.method public final g()V
    .locals 3

    .line 1
    iget-object v0, p0, Lgm2;->g0:Lg94;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    new-instance v0, Lg94;

    .line 6
    .line 7
    const/4 v1, 0x1

    .line 8
    invoke-direct {v0, p0, v1}, Lg94;-><init>(Ld94;Z)V

    .line 9
    .line 10
    .line 11
    iput-object v0, p0, Lgm2;->g0:Lg94;

    .line 12
    .line 13
    new-instance v0, Lxv6;

    .line 14
    .line 15
    new-instance v1, Lhr5;

    .line 16
    .line 17
    const/16 v2, 0xe

    .line 18
    .line 19
    invoke-direct {v1, p0, v2}, Lhr5;-><init>(Ljava/lang/Object;B)V

    .line 20
    .line 21
    .line 22
    invoke-direct {v0, p0, v1}, Lxv6;-><init>(Lyv6;Lhr5;)V

    .line 23
    .line 24
    .line 25
    new-instance v1, Lxd6;

    .line 26
    .line 27
    const/4 v2, 0x5

    .line 28
    invoke-direct {v1, v0, v2}, Lxd6;-><init>(Lxv6;B)V

    .line 29
    .line 30
    .line 31
    iput-object v1, p0, Lgm2;->h0:Lxd6;

    .line 32
    .line 33
    invoke-virtual {v1}, Lxd6;->w()V

    .line 34
    .line 35
    .line 36
    iget-object p0, p0, Lgm2;->Z:Ljk2;

    .line 37
    .line 38
    invoke-virtual {p0}, Ljk2;->run()V

    .line 39
    .line 40
    .line 41
    :cond_0
    return-void
.end method

.method public final h()Lg94;
    .locals 0

    .line 1
    invoke-virtual {p0}, Lgm2;->g()V

    .line 2
    .line 3
    .line 4
    iget-object p0, p0, Lgm2;->g0:Lg94;

    .line 5
    .line 6
    return-object p0
.end method
