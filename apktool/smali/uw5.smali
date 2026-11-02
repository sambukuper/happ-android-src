.class public final synthetic Luw5;
.super Ljava/lang/Object;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"

# interfaces
.implements Lrn2;


# instance fields
.field public final synthetic X:Ldn2;

.field public final synthetic Y:Lkx4;

.field public final synthetic Z:J

.field public final synthetic f0:J

.field public final synthetic g0:Z

.field public final synthetic h0:F

.field public final synthetic i0:Lgn2;

.field public final synthetic j0:B


# direct methods
.method public synthetic constructor <init>(Ldn2;Lkx4;JJIFLgn2;I)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Luw5;->X:Ldn2;

    .line 5
    .line 6
    iput-object p2, p0, Luw5;->Y:Lkx4;

    .line 7
    .line 8
    iput-wide p3, p0, Luw5;->Z:J

    .line 9
    .line 10
    iput-wide p5, p0, Luw5;->f0:J

    .line 11
    .line 12
    iput-boolean p7, p0, Luw5;->g0:Z

    .line 13
    .line 14
    iput p8, p0, Luw5;->h0:F

    .line 15
    .line 16
    iput-object p9, p0, Luw5;->i0:Lgn2;

    .line 17
    .line 18
    iput-byte p10, p0, Luw5;->j0:B

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
    iget-byte p1, p0, Luw5;->j0:B

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
    iget-object v0, p0, Luw5;->X:Ldn2;

    .line 18
    .line 19
    iget-object v1, p0, Luw5;->Y:Lkx4;

    .line 20
    .line 21
    iget-wide v2, p0, Luw5;->Z:J

    .line 22
    .line 23
    iget-wide v4, p0, Luw5;->f0:J

    .line 24
    .line 25
    iget-boolean v6, p0, Luw5;->g0:Z

    .line 26
    .line 27
    iget v7, p0, Luw5;->h0:F

    .line 28
    .line 29
    iget-object v8, p0, Luw5;->i0:Lgn2;

    .line 30
    .line 31
    invoke-static/range {v0 .. v10}, Lxw5;->b(Ldn2;Lkx4;JJIFLgn2;Llp2;I)V

    .line 32
    .line 33
    .line 34
    sget-object p0, Ldn8;->a:Ldn8;

    .line 35
    .line 36
    return-object p0
.end method
