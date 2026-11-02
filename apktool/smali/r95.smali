.class public final Lr95;
.super Ljava/lang/Object;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"

# interfaces
.implements Landroid/window/OnBackAnimationCallback;


# instance fields
.field public final synthetic a:Ls95;


# direct methods
.method public constructor <init>(Ls95;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lr95;->a:Ls95;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final onBackCancelled()V
    .locals 5

    .line 1
    iget-object p0, p0, Lr95;->a:Ls95;

    .line 2
    .line 3
    iget-object v0, p0, Lm25;->a:Lz47;

    .line 4
    .line 5
    if-eqz v0, :cond_5

    .line 6
    .line 7
    iget-boolean v1, p0, Lm25;->b:Z

    .line 8
    .line 9
    const/4 v2, 0x0

    .line 10
    if-nez v1, :cond_0

    .line 11
    .line 12
    invoke-virtual {v0, p0, v2}, Lz47;->s(Lm25;Li25;)V

    .line 13
    .line 14
    .line 15
    :cond_0
    iget-object v0, v0, Lz47;->Z:Ljava/lang/Object;

    .line 16
    .line 17
    check-cast v0, Ln25;

    .line 18
    .line 19
    iget-object v1, v0, Ln25;->h:Lm25;

    .line 20
    .line 21
    invoke-virtual {p0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 22
    .line 23
    .line 24
    move-result v1

    .line 25
    const/4 v3, 0x0

    .line 26
    if-eqz v1, :cond_4

    .line 27
    .line 28
    iget v1, v0, Ln25;->g:I

    .line 29
    .line 30
    const/4 v4, -0x1

    .line 31
    if-eq v4, v1, :cond_1

    .line 32
    .line 33
    goto :goto_0

    .line 34
    :cond_1
    iget-object v1, v0, Ln25;->f:Lk25;

    .line 35
    .line 36
    if-nez v1, :cond_2

    .line 37
    .line 38
    invoke-virtual {v0, v4}, Ln25;->c(I)Lk25;

    .line 39
    .line 40
    .line 41
    move-result-object v1

    .line 42
    :cond_2
    iput-object v2, v0, Ln25;->f:Lk25;

    .line 43
    .line 44
    iput v3, v0, Ln25;->g:I

    .line 45
    .line 46
    iput-object v2, v0, Ln25;->h:Lm25;

    .line 47
    .line 48
    if-eqz v1, :cond_3

    .line 49
    .line 50
    invoke-virtual {v1}, Lk25;->a()V

    .line 51
    .line 52
    .line 53
    :cond_3
    iget-object v0, v0, Ln25;->a:Loh7;

    .line 54
    .line 55
    sget-object v1, Lo25;->i0:Lo25;

    .line 56
    .line 57
    invoke-virtual {v0, v2, v1}, Loh7;->n(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 58
    .line 59
    .line 60
    :cond_4
    :goto_0
    iput-boolean v3, p0, Lm25;->b:Z

    .line 61
    .line 62
    return-void

    .line 63
    :cond_5
    const-string p0, "This input is not added to any dispatcher."

    .line 64
    .line 65
    invoke-static {p0}, Lbt;->i(Ljava/lang/String;)V

    .line 66
    .line 67
    .line 68
    return-void
.end method

.method public final onBackInvoked()V
    .locals 0

    .line 1
    iget-object p0, p0, Lr95;->a:Ls95;

    .line 2
    .line 3
    invoke-virtual {p0}, Lm25;->a()V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final onBackProgressed(Landroid/window/BackEvent;)V
    .locals 2

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-static {p1}, Ld4;->a(Landroid/window/BackEvent;)Li25;

    .line 5
    .line 6
    .line 7
    move-result-object p1

    .line 8
    iget-object p0, p0, Lr95;->a:Ls95;

    .line 9
    .line 10
    iget-object v0, p0, Lm25;->a:Lz47;

    .line 11
    .line 12
    if-eqz v0, :cond_4

    .line 13
    .line 14
    iget-boolean v1, p0, Lm25;->b:Z

    .line 15
    .line 16
    if-eqz v1, :cond_3

    .line 17
    .line 18
    iget-object v0, v0, Lz47;->Z:Ljava/lang/Object;

    .line 19
    .line 20
    check-cast v0, Ln25;

    .line 21
    .line 22
    iget-object v1, v0, Ln25;->h:Lm25;

    .line 23
    .line 24
    invoke-virtual {p0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 25
    .line 26
    .line 27
    move-result p0

    .line 28
    if-eqz p0, :cond_3

    .line 29
    .line 30
    iget p0, v0, Ln25;->g:I

    .line 31
    .line 32
    const/4 v1, -0x1

    .line 33
    if-eq v1, p0, :cond_0

    .line 34
    .line 35
    goto :goto_0

    .line 36
    :cond_0
    iget-object p0, v0, Ln25;->f:Lk25;

    .line 37
    .line 38
    if-nez p0, :cond_1

    .line 39
    .line 40
    invoke-virtual {v0, v1}, Ln25;->c(I)Lk25;

    .line 41
    .line 42
    .line 43
    move-result-object p0

    .line 44
    :cond_1
    if-eqz p0, :cond_2

    .line 45
    .line 46
    invoke-virtual {p0, p1}, Lk25;->c(Li25;)V

    .line 47
    .line 48
    .line 49
    :cond_2
    iget-object p0, v0, Ln25;->a:Loh7;

    .line 50
    .line 51
    new-instance v0, Lp25;

    .line 52
    .line 53
    invoke-direct {v0, p1}, Lp25;-><init>(Li25;)V

    .line 54
    .line 55
    .line 56
    const/4 p1, 0x0

    .line 57
    invoke-virtual {p0, p1, v0}, Loh7;->n(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 58
    .line 59
    .line 60
    :cond_3
    :goto_0
    return-void

    .line 61
    :cond_4
    const-string p0, "This input is not added to any dispatcher."

    .line 62
    .line 63
    invoke-static {p0}, Lbt;->i(Ljava/lang/String;)V

    .line 64
    .line 65
    .line 66
    return-void
.end method

.method public final onBackStarted(Landroid/window/BackEvent;)V
    .locals 2

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-static {p1}, Ld4;->a(Landroid/window/BackEvent;)Li25;

    .line 5
    .line 6
    .line 7
    move-result-object p1

    .line 8
    iget-object p0, p0, Lr95;->a:Ls95;

    .line 9
    .line 10
    iget-object v0, p0, Lm25;->a:Lz47;

    .line 11
    .line 12
    if-eqz v0, :cond_1

    .line 13
    .line 14
    iget-boolean v1, p0, Lm25;->b:Z

    .line 15
    .line 16
    if-nez v1, :cond_0

    .line 17
    .line 18
    invoke-virtual {v0, p0, p1}, Lz47;->s(Lm25;Li25;)V

    .line 19
    .line 20
    .line 21
    const/4 p1, 0x1

    .line 22
    iput-boolean p1, p0, Lm25;->b:Z

    .line 23
    .line 24
    :cond_0
    return-void

    .line 25
    :cond_1
    const-string p0, "This input is not added to any dispatcher."

    .line 26
    .line 27
    invoke-static {p0}, Lbt;->i(Ljava/lang/String;)V

    .line 28
    .line 29
    .line 30
    return-void
.end method
