.class public final Lzy7;
.super Ls51;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"


# instance fields
.field public f0:Log7;

.field public synthetic g0:Ljava/lang/Object;

.field public final synthetic h0:Lbz7;

.field public i0:I


# direct methods
.method public constructor <init>(Lbz7;Lr10;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lzy7;->h0:Lbz7;

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
    .locals 3

    .line 1
    iput-object p1, p0, Lzy7;->g0:Ljava/lang/Object;

    .line 2
    .line 3
    iget p1, p0, Lzy7;->i0:I

    .line 4
    .line 5
    const/high16 v0, -0x80000000

    .line 6
    .line 7
    or-int/2addr p1, v0

    .line 8
    iput p1, p0, Lzy7;->i0:I

    .line 9
    .line 10
    const-wide/16 v0, 0x0

    .line 11
    .line 12
    const/4 p1, 0x0

    .line 13
    iget-object v2, p0, Lzy7;->h0:Lbz7;

    .line 14
    .line 15
    invoke-virtual {v2, v0, v1, p1, p0}, Lbz7;->d(JLrn2;Lr10;)Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    move-result-object p0

    .line 19
    return-object p0
.end method
