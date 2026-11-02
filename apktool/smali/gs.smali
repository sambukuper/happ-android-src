.class public final Lgs;
.super Luy7;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"

# interfaces
.implements Lrn2;


# instance fields
.field public g0:B

.field public final synthetic h0:Z

.field public final synthetic i0:Lms;


# direct methods
.method public constructor <init>(ZLms;Lq51;)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Lgs;->h0:Z

    .line 2
    .line 3
    iput-object p2, p0, Lgs;->i0:Lms;

    .line 4
    .line 5
    const/4 p1, 0x2

    .line 6
    invoke-direct {p0, p1, p3}, Luy7;-><init>(ILq51;)V

    .line 7
    .line 8
    .line 9
    return-void
.end method


# virtual methods
.method public final K(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Lb71;

    .line 2
    .line 3
    check-cast p2, Lq51;

    .line 4
    .line 5
    invoke-virtual {p0, p2, p1}, Lgs;->n(Lq51;Ljava/lang/Object;)Lq51;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    check-cast p0, Lgs;

    .line 10
    .line 11
    sget-object p1, Ldn8;->a:Ldn8;

    .line 12
    .line 13
    invoke-virtual {p0, p1}, Lgs;->q(Ljava/lang/Object;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    return-object p0
.end method

.method public final n(Lq51;Ljava/lang/Object;)Lq51;
    .locals 1

    .line 1
    new-instance p2, Lgs;

    .line 2
    .line 3
    iget-boolean v0, p0, Lgs;->h0:Z

    .line 4
    .line 5
    iget-object p0, p0, Lgs;->i0:Lms;

    .line 6
    .line 7
    invoke-direct {p2, v0, p0, p1}, Lgs;-><init>(ZLms;Lq51;)V

    .line 8
    .line 9
    .line 10
    return-object p2
.end method

.method public final q(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4

    .line 1
    iget-byte v0, p0, Lgs;->g0:B

    .line 2
    .line 3
    const/4 v1, 0x2

    .line 4
    const/4 v2, 0x1

    .line 5
    if-eqz v0, :cond_2

    .line 6
    .line 7
    if-eq v0, v2, :cond_1

    .line 8
    .line 9
    if-ne v0, v1, :cond_0

    .line 10
    .line 11
    goto :goto_0

    .line 12
    :cond_0
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 13
    .line 14
    invoke-static {p0}, Lbt;->i(Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    const/4 p0, 0x0

    .line 18
    return-object p0

    .line 19
    :cond_1
    :goto_0
    invoke-static {p1}, Lw39;->n0(Ljava/lang/Object;)V

    .line 20
    .line 21
    .line 22
    goto :goto_2

    .line 23
    :cond_2
    invoke-static {p1}, Lw39;->n0(Ljava/lang/Object;)V

    .line 24
    .line 25
    .line 26
    sget-object p1, Lc71;->X:Lc71;

    .line 27
    .line 28
    iget-boolean v0, p0, Lgs;->h0:Z

    .line 29
    .line 30
    iget-object v3, p0, Lgs;->i0:Lms;

    .line 31
    .line 32
    if-eqz v0, :cond_3

    .line 33
    .line 34
    iget-object v0, v3, Lms;->b:Lrp8;

    .line 35
    .line 36
    iput-byte v2, p0, Lgs;->g0:B

    .line 37
    .line 38
    invoke-virtual {v0, p0}, Lrp8;->d(Ls51;)Ljava/lang/Object;

    .line 39
    .line 40
    .line 41
    move-result-object p0

    .line 42
    if-ne p0, p1, :cond_4

    .line 43
    .line 44
    goto :goto_1

    .line 45
    :cond_3
    iput-byte v1, p0, Lgs;->g0:B

    .line 46
    .line 47
    invoke-virtual {v3, p0}, Lms;->d(Ls51;)Ljava/lang/Object;

    .line 48
    .line 49
    .line 50
    move-result-object p0

    .line 51
    if-ne p0, p1, :cond_4

    .line 52
    .line 53
    :goto_1
    return-object p1

    .line 54
    :cond_4
    :goto_2
    sget-object p0, Ldn8;->a:Ldn8;

    .line 55
    .line 56
    return-object p0
.end method
