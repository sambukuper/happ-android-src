.class public interface abstract Lxr4;
.super Ljava/lang/Object;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"


# virtual methods
.method public abstract c(Lzr4;Ljava/util/List;J)Lyr4;
.end method

.method public d(Li55;Ljava/util/List;I)I
    .locals 8

    .line 1
    new-instance v0, Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-interface {p2}, Ljava/util/List;->size()I

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    .line 8
    .line 9
    .line 10
    invoke-interface {p2}, Ljava/util/Collection;->size()I

    .line 11
    .line 12
    .line 13
    move-result v1

    .line 14
    const/4 v2, 0x0

    .line 15
    move v3, v2

    .line 16
    :goto_0
    if-ge v3, v1, :cond_0

    .line 17
    .line 18
    invoke-interface {p2, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object v4

    .line 22
    check-cast v4, Ltr4;

    .line 23
    .line 24
    new-instance v5, Lxe1;

    .line 25
    .line 26
    sget-object v6, Lvg3;->Y:Lvg3;

    .line 27
    .line 28
    sget-object v7, Lzg3;->Y:Lzg3;

    .line 29
    .line 30
    invoke-direct {v5, v4, v6, v7, v2}, Lxe1;-><init>(Ltr4;Ljava/lang/Enum;Ljava/lang/Enum;B)V

    .line 31
    .line 32
    .line 33
    invoke-virtual {v0, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 34
    .line 35
    .line 36
    add-int/lit8 v3, v3, 0x1

    .line 37
    .line 38
    goto :goto_0

    .line 39
    :cond_0
    const/16 p2, 0xd

    .line 40
    .line 41
    invoke-static {v2, p3, v2, v2, p2}, Ls31;->b(IIIII)J

    .line 42
    .line 43
    .line 44
    move-result-wide p2

    .line 45
    new-instance v1, Llh3;

    .line 46
    .line 47
    iget-object v2, p1, Li55;->w0:Landroidx/compose/ui/node/LayoutNode;

    .line 48
    .line 49
    iget-object v2, v2, Landroidx/compose/ui/node/LayoutNode;->B0:Lz24;

    .line 50
    .line 51
    invoke-direct {v1, p1, v2}, Llh3;-><init>(Lug3;Lz24;)V

    .line 52
    .line 53
    .line 54
    invoke-interface {p0, v1, v0, p2, p3}, Lxr4;->c(Lzr4;Ljava/util/List;J)Lyr4;

    .line 55
    .line 56
    .line 57
    move-result-object p0

    .line 58
    invoke-interface {p0}, Lyr4;->a()I

    .line 59
    .line 60
    .line 61
    move-result p0

    .line 62
    return p0
.end method

.method public f(Li55;Ljava/util/List;I)I
    .locals 8

    .line 1
    new-instance v0, Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-interface {p2}, Ljava/util/List;->size()I

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    .line 8
    .line 9
    .line 10
    invoke-interface {p2}, Ljava/util/Collection;->size()I

    .line 11
    .line 12
    .line 13
    move-result v1

    .line 14
    const/4 v2, 0x0

    .line 15
    move v3, v2

    .line 16
    :goto_0
    if-ge v3, v1, :cond_0

    .line 17
    .line 18
    invoke-interface {p2, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object v4

    .line 22
    check-cast v4, Ltr4;

    .line 23
    .line 24
    new-instance v5, Lxe1;

    .line 25
    .line 26
    sget-object v6, Lvg3;->X:Lvg3;

    .line 27
    .line 28
    sget-object v7, Lzg3;->X:Lzg3;

    .line 29
    .line 30
    invoke-direct {v5, v4, v6, v7, v2}, Lxe1;-><init>(Ltr4;Ljava/lang/Enum;Ljava/lang/Enum;B)V

    .line 31
    .line 32
    .line 33
    invoke-virtual {v0, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 34
    .line 35
    .line 36
    add-int/lit8 v3, v3, 0x1

    .line 37
    .line 38
    goto :goto_0

    .line 39
    :cond_0
    const/4 p2, 0x7

    .line 40
    invoke-static {v2, v2, v2, p3, p2}, Ls31;->b(IIIII)J

    .line 41
    .line 42
    .line 43
    move-result-wide p2

    .line 44
    new-instance v1, Llh3;

    .line 45
    .line 46
    iget-object v2, p1, Li55;->w0:Landroidx/compose/ui/node/LayoutNode;

    .line 47
    .line 48
    iget-object v2, v2, Landroidx/compose/ui/node/LayoutNode;->B0:Lz24;

    .line 49
    .line 50
    invoke-direct {v1, p1, v2}, Llh3;-><init>(Lug3;Lz24;)V

    .line 51
    .line 52
    .line 53
    invoke-interface {p0, v1, v0, p2, p3}, Lxr4;->c(Lzr4;Ljava/util/List;J)Lyr4;

    .line 54
    .line 55
    .line 56
    move-result-object p0

    .line 57
    invoke-interface {p0}, Lyr4;->b()I

    .line 58
    .line 59
    .line 60
    move-result p0

    .line 61
    return p0
.end method

.method public g(Li55;Ljava/util/List;I)I
    .locals 8

    .line 1
    new-instance v0, Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-interface {p2}, Ljava/util/List;->size()I

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    .line 8
    .line 9
    .line 10
    invoke-interface {p2}, Ljava/util/Collection;->size()I

    .line 11
    .line 12
    .line 13
    move-result v1

    .line 14
    const/4 v2, 0x0

    .line 15
    move v3, v2

    .line 16
    :goto_0
    if-ge v3, v1, :cond_0

    .line 17
    .line 18
    invoke-interface {p2, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object v4

    .line 22
    check-cast v4, Ltr4;

    .line 23
    .line 24
    new-instance v5, Lxe1;

    .line 25
    .line 26
    sget-object v6, Lvg3;->X:Lvg3;

    .line 27
    .line 28
    sget-object v7, Lzg3;->Y:Lzg3;

    .line 29
    .line 30
    invoke-direct {v5, v4, v6, v7, v2}, Lxe1;-><init>(Ltr4;Ljava/lang/Enum;Ljava/lang/Enum;B)V

    .line 31
    .line 32
    .line 33
    invoke-virtual {v0, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 34
    .line 35
    .line 36
    add-int/lit8 v3, v3, 0x1

    .line 37
    .line 38
    goto :goto_0

    .line 39
    :cond_0
    const/16 p2, 0xd

    .line 40
    .line 41
    invoke-static {v2, p3, v2, v2, p2}, Ls31;->b(IIIII)J

    .line 42
    .line 43
    .line 44
    move-result-wide p2

    .line 45
    new-instance v1, Llh3;

    .line 46
    .line 47
    iget-object v2, p1, Li55;->w0:Landroidx/compose/ui/node/LayoutNode;

    .line 48
    .line 49
    iget-object v2, v2, Landroidx/compose/ui/node/LayoutNode;->B0:Lz24;

    .line 50
    .line 51
    invoke-direct {v1, p1, v2}, Llh3;-><init>(Lug3;Lz24;)V

    .line 52
    .line 53
    .line 54
    invoke-interface {p0, v1, v0, p2, p3}, Lxr4;->c(Lzr4;Ljava/util/List;J)Lyr4;

    .line 55
    .line 56
    .line 57
    move-result-object p0

    .line 58
    invoke-interface {p0}, Lyr4;->a()I

    .line 59
    .line 60
    .line 61
    move-result p0

    .line 62
    return p0
.end method

.method public i(Li55;Ljava/util/List;I)I
    .locals 8

    .line 1
    new-instance v0, Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-interface {p2}, Ljava/util/List;->size()I

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    .line 8
    .line 9
    .line 10
    invoke-interface {p2}, Ljava/util/Collection;->size()I

    .line 11
    .line 12
    .line 13
    move-result v1

    .line 14
    const/4 v2, 0x0

    .line 15
    move v3, v2

    .line 16
    :goto_0
    if-ge v3, v1, :cond_0

    .line 17
    .line 18
    invoke-interface {p2, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object v4

    .line 22
    check-cast v4, Ltr4;

    .line 23
    .line 24
    new-instance v5, Lxe1;

    .line 25
    .line 26
    sget-object v6, Lvg3;->Y:Lvg3;

    .line 27
    .line 28
    sget-object v7, Lzg3;->X:Lzg3;

    .line 29
    .line 30
    invoke-direct {v5, v4, v6, v7, v2}, Lxe1;-><init>(Ltr4;Ljava/lang/Enum;Ljava/lang/Enum;B)V

    .line 31
    .line 32
    .line 33
    invoke-virtual {v0, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 34
    .line 35
    .line 36
    add-int/lit8 v3, v3, 0x1

    .line 37
    .line 38
    goto :goto_0

    .line 39
    :cond_0
    const/4 p2, 0x7

    .line 40
    invoke-static {v2, v2, v2, p3, p2}, Ls31;->b(IIIII)J

    .line 41
    .line 42
    .line 43
    move-result-wide p2

    .line 44
    new-instance v1, Llh3;

    .line 45
    .line 46
    iget-object v2, p1, Li55;->w0:Landroidx/compose/ui/node/LayoutNode;

    .line 47
    .line 48
    iget-object v2, v2, Landroidx/compose/ui/node/LayoutNode;->B0:Lz24;

    .line 49
    .line 50
    invoke-direct {v1, p1, v2}, Llh3;-><init>(Lug3;Lz24;)V

    .line 51
    .line 52
    .line 53
    invoke-interface {p0, v1, v0, p2, p3}, Lxr4;->c(Lzr4;Ljava/util/List;J)Lyr4;

    .line 54
    .line 55
    .line 56
    move-result-object p0

    .line 57
    invoke-interface {p0}, Lyr4;->b()I

    .line 58
    .line 59
    .line 60
    move-result p0

    .line 61
    return p0
.end method
