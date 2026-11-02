.class public final synthetic Lh58;
.super Ljava/lang/Object;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"

# interfaces
.implements Lrn2;


# instance fields
.field public final synthetic X:J

.field public final synthetic Y:Lo88;

.field public final synthetic Z:Lrn2;

.field public final synthetic f0:S


# direct methods
.method public synthetic constructor <init>(JLo88;Lrn2;I)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-wide p1, p0, Lh58;->X:J

    .line 5
    .line 6
    iput-object p3, p0, Lh58;->Y:Lo88;

    .line 7
    .line 8
    iput-object p4, p0, Lh58;->Z:Lrn2;

    .line 9
    .line 10
    iput-short p5, p0, Lh58;->f0:S

    .line 11
    .line 12
    return-void
.end method


# virtual methods
.method public final K(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    .line 1
    move-object v4, p1

    .line 2
    check-cast v4, Llp2;

    .line 3
    .line 4
    check-cast p2, Ljava/lang/Integer;

    .line 5
    .line 6
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 7
    .line 8
    .line 9
    iget-short p1, p0, Lh58;->f0:S

    .line 10
    .line 11
    or-int/lit8 p1, p1, 0x1

    .line 12
    .line 13
    invoke-static {p1}, Lw79;->P(I)I

    .line 14
    .line 15
    .line 16
    move-result v5

    .line 17
    iget-wide v0, p0, Lh58;->X:J

    .line 18
    .line 19
    iget-object v2, p0, Lh58;->Y:Lo88;

    .line 20
    .line 21
    iget-object v3, p0, Lh58;->Z:Lrn2;

    .line 22
    .line 23
    invoke-static/range {v0 .. v5}, Lpn7;->b(JLo88;Lrn2;Llp2;I)V

    .line 24
    .line 25
    .line 26
    sget-object p0, Ldn8;->a:Ldn8;

    .line 27
    .line 28
    return-object p0
.end method
