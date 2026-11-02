.class public final Ldj1;
.super Ljava/lang/Object;

# interfaces
.implements Ldn2;


# instance fields
.field public final synthetic X:B

.field public final Y:Li44;


# direct methods
.method public synthetic constructor <init>(Li44;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, Ldj1;->X:B

    .line 2
    .line 3
    iput-object p1, p0, Ldj1;->Y:Li44;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 1

    .line 1
    iget-byte v0, p0, Ldj1;->X:B

    .line 2
    .line 3
    iget-object p0, p0, Ldj1;->Y:Li44;

    .line 4
    .line 5
    return-object p0
.end method
