.class public final Lyn;
.super Ls51;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"


# instance fields
.field public synthetic f0:Ljava/lang/Object;

.field public final synthetic g0:Lvb;

.field public h0:I


# direct methods
.method public constructor <init>(Lvb;Lq51;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lyn;->g0:Lvb;

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
    iput-object p1, p0, Lyn;->f0:Ljava/lang/Object;

    .line 2
    .line 3
    iget p1, p0, Lyn;->h0:I

    .line 4
    .line 5
    const/high16 v0, -0x80000000

    .line 6
    .line 7
    or-int/2addr p1, v0

    .line 8
    iput p1, p0, Lyn;->h0:I

    .line 9
    .line 10
    iget-object p1, p0, Lyn;->g0:Lvb;

    .line 11
    .line 12
    const/4 v0, 0x0

    .line 13
    invoke-virtual {p1, v0, v0, p0}, Lvb;->W(Ljava/lang/String;Ljava/lang/String;Lq51;)Ljava/io/Serializable;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    return-object p0
.end method
