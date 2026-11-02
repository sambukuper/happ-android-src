.class public final Lko;
.super Ls51;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"


# instance fields
.field public synthetic f0:Ljava/lang/Object;

.field public final synthetic g0:Lqo;

.field public h0:I


# direct methods
.method public constructor <init>(Lqo;Ls51;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lko;->g0:Lqo;

    .line 2
    .line 3
    invoke-direct {p0, p2}, Ls51;-><init>(Lq51;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final q(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    .line 1
    iput-object p1, p0, Lko;->f0:Ljava/lang/Object;

    .line 2
    .line 3
    iget p1, p0, Lko;->h0:I

    .line 4
    .line 5
    const/high16 v0, -0x80000000

    .line 6
    .line 7
    or-int/2addr p1, v0

    .line 8
    iput p1, p0, Lko;->h0:I

    .line 9
    .line 10
    const/4 p1, 0x0

    .line 11
    const/4 v0, 0x0

    .line 12
    iget-object v1, p0, Lko;->g0:Lqo;

    .line 13
    .line 14
    invoke-virtual {v1, p1, p1, v0, p0}, Lqo;->j(Ljava/lang/String;Ljava/util/ArrayList;ILs51;)Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    move-result-object p0

    .line 18
    sget-object p1, Lc71;->X:Lc71;

    .line 19
    .line 20
    if-ne p0, p1, :cond_0

    .line 21
    .line 22
    return-object p0

    .line 23
    :cond_0
    new-instance p1, Lsj6;

    .line 24
    .line 25
    invoke-direct {p1, p0}, Lsj6;-><init>(Ljava/lang/Object;)V

    .line 26
    .line 27
    .line 28
    return-object p1
.end method
