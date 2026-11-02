.class public final Lw66;
.super Lsz0;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"


# instance fields
.field public final synthetic Y:B

.field public final synthetic Z:Llr5;


# direct methods
.method public synthetic constructor <init>(Llr5;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, Lw66;->Y:B

    .line 2
    .line 3
    iput-object p1, p0, Lw66;->Z:Llr5;

    .line 4
    .line 5
    const/4 p1, 0x1

    .line 6
    invoke-direct {p0, p1}, Lsz0;-><init>(B)V

    .line 7
    .line 8
    .line 9
    return-void
.end method


# virtual methods
.method public final i([Ljava/lang/String;)V
    .locals 1

    .line 1
    iget-byte v0, p0, Lw66;->Y:B

    .line 2
    .line 3
    iget-object p0, p0, Lw66;->Z:Llr5;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    if-eqz p1, :cond_0

    .line 9
    .line 10
    iget-object p0, p0, Llr5;->Y:Ljava/lang/Object;

    .line 11
    .line 12
    check-cast p0, Lx66;

    .line 13
    .line 14
    iput-object p1, p0, Lx66;->g0:[Ljava/lang/String;

    .line 15
    .line 16
    goto :goto_0

    .line 17
    :cond_0
    const-string p0, "Argument for @NotNull parameter \'data\' of kotlin/reflect/jvm/internal/impl/load/kotlin/header/ReadKotlinClassHeaderAnnotationVisitor$OldDeprecatedAnnotationArgumentVisitor$2.visitEnd must not be null"

    .line 18
    .line 19
    invoke-static {p0}, Lbt;->q(Ljava/lang/String;)V

    .line 20
    .line 21
    .line 22
    :goto_0
    return-void

    .line 23
    :pswitch_0
    if-eqz p1, :cond_1

    .line 24
    .line 25
    iget-object p0, p0, Llr5;->Y:Ljava/lang/Object;

    .line 26
    .line 27
    check-cast p0, Lx66;

    .line 28
    .line 29
    iput-object p1, p0, Lx66;->f0:[Ljava/lang/String;

    .line 30
    .line 31
    goto :goto_1

    .line 32
    :cond_1
    const-string p0, "Argument for @NotNull parameter \'data\' of kotlin/reflect/jvm/internal/impl/load/kotlin/header/ReadKotlinClassHeaderAnnotationVisitor$OldDeprecatedAnnotationArgumentVisitor$1.visitEnd must not be null"

    .line 33
    .line 34
    invoke-static {p0}, Lbt;->q(Ljava/lang/String;)V

    .line 35
    .line 36
    .line 37
    :goto_1
    return-void

    .line 38
    nop

    .line 39
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
