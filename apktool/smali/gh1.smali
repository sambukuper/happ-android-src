.class public final Lgh1;
.super Ljava/lang/Object;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"

# interfaces
.implements Lqq8;


# instance fields
.field public final a:Lv06;

.field public final b:Lpr8;

.field public volatile c:Lwq8;

.field public final d:Ljava/util/concurrent/atomic/AtomicBoolean;


# direct methods
.method public constructor <init>(Lv06;Lpr8;)V
    .locals 0

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
    iput-object p1, p0, Lgh1;->a:Lv06;

    .line 11
    .line 12
    iput-object p2, p0, Lgh1;->b:Lpr8;

    .line 13
    .line 14
    new-instance p1, Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 15
    .line 16
    const/4 p2, 0x0

    .line 17
    invoke-direct {p1, p2}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    .line 18
    .line 19
    .line 20
    iput-object p1, p0, Lgh1;->d:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 21
    .line 22
    return-void
.end method


# virtual methods
.method public final a()Lxg1;
    .locals 4

    .line 1
    iget-object v0, p0, Lgh1;->c:Lwq8;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {v0}, Lwq8;->a()Lxg1;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    return-object p0

    .line 10
    :cond_0
    iget-object v0, p0, Lgh1;->b:Lpr8;

    .line 11
    .line 12
    iget-object v0, v0, Lpr8;->f:Lm51;

    .line 13
    .line 14
    new-instance v1, Leh1;

    .line 15
    .line 16
    const/4 v2, 0x2

    .line 17
    const/4 v3, 0x0

    .line 18
    invoke-direct {v1, p0, v3, v2}, Leh1;-><init>(Lgh1;Lq51;B)V

    .line 19
    .line 20
    .line 21
    const/4 p0, 0x3

    .line 22
    invoke-static {v0, v3, v1, p0}, Lw51;->j(Lb71;Ls61;Lrn2;I)Lyg1;

    .line 23
    .line 24
    .line 25
    move-result-object p0

    .line 26
    return-object p0
.end method

.method public final b(Luy7;)Ljava/lang/Object;
    .locals 4

    .line 1
    iget-object v0, p0, Lgh1;->c:Lwq8;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {v0, p1}, Lwq8;->b(Luy7;)Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    return-object p0

    .line 10
    :cond_0
    iget-object v0, p0, Lgh1;->b:Lpr8;

    .line 11
    .line 12
    iget-object v0, v0, Lpr8;->e:Lob;

    .line 13
    .line 14
    invoke-static {v0}, Lnr4;->x(Ljava/util/concurrent/Executor;)Lu61;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    new-instance v1, Leh1;

    .line 19
    .line 20
    const/4 v2, 0x0

    .line 21
    const/4 v3, 0x0

    .line 22
    invoke-direct {v1, p0, v2, v3}, Leh1;-><init>(Lgh1;Lq51;B)V

    .line 23
    .line 24
    .line 25
    invoke-static {v0, v1, p1}, Lw51;->W(Ls61;Lrn2;Lq51;)Ljava/lang/Object;

    .line 26
    .line 27
    .line 28
    move-result-object p0

    .line 29
    return-object p0
.end method

.method public final c(Lgg0;Ljava/util/Map;)Lxg1;
    .locals 7

    .line 1
    iget-object v0, p0, Lgh1;->c:Lwq8;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {v0, p1, p2}, Lwq8;->c(Lgg0;Ljava/util/Map;)Lxg1;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    return-object p0

    .line 10
    :cond_0
    iget-object v0, p0, Lgh1;->b:Lpr8;

    .line 11
    .line 12
    iget-object v0, v0, Lpr8;->f:Lm51;

    .line 13
    .line 14
    new-instance v1, Lr0;

    .line 15
    .line 16
    const/16 v6, 0x10

    .line 17
    .line 18
    const/4 v3, 0x0

    .line 19
    move-object v2, p0

    .line 20
    move-object v4, p1

    .line 21
    move-object v5, p2

    .line 22
    invoke-direct/range {v1 .. v6}, Lr0;-><init>(Lgh1;Lq51;Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 23
    .line 24
    .line 25
    const/4 p0, 0x3

    .line 26
    invoke-static {v0, v3, v1, p0}, Lw51;->j(Lb71;Ls61;Lrn2;I)Lyg1;

    .line 27
    .line 28
    .line 29
    move-result-object p0

    .line 30
    return-object p0
.end method

.method public final close()V
    .locals 4

    .line 1
    iget-object v0, p0, Lgh1;->d:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    invoke-virtual {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;->getAndSet(Z)Z

    .line 5
    .line 6
    .line 7
    move-result v0

    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    return-void

    .line 11
    :cond_0
    iget-object v0, p0, Lgh1;->b:Lpr8;

    .line 12
    .line 13
    iget-object v0, v0, Lpr8;->f:Lm51;

    .line 14
    .line 15
    new-instance v1, Ll40;

    .line 16
    .line 17
    const/4 v2, 0x0

    .line 18
    const/4 v3, 0x3

    .line 19
    invoke-direct {v1, v2, p0, v3}, Ll40;-><init>(Lq51;Ljava/lang/Object;B)V

    .line 20
    .line 21
    .line 22
    invoke-static {v0, v2, v2, v1, v3}, Lw51;->G(Lb71;Ls61;Le71;Lrn2;I)Log7;

    .line 23
    .line 24
    .line 25
    return-void
.end method

.method public final d(I)Lxg1;
    .locals 3

    .line 1
    iget-object v0, p0, Lgh1;->c:Lwq8;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {v0, p1}, Lwq8;->d(I)Lxg1;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    return-object p0

    .line 10
    :cond_0
    iget-object v0, p0, Lgh1;->b:Lpr8;

    .line 11
    .line 12
    iget-object v0, v0, Lpr8;->f:Lm51;

    .line 13
    .line 14
    new-instance v1, Lfh1;

    .line 15
    .line 16
    const/4 v2, 0x0

    .line 17
    invoke-direct {v1, p0, v2, p1}, Lfh1;-><init>(Lgh1;Lq51;I)V

    .line 18
    .line 19
    .line 20
    const/4 p0, 0x3

    .line 21
    invoke-static {v0, v2, v1, p0}, Lw51;->j(Lb71;Ls61;Lrn2;I)Lyg1;

    .line 22
    .line 23
    .line 24
    move-result-object p0

    .line 25
    return-object p0
.end method

.method public final e(Ljava/util/List;)Lxg1;
    .locals 3

    .line 1
    iget-object v0, p0, Lgh1;->c:Lwq8;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {v0, p1}, Lwq8;->e(Ljava/util/List;)Lxg1;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    return-object p0

    .line 10
    :cond_0
    iget-object v0, p0, Lgh1;->b:Lpr8;

    .line 11
    .line 12
    iget-object v0, v0, Lpr8;->f:Lm51;

    .line 13
    .line 14
    new-instance v1, Lq0;

    .line 15
    .line 16
    const/4 v2, 0x0

    .line 17
    invoke-direct {v1, p0, v2, p1}, Lq0;-><init>(Lgh1;Lq51;Ljava/util/List;)V

    .line 18
    .line 19
    .line 20
    const/4 p0, 0x3

    .line 21
    invoke-static {v0, v2, v1, p0}, Lw51;->j(Lb71;Ls61;Lrn2;I)Lyg1;

    .line 22
    .line 23
    .line 24
    move-result-object p0

    .line 25
    return-object p0
.end method

.method public final f(Ljava/util/LinkedHashSet;Z)Lxg1;
    .locals 3

    .line 1
    iget-object v0, p0, Lgh1;->c:Lwq8;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {v0, p1, p2}, Lwq8;->f(Ljava/util/LinkedHashSet;Z)Lxg1;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    return-object p0

    .line 10
    :cond_0
    iget-object v0, p0, Lgh1;->b:Lpr8;

    .line 11
    .line 12
    iget-object v0, v0, Lpr8;->f:Lm51;

    .line 13
    .line 14
    new-instance v1, Lz81;

    .line 15
    .line 16
    const/4 v2, 0x0

    .line 17
    invoke-direct {v1, p0, v2, p2, p1}, Lz81;-><init>(Lgh1;Lq51;ZLjava/util/LinkedHashSet;)V

    .line 18
    .line 19
    .line 20
    const/4 p0, 0x3

    .line 21
    invoke-static {v0, v2, v1, p0}, Lw51;->j(Lb71;Ls61;Lrn2;I)Lyg1;

    .line 22
    .line 23
    .line 24
    move-result-object p0

    .line 25
    return-object p0
.end method

.method public final g(Ljava/util/Map;Lpq8;Lk11;)Lxg1;
    .locals 7

    .line 1
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    iget-object v0, p0, Lgh1;->c:Lwq8;

    .line 8
    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    invoke-virtual {v0, p1, p2, p3}, Lwq8;->g(Ljava/util/Map;Lpq8;Lk11;)Lxg1;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    return-object p0

    .line 16
    :cond_0
    iget-object v0, p0, Lgh1;->b:Lpr8;

    .line 17
    .line 18
    iget-object v0, v0, Lpr8;->f:Lm51;

    .line 19
    .line 20
    new-instance v1, Lpi;

    .line 21
    .line 22
    const/4 v3, 0x0

    .line 23
    move-object v2, p0

    .line 24
    move-object v4, p1

    .line 25
    move-object v5, p2

    .line 26
    move-object v6, p3

    .line 27
    invoke-direct/range {v1 .. v6}, Lpi;-><init>(Lgh1;Lq51;Ljava/util/Map;Lpq8;Lk11;)V

    .line 28
    .line 29
    .line 30
    const/4 p0, 0x3

    .line 31
    const/4 p1, 0x0

    .line 32
    invoke-static {v0, p1, v1, p0}, Lw51;->j(Lb71;Ls61;Lrn2;I)Lyg1;

    .line 33
    .line 34
    .line 35
    move-result-object p0

    .line 36
    return-object p0
.end method

.method public final h(Ljava/util/Map;Lk11;)Lxg1;
    .locals 7

    .line 1
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lgh1;->c:Lwq8;

    .line 5
    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    invoke-virtual {v0, p1, p2}, Lwq8;->h(Ljava/util/Map;Lk11;)Lxg1;

    .line 9
    .line 10
    .line 11
    move-result-object p0

    .line 12
    return-object p0

    .line 13
    :cond_0
    iget-object v0, p0, Lgh1;->b:Lpr8;

    .line 14
    .line 15
    iget-object v0, v0, Lpr8;->f:Lm51;

    .line 16
    .line 17
    new-instance v1, Lr0;

    .line 18
    .line 19
    const/16 v6, 0xf

    .line 20
    .line 21
    const/4 v3, 0x0

    .line 22
    move-object v2, p0

    .line 23
    move-object v4, p1

    .line 24
    move-object v5, p2

    .line 25
    invoke-direct/range {v1 .. v6}, Lr0;-><init>(Lgh1;Lq51;Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 26
    .line 27
    .line 28
    const/4 p0, 0x3

    .line 29
    invoke-static {v0, v3, v1, p0}, Lw51;->j(Lb71;Ls61;Lrn2;I)Lyg1;

    .line 30
    .line 31
    .line 32
    move-result-object p0

    .line 33
    return-object p0
.end method

.method public final i()Lxg1;
    .locals 4

    .line 1
    iget-object v0, p0, Lgh1;->c:Lwq8;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {v0}, Lwq8;->i()Lxg1;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    return-object p0

    .line 10
    :cond_0
    iget-object v0, p0, Lgh1;->b:Lpr8;

    .line 11
    .line 12
    iget-object v0, v0, Lpr8;->f:Lm51;

    .line 13
    .line 14
    new-instance v1, Leh1;

    .line 15
    .line 16
    const/4 v2, 0x1

    .line 17
    const/4 v3, 0x0

    .line 18
    invoke-direct {v1, p0, v3, v2}, Leh1;-><init>(Lgh1;Lq51;B)V

    .line 19
    .line 20
    .line 21
    const/4 p0, 0x3

    .line 22
    invoke-static {v0, v3, v1, p0}, Lw51;->j(Lb71;Ls61;Lrn2;I)Lyg1;

    .line 23
    .line 24
    .line 25
    move-result-object p0

    .line 26
    return-object p0
.end method

.method public final j()Lwq8;
    .locals 2

    .line 1
    iget-object v0, p0, Lgh1;->d:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-nez v0, :cond_2

    .line 8
    .line 9
    iget-object v0, p0, Lgh1;->c:Lwq8;

    .line 10
    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    return-object v0

    .line 14
    :cond_0
    iget-object v0, p0, Lgh1;->a:Lv06;

    .line 15
    .line 16
    invoke-interface {v0}, Lv06;->get()Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    check-cast v0, Lwq8;

    .line 21
    .line 22
    iget-object v1, p0, Lgh1;->d:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 23
    .line 24
    invoke-virtual {v1}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    .line 25
    .line 26
    .line 27
    move-result v1

    .line 28
    if-nez v1, :cond_1

    .line 29
    .line 30
    iput-object v0, p0, Lgh1;->c:Lwq8;

    .line 31
    .line 32
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 33
    .line 34
    .line 35
    return-object v0

    .line 36
    :cond_1
    invoke-virtual {v0}, Lwq8;->close()V

    .line 37
    .line 38
    .line 39
    new-instance p0, Ljava/util/concurrent/CancellationException;

    .line 40
    .line 41
    const-string v0, "UseCaseCameraRequestControl closed during initialization"

    .line 42
    .line 43
    invoke-direct {p0, v0}, Ljava/util/concurrent/CancellationException;-><init>(Ljava/lang/String;)V

    .line 44
    .line 45
    .line 46
    throw p0

    .line 47
    :cond_2
    new-instance p0, Ljava/util/concurrent/CancellationException;

    .line 48
    .line 49
    const-string v0, "UseCaseCameraRequestControl is closed"

    .line 50
    .line 51
    invoke-direct {p0, v0}, Ljava/util/concurrent/CancellationException;-><init>(Ljava/lang/String;)V

    .line 52
    .line 53
    .line 54
    throw p0
.end method
