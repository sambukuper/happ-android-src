.class public final Lu9;
.super Luy7;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"

# interfaces
.implements Lsn2;


# instance fields
.field public g0:Z

.field public synthetic h0:Lia;

.field public final synthetic i0:Lpi;

.field public final synthetic j0:Lz9;


# direct methods
.method public constructor <init>(Lpi;Lz9;Lq51;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lu9;->i0:Lpi;

    .line 2
    .line 3
    iput-object p2, p0, Lu9;->j0:Lz9;

    .line 4
    .line 5
    const/4 p1, 0x3

    .line 6
    invoke-direct {p0, p1, p3}, Luy7;-><init>(ILq51;)V

    .line 7
    .line 8
    .line 9
    return-void
.end method


# virtual methods
.method public final q(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    .line 1
    iget-boolean v0, p0, Lu9;->g0:Z

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    if-eqz v0, :cond_1

    .line 5
    .line 6
    if-ne v0, v1, :cond_0

    .line 7
    .line 8
    invoke-static {p1}, Lw39;->n0(Ljava/lang/Object;)V

    .line 9
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
    invoke-static {p1}, Lw39;->n0(Ljava/lang/Object;)V

    .line 20
    .line 21
    .line 22
    iget-object p1, p0, Lu9;->h0:Lia;

    .line 23
    .line 24
    new-instance v0, Lp0;

    .line 25
    .line 26
    iget-object v2, p0, Lu9;->j0:Lz9;

    .line 27
    .line 28
    invoke-direct {v0, v2, p1, v1}, Lp0;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 29
    .line 30
    .line 31
    iput-boolean v1, p0, Lu9;->g0:Z

    .line 32
    .line 33
    iget-object p1, p0, Lu9;->i0:Lpi;

    .line 34
    .line 35
    invoke-virtual {p1, v0, p0}, Lpi;->K(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 36
    .line 37
    .line 38
    move-result-object p0

    .line 39
    sget-object p1, Lc71;->X:Lc71;

    .line 40
    .line 41
    if-ne p0, p1, :cond_2

    .line 42
    .line 43
    return-object p1

    .line 44
    :cond_2
    :goto_0
    sget-object p0, Ldn8;->a:Ldn8;

    .line 45
    .line 46
    return-object p0
.end method

.method public final x(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    check-cast p1, Lia;

    .line 2
    .line 3
    check-cast p2, Lke1;

    .line 4
    .line 5
    check-cast p3, Lq51;

    .line 6
    .line 7
    new-instance p2, Lu9;

    .line 8
    .line 9
    iget-object v0, p0, Lu9;->i0:Lpi;

    .line 10
    .line 11
    iget-object p0, p0, Lu9;->j0:Lz9;

    .line 12
    .line 13
    invoke-direct {p2, v0, p0, p3}, Lu9;-><init>(Lpi;Lz9;Lq51;)V

    .line 14
    .line 15
    .line 16
    iput-object p1, p2, Lu9;->h0:Lia;

    .line 17
    .line 18
    sget-object p0, Ldn8;->a:Ldn8;

    .line 19
    .line 20
    invoke-virtual {p2, p0}, Lu9;->q(Ljava/lang/Object;)Ljava/lang/Object;

    .line 21
    .line 22
    .line 23
    move-result-object p0

    .line 24
    return-object p0
.end method
