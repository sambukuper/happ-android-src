.class public final Lfw7;
.super Ljava/lang/Object;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"

# interfaces
.implements Let4;


# instance fields
.field public final b:Let4;

.field public final c:Lwi8;

.field public d:Ljava/util/HashMap;

.field public final e:Lvz7;


# direct methods
.method public constructor <init>(Let4;Lwi8;)V
    .locals 1

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    .line 9
    .line 10
    iput-object p1, p0, Lfw7;->b:Let4;

    .line 11
    .line 12
    new-instance p1, Lzk3;

    .line 13
    .line 14
    const/16 v0, 0x18

    .line 15
    .line 16
    invoke-direct {p1, p2, v0}, Lzk3;-><init>(Ljava/lang/Object;B)V

    .line 17
    .line 18
    .line 19
    new-instance v0, Lvz7;

    .line 20
    .line 21
    invoke-direct {v0, p1}, Lvz7;-><init>(Ldn2;)V

    .line 22
    .line 23
    .line 24
    iget-object p1, p2, Lwi8;->a:Lui8;

    .line 25
    .line 26
    invoke-static {p1}, Lz91;->U(Lui8;)Lui8;

    .line 27
    .line 28
    .line 29
    move-result-object p1

    .line 30
    new-instance p2, Lwi8;

    .line 31
    .line 32
    invoke-direct {p2, p1}, Lwi8;-><init>(Lui8;)V

    .line 33
    .line 34
    .line 35
    iput-object p2, p0, Lfw7;->c:Lwi8;

    .line 36
    .line 37
    new-instance p1, Lzk3;

    .line 38
    .line 39
    const/16 p2, 0x19

    .line 40
    .line 41
    invoke-direct {p1, p0, p2}, Lzk3;-><init>(Ljava/lang/Object;B)V

    .line 42
    .line 43
    .line 44
    new-instance p2, Lvz7;

    .line 45
    .line 46
    invoke-direct {p2, p1}, Lvz7;-><init>(Ldn2;)V

    .line 47
    .line 48
    .line 49
    iput-object p2, p0, Lfw7;->e:Lvz7;

    .line 50
    .line 51
    return-void
.end method


# virtual methods
.method public final a(Lpk1;Lgn2;)Ljava/util/Collection;
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget-object p0, p0, Lfw7;->e:Lvz7;

    .line 5
    .line 6
    invoke-virtual {p0}, Lvz7;->getValue()Ljava/lang/Object;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    check-cast p0, Ljava/util/Collection;

    .line 11
    .line 12
    return-object p0
.end method

.method public final b(Lv15;Lx45;)Ljava/util/Collection;
    .locals 1

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lfw7;->b:Let4;

    .line 5
    .line 6
    invoke-interface {v0, p1, p2}, Let4;->b(Lv15;Lx45;)Ljava/util/Collection;

    .line 7
    .line 8
    .line 9
    move-result-object p1

    .line 10
    invoke-virtual {p0, p1}, Lfw7;->i(Ljava/util/Collection;)Ljava/util/Collection;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    return-object p0
.end method

.method public final c()Ljava/util/Set;
    .locals 0

    .line 1
    iget-object p0, p0, Lfw7;->b:Let4;

    .line 2
    .line 3
    invoke-interface {p0}, Let4;->c()Ljava/util/Set;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    return-object p0
.end method

.method public final d()Ljava/util/Set;
    .locals 0

    .line 1
    iget-object p0, p0, Lfw7;->b:Let4;

    .line 2
    .line 3
    invoke-interface {p0}, Let4;->d()Ljava/util/Set;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    return-object p0
.end method

.method public final e(Lv15;Lx45;)Lot0;
    .locals 1

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    iget-object v0, p0, Lfw7;->b:Let4;

    .line 8
    .line 9
    invoke-interface {v0, p1, p2}, Let4;->e(Lv15;Lx45;)Lot0;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    if-eqz p1, :cond_0

    .line 14
    .line 15
    invoke-virtual {p0, p1}, Lfw7;->h(Led1;)Led1;

    .line 16
    .line 17
    .line 18
    move-result-object p0

    .line 19
    check-cast p0, Lot0;

    .line 20
    .line 21
    return-object p0

    .line 22
    :cond_0
    const/4 p0, 0x0

    .line 23
    return-object p0
.end method

.method public final f(Lv15;Lx45;)Ljava/util/Collection;
    .locals 1

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lfw7;->b:Let4;

    .line 5
    .line 6
    invoke-interface {v0, p1, p2}, Let4;->f(Lv15;Lx45;)Ljava/util/Collection;

    .line 7
    .line 8
    .line 9
    move-result-object p1

    .line 10
    invoke-virtual {p0, p1}, Lfw7;->i(Ljava/util/Collection;)Ljava/util/Collection;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    return-object p0
.end method

.method public final g()Ljava/util/Set;
    .locals 0

    .line 1
    iget-object p0, p0, Lfw7;->b:Let4;

    .line 2
    .line 3
    invoke-interface {p0}, Let4;->g()Ljava/util/Set;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    return-object p0
.end method

.method public final h(Led1;)Led1;
    .locals 3

    .line 1
    iget-object v0, p0, Lfw7;->c:Lwi8;

    .line 2
    .line 3
    iget-object v1, v0, Lwi8;->a:Lui8;

    .line 4
    .line 5
    invoke-virtual {v1}, Lui8;->e()Z

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    if-eqz v1, :cond_0

    .line 10
    .line 11
    return-object p1

    .line 12
    :cond_0
    iget-object v1, p0, Lfw7;->d:Ljava/util/HashMap;

    .line 13
    .line 14
    if-nez v1, :cond_1

    .line 15
    .line 16
    new-instance v1, Ljava/util/HashMap;

    .line 17
    .line 18
    invoke-direct {v1}, Ljava/util/HashMap;-><init>()V

    .line 19
    .line 20
    .line 21
    iput-object v1, p0, Lfw7;->d:Ljava/util/HashMap;

    .line 22
    .line 23
    :cond_1
    invoke-interface {v1, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    move-result-object p0

    .line 27
    if-nez p0, :cond_4

    .line 28
    .line 29
    instance-of p0, p1, Lew7;

    .line 30
    .line 31
    const/4 v2, 0x0

    .line 32
    if-eqz p0, :cond_3

    .line 33
    .line 34
    move-object p0, p1

    .line 35
    check-cast p0, Lew7;

    .line 36
    .line 37
    invoke-interface {p0, v0}, Lew7;->g(Lwi8;)Lgd1;

    .line 38
    .line 39
    .line 40
    move-result-object p0

    .line 41
    if-eqz p0, :cond_2

    .line 42
    .line 43
    invoke-interface {v1, p1, p0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 44
    .line 45
    .line 46
    goto :goto_0

    .line 47
    :cond_2
    const-string p0, "We expect that no conflict should happen while substitution is guaranteed to generate invariant projection, but "

    .line 48
    .line 49
    const-string v0, " substitution fails"

    .line 50
    .line 51
    invoke-static {p0, p1, v0}, Lxw3;->l(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 52
    .line 53
    .line 54
    return-object v2

    .line 55
    :cond_3
    const-string p0, "Unknown descriptor in scope: "

    .line 56
    .line 57
    invoke-static {p1, p0}, Lb61;->o(Ljava/lang/Object;Ljava/lang/String;)V

    .line 58
    .line 59
    .line 60
    return-object v2

    .line 61
    :cond_4
    :goto_0
    check-cast p0, Led1;

    .line 62
    .line 63
    return-object p0
.end method

.method public final i(Ljava/util/Collection;)Ljava/util/Collection;
    .locals 3

    .line 1
    iget-object v0, p0, Lfw7;->c:Lwi8;

    .line 2
    .line 3
    iget-object v0, v0, Lwi8;->a:Lui8;

    .line 4
    .line 5
    invoke-virtual {v0}, Lui8;->e()Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    return-object p1

    .line 12
    :cond_0
    invoke-interface {p1}, Ljava/util/Collection;->isEmpty()Z

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    if-eqz v0, :cond_1

    .line 17
    .line 18
    return-object p1

    .line 19
    :cond_1
    invoke-interface {p1}, Ljava/util/Collection;->size()I

    .line 20
    .line 21
    .line 22
    move-result v0

    .line 23
    new-instance v1, Ljava/util/LinkedHashSet;

    .line 24
    .line 25
    const/4 v2, 0x3

    .line 26
    if-ge v0, v2, :cond_2

    .line 27
    .line 28
    goto :goto_0

    .line 29
    :cond_2
    div-int/lit8 v2, v0, 0x3

    .line 30
    .line 31
    add-int/2addr v2, v0

    .line 32
    add-int/lit8 v2, v2, 0x1

    .line 33
    .line 34
    :goto_0
    invoke-direct {v1, v2}, Ljava/util/LinkedHashSet;-><init>(I)V

    .line 35
    .line 36
    .line 37
    invoke-interface {p1}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    .line 38
    .line 39
    .line 40
    move-result-object p1

    .line 41
    :goto_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 42
    .line 43
    .line 44
    move-result v0

    .line 45
    if-eqz v0, :cond_3

    .line 46
    .line 47
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 48
    .line 49
    .line 50
    move-result-object v0

    .line 51
    check-cast v0, Led1;

    .line 52
    .line 53
    invoke-virtual {p0, v0}, Lfw7;->h(Led1;)Led1;

    .line 54
    .line 55
    .line 56
    move-result-object v0

    .line 57
    invoke-virtual {v1, v0}, Ljava/util/AbstractCollection;->add(Ljava/lang/Object;)Z

    .line 58
    .line 59
    .line 60
    goto :goto_1

    .line 61
    :cond_3
    return-object v1
.end method
