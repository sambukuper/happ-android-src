.class public final Lo16;
.super Ls51;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"


# instance fields
.field public f0:Lpe6;

.field public g0:Ljava/util/Iterator;

.field public synthetic h0:Ljava/lang/Object;

.field public final synthetic i0:Ls16;

.field public j0:I


# direct methods
.method public constructor <init>(Ls16;Ls51;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lo16;->i0:Ls16;

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
    .locals 1

    .line 1
    iput-object p1, p0, Lo16;->h0:Ljava/lang/Object;

    .line 2
    .line 3
    iget p1, p0, Lo16;->j0:I

    .line 4
    .line 5
    const/high16 v0, -0x80000000

    .line 6
    .line 7
    or-int/2addr p1, v0

    .line 8
    iput p1, p0, Lo16;->j0:I

    .line 9
    .line 10
    iget-object p1, p0, Lo16;->i0:Ls16;

    .line 11
    .line 12
    const/4 v0, 0x0

    .line 13
    invoke-virtual {p1, v0, p0}, Ls16;->e(Lpe6;Ls51;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    return-object p0
.end method
