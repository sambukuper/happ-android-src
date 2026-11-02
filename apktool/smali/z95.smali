.class public final Lz95;
.super Ljava/lang/Object;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"


# instance fields
.field public final a:Ljava/lang/Runnable;

.field public final b:Lvz7;


# direct methods
.method public constructor <init>(Ljava/lang/Runnable;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lz95;->a:Ljava/lang/Runnable;

    .line 5
    .line 6
    new-instance p1, Ltb2;

    .line 7
    .line 8
    const/16 v0, 0x1b

    .line 9
    .line 10
    invoke-direct {p1, p0, v0}, Ltb2;-><init>(Ljava/lang/Object;B)V

    .line 11
    .line 12
    .line 13
    new-instance v0, Lvz7;

    .line 14
    .line 15
    invoke-direct {v0, p1}, Lvz7;-><init>(Ldn2;)V

    .line 16
    .line 17
    .line 18
    iput-object v0, p0, Lz95;->b:Lvz7;

    .line 19
    .line 20
    return-void
.end method


# virtual methods
.method public final a(Ld94;Lu95;)V
    .locals 3

    .line 1
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-interface {p1}, Ld94;->h()Lg94;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    iget-object v1, v0, Lg94;->i:Lo84;

    .line 9
    .line 10
    sget-object v2, Lo84;->X:Lo84;

    .line 11
    .line 12
    if-ne v1, v2, :cond_0

    .line 13
    .line 14
    return-void

    .line 15
    :cond_0
    new-instance v1, Lv95;

    .line 16
    .line 17
    invoke-direct {v1, p1, p2}, Lv95;-><init>(Ld94;Lu95;)V

    .line 18
    .line 19
    .line 20
    new-instance p1, Lt95;

    .line 21
    .line 22
    invoke-direct {p1, p2, v1}, Lt95;-><init>(Lu95;Lv95;)V

    .line 23
    .line 24
    .line 25
    iget-object v1, p2, Lu95;->a:Ljava/util/ArrayList;

    .line 26
    .line 27
    invoke-virtual {v1, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 28
    .line 29
    .line 30
    const/4 v1, 0x0

    .line 31
    invoke-virtual {p1, v1}, Lt95;->g(Z)V

    .line 32
    .line 33
    .line 34
    invoke-virtual {p0}, Lz95;->c()Lx95;

    .line 35
    .line 36
    .line 37
    move-result-object v1

    .line 38
    iget-object v1, v1, Lx95;->c:Lz47;

    .line 39
    .line 40
    invoke-static {v1, p1}, Lz47;->k(Lz47;Lk25;)V

    .line 41
    .line 42
    .line 43
    new-instance v1, Ljf1;

    .line 44
    .line 45
    invoke-direct {v1, p1, p0, v0}, Ljf1;-><init>(Lt95;Lz95;Lg94;)V

    .line 46
    .line 47
    .line 48
    invoke-virtual {v0, v1}, Lg94;->a(Lc94;)V

    .line 49
    .line 50
    .line 51
    new-instance p0, Lw95;

    .line 52
    .line 53
    invoke-direct {p0, v0, v1}, Lw95;-><init>(Lg94;Ljf1;)V

    .line 54
    .line 55
    .line 56
    iget-object p1, p2, Lu95;->c:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 57
    .line 58
    invoke-virtual {p1, p0}, Ljava/util/concurrent/CopyOnWriteArrayList;->add(Ljava/lang/Object;)Z

    .line 59
    .line 60
    .line 61
    return-void
.end method

.method public final b(Lu95;)V
    .locals 2

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    new-instance v0, Lv95;

    .line 5
    .line 6
    const/4 v1, 0x0

    .line 7
    invoke-direct {v0, v1, p1}, Lv95;-><init>(Ld94;Lu95;)V

    .line 8
    .line 9
    .line 10
    new-instance v1, Lt95;

    .line 11
    .line 12
    invoke-direct {v1, p1, v0}, Lt95;-><init>(Lu95;Lv95;)V

    .line 13
    .line 14
    .line 15
    iget-object p1, p1, Lu95;->a:Ljava/util/ArrayList;

    .line 16
    .line 17
    invoke-virtual {p1, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 18
    .line 19
    .line 20
    invoke-virtual {p0}, Lz95;->c()Lx95;

    .line 21
    .line 22
    .line 23
    move-result-object p0

    .line 24
    iget-object p0, p0, Lx95;->c:Lz47;

    .line 25
    .line 26
    invoke-static {p0, v1}, Lz47;->k(Lz47;Lk25;)V

    .line 27
    .line 28
    .line 29
    return-void
.end method

.method public final c()Lx95;
    .locals 0

    .line 1
    iget-object p0, p0, Lz95;->b:Lvz7;

    .line 2
    .line 3
    invoke-virtual {p0}, Lvz7;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Lx95;

    .line 8
    .line 9
    return-object p0
.end method

.method public final d(Landroid/window/OnBackInvokedDispatcher;)V
    .locals 4

    .line 1
    invoke-virtual {p0}, Lz95;->c()Lx95;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget-object v0, v0, Lx95;->c:Lz47;

    .line 6
    .line 7
    new-instance v1, Lq95;

    .line 8
    .line 9
    const/4 v2, 0x0

    .line 10
    invoke-direct {v1, p1, v2}, Ls95;-><init>(Landroid/window/OnBackInvokedDispatcher;I)V

    .line 11
    .line 12
    .line 13
    const/4 v3, 0x1

    .line 14
    invoke-virtual {v0, v1, v3}, Lz47;->m(Ls95;I)V

    .line 15
    .line 16
    .line 17
    invoke-virtual {p0}, Lz95;->c()Lx95;

    .line 18
    .line 19
    .line 20
    move-result-object p0

    .line 21
    iget-object p0, p0, Lx95;->c:Lz47;

    .line 22
    .line 23
    new-instance v0, Lq95;

    .line 24
    .line 25
    const v1, 0xf4240

    .line 26
    .line 27
    .line 28
    invoke-direct {v0, p1, v1}, Ls95;-><init>(Landroid/window/OnBackInvokedDispatcher;I)V

    .line 29
    .line 30
    .line 31
    invoke-virtual {p0, v0, v2}, Lz47;->m(Ls95;I)V

    .line 32
    .line 33
    .line 34
    return-void
.end method
