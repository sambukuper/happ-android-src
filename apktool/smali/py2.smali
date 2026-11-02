.class public final synthetic Lpy2;
.super Ljava/lang/Object;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"

# interfaces
.implements Lrn2;


# instance fields
.field public final synthetic X:I

.field public final synthetic Y:Lmw2;

.field public final synthetic Z:Lb83;

.field public final synthetic f0:Low2;

.field public final synthetic g0:Lkx4;

.field public final synthetic h0:I


# direct methods
.method public synthetic constructor <init>(ILmw2;Lb83;Low2;Lkx4;I)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput p1, p0, Lpy2;->X:I

    .line 5
    .line 6
    iput-object p2, p0, Lpy2;->Y:Lmw2;

    .line 7
    .line 8
    iput-object p3, p0, Lpy2;->Z:Lb83;

    .line 9
    .line 10
    iput-object p4, p0, Lpy2;->f0:Low2;

    .line 11
    .line 12
    iput-object p5, p0, Lpy2;->g0:Lkx4;

    .line 13
    .line 14
    iput p6, p0, Lpy2;->h0:I

    .line 15
    .line 16
    return-void
.end method


# virtual methods
.method public final K(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    .line 1
    move-object v5, p1

    .line 2
    check-cast v5, Llp2;

    .line 3
    .line 4
    check-cast p2, Ljava/lang/Integer;

    .line 5
    .line 6
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 7
    .line 8
    .line 9
    iget p1, p0, Lpy2;->h0:I

    .line 10
    .line 11
    or-int/lit8 p1, p1, 0x1

    .line 12
    .line 13
    invoke-static {p1}, Lw79;->P(I)I

    .line 14
    .line 15
    .line 16
    move-result v6

    .line 17
    iget v0, p0, Lpy2;->X:I

    .line 18
    .line 19
    iget-object v1, p0, Lpy2;->Y:Lmw2;

    .line 20
    .line 21
    iget-object v2, p0, Lpy2;->Z:Lb83;

    .line 22
    .line 23
    iget-object v3, p0, Lpy2;->f0:Low2;

    .line 24
    .line 25
    iget-object v4, p0, Lpy2;->g0:Lkx4;

    .line 26
    .line 27
    invoke-static/range {v0 .. v6}, Lys0;->d(ILmw2;Lb83;Low2;Lkx4;Llp2;I)V

    .line 28
    .line 29
    .line 30
    sget-object p0, Ldn8;->a:Ldn8;

    .line 31
    .line 32
    return-object p0
.end method
