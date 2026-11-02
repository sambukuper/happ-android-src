.class public final Lfj8;
.super Lar3;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"

# interfaces
.implements Lp51;


# instance fields
.field public final X:Lri8;

.field public final Y:Lar3;


# direct methods
.method public constructor <init>(Lri8;Lar3;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lfj8;->X:Lri8;

    .line 5
    .line 6
    iput-object p2, p0, Lfj8;->Y:Lar3;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final a(Lt37;Ld50;)Lar3;
    .locals 2

    .line 1
    iget-object v0, p0, Lfj8;->Y:Lar3;

    .line 2
    .line 3
    instance-of v1, v0, Lp51;

    .line 4
    .line 5
    if-eqz v1, :cond_0

    .line 6
    .line 7
    invoke-virtual {p1, v0, p2}, Lt37;->v(Lar3;Ld50;)Lar3;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    goto :goto_0

    .line 12
    :cond_0
    move-object p1, v0

    .line 13
    :goto_0
    if-ne p1, v0, :cond_1

    .line 14
    .line 15
    return-object p0

    .line 16
    :cond_1
    new-instance p2, Lfj8;

    .line 17
    .line 18
    iget-object p0, p0, Lfj8;->X:Lri8;

    .line 19
    .line 20
    invoke-direct {p2, p0, p1}, Lfj8;-><init>(Lri8;Lar3;)V

    .line 21
    .line 22
    .line 23
    return-object p2
.end method

.method public final e(Ljava/lang/Object;Lro3;Lt37;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lfj8;->Y:Lar3;

    .line 2
    .line 3
    iget-object p0, p0, Lfj8;->X:Lri8;

    .line 4
    .line 5
    invoke-virtual {v0, p1, p2, p3, p0}, Lar3;->f(Ljava/lang/Object;Lro3;Lt37;Lri8;)V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public final f(Ljava/lang/Object;Lro3;Lt37;Lri8;)V
    .locals 0

    .line 1
    iget-object p0, p0, Lfj8;->Y:Lar3;

    .line 2
    .line 3
    invoke-virtual {p0, p1, p2, p3, p4}, Lar3;->f(Ljava/lang/Object;Lro3;Lt37;Lri8;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method
