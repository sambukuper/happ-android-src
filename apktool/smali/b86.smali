.class public final Lb86;
.super Ljava/lang/Object;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"

# interfaces
.implements Ljava/io/Closeable;


# instance fields
.field public final synthetic X:B

.field public final Y:J

.field public final Z:Lba0;


# direct methods
.method public synthetic constructor <init>(JLba0;B)V
    .locals 0

    .line 1
    iput-byte p4, p0, Lb86;->X:B

    .line 2
    .line 3
    iput-wide p1, p0, Lb86;->Y:J

    .line 4
    .line 5
    iput-object p3, p0, Lb86;->Z:Lba0;

    .line 6
    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public close()V
    .locals 0

    .line 1
    invoke-virtual {p0}, Lb86;->source()Lba0;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-static {p0}, Lks8;->c(Ljava/io/Closeable;)V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public final g()J
    .locals 2

    .line 1
    iget-byte v0, p0, Lb86;->X:B

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-wide v0, p0, Lb86;->Y:J

    .line 7
    .line 8
    return-wide v0

    .line 9
    :pswitch_0
    iget-wide v0, p0, Lb86;->Y:J

    .line 10
    .line 11
    return-wide v0

    .line 12
    nop

    .line 13
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final source()Lba0;
    .locals 1

    .line 1
    iget-byte v0, p0, Lb86;->X:B

    .line 2
    .line 3
    iget-object p0, p0, Lb86;->Z:Lba0;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    check-cast p0, Li90;

    .line 9
    .line 10
    return-object p0

    .line 11
    :pswitch_0
    check-cast p0, Lj76;

    .line 12
    .line 13
    return-object p0

    .line 14
    nop

    .line 15
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
