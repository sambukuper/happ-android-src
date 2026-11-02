.class public final synthetic Lbc8;
.super Ljava/lang/Object;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"

# interfaces
.implements Lrn2;


# instance fields
.field public final synthetic X:Lhc8;

.field public final synthetic Y:Lkx4;

.field public final synthetic Z:F

.field public final synthetic f0:Lx67;

.field public final synthetic g0:J

.field public final synthetic h0:J

.field public final synthetic i0:Lzy0;

.field public final synthetic j0:I


# direct methods
.method public synthetic constructor <init>(Lhc8;Lkx4;FLx67;JJLzy0;I)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lbc8;->X:Lhc8;

    .line 5
    .line 6
    iput-object p2, p0, Lbc8;->Y:Lkx4;

    .line 7
    .line 8
    iput p3, p0, Lbc8;->Z:F

    .line 9
    .line 10
    iput-object p4, p0, Lbc8;->f0:Lx67;

    .line 11
    .line 12
    iput-wide p5, p0, Lbc8;->g0:J

    .line 13
    .line 14
    iput-wide p7, p0, Lbc8;->h0:J

    .line 15
    .line 16
    iput-object p9, p0, Lbc8;->i0:Lzy0;

    .line 17
    .line 18
    iput p10, p0, Lbc8;->j0:I

    .line 19
    .line 20
    return-void
.end method


# virtual methods
.method public final K(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 11

    .line 1
    move-object v9, p1

    .line 2
    check-cast v9, Llp2;

    .line 3
    .line 4
    check-cast p2, Ljava/lang/Integer;

    .line 5
    .line 6
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 7
    .line 8
    .line 9
    iget p1, p0, Lbc8;->j0:I

    .line 10
    .line 11
    or-int/lit8 p1, p1, 0x1

    .line 12
    .line 13
    invoke-static {p1}, Lw79;->P(I)I

    .line 14
    .line 15
    .line 16
    move-result v10

    .line 17
    iget-object v0, p0, Lbc8;->X:Lhc8;

    .line 18
    .line 19
    iget-object v1, p0, Lbc8;->Y:Lkx4;

    .line 20
    .line 21
    iget v2, p0, Lbc8;->Z:F

    .line 22
    .line 23
    iget-object v3, p0, Lbc8;->f0:Lx67;

    .line 24
    .line 25
    iget-wide v4, p0, Lbc8;->g0:J

    .line 26
    .line 27
    iget-wide v6, p0, Lbc8;->h0:J

    .line 28
    .line 29
    iget-object v8, p0, Lbc8;->i0:Lzy0;

    .line 30
    .line 31
    invoke-static/range {v0 .. v10}, Lec8;->a(Lhc8;Lkx4;FLx67;JJLzy0;Llp2;I)V

    .line 32
    .line 33
    .line 34
    sget-object p0, Ldn8;->a:Ldn8;

    .line 35
    .line 36
    return-object p0
.end method
