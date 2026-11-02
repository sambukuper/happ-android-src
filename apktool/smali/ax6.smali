.class public abstract Lax6;
.super Ljava/lang/Object;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"


# static fields
.field public static final synthetic a:I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    const-string v0, "Schedulers"

    .line 2
    .line 3
    invoke-static {v0}, Llh4;->a1(Ljava/lang/String;)Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public static a(Ln49;Lf08;Ljava/util/List;)V
    .locals 2

    .line 1
    invoke-interface {p2}, Ljava/util/List;->size()I

    .line 2
    .line 3
    .line 4
    move-result p1

    .line 5
    if-lez p1, :cond_0

    .line 6
    .line 7
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 8
    .line 9
    .line 10
    move-result-wide v0

    .line 11
    invoke-interface {p2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 16
    .line 17
    .line 18
    move-result p2

    .line 19
    if-eqz p2, :cond_0

    .line 20
    .line 21
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    move-result-object p2

    .line 25
    check-cast p2, Ll49;

    .line 26
    .line 27
    iget-object p2, p2, Ll49;->a:Ljava/lang/String;

    .line 28
    .line 29
    invoke-virtual {p0, v0, v1, p2}, Ln49;->e(JLjava/lang/String;)V

    .line 30
    .line 31
    .line 32
    goto :goto_0

    .line 33
    :cond_0
    return-void
.end method

.method public static b(Lxy0;Landroidx/work/impl/WorkDatabase;Ljava/util/List;)V
    .locals 8

    .line 1
    if-eqz p2, :cond_1

    .line 2
    .line 3
    invoke-interface {p2}, Ljava/util/List;->isEmpty()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    goto :goto_0

    .line 10
    :cond_0
    invoke-virtual {p1}, Landroidx/work/impl/WorkDatabase;->x()Ln49;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    new-instance v1, Ljava/util/ArrayList;

    .line 15
    .line 16
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 17
    .line 18
    .line 19
    invoke-virtual {p1}, Lql6;->b()V

    .line 20
    .line 21
    .line 22
    :try_start_0
    iget-object v1, v0, Ln49;->a:Lql6;

    .line 23
    .line 24
    iget-object v2, v0, Ln49;->a:Lql6;

    .line 25
    .line 26
    new-instance v3, Lut8;

    .line 27
    .line 28
    const/16 v4, 0x12

    .line 29
    .line 30
    invoke-direct {v3, v4}, Lut8;-><init>(B)V

    .line 31
    .line 32
    .line 33
    const/4 v4, 0x0

    .line 34
    const/4 v5, 0x1

    .line 35
    invoke-static {v1, v5, v4, v3}, Lu15;->G(Lql6;ZZLgn2;)Ljava/lang/Object;

    .line 36
    .line 37
    .line 38
    move-result-object v1

    .line 39
    check-cast v1, Ljava/util/List;

    .line 40
    .line 41
    iget-object v3, p0, Lxy0;->g0:Ljava/lang/Object;

    .line 42
    .line 43
    check-cast v3, Lf08;

    .line 44
    .line 45
    invoke-static {v0, v3, v1}, Lax6;->a(Ln49;Lf08;Ljava/util/List;)V

    .line 46
    .line 47
    .line 48
    new-instance v3, Lut8;

    .line 49
    .line 50
    const/16 v6, 0x16

    .line 51
    .line 52
    invoke-direct {v3, v6}, Lut8;-><init>(B)V

    .line 53
    .line 54
    .line 55
    invoke-static {v2, v5, v4, v3}, Lu15;->G(Lql6;ZZLgn2;)Ljava/lang/Object;

    .line 56
    .line 57
    .line 58
    move-result-object v3

    .line 59
    check-cast v3, Ljava/util/List;

    .line 60
    .line 61
    new-instance v6, Lut8;

    .line 62
    .line 63
    const/16 v7, 0x18

    .line 64
    .line 65
    invoke-direct {v6, v7}, Lut8;-><init>(B)V

    .line 66
    .line 67
    .line 68
    invoke-static {v2, v5, v4, v6}, Lu15;->G(Lql6;ZZLgn2;)Ljava/lang/Object;

    .line 69
    .line 70
    .line 71
    move-result-object v2

    .line 72
    check-cast v2, Ljava/util/List;

    .line 73
    .line 74
    iget-object p0, p0, Lxy0;->g0:Ljava/lang/Object;

    .line 75
    .line 76
    check-cast p0, Lf08;

    .line 77
    .line 78
    invoke-static {v0, p0, v2}, Lax6;->a(Ln49;Lf08;Ljava/util/List;)V

    .line 79
    .line 80
    .line 81
    invoke-interface {v2, v1}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    .line 82
    .line 83
    .line 84
    invoke-virtual {p1}, Lql6;->p()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 85
    .line 86
    .line 87
    invoke-virtual {p1}, Lql6;->l()V

    .line 88
    .line 89
    .line 90
    invoke-static {v2, p2, v5}, Lax6;->c(Ljava/util/List;Ljava/util/List;Z)V

    .line 91
    .line 92
    .line 93
    invoke-static {v3, p2, v4}, Lax6;->c(Ljava/util/List;Ljava/util/List;Z)V

    .line 94
    .line 95
    .line 96
    return-void

    .line 97
    :catchall_0
    move-exception p0

    .line 98
    invoke-virtual {p1}, Lql6;->l()V

    .line 99
    .line 100
    .line 101
    throw p0

    .line 102
    :cond_1
    :goto_0
    return-void
.end method

.method public static c(Ljava/util/List;Ljava/util/List;Z)V
    .locals 2

    .line 1
    invoke-interface {p0}, Ljava/util/List;->isEmpty()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    goto :goto_1

    .line 8
    :cond_0
    invoke-interface {p0}, Ljava/util/List;->size()I

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    new-array v0, v0, [Ll49;

    .line 13
    .line 14
    invoke-interface {p0, v0}, Ljava/util/List;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    move-result-object p0

    .line 18
    check-cast p0, [Ll49;

    .line 19
    .line 20
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 21
    .line 22
    .line 23
    move-result-object p1

    .line 24
    :cond_1
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 25
    .line 26
    .line 27
    move-result v0

    .line 28
    if-eqz v0, :cond_2

    .line 29
    .line 30
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 31
    .line 32
    .line 33
    move-result-object v0

    .line 34
    check-cast v0, Lxw6;

    .line 35
    .line 36
    invoke-interface {v0}, Lxw6;->c()Z

    .line 37
    .line 38
    .line 39
    move-result v1

    .line 40
    if-ne v1, p2, :cond_1

    .line 41
    .line 42
    invoke-interface {v0, p0}, Lxw6;->e([Ll49;)V

    .line 43
    .line 44
    .line 45
    goto :goto_0

    .line 46
    :cond_2
    :goto_1
    return-void
.end method
